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
import org.slf4j.Logger;

public class Main {
   static final Logger a = LogUtils.getLogger();

   @DontObfuscate
   public static void main(String[] $$0) {
      Stopwatch $$1 = Stopwatch.createStarted(Ticker.systemTicker());
      Stopwatch $$2 = Stopwatch.createStarted(Ticker.systemTicker());
      gdh.a.a(gdd.z, $$1);
      gdh.a.a(gdd.A, $$2);
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
      OptionSpec<String> $$16 = $$3.accepts("username").withRequiredArg().defaultsTo("Player" + ac.b() % 1000L, new String[0]);
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
      OptionSpec<String> $$29 = $$3.accepts("userType").withRequiredArg().defaultsTo(erc.a.a.a(), new String[0]);
      OptionSpec<String> $$30 = $$3.accepts("versionType").withRequiredArg().defaultsTo("release", new String[0]);
      OptionSpec<String> $$31 = $$3.nonOptions();
      OptionSet $$32 = $$3.parse($$0);
      List<String> $$33 = $$32.valuesOf($$31);
      if (!$$33.isEmpty()) {
         a.info("Completely ignored arguments: " + $$33);
      }

      String $$34 = a($$32, $$12);
      Proxy $$35 = Proxy.NO_PROXY;
      if ($$34 != null) {
         try {
            $$35 = new Proxy(Type.SOCKS, new InetSocketAddress($$34, a($$32, $$13)));
         } catch (Exception var83) {
         }
      }

      final String $$36 = a($$32, $$14);
      final String $$37 = a($$32, $$15);
      if (!$$35.equals(Proxy.NO_PROXY) && b($$36) && b($$37)) {
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
      PropertyMap $$48 = arf.a($$47, a($$32, $$26), PropertyMap.class);
      PropertyMap $$49 = arf.a($$47, a($$32, $$27), PropertyMap.class);
      String $$50 = a($$32, $$30);
      File $$51 = a($$32, $$9);
      File $$52 = $$32.has($$10) ? a($$32, $$10) : new File($$51, "assets/");
      File $$53 = $$32.has($$11) ? a($$32, $$11) : new File($$51, "resourcepacks/");
      UUID $$54 = $$32.has($$17) ? UndashedUuid.fromStringLenient((String)$$17.value($$32)) : hz.a((String)$$16.value($$32));
      String $$55 = $$32.has($$28) ? (String)$$28.value($$32) : null;
      String $$56 = (String)$$32.valueOf($$18);
      String $$57 = (String)$$32.valueOf($$19);
      String $$58 = a($$32, $$5);
      String $$59 = a($$32, $$6);
      String $$60 = a($$32, $$7);
      String $$61 = a($$32, $$8);
      if ($$32.has($$4)) {
         bdk.e.a(bdi.a);
      }

      o.h();
      aer.a();
      gdh.a.a(aer.b.get());
      aer.c();
      ac.l();
      String $$62 = (String)$$29.value($$32);
      erc.a $$63 = erc.a.a($$62);
      if ($$63 == null) {
         a.warn("Unrecognized user type: {}", $$62);
      }

      erc $$64 = new erc((String)$$16.value($$32), $$54, (String)$$20.value($$32), a($$56), a($$57), $$63);
      fdd $$65 = new fdd(
         new fdd.d($$64, $$48, $$49, $$35),
         new ejy($$38, $$39, $$40, $$41, $$42),
         new fdd.a($$51, $$53, $$52, $$55),
         new fdd.b($$43, $$46, $$50, $$44, $$45),
         new fdd.c($$58, $$59, $$60, $$61)
      );
      Thread $$66 = new Thread("Client Shutdown Thread") {
         @Override
         public void run() {
            eqn $$0 = eqn.N();
            if ($$0 != null) {
               gcf $$1 = $$0.S();
               if ($$1 != null) {
                  $$1.a(true);
               }
            }
         }
      };
      $$66.setUncaughtExceptionHandler(new r(a));
      Runtime.getRuntime().addShutdownHook($$66);

      final eqn $$67;
      try {
         Thread.currentThread().setName("Render thread");
         RenderSystem.initRenderThread();
         RenderSystem.beginInitialization();
         $$67 = new eqn($$65);
         RenderSystem.finishInitialization();
      } catch (fde var81) {
         a.warn("Failed to create window: ", var81);
         return;
      } catch (Throwable var82) {
         o $$70 = o.a(var82, "Initializing game");
         p $$71 = $$70.a("Initialization");
         arp.a($$71);
         eqn.a(null, null, $$65.d.b, null, $$70);
         eqn.c($$70);
         return;
      }

      Thread $$73;
      if ($$67.aL()) {
         $$73 = new Thread("Game thread") {
            @Override
            public void run() {
               try {
                  RenderSystem.initGameThread(true);
                  $$67.e();
               } catch (Throwable var2) {
                  Main.a.error("Exception in client thread", var2);
               }
            }
         };
         $$73.start();

         while ($$67.q()) {
         }
      } else {
         $$73 = null;

         try {
            RenderSystem.initGameThread(false);
            $$67.e();
         } catch (Throwable var80) {
            a.error("Unhandled game exception", var80);
         }
      }

      eld.a();

      try {
         $$67.p();
         if ($$73 != null) {
            $$73.join();
         }
      } catch (InterruptedException var78) {
         a.error("Exception during client thread shutdown", var78);
      } finally {
         $$67.l();
      }
   }

   private static Optional<String> a(String $$0) {
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

   private static boolean b(@Nullable String $$0) {
      return $$0 != null && !$$0.isEmpty();
   }

   static {
      System.setProperty("java.awt.headless", "true");
   }
}
