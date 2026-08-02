/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mrx7014.tabs10uspoofer;

import android.os.Build;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class TabS10USpoofer implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {        
        XposedBridge.log("tabs10uspoofer: Hooking into: " + lpparam.packageName);

        // ro.product.manufacturer
        XposedHelpers.setStaticObjectField(Build.class, "MANUFACTURER", "Samsung");

        // ro.product.brand
        XposedHelpers.setStaticObjectField(Build.class, "BRAND", "Samsung Tab S10 Ultra");

        // ro.product.device
        XposedHelpers.setStaticObjectField(Build.class, "DEVICE", "gts10u");

        // ro.product.system.device
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.DEVICE", "gts10u");

        // ro.product.product
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT", "gts10u");

        // ro.product.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "gts10u");

        // ro.product.system.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "gts10u");

        // ro.product.vendor.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "gts10u");

        // ro.product.system_ext.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "gts10u");

        // ro.product.system.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.NAME", "gts10u");

        // ro.product.vendor.name
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.NAME", "gts10u");

        // ro.product.system_ext.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.NAME", "gts10u");

        // ro.system_ext.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.MODEL", "gts10u");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT.MODEL", "gts10u");

        // ro.product.vendor.model
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.MODEL", "gts10u");

        // ro.product.system.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.MODEL", "gts10u");
    }
}