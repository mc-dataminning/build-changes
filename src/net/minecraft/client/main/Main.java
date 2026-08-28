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
      OptionSpec<String> $$3 = $$1.accepts("quickPlayPath").withRequiredArg();
      OptionSpec<String> $$4 = $$1.accepts("quickPlaySingleplayer").withRequiredArg();
      OptionSpec<String> $$5 = $$1.accepts("quickPlayMultiplayer").withRequiredArg();
      OptionSpec<String> $$6 = $$1.accepts("quickPlayRealms").withRequiredArg();
      OptionSpec<File> $$7 = $$1.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), new File[0]);
      OptionSpec<File> $$8 = $$1.accepts("assetsDir").withRequiredArg().ofType(File.class);
      OptionSpec<File> $$9 = $$1.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
      OptionSpec<String> $$10 = $$1.accepts("proxyHost").withRequiredArg();
      OptionSpec<Integer> $$11 = $$1.accepts("proxyPort").withRequiredArg().defaultsTo("8080", new String[0]).ofType(Integer.class);
      OptionSpec<String> $$12 = $$1.accepts("proxyUser").withRequiredArg();
      OptionSpec<String> $$13 = $$1.accepts("proxyPass").withRequiredArg();
      OptionSpec<String> $$14 = $$1.accepts("username").withRequiredArg().defaultsTo("Player" + System.currentTimeMillis() % 1000L, new String[0]);
      OptionSpec<String> $$15 = $$1.accepts("uuid").withRequiredArg();
      OptionSpec<String> $$16 = $$1.accepts("xuid").withOptionalArg().defaultsTo("", new String[0]);
      OptionSpec<String> $$17 = $$1.accepts("clientId").withOptionalArg().defaultsTo("", new String[0]);
      OptionSpec<String> $$18 = $$1.accepts("accessToken").withRequiredArg().required();
      OptionSpec<String> $$19 = $$1.accepts("version").withRequiredArg().required();
      OptionSpec<Integer> $$20 = $$1.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(854, new Integer[0]);
      OptionSpec<Integer> $$21 = $$1.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(480, new Integer[0]);
      OptionSpec<Integer> $$22 = $$1.accepts("fullscreenWidth").withRequiredArg().ofType(Integer.class);
      OptionSpec<Integer> $$23 = $$1.accepts("fullscreenHeight").withRequiredArg().ofType(Integer.class);
      OptionSpec<String> $$24 = $$1.accepts("userProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      OptionSpec<String> $$25 = $$1.accepts("profileProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      OptionSpec<String> $$26 = $$1.accepts("assetIndex").withRequiredArg();
      OptionSpec<String> $$27 = $$1.accepts("userType").withRequiredArg().defaultsTo("legacy", new String[0]);
      OptionSpec<String> $$28 = $$1.accepts("versionType").withRequiredArg().defaultsTo("release", new String[0]);
      OptionSpec<String> $$29 = $$1.nonOptions();
      OptionSet $$30 = $$1.parse($$0);
      File $$31 = a($$30, $$7);
      String $$32 = a($$30, $$19);
      String $$33 = "Pre-bootstrap";

      Logger $$37;
      fwn $$68;
      try {
         if ($$30.has($$2)) {
            boq.f.a(boo.a);
         }

         Stopwatch $$34 = Stopwatch.createStarted(Ticker.systemTicker());
         Stopwatch $$35 = Stopwatch.createStarted(Ticker.systemTicker());
         hdj.a.a(hdf.z, $$34);
         hdj.a.a(hdf.A, $$35);
         ab.a();
         CompletableFuture<?> $$36 = bat.a(bas.t);
         o.g();
         $$37 = LogUtils.getLogger();
         $$33 = "Bootstrap";
         alj.a();
         hdj.a.a(alj.b.get());
         alj.c();
         $$33 = "Argument parsing";
         List<String> $$38 = $$30.valuesOf($$29);
         if (!$$38.isEmpty()) {
            $$37.info("Completely ignored arguments: {}", $$38);
         }

         String $$39 = (String)$$27.value($$30);
         fjn.a $$40 = fjn.a.a($$39);
         if ($$40 == null) {
            $$37.warn("Unrecognized user type: {}", $$39);
         }

         String $$41 = a($$30, $$10);
         Proxy $$42 = Proxy.NO_PROXY;
         if ($$41 != null) {
            try {
               $$42 = new Proxy(Type.SOCKS, new InetSocketAddress($$41, a($$30, $$11)));
            } catch (Exception var78) {
            }
         }

         final String $$43 = a($$30, $$12);
         final String $$44 = a($$30, $$13);
         if (!$$42.equals(Proxy.NO_PROXY) && c($$43) && c($$44)) {
            Authenticator.setDefault(new Authenticator() {
               @Override
               protected PasswordAuthentication getPasswordAuthentication() {
                  return new PasswordAuthentication($$43, $$44.toCharArray());
               }
            });
         }

         int $$45 = a($$30, $$20);
         int $$46 = a($$30, $$21);
         OptionalInt $$47 = a(a($$30, $$22));
         OptionalInt $$48 = a(a($$30, $$23));
         boolean $$49 = $$30.has("fullscreen");
         boolean $$50 = $$30.has("demo");
         boolean $$51 = $$30.has("disableMultiplayer");
         boolean $$52 = $$30.has("disableChat");
         Gson $$53 = new GsonBuilder().registerTypeAdapter(PropertyMap.class, new Serializer()).create();
         PropertyMap $$54 = ayz.a($$53, a($$30, $$24), PropertyMap.class);
         PropertyMap $$55 = ayz.a($$53, a($$30, $$25), PropertyMap.class);
         String $$56 = a($$30, $$28);
         File $$57 = $$30.has($$8) ? a($$30, $$8) : new File($$31, "assets/");
         File $$58 = $$30.has($$9) ? a($$30, $$9) : new File($$31, "resourcepacks/");
         UUID $$59 = a($$15, $$30, $$37) ? UndashedUuid.fromStringLenient((String)$$15.value($$30)) : kj.a((String)$$14.value($$30));
         String $$60 = $$30.has($$26) ? (String)$$26.value($$30) : null;
         String $$61 = (String)$$30.valueOf($$16);
         String $$62 = (String)$$30.valueOf($$17);
         String $$63 = a($$30, $$3);
         String $$64 = a(a($$30, $$4));
         String $$65 = a(a($$30, $$5));
         String $$66 = a(a($$30, $$6));
         fjn $$67 = new fjn((String)$$14.value($$30), $$59, (String)$$18.value($$30), b($$61), b($$62), $$40);
         $$68 = new fwn(
            new fwn.d($$67, $$54, $$55, $$42),
            new fcj($$45, $$46, $$47, $$48, $$49),
            new fwn.a($$31, $$58, $$57, $$60),
            new fwn.b($$50, $$32, $$56, $$51, $$52),
            new fwn.c($$63, $$64, $$65, $$66)
         );
         ad.o();
         $$36.join();
      } catch (Throwable var79) {
         o $$70 = o.a(var79, $$33);
         p $$71 = $$70.a("Initialization");
         azk.a($$71);
         fja.a(null, null, $$32, null, $$70);
         fja.a(null, $$31, $$70);
         return;
      }

      Thread $$74 = new Thread("Client Shutdown Thread") {
         @Override
         public void run() {
            fja $$0 = fja.Q();
            if ($$0 != null) {
               hcd $$1 = $$0.V();
               if ($$1 != null) {
                  $$1.a(true);
               }
            }
         }
      };
      $$74.setUncaughtExceptionHandler(new r($$37));
      Runtime.getRuntime().addShutdownHook($$74);
      fja $$75 = null;

      try {
         Thread.currentThread().setName("Render thread");
         RenderSystem.initRenderThread();
         RenderSystem.beginInitialization();
         $$75 = new fja($$68);
         RenderSystem.finishInitialization();
      } catch (fwo var76) {
         ad.j();
         $$37.warn("Failed to create window: ", var76);
         return;
      } catch (Throwable var77) {
         o $$78 = o.a(var77, "Initializing game");
         p $$79 = $$78.a("Initialization");
         azk.a($$79);
         fja.a($$75, null, $$68.d.b, null, $$78);
         fja.a($$75, $$68.c.a, $$78);
         return;
      }

      fja $$80 = $$75;
      $$75.f();
      fdp.a();

      try {
         $$80.q();
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
