package net.minecraft.client.main;

import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.properties.PropertyMap.Serializer;
import com.mojang.blaze3d.systems.RenderSystem;
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
import javax.annotation.Nullable;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import net.minecraft.obfuscate.DontObfuscate;
import org.apache.commons.lang3.StringEscapeUtils;
import org.slf4j.Logger;

public class Main {
   static final Logger a = LogUtils.getLogger();

   @DontObfuscate
   public static void main(String[] $$0) {
      Stopwatch $$1 = Stopwatch.createStarted(Ticker.systemTicker());
      Stopwatch $$2 = Stopwatch.createStarted(Ticker.systemTicker());
      guk.a.a(gug.z, $$1);
      guk.a.a(gug.A, $$2);
      aa.a();
      aa.d();
      OptionParser $$3 = new OptionParser();
      $$3.allowsUnrecognizedOptions();
      $$3.accepts("demo");
      $$3.accepts("disableMultiplayer");
      $$3.accepts("disableChat");
      $$3.accepts("fullscreen");
      $$3.accepts("checkGlErrors");
      OptionSpec<Void> $$4 = $$3.accepts("jfrProfile");
      OptionSpec<String> $$5 = $$3.accepts("quickPlayPath").withRequiredArg();
      OptionSpec<String> $$6 = $$3.accepts("quickPlaySingleplayer").withRequiredArg();
      OptionSpec<String> $$7 = $$3.accepts("quickPlayMultiplayer").withRequiredArg();
      OptionSpec<String> $$8 = $$3.accepts("quickPlayRealms").withRequiredArg();
      OptionSpec<File> $$9 = $$3.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), new File[0]);
      OptionSpec<File> $$10 = $$3.accepts("assetsDir").withRequiredArg().ofType(File.class);
      OptionSpec<File> $$11 = $$3.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
      OptionSpec<String> $$12 = $$3.accepts("proxyHost").withRequiredArg();
      OptionSpec<Integer> $$13 = $$3.accepts("proxyPort").withRequiredArg().defaultsTo("8080", new String[0]).ofType(Integer.class);
      OptionSpec<String> $$14 = $$3.accepts("proxyUser").withRequiredArg();
      OptionSpec<String> $$15 = $$3.accepts("proxyPass").withRequiredArg();
      OptionSpec<String> $$16 = $$3.accepts("username").withRequiredArg().defaultsTo("Player" + ac.c() % 1000L, new String[0]);
      OptionSpec<String> $$17 = $$3.accepts("uuid").withRequiredArg();
      OptionSpec<String> $$18 = $$3.accepts("xuid").withOptionalArg().defaultsTo("", new String[0]);
      OptionSpec<String> $$19 = $$3.accepts("clientId").withOptionalArg().defaultsTo("", new String[0]);
      OptionSpec<String> $$20 = $$3.accepts("accessToken").withRequiredArg().required();
      OptionSpec<String> $$21 = $$3.accepts("version").withRequiredArg().required();
      OptionSpec<Integer> $$22 = $$3.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(854, new Integer[0]);
      OptionSpec<Integer> $$23 = $$3.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(480, new Integer[0]);
      OptionSpec<Integer> $$24 = $$3.accepts("fullscreenWidth").withRequiredArg().ofType(Integer.class);
      OptionSpec<Integer> $$25 = $$3.accepts("fullscreenHeight").withRequiredArg().ofType(Integer.class);
      OptionSpec<String> $$26 = $$3.accepts("userProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      OptionSpec<String> $$27 = $$3.accepts("profileProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      OptionSpec<String> $$28 = $$3.accepts("assetIndex").withRequiredArg();
      OptionSpec<String> $$29 = $$3.accepts("userType").withRequiredArg().defaultsTo(fft.a.a.a(), new String[0]);
      OptionSpec<String> $$30 = $$3.accepts("versionType").withRequiredArg().defaultsTo("release", new String[0]);
      OptionSpec<String> $$31 = $$3.nonOptions();
      OptionSet $$32 = $$3.parse($$0);
      List<String> $$33 = $$32.valuesOf($$31);
      if (!$$33.isEmpty()) {
         a.info("Completely ignored arguments: {}", $$33);
      }

      String $$34 = a($$32, $$12);
      Proxy $$35 = Proxy.NO_PROXY;
      if ($$34 != null) {
         try {
            $$35 = new Proxy(Type.SOCKS, new InetSocketAddress($$34, a($$32, $$13)));
         } catch (Exception var85) {
         }
      }

      final String $$36 = a($$32, $$14);
      final String $$37 = a($$32, $$15);
      if (!$$35.equals(Proxy.NO_PROXY) && c($$36) && c($$37)) {
         Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication($$36, $$37.toCharArray());
            }
         });
      }

      int $$38 = a($$32, $$22);
      int $$39 = a($$32, $$23);
      OptionalInt $$40 = a(a($$32, $$24));
      OptionalInt $$41 = a(a($$32, $$25));
      boolean $$42 = $$32.has("fullscreen");
      boolean $$43 = $$32.has("demo");
      boolean $$44 = $$32.has("disableMultiplayer");
      boolean $$45 = $$32.has("disableChat");
      String $$46 = a($$32, $$21);
      Gson $$47 = new GsonBuilder().registerTypeAdapter(PropertyMap.class, new Serializer()).create();
      PropertyMap $$48 = ayp.a($$47, a($$32, $$26), PropertyMap.class);
      PropertyMap $$49 = ayp.a($$47, a($$32, $$27), PropertyMap.class);
      String $$50 = a($$32, $$30);
      File $$51 = a($$32, $$9);
      File $$52 = $$32.has($$10) ? a($$32, $$10) : new File($$51, "assets/");
      File $$53 = $$32.has($$11) ? a($$32, $$11) : new File($$51, "resourcepacks/");
      UUID $$54 = $$32.has($$17) ? UndashedUuid.fromStringLenient((String)$$17.value($$32)) : kc.a((String)$$16.value($$32));
      String $$55 = $$32.has($$28) ? (String)$$28.value($$32) : null;
      String $$56 = (String)$$32.valueOf($$18);
      String $$57 = (String)$$32.valueOf($$19);
      String $$58 = a($$32, $$5);
      String $$59 = a(a($$32, $$6));
      String $$60 = a(a($$32, $$7));
      String $$61 = a(a($$32, $$8));
      if ($$32.has($$4)) {
         bno.f.a(bnm.a);
      }

      o.h();

      try {
         alh.a();
         guk.a.a(alh.b.get());
         alh.c();
      } catch (Throwable var84) {
         o $$63 = o.a(var84, "Bootstrap");
         p $$64 = $$63.a("Initialization");
         aza.a($$64);
         fff.a(null, null, $$46, null, $$63);
         fff.a(null, $$51, $$63);
         return;
      }

      String $$65 = (String)$$29.value($$32);
      fft.a $$66 = fft.a.a($$65);
      if ($$66 == null) {
         a.warn("Unrecognized user type: {}", $$65);
      }

      fft $$67 = new fft((String)$$16.value($$32), $$54, (String)$$20.value($$32), b($$56), b($$57), $$66);
      fsq $$68 = new fsq(
         new fsq.d($$67, $$48, $$49, $$35),
         new eyp($$38, $$39, $$40, $$41, $$42),
         new fsq.a($$51, $$53, $$52, $$55),
         new fsq.b($$43, $$46, $$50, $$44, $$45),
         new fsq.c($$58, $$59, $$60, $$61)
      );
      ac.m();
      Thread $$69 = new Thread("Client Shutdown Thread") {
         @Override
         public void run() {
            fff $$0 = fff.Q();
            if ($$0 != null) {
               gte $$1 = $$0.V();
               if ($$1 != null) {
                  $$1.a(true);
               }
            }
         }
      };
      $$69.setUncaughtExceptionHandler(new r(a));
      Runtime.getRuntime().addShutdownHook($$69);
      final fff $$70 = null;

      try {
         Thread.currentThread().setName("Render thread");
         RenderSystem.initRenderThread();
         RenderSystem.beginInitialization();
         $$70 = new fff($$68);
         RenderSystem.finishInitialization();
      } catch (fsr var82) {
         ac.j();
         a.warn("Failed to create window: ", var82);
         return;
      } catch (Throwable var83) {
         o $$73 = o.a(var83, "Initializing game");
         p $$74 = $$73.a("Initialization");
         aza.a($$74);
         fff.a($$70, null, $$68.d.b, null, $$73);
         fff.a($$70, $$68.c.a, $$73);
         return;
      }

      fff $$75 = $$70;
      Thread $$76;
      if ($$70.aN()) {
         $$76 = new Thread("Game thread") {
            @Override
            public void run() {
               try {
                  RenderSystem.initGameThread(true);
                  $$70.f();
               } catch (Throwable var2) {
                  Main.a.error("Exception in client thread", var2);
               }
            }
         };
         $$76.start();

         while ($$75.r()) {
         }
      } else {
         $$76 = null;

         try {
            RenderSystem.initGameThread(false);
            $$75.f();
         } catch (Throwable var81) {
            a.error("Unhandled game exception", var81);
         }
      }

      ezu.a();

      try {
         $$75.q();
         if ($$76 != null) {
            $$76.join();
         }
      } catch (InterruptedException var79) {
         a.error("Exception during client thread shutdown", var79);
      } finally {
         $$75.n();
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

   static {
      System.setProperty("java.awt.headless", "true");
   }
}
