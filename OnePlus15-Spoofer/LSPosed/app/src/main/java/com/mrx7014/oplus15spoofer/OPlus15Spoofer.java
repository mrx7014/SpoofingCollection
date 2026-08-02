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

package com.mrx7014.oplus15spoofer;

import android.os.Build;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class MainHook implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {        
        XposedBridge.log("oplus15spoofer: Hooking into: " + lpparam.packageName);

        // ro.product.manufacturer
        XposedHelpers.setStaticObjectField(Build.class, "MANUFACTURER", "OnePlus");

        // ro.product.brand
        XposedHelpers.setStaticObjectField(Build.class, "BRAND", "OnePlus 15");

        // ro.product.device
        XposedHelpers.setStaticObjectField(Build.class, "DEVICE", "OP611FL1");

        // ro.product.system.device
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.DEVICE", "OP611FL1");

        // ro.product.product
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT", "OP611FL1");

        // ro.product.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "OP611FL1");

        // ro.product.system.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "OP611FL1");

        // ro.product.vendor.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "OP611FL1");

        // ro.product.system_ext.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "OP611FL1");

        // ro.product.system.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.NAME", "OP611FL1");

        // ro.product.vendor.name
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.NAME", "OP611FL1");

        // ro.product.system_ext.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.NAME", "OP611FL1");

        // ro.system_ext.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.MODEL", "OP611FL1");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT.MODEL", "OP611FL1");

        // ro.product.vendor.model
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.MODEL", "OP611FL1");

        // ro.product.system.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.MODEL", "OP611FL1");
    }
}
