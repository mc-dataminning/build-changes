package net.minecraft.client.main;

import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.properties.PropertyMap.Serializer;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import net.minecraft.obfuscate.DontObfuscate;
import org.apache.commons.lang3.StringEscapeUtils;
import org.slf4j.Logger;

public class Main {
   @DontObfuscate
   public static void main(String[] $$0) {
      OptionParser $$1 = new OptionParser();
      $$1.allowsUnrecognizedOptions();
      $$1.accepts("demo");
      $$1.accepts("disableMultiplayer");
      $$1.accepts("disableChat");
      $$1.accepts("fullscreen");
      $$1.accepts("checkGlErrors");
      OptionSpec<Void> $$2 = $$1.accepts("renderDebugLabels");
      OptionSpec<Void> $$3 = $$1.accepts("jfrProfile");
      OptionSpec<Void> $$4 = $$1.accepts("tracy");
      OptionSpec<Void> $$5 = $$1.accepts("tracyNoImages");
      OptionSpec<String> $$6 = $$1.accepts("quickPlayPath").withRequiredArg();
      OptionSpec<String> $$7 = $$1.accepts("quickPlaySingleplayer").withRequiredArg();
      OptionSpec<String> $$8 = $$1.accepts("quickPlayMultiplayer").withRequiredArg();
      OptionSpec<String> $$9 = $$1.accepts("quickPlayRealms").withRequiredArg();
      OptionSpec<File> $$10 = $$1.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), new File[0]);
      OptionSpec<File> $$11 = $$1.accepts("assetsDir").withRequiredArg().ofType(File.class);
      OptionSpec<File> $$12 = $$1.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
      OptionSpec<String> $$13 = $$1.accepts("proxyHost").withRequiredArg();
      OptionSpec<Integer> $$14 = $$1.accepts("proxyPort").withRequiredArg().defaultsTo("8080", new String[0]).ofType(Integer.class);
      OptionSpec<String> $$15 = $$1.accepts("proxyUser").withRequiredArg();
      OptionSpec<String> $$16 = $$1.accepts("proxyPass").withRequiredArg();
      OptionSpec<String> $$17 = $$1.accepts("username").withRequiredArg().defaultsTo("Player" + System.currentTimeMillis() % 1000L, new String[0]);
      OptionSpec<String> $$18 = $$1.accepts("uuid").withRequiredArg();
      OptionSpec<String> $$19 = $$1.accepts("xuid").withOptionalArg().defaultsTo("", new String[0]);
      OptionSpec<String> $$20 = $$1.accepts("clientId").withOptionalArg().defaultsTo("", new String[0]);
      OptionSpec<String> $$21 = $$1.accepts("accessToken").withRequiredArg().required();
      OptionSpec<String> $$22 = $$1.accepts("version").withRequiredArg().required();
      OptionSpec<Integer> $$23 = $$1.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(854, new Integer[0]);
      OptionSpec<Integer> $$24 = $$1.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(480, new Integer[0]);
      OptionSpec<Integer> $$25 = $$1.accepts("fullscreenWidth").withRequiredArg().ofType(Integer.class);
      OptionSpec<Integer> $$26 = $$1.accepts("fullscreenHeight").withRequiredArg().ofType(Integer.class);
      OptionSpec<String> $$27 = $$1.accepts("userProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      OptionSpec<String> $$28 = $$1.accepts("profileProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      OptionSpec<String> $$29 = $$1.accepts("assetIndex").withRequiredArg();
      OptionSpec<String> $$30 = $$1.accepts("userType").withRequiredArg().defaultsTo("legacy", new String[0]);
      OptionSpec<String> $$31 = $$1.accepts("versionType").withRequiredArg().defaultsTo("release", new String[0]);
      OptionSpec<String> $$32 = $$1.nonOptions();
      OptionSet $$33 = $$1.parse($$0);
      File $$34 = a($$33, $$10);
      String $$35 = a($$33, $$22);
      String $$36 = "Pre-bootstrap";

      Logger $$40;
      ggh $$73;
      try {
         if ($$33.has($$3)) {
            brl.f.a(brj.a);
         }

         if ($$33.has($$4)) {
            fhx.a();
         }

         Stopwatch $$37 = Stopwatch.createStarted(Ticker.systemTicker());
         Stopwatch $$38 = Stopwatch.createStarted(Ticker.systemTicker());
         hqu.a.a(hqq.z, $$37);
         hqu.a.a(hqq.A, $$38);
         ac.a();
         TracyClient.reportAppInfo("Minecraft Java Edition " + ac.b().c());
         CompletableFuture<?> $$39 = bbg.a(bbf.t);
         p.g();
         $$40 = LogUtils.getLogger();
         $$36 = "Bootstrap";
         alm.a();
         fqp.a();
         hqu.a.a(alm.b.get());
         alm.c();
         $$36 = "Argument parsing";
         List<String> $$41 = $$33.valuesOf($$32);
         if (!$$41.isEmpty()) {
            $$40.info("Completely ignored arguments: {}", $$41);
         }

         String $$42 = (String)$$30.value($$33);
         frr.a $$43 = frr.a.a($$42);
         if ($$43 == null) {
            $$40.warn("Unrecognized user type: {}", $$42);
         }

         String $$44 = a($$33, $$13);
         Proxy $$45 = Proxy.NO_PROXY;
         if ($$44 != null) {
            try {
               $$45 = new Proxy(Type.SOCKS, new InetSocketAddress($$44, a($$33, $$14)));
            } catch (Exception var83) {
            }
         }

         final String $$46 = a($$33, $$15);
         final String $$47 = a($$33, $$16);
         if (!$$45.equals(Proxy.NO_PROXY) && c($$46) && c($$47)) {
            Authenticator.setDefault(new Authenticator() {
               @Override
               protected PasswordAuthentication getPasswordAuthentication() {
                  return new PasswordAuthentication($$46, $$47.toCharArray());
               }
            });
         }

         int $$48 = a($$33, $$23);
         int $$49 = a($$33, $$24);
         OptionalInt $$50 = a(a($$33, $$25));
         OptionalInt $$51 = a(a($$33, $$26));
         boolean $$52 = $$33.has("fullscreen");
         boolean $$53 = $$33.has("demo");
         boolean $$54 = $$33.has("disableMultiplayer");
         boolean $$55 = $$33.has("disableChat");
         boolean $$56 = !$$33.has($$5);
         boolean $$57 = $$33.has($$2);
         Gson $$58 = new GsonBuilder().registerTypeAdapter(PropertyMap.class, new Serializer()).create();
         PropertyMap $$59 = azg.a($$58, a($$33, $$27), PropertyMap.class);
         PropertyMap $$60 = azg.a($$58, a($$33, $$28), PropertyMap.class);
         String $$61 = a($$33, $$31);
         File $$62 = $$33.has($$11) ? a($$33, $$11) : new File($$34, "assets/");
         File $$63 = $$33.has($$12) ? a($$33, $$12) : new File($$34, "resourcepacks/");
         UUID $$64 = a($$18, $$33, $$40) ? UndashedUuid.fromStringLenient((String)$$18.value($$33)) : ka.a((String)$$17.value($$33));
         String $$65 = $$33.has($$29) ? (String)$$29.value($$33) : null;
         String $$66 = (String)$$33.valueOf($$19);
         String $$67 = (String)$$33.valueOf($$20);
         String $$68 = a($$33, $$6);
         String $$69 = a(a($$33, $$7));
         String $$70 = a(a($$33, $$8));
         String $$71 = a(a($$33, $$9));
         frr $$72 = new frr((String)$$17.value($$33), $$64, (String)$$21.value($$33), b($$66), b($$67), $$43);
         $$73 = new ggh(
            new ggh.d($$72, $$59, $$60, $$45),
            new fjz($$48, $$49, $$50, $$51, $$52),
            new ggh.a($$34, $$63, $$62, $$65),
            new ggh.b($$53, $$35, $$61, $$54, $$55, $$56, $$57),
            new ggh.c($$68, $$69, $$70, $$71)
         );
         ag.p();
         $$39.join();
      } catch (Throwable var84) {
         p $$75 = p.a(var84, $$36);
         q $$76 = $$75.a("Initialization");
         azr.a($$76);
         frf.a(null, null, $$35, null, $$75);
         frf.a(null, $$34, $$75);
         return;
      }

      Thread $$79 = new Thread("Client Shutdown Thread") {
         @Override
         public void run() {
            frf $$0 = frf.Q();
            if ($$0 != null) {
               hpn $$1 = $$0.V();
               if ($$1 != null) {
                  $$1.a(true);
               }
            }
         }
      };
      $$79.setUncaughtExceptionHandler(new s($$40));
      Runtime.getRuntime().addShutdownHook($$79);
      frf $$80 = null;

      try {
         Thread.currentThread().setName("Render thread");
         RenderSystem.initRenderThread();
         $$80 = new frf($$73);
      } catch (ggi var81) {
         ag.k();
         $$40.warn("Failed to create window: ", var81);
         return;
      } catch (Throwable var82) {
         p $$83 = p.a(var82, "Initializing game");
         q $$84 = $$83.a("Initialization");
         azr.a($$84);
         frf.a($$80, null, $$73.d.b, null, $$83);
         frf.a($$80, $$73.c.a, $$83);
         return;
      }

      frf $$85 = $$80;
      $$80.f();

      try {
         $$85.q();
      } finally {
         $$80.n();
      }
   }

   @Nullable
   private static String a(@Nullable String $$0) {
      return $$0 == null ? null : StringEscapeUtils.unescapeJava($$0);
   }

   private static Optional<String> b(String $$0) {
      return $$0.isEmpty() ? Optional.empty() : Optional.of($$0);
   }

   private static OptionalInt a(@Nullable Integer $$0) {
      return $$0 != null ? OptionalInt.of($$0) : OptionalInt.empty();
   }

   @Nullable
   private static <T> T a(OptionSet $$0, OptionSpec<T> $$1) {
      try {
         return (T)$$0.valueOf($$1);
      } catch (Throwable var5) {
         if ($$1 instanceof ArgumentAcceptingOptionSpec<T> $$3) {
            List<T> $$4 = $$3.defaultValues();
            if (!$$4.isEmpty()) {
               return $$4.get(0);
            }
         }

         throw var5;
      }
   }

   private static boolean c(@Nullable String $$0) {
      return $$0 != null && !$$0.isEmpty();
   }

   private static boolean a(OptionSpec<String> $$0, OptionSet $$1, Logger $$2) {
      return $$1.has($$0) && b($$0, $$1, $$2);
   }

   private static boolean b(OptionSpec<String> $$0, OptionSet $$1, Logger $$2) {
      try {
         UndashedUuid.fromStringLenient((String)$$0.value($$1));
         return true;
      } catch (IllegalArgumentException var4) {
         $$2.warn("Invalid UUID: '{}", $$0.value($$1));
         return false;
      }
   }

   static {
      System.setProperty("java.awt.headless", "true");
   }
}
