/**
 * Copyright (c) 2015 Aldebaran Robotics. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be
 * found in the COPYING file.
 * Created by epinault and ekroeger
 */
package com.aldebaran.qi.helper.proxies;

import com.aldebaran.qi.CallError;
import com.aldebaran.qi.Session;
import com.aldebaran.qi.helper.ALProxy;
import java.util.List;
import java.util.Map;
import com.aldebaran.qi.*;

import java.util.List;
/**
* 
* @see <a href="http://doc.aldebaran.lan/doc/master/aldeb-doc/naoqi/core/packagemanager.html#packagemanager">NAOqi APIs for PackageManager </a>
*
*/
public class PackageManager extends ALProxy {

    public PackageManager(Session session) {
        super(session);
    }

    /**
    * 
    * 
    */
    public Boolean isStatsEnabled() throws CallError, InterruptedException {
        return (Boolean)service.call("isStatsEnabled").get();
    }

    /**
    * 
    * 
    */
    public void clearStats() throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("clearStats");
        else
            service.call("clearStats").get();
    }

    /**
    * 
    * 
    */
    public Boolean isTraceEnabled() throws CallError, InterruptedException {
        return (Boolean)service.call("isTraceEnabled").get();
    }

    /**
    * 
    * 
    */
    public Boolean install(String param1) throws CallError, InterruptedException {
        return (Boolean)service.call("install", param1).get();
    }

    /**
    * 
    * 
    */
    public Boolean installCheckMd5(String param1, String param2) throws CallError, InterruptedException {
        return (Boolean)service.call("installCheckMd5", param1, param2).get();
    }

    /**
    * 
    * 
    */
    public void setServiceDirectory(String param1) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setServiceDirectory", param1);
        else
            service.call("setServiceDirectory", param1).get();
    }

    /**
    * 
    * 
    */
    public Boolean hasPackage(String param1) throws CallError, InterruptedException {
        return (Boolean)service.call("hasPackage", param1).get();
    }

    /**
    * 
    * 
    */
    public List<Tuple10<String, String, String, String, String, String, String, String, String, Map<String, Object>>> packages2() throws CallError, InterruptedException {
        return (List<Tuple10<String, String, String, String, String, String, String, String, String, Map<String, Object>>>)service.call("packages2").get();
    }

    /**
    * 
    * 
    */
    public Tuple10<String, String, String, String, String, String, String, String, String, Map<String, Object>> package2(String param1) throws CallError, InterruptedException {
        return (Tuple10<String, String, String, String, String, String, String, String, String, Map<String, Object>>)service.call("package2", param1).get();
    }

    /**
    * 
    * 
    */
    public String packageIcon(String param1) throws CallError, InterruptedException {
        return (String)service.call("packageIcon", param1).get();
    }

    /**
    * 
    * 
    */
    public void removePkg(String param1) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("removePkg", param1);
        else
            service.call("removePkg", param1).get();
    }

    /**
    * 
    * 
    */
    public Object getPackages() throws CallError, InterruptedException {
        return (Object)service.call("getPackages").get();
    }

    /**
    * 
    * 
    */
    public List<Tuple20<String, String, String, String, String, String, String, String, Map<String, String>, Map<String, String>, List<String>, List<Tuple10<String, String, Map<String, String>, Map<String, String>, String, Map<String, List<String>>, Map<String, List<String>>, Map<String, List<String>>, Map<String, List<String>>, List<String>>>, List<Tuple5<String, String, String, String, Map<String, String>>>, String, List<Tuple5<String, String, String, String, String>>, List<Tuple2<String, String>>, List<Tuple3<String, String, Boolean>>, List<String>, List<Tuple3<String, String, Map<String, String>>>, List<String>>> packages() throws CallError, InterruptedException {
        return (List<Tuple20<String, String, String, String, String, String, String, String, Map<String, String>, Map<String, String>, List<String>, List<Tuple10<String, String, Map<String, String>, Map<String, String>, String, Map<String, List<String>>, Map<String, List<String>>, Map<String, List<String>>, Map<String, List<String>>, List<String>>>, List<Tuple5<String, String, String, String, Map<String, String>>>, String, List<Tuple5<String, String, String, String, String>>, List<Tuple2<String, String>>, List<Tuple3<String, String, Boolean>>, List<String>, List<Tuple3<String, String, Map<String, String>>>, List<String>>>)service.call("packages").get();
    }

    /**
    * 
    * 
    */
    public Tuple20<String, String, String, String, String, String, String, String, Map<String, String>, Map<String, String>, List<String>, List<Tuple10<String, String, Map<String, String>, Map<String, String>, String, Map<String, List<String>>, Map<String, List<String>>, Map<String, List<String>>, Map<String, List<String>>, List<String>>>, List<Tuple5<String, String, String, String, Map<String, String>>>, String, List<Tuple5<String, String, String, String, String>>, List<Tuple2<String, String>>, List<Tuple3<String, String, Boolean>>, List<String>, List<Tuple3<String, String, Map<String, String>>>, List<String>> getPackage2(String param1) throws CallError, InterruptedException {
        return (Tuple20<String, String, String, String, String, String, String, String, Map<String, String>, Map<String, String>, List<String>, List<Tuple10<String, String, Map<String, String>, Map<String, String>, String, Map<String, List<String>>, Map<String, List<String>>, Map<String, List<String>>, Map<String, List<String>>, List<String>>>, List<Tuple5<String, String, String, String, Map<String, String>>>, String, List<Tuple5<String, String, String, String, String>>, List<Tuple2<String, String>>, List<Tuple3<String, String, Boolean>>, List<String>, List<Tuple3<String, String, Map<String, String>>>, List<String>>)service.call("package", param1).get();
    }

    /**
    * 
    * 
    */
    public Object getPackage(String param1) throws CallError, InterruptedException {
        return (Object)service.call("getPackage", param1).get();
    }

    /**
    * 
    * 
    */
    public Object getPackageIcon(String param1) throws CallError, InterruptedException {
        return (Object)service.call("getPackageIcon", param1).get();
    }

    /**
    * 
    * 
    */
    public Integer install(String param1, String param2) throws CallError, InterruptedException {
        return (Integer)service.call("install", param1, param2).get();
    }

    /**
    * 
    * 
    */
    public Integer install(String param1, String param2, String param3) throws CallError, InterruptedException {
        return (Integer)service.call("install", param1, param2, param3).get();
    }

    /**
    * 
    * 
    */
    public Integer remove(String param1) throws CallError, InterruptedException {
        return (Integer)service.call("remove", param1).get();
    }

}
    