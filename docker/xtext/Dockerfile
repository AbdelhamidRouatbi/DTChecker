FROM maven:3.9-eclipse-temurin-21

WORKDIR /app/project

# --- Web module ---
COPY eclipse/org.xtext.stlrobust.spec.parent/org.xtext.stlrobust.spec.web/src      ./src
COPY eclipse/org.xtext.stlrobust.spec.parent/org.xtext.stlrobust.spec.web/src-gen  ./src-gen
COPY eclipse/org.xtext.stlrobust.spec.parent/org.xtext.stlrobust.spec.web/WebRoot  ./WebRoot
COPY eclipse/org.xtext.stlrobust.spec.parent/org.xtext.stlrobust.spec.web/pom-docker.xml ./pom-docker.xml

# --- spec module ---
COPY eclipse/org.xtext.stlrobust.spec.parent/org.xtext.stlrobust.spec/src      ./spec-src
COPY eclipse/org.xtext.stlrobust.spec.parent/org.xtext.stlrobust.spec/src-gen  ./spec-src-gen
# Seed xtend-gen with pre-existing compiled output so the antrun pre-compile
# phase can resolve SpecGenerator (from AbstractSpecRuntimeModule's import).
# The Xtend compiler will then overwrite these with freshly compiled versions.
COPY eclipse/org.xtext.stlrobust.spec.parent/org.xtext.stlrobust.spec/xtend-gen ./xtend-gen

# --- spec.ide module ---
COPY eclipse/org.xtext.stlrobust.spec.parent/org.xtext.stlrobust.spec.ide/src      ./ide-src
COPY eclipse/org.xtext.stlrobust.spec.parent/org.xtext.stlrobust.spec.ide/src-gen  ./ide-src-gen

# Pre-fetch all Maven dependencies
RUN mvn -f pom-docker.xml \
        dependency:resolve \
        dependency:resolve-plugins \
        --no-transfer-progress \
        -q

EXPOSE 8090

CMD ["mvn", "-f", "pom-docker.xml", \
     "jetty:run", \
     "--no-transfer-progress"]
