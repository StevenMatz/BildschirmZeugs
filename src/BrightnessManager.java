/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matz
 */

import java.io.IOException;

public class BrightnessManager {
    public static void setHelligkeit(int helligkeit) throws IOException
        {
        //Formatiertes Powershell Skript - Geht nur so, weil es keine Java API dazu gibt
        //setzt den übergebenen helligkeitsparam in das Skript ein und speichert es in s
        //Quelle: http://blogs.technet.com/b/heyscriptingguy/archive/2013/07/25/use-powershell-to-report-and-set-monitor-brightness.aspx
        String s = String.format("$helligkeit = %d;", helligkeit)
                + "$delay = 0;"
                + "$Monitor = Get-WmiObject -ns root\\wmi -Class WmiMonitorBrightnessMethods;"
                + "$Monitor.wmisetbrightness($delay, $helligkeit)";
        //Befehl wird nach "b" geschrieben
        String b = "powershell.exe  " + s;
        //und ausgeführt
        Runtime.getRuntime().exec(b);    
        }
}
