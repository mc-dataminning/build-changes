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
            bgs.e.a(bgq.b);
         }

         ahf.a();
         ahf.c();
         ac.k();
         Path $$19 = Paths.get("server.properties");
         aly $$20 = new aly($$19);
         $$20.b();
         Path $$21 = Paths.get("eula.txt");
         ahj $$22 = new ahj($$21);
         if ($$17.has($$3)) {
            a.info("Initialized '{}' and '{}'", $$19.toAbsolutePath(), $$21.toAbsolutePath());
            return;
         }

         if (!$$22.a()) {
            a.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
            return;
         }

         File $$23 = new File((String)$$17.valueOf($$10));
         ahw $$24 = ahw.a(new YggdrasilAuthenticationService(Proxy.NO_PROXY), $$23);
         String $$25 = (String)Optional.ofNullable((String)$$17.valueOf($$11)).orElse($$20.a().m);
         egf $$26 = egf.b($$23.toPath());
         egf.c $$27 = $$26.d($$25);
         Dynamic<?> $$28;
         if ($$27.k()) {
            egg $$29;
            try {
               $$28 = $$27.f();
               $$29 = $$27.a($$28);
            } catch (sw | tc | IOException var39) {
               egf.b $$31 = $$27.c();
               a.warn("Failed to load world data from {}", $$31.b(), var39);
               a.info("Attempting to use fallback");

               try {
                  $$28 = $$27.g();
                  $$29 = $$27.a($$28);
               } catch (sw | tc | IOException var38) {
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

         apn $$40 = apq.a($$27);

         ahz $$42;
         try {
            ahy.c $$41 = a($$20.a(), $$38, $$39, $$40);
            $$42 = ac.<ahz>c($$6x -> ahy.a($$41, $$5xx -> {
                  it<dmk> $$6xx = $$5xx.d().d(ke.aN);
                  if ($$38 != null) {
                     egc $$7x = egf.a($$38, $$5xx.b(), $$6xx, $$5xx.c());
                     return new ahy.b<>($$7x.a(), $$7x.b().b());
                  } else {
                     a.info("No existing world data, creating new world");
                     ctm $$8x;
                     dph $$9x;
                     dpe $$10x;
                     if ($$17.has($$4)) {
                        $$8x = MinecraftServer.e;
                        $$9x = dph.b;
                        $$10x = dyp.a($$5xx.c());
                     } else {
                        alx $$11x = $$20.a();
                        $$8x = new ctm($$11x.m, $$11x.l, $$11x.u, $$11x.k, false, new cte(), $$5xx.b());
                        $$9x = $$17.has($$5) ? $$11x.Y.a(true) : $$11x.Y;
                        $$10x = $$11x.a($$5xx.c());
                     }

                     dpe.b $$15x = $$10x.a($$6xx);
                     Lifecycle $$16x = $$15x.a().add($$5xx.c().e());
                     return new ahy.b<>(new egj($$8x, $$9x, $$15x.d(), $$16x), $$15x.b());
                  }
               }, ahz::new, ac.f(), $$6x)).get();
         } catch (Exception var37) {
            a.warn("Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", var37);
            return;
         }

         iu.b $$45 = $$42.c().a();
         if ($$17.has($$6)) {
            a($$27, avr.a(), $$17.has($$7), () -> true, $$45.d(ke.aN));
         }

         egl $$46 = $$42.d();
         $$27.a($$45, $$46);
         final alw $$47 = MinecraftServer.a((Function<Thread, alw>)($$11x -> {
            alw $$12x = new alw($$11x, $$27, $$40, $$42, $$20, avr.a(), $$24, ank::new);
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

   private static ahy.c a(alx $$0, @Nullable Dynamic<?> $$1, boolean $$2, apn $$3) {
      boolean $$5;
      cuc $$6;
      if ($$1 != null) {
         cuc $$4 = egf.a($$1);
         $$5 = false;
         $$6 = $$4;
      } else {
         $$5 = true;
         $$6 = new cuc($$0.T, chn.h);
      }

      ahy.d $$9 = new ahy.d($$3, $$6, $$2, $$5);
      return new ahy.c($$9, dt.a.b, $$0.B);
   }

   private static void a(egf.c $$0, DataFixer $$1, boolean $$2, BooleanSupplier $$3, it<dmk> $$4) {
      a.info("Forcing world upgrade!");
      bjj $$5 = new bjj($$0, $$1, $$4, $$2);
      vd $$6 = null;

      while (!$$5.b()) {
         vd $$7 = $$5.h();
         if ($$6 != $$7) {
            $$6 = $$7;
            a.info($$5.h().getString());
         }

         int $$8 = $$5.e();
         if ($$8 > 0) {
            int $$9 = $$5.f() + $$5.g();
            a.info("{}% completed ({} / {} chunks)...", new Object[]{aui.d((float)$$9 / (float)$$8 * 100.0F), $$9, $$8});
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
