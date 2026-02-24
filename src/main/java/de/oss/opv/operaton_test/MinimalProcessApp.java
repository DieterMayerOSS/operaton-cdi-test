package de.oss.opv.operaton_test;

import org.operaton.bpm.application.ProcessApplication;
import org.operaton.bpm.application.impl.JakartaServletProcessApplication;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@ProcessApplication("MinimalTestApp")
public class MinimalProcessApp extends JakartaServletProcessApplication {

}