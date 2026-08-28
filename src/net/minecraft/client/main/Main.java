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
      OptionSpec<Void> $$2 = $$1.accepts("jfrProfile");
      OptionSpec<Void> $$3 = $$1.accepts("tracy");
      OptionSpec<Void> $$4 = $$1.accepts("tracyNoImages");
      OptionSpec<String> $$5 = $$1.accepts("quickPlayPath").withRequiredArg();
      OptionSpec<String> $$6 = $$1.accepts("quickPlaySingleplayer").withRequiredArg();
      OptionSpec<String> $$7 = $$1.accepts("quickPlayMultiplayer").withRequiredArg();
      OptionSpec<String> $$8 = $$1.accepts("quickPlayRealms").withRequiredArg();
      OptionSpec<File> $$9 = $$1.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), new File[0]);
      OptionSpec<File> $$10 = $$1.accepts("assetsDir").withRequiredArg().ofType(File.class);
      OptionSpec<File> $$11 = $$1.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
      OptionSpec<String> $$12 = $$1.accepts("proxyHost").withRequiredArg();
      OptionSpec<Integer> $$13 = $$1.accepts("proxyPort").withRequiredArg().defaultsTo("8080", new String[0]).ofType(Integer.class);
      OptionSpec<String> $$14 = $$1.accepts("proxyUser").withRequiredArg();
      OptionSpec<String> $$15 = $$1.accepts("proxyPass").withRequiredArg();
      OptionSpec<String> $$16 = $$1.accepts("username").withRequiredArg().defaultsTo("Player" + System.currentTimeMillis() % 1000L, new String[0]);
      OptionSpec<String> $$17 = $$1.accepts("uuid").withRequiredArg();
      OptionSpec<String> $$18 = $$1.accepts("xuid").withOptionalArg().defaultsTo("", new String[0]);
      OptionSpec<String> $$19 = $$1.accepts("clientId").withOptionalArg().defaultsTo("", new String[0]);
      OptionSpec<String> $$20 = $$1.accepts("accessToken").withRequiredArg().required();
      OptionSpec<String> $$21 = $$1.accepts("version").withRequiredArg().required();
      OptionSpec<Integer> $$22 = $$1.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(854, new Integer[0]);
      OptionSpec<Integer> $$23 = $$1.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(480, new Integer[0]);
      OptionSpec<Integer> $$24 = $$1.accepts("fullscreenWidth").withRequiredArg().ofType(Integer.class);
      OptionSpec<Integer> $$25 = $$1.accepts("fullscreenHeight").withRequiredArg().ofType(Integer.class);
      OptionSpec<String> $$26 = $$1.accepts("userProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      OptionSpec<String> $$27 = $$1.accepts("profileProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      OptionSpec<String> $$28 = $$1.accepts("assetIndex").withRequiredArg();
      OptionSpec<String> $$29 = $$1.accepts("userType").withRequiredArg().defaultsTo("legacy", new String[0]);
      OptionSpec<String> $$30 = $$1.accepts("versionType").withRequiredArg().defaultsTo("release", new String[0]);
      OptionSpec<String> $$31 = $$1.nonOptions();
      OptionSet $$32 = $$1.parse($$0);
      File $$33 = a($$32, $$9);
      String $$34 = a($$32, $$21);
      String $$35 = "Pre-bootstrap";

      Logger $$39;
      gak $$71;
      try {
         if ($$32.has($$2)) {
            bpa.f.a(boy.a);
         }

         if ($$32.has($$3)) {
            fdd.a();
         }

         Stopwatch $$36 = Stopwatch.createStarted(Ticker.systemTicker());
         Stopwatch $$37 = Stopwatch.createStarted(Ticker.systemTicker());
         hkj.a.a(hkf.z, $$36);
         hkj.a.a(hkf.A, $$37);
         ab.a();
         TracyClient.reportAppInfo("Minecraft Java Edition " + ab.b().c());
         CompletableFuture<?> $$38 = bao.a(ban.t);
         o.g();
         $$39 = LogUtils.getLogger();
         $$35 = "Bootstrap";
         akx.a();
         fks.a();
         hkj.a.a(akx.b.get());
         akx.c();
         $$35 = "Argument parsing";
         List<String> $$40 = $$32.valuesOf($$31);
         if (!$$40.isEmpty()) {
            $$39.info("Completely ignored arguments: {}", $$40);
         }

         String $$41 = (String)$$29.value($$32);
         flu.a $$42 = flu.a.a($$41);
         if ($$42 == null) {
            $$39.warn("Unrecognized user type: {}", $$41);
         }

         String $$43 = a($$32, $$12);
         Proxy $$44 = Proxy.NO_PROXY;
         if ($$43 != null) {
            try {
               $$44 = new Proxy(Type.SOCKS, new InetSocketAddress($$43, a($$32, $$13)));
            } catch (Exception var81) {
            }
         }

         final String $$45 = a($$32, $$14);
         final String $$46 = a($$32, $$15);
         if (!$$44.equals(Proxy.NO_PROXY) && c($$45) && c($$46)) {
            Authenticator.setDefault(new Authenticator() {
               @Override
               protected PasswordAuthentication getPasswordAuthentication() {
                  return new PasswordAuthentication($$45, $$46.toCharArray());
               }
            });
         }

         int $$47 = a($$32, $$22);
         int $$48 = a($$32, $$23);
         OptionalInt $$49 = a(a($$32, $$24));
         OptionalInt $$50 = a(a($$32, $$25));
         boolean $$51 = $$32.has("fullscreen");
         boolean $$52 = $$32.has("demo");
         boolean $$53 = $$32.has("disableMultiplayer");
         boolean $$54 = $$32.has("disableChat");
         boolean $$55 = !$$32.has($$4);
         Gson $$56 = new GsonBuilder().registerTypeAdapter(PropertyMap.class, new Serializer()).create();
         PropertyMap $$57 = ayp.a($$56, a($$32, $$26), PropertyMap.class);
         PropertyMap $$58 = ayp.a($$56, a($$32, $$27), PropertyMap.class);
         String $$59 = a($$32, $$30);
         File $$60 = $$32.has($$10) ? a($$32, $$10) : new File($$33, "assets/");
         File $$61 = $$32.has($$11) ? a($$32, $$11) : new File($$33, "resourcepacks/");
         UUID $$62 = a($$17, $$32, $$39) ? UndashedUuid.fromStringLenient((String)$$17.value($$32)) : kl.a((String)$$16.value($$32));
         String $$63 = $$32.has($$28) ? (String)$$28.value($$32) : null;
         String $$64 = (String)$$32.valueOf($$18);
         String $$65 = (String)$$32.valueOf($$19);
         String $$66 = a($$32, $$5);
         String $$67 = a(a($$32, $$6));
         String $$68 = a(a($$32, $$7));
         String $$69 = a(a($$32, $$8));
         flu $$70 = new flu((String)$$16.value($$32), $$62, (String)$$20.value($$32), b($$64), b($$65), $$42);
         $$71 = new gak(
            new gak.d($$70, $$57, $$58, $$44),
            new fej($$47, $$48, $$49, $$50, $$51),
            new gak.a($$33, $$61, $$60, $$63),
            new gak.b($$52, $$34, $$59, $$53, $$54, $$55),
            new gak.c($$66, $$67, $$68, $$69)
         );
         af.o();
         $$38.join();
      } catch (Throwable var82) {
         o $$73 = o.a(var82, $$35);
         p $$74 = $$73.a("Initialization");
         aza.a($$74);
         fli.a(null, null, $$34, null, $$73);
         fli.a(null, $$33, $$73);
         return;
      }

      Thread $$77 = new Thread("Client Shutdown Thread") {
         @Override
         public void run() {
            fli $$0 = fli.Q();
            if ($$0 != null) {
               hjc $$1 = $$0.V();
               if ($$1 != null) {
                  $$1.a(true);
               }
            }
         }
      };
      $$77.setUncaughtExceptionHandler(new r($$39));
      Runtime.getRuntime().addShutdownHook($$77);
      fli $$78 = null;

      try {
         Thread.currentThread().setName("Render thread");
         RenderSystem.initRenderThread();
         RenderSystem.beginInitialization();
         $$78 = new fli($$71);
         RenderSystem.finishInitialization();
      } catch (gal var79) {
         af.j();
         $$39.warn("Failed to create window: ", var79);
         return;
      } catch (Throwable var80) {
         o $$81 = o.a(var80, "Initializing game");
         p $$82 = $$81.a("Initialization");
         aza.a($$82);
         fli.a($$78, null, $$71.d.b, null, $$81);
         fli.a($$78, $$71.c.a, $$81);
         return;
      }

      fli $$83 = $$78;
      $$78.f();
      ffp.a();

      try {
         $$83.q();
      } finally {
         $$78.n();
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
