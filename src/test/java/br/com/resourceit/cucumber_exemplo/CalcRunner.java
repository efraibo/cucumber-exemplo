package br.com.resourceit.cucumber_exemplo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:caracteristicas", 
	format= {"pretty", "html:target/cucumber"},
	glue = "br.com.resourceit.cucumber_exemplo.steps", 
	tags = "@CalcRunner", monochrome = true, dryRun = false)
public class CalcRunner {

}
