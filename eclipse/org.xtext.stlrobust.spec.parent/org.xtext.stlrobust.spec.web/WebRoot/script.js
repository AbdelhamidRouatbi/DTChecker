class PlotRenderer extends React.Component {

			      constructor(props) {
			        super(props);
			        this.state = {
					  title: props.title || "",
			          times: props.times || [],
			          values: props.values || [],
			        }
			      }
			      

			      render() {
					
					const lastValue = this.state.values[this.state.values.length - 1];
					const lineColor = lastValue < 0 ? "red" : "blue";
					
			        const style = {
			          width: "calc(35vw - 30px)",
			          height: "calc(35vh - 30px)",
			          margin: "10px"
			        };

			        const lineLayer = {
			          type: "line",
			          x: "_time",
			          y: "_value",
					  colors: [lineColor]
			        };

			        const table = Giraffe.newTable(this.state.times.length)
			          .addColumn('_time', 'dateTime:RFC3339', 'time', this.state.times)
			          .addColumn('_value', 'double', 'number', this.state.values);
					  
			        const config = {
			          table,
			          layers: [lineLayer],
					  xTickFont: '12px sans-serif',
					  tickFontColor: "black",
					  gridOpacity: 0.25
			        };

			        const SimplePlot = React.createElement(Giraffe.Plot, {config}, null);
					return React.createElement('div', null, 
					    React.createElement('h3', null, this.props.title),
					    React.createElement('div', { style }, SimplePlot)
					  );
			      }
			    }

			    var data = {}
				
			    function addPoint(pointData){
				  spec = pointData.spec;
				  timestamp = pointData.result[0][0];
				  robustness = pointData.result[0][1];
				  formula = pointData.formula;
			      if (!data[spec]) {
					data[spec] = {
						formula: formula,
						timestamps: [],
						values: []
					}
					if (!spec.startsWith("signal-")) createSpecTab(spec);
				  }
				  console.log(data[spec]);
				  
				  data[spec].timestamps.push(timestamp);
				  data[spec].values.push(robustness);
				  
				  
				  let e = document.getElementById(spec);
				  let specTitle = spec;
				  let isSignal = specTitle.startsWith("signal-")
				  if (!e) {
					e = document.createElement('div');
					e.style.boxShadow = "inset 0 0 0 4px grey";
					e.style.padding = "20px";
					e.style.backgroundColor = "#f5f5f5";
					e.id = spec;
					
					const container = isSignal? document.getElementById('signals-view') : document.getElementById('specs-view');
					if (container) {
						container.appendChild(e);
					}
				  }
				  if (isSignal) {
					specTitle = specTitle.split('-')[1];
				  }
			      ReactDOM.render(
			        React.createElement(PlotRenderer, {title: specTitle, times: data[spec].timestamps, values: data[spec].values}),
			          e
			        );
			    }
				
				function createSpecTab(spec) {
				  const specNavbar = document.getElementById('spec-navbar');
				  const specContent = document.getElementById('spec-content');


				  // Create new tab button
				  const li = document.createElement('li');
				  li.className = 'nav-item';
				  li.role = 'presentation';

				  const button = document.createElement('button');
				  button.className = 'nav-link'; // <-- no 'active'
				  button.id = `${spec}-tab`;
				  button.dataset.bsToggle = 'tab';
				  button.dataset.bsTarget = `#${spec}-pane`;
				  button.type = 'button';
				  button.role = 'tab';
				  button.setAttribute('aria-controls', `${spec}-pane`);
				  button.setAttribute('aria-selected', 'false'); // <-- not selected
				  button.textContent = spec;
				  li.appendChild(button);
				  specNavbar.appendChild(li);
				}
				
				$("#spec-navbar").on("click", ".nav-link", function () {
				  const $clickedTab = $(this);
				  const tabName = $clickedTab.text();;
				  $("#spec-navbar .nav-link").removeClass("active").attr("aria-selected", "false");
				  $(".tab-pane").removeClass("show active");
				  $clickedTab.addClass("active").attr("aria-selected", "true");
				  console.log(tabName);
				  
				  if (tabName == "All") {
					for (const spec in data) {
					    const pane = document.getElementById(`${spec}`);
					    if (pane) {
					      pane.removeAttribute("hidden");
					    }
					  }
				  } else {
					for (const spec in data) {
					    const pane = document.getElementById(`${spec}`);
					    if (pane) {
					      if (spec === tabName || isInvolved(tabName, spec)) {
							console.log("displaying: " + spec);
					        pane.removeAttribute("hidden");
					      } else {
							console.log("hiding :" + spec);
					        pane.setAttribute("hidden", true);
					      }
					    }
					  }
				  }
				});
				
				function isInvolved(spec, signal) {
					formula = data[spec].formula;
					const target = signal.split('-')[1];
					const pattern = new RegExp(`(<|>|=)\\s*${target}|${target}\\s*(<|>|=)`);
					return pattern.test(formula);
				}