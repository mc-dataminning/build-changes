package net.minecraft.server;

import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.util.PathConverter;
import joptsimple.util.PathProperties;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public class Main {
   private static final Logger a = LogUtils.getLogger();

   @DontObfuscate
   public static void main(String[] $$0) {
      aa.a();
      OptionParser $$1 = new OptionParser();
      OptionSpec<Void> $$2 = $$1.accepts("nogui");
      OptionSpec<Void> $$3 = $$1.accepts("initSettings", "Initializes 'server.properties' and 'eula.txt', then quits");
      OptionSpec<Void> $$4 = $$1.accepts("demo");
      OptionSpec<Void> $$5 = $$1.accepts("bonusChest");
      OptionSpec<Void> $$6 = $$1.accepts("forceUpgrade");
      OptionSpec<Void> $$7 = $$1.accepts("eraseCache");
      OptionSpec<Void> $$8 = $$1.accepts("safeMode", "Loads level with vanilla datapack only");
      OptionSpec<Void> $$9 = $$1.accepts("help").forHelp();
      OptionSpec<String> $$10 = $$1.accepts("universe").withRequiredArg().defaultsTo(".", new String[0]);
      OptionSpec<String> $$11 = $$1.accepts("world").withRequiredArg();
      OptionSpec<Integer> $$12 = $$1.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(-1, new Integer[0]);
      OptionSpec<String> $$13 = $$1.accepts("serverId").withRequiredArg();
      OptionSpec<Void> $$14 = $$1.accepts("jfrProfile");
      OptionSpec<Path> $$15 = $$1.accepts("pidFile").withRequiredArg().withValuesConvertedBy(new PathConverter(new PathProperties[0]));
      OptionSpec<String> $$16 = $$1.nonOptions();

      try {
         OptionSet $$17 = $$1.parse($$0);
         if ($$17.has($$9)) {
            $$1.printHelpOn(System.err);
            return;
         }

         Path $$18 = (Path)$$17.valueOf($$15);
         if ($$18 != null) {
            a($$18);
         }

         o.h();
         if ($$17.has($$14)) {
            bfy.e.a(bfw.b);
         }

         ago.a();
         ago.c();
         ac.k();
         Path $$19 = Paths.get("server.properties");
         alh $$20 = new alh($$19);
         $$20.b();
         Path $$21 = Paths.get("eula.txt");
         ags $$22 = new ags($$21);
         if ($$17.has($$3)) {
            a.info("Initialized '{}' and '{}'", $$19.toAbsolutePath(), $$21.toAbsolutePath());
            return;
         }

         if (!$$22.a()) {
            a.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
            return;
         }

         File $$23 = new File((String)$$17.valueOf($$10));
         ahf $$24 = ahf.a(new YggdrasilAuthenticationService(Proxy.NO_PROXY), $$23);
         String $$25 = (String)Optional.ofNullable((String)$$17.valueOf($$11)).orElse($$20.a().m);
         ees $$26 = ees.b($$23.toPath());
         ees.c $$27 = $$26.d($$25);
         Dynamic<?> $$28;
         if ($$27.k()) {
            eet $$29;
            try {
               $$28 = $$27.f();
               $$29 = $$27.a($$28);
            } catch (so | su | IOException var39) {
               ees.b $$31 = $$27.c();
               a.warn("Failed to load world data from {}", $$31.b(), var39);
               a.info("Attempting to use fallback");

               try {
                  $$28 = $$27.g();
                  $$29 = $$27.a($$28);
               } catch (so | su | IOException var38) {
                  a.error("Failed to load world data from {}", $$31.c(), var38);
                  a.error("Failed to load world data from {} and {}. World files may be corrupted. Shutting down.", $$31.b(), $$31.c());
                  return;
               }

               $$27.l();
            }

            if ($$29.d()) {
               a.info("This world must be opened in an older version (like 1.6.4) to be safely converted");
               return;
            }

            if (!$$29.r()) {
               a.info("This world was created by an incompatible version.");
               return;
            }
         } else {
            $$28 = null;
         }

         Dynamic<?> $$38 = $$28;
         boolean $$39 = $$17.has($$8);
         if ($$39) {
            a.warn("Safe mode active, only vanilla datapack will be loaded");
         }

         aow $$40 = aoz.a($$27);

         ahi $$42;
         try {
            ahh.c $$41 = a($$20.a(), $$38, $$39, $$40);
            $$42 = ac.<ahi>c($$6x -> ahh.a($$41, $$5xx -> {
                  is<dkx> $$6xx = $$5xx.d().d(kd.aK);
                  if ($$38 != null) {
                     eep $$7x = ees.a($$38, $$5xx.b(), $$6xx, $$5xx.c());
                     return new ahh.b<>($$7x.a(), $$7x.b().b());
                  } else {
                     a.info("No existing world data, creating new world");
                     csj $$8x;
                     dnu $$9x;
                     dnr $$10x;
                     if ($$17.has($$4)) {
                        $$8x = MinecraftServer.e;
                        $$9x = dnu.b;
                        $$10x = dxc.a($$5xx.c());
                     } else {
                        alg $$11x = $$20.a();
                        $$8x = new csj($$11x.m, $$11x.l, $$11x.u, $$11x.k, false, new csb(), $$5xx.b());
                        $$9x = $$17.has($$5) ? $$11x.Y.a(true) : $$11x.Y;
                        $$10x = $$11x.a($$5xx.c());
                     }

                     dnr.b $$15x = $$10x.a($$6xx);
                     Lifecycle $$16x = $$15x.a().add($$5xx.c().d());
                     return new ahh.b<>(new eew($$8x, $$9x, $$15x.d(), $$16x), $$15x.b());
                  }
               }, ahi::new, ac.f(), $$6x)).get();
         } catch (Exception var37) {
            a.warn("Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", var37);
            return;
         }

         it.b $$45 = $$42.c().a();
         if ($$17.has($$6)) {
            a($$27, auy.a(), $$17.has($$7), () -> true, $$45.d(kd.aK));
         }

         eey $$46 = $$42.d();
         $$27.a($$45, $$46);
         final alf $$47 = MinecraftServer.a((Function<Thread, alf>)($$11x -> {
            alf $$12x = new alf($$11x, $$27, $$40, $$42, $$20, auy.a(), $$24, amt::new);
            $$12x.a((Integer)$$17.valueOf($$12));
            $$12x.c($$17.has($$4));
            $$12x.b((String)$$17.valueOf($$13));
            boolean $$13x = !$$17.has($$2) && !$$17.valuesOf($$16).contains("nogui");
            if ($$13x && !GraphicsEnvironment.isHeadless()) {
               $$12x.bm();
            }

            return $$12x;
         }));
         Thread $$48 = new Thread("Server Shutdown Thread") {
            @Override
            public void run() {
               $$47.a(true);
            }
         };
         $$48.setUncaughtExceptionHandler(new r(a));
         Runtime.getRuntime().addShutdownHook($$48);
      } catch (Exception var40) {
         a.error(LogUtils.FATAL_MARKER, "Failed to start the minecraft server", var40);
      }
   }

   private static void a(Path $$0) {
      try {
         long $$1 = ProcessHandle.current().pid();
         Files.writeString($$0, Long.toString($$1));
      } catch (IOException var3) {
         throw new UncheckedIOException(var3);
      }
   }

   private static ahh.c a(alg $$0, @Nullable Dynamic<?> $$1, boolean $$2, aow $$3) {
      boolean $$5;
      csy $$6;
      if ($$1 != null) {
         csy $$4 = ees.a($$1);
         $$5 = false;
         $$6 = $$4;
      } else {
         $$5 = true;
         $$6 = new csy($$0.T, cgk.h);
      }

      ahh.d $$9 = new ahh.d($$3, $$6, $$2, $$5);
      return new ahh.c($$9, dv.a.b, $$0.B);
   }

   private static void a(ees.c $$0, DataFixer $$1, boolean $$2, BooleanSupplier $$3, is<dkx> $$4) {
      a.info("Forcing world upgrade!");
      bip $$5 = new bip($$0, $$1, $$4, $$2);
      uv $$6 = null;

      while (!$$5.b()) {
         uv $$7 = $$5.h();
         if ($$6 != $$7) {
            $$6 = $$7;
            a.info($$5.h().getString());
         }

         int $$8 = $$5.e();
         if ($$8 > 0) {
            int $$9 = $$5.f() + $$5.g();
            a.info("{}% completed ({} / {} chunks)...", new Object[]{atq.d((float)$$9 / (float)$$8 * 100.0F), $$9, $$8});
         }

         if (!$$3.getAsBoolean()) {
            $$5.a();
         } else {
            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var10) {
            }
         }
      }
   }
}
