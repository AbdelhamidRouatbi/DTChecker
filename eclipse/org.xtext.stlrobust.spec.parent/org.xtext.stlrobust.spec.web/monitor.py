
import pika, rtamt, time, os, sys
from functools import partial

def main():

   #RabbitMQ Setup
   credentials = pika.PlainCredentials('incubator', 'incubator')
   parameters = pika.ConnectionParameters('localhost', credentials=credentials)
   connection = pika.BlockingConnection(parameters)
   channel = connection.channel()

   channel.queue_declare(queue='a', durable=True)

   #Specs Setup
   first = rtamt.StlDenseTimeSpecification()
   first.name = 'first'

   #Input Setup
   first.declare_var('s', 'float')

   #Timer setup
   start_time = time.time()

   #STL Formula
   first.spec = 'always[0,0](temperature < 50)'
   try:
      first.parse()
      first.pastify()
   except rtamt.RTAMTException as err:
      print('RTAMT Exception: {}'.format(err))

   def evaluate(ch, method, properties, body, signal):
      timestamp = time.time() - start_time
      value = float(next(iter({body})).decode('utf-8'))
      print(first.update([signal, [(timestamp, value)]]))

   channel.basic_consume(queue='a', auto_ack=True, on_message_callback=partial(evaluate, signal='s'))
   print('Monitoring started')
   channel.start_consuming()
	
	
if __name__ == '__main__':
	try:
		main()
	except KeyboardInterrupt:
		print('Interrupted')
		try:
			sys.exit(0)
		except SystemExit:
			os._exit(0)


