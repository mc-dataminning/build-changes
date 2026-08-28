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
      ab.a();
      OptionParser $$1 = new OptionParser();
      OptionSpec<Void> $$2 = $$1.accepts("nogui");
      OptionSpec<Void> $$3 = $$1.accepts("initSettings", "Initializes 'server.properties' and 'eula.txt', then quits");
      OptionSpec<Void> $$4 = $$1.accepts("demo");
      OptionSpec<Void> $$5 = $$1.accepts("bonusChest");
      OptionSpec<Void> $$6 = $$1.accepts("forceUpgrade");
      OptionSpec<Void> $$7 = $$1.accepts("eraseCache");
      OptionSpec<Void> $$8 = $$1.accepts("recreateRegionFiles");
      OptionSpec<Void> $$9 = $$1.accepts("safeMode", "Loads level with vanilla datapack only");
      OptionSpec<Void> $$10 = $$1.accepts("help").forHelp();
      OptionSpec<String> $$11 = $$1.accepts("universe").withRequiredArg().defaultsTo(".", new String[0]);
      OptionSpec<String> $$12 = $$1.accepts("world").withRequiredArg();
      OptionSpec<Integer> $$13 = $$1.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(-1, new Integer[0]);
      OptionSpec<String> $$14 = $$1.accepts("serverId").withRequiredArg();
      OptionSpec<Void> $$15 = $$1.accepts("jfrProfile");
      OptionSpec<Path> $$16 = $$1.accepts("pidFile").withRequiredArg().withValuesConvertedBy(new PathConverter(new PathProperties[0]));
      OptionSpec<String> $$17 = $$1.nonOptions();

      try {
         OptionSet $$18 = $$1.parse($$0);
         if ($$18.has($$10)) {
            $$1.printHelpOn(System.err);
            return;
         }

         Path $$19 = (Path)$$18.valueOf($$16);
         if ($$19 != null) {
            a($$19);
         }

         o.g();
         if ($$18.has($$15)) {
            bov.f.a(bot.b);
         }

         alk.a();
         alk.c();
         ae.o();
         Path $$20 = Paths.get("server.properties");
         aqh $$21 = new aqh($$20);
         $$21.b();
         dyx.a($$21.a().M);
         Path $$22 = Paths.get("eula.txt");
         alo $$23 = new alo($$22);
         if ($$18.has($$3)) {
            a.info("Initialized '{}' and '{}'", $$20.toAbsolutePath(), $$22.toAbsolutePath());
            return;
         }

         if (!$$23.a()) {
            a.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
            return;
         }

         File $$24 = new File((String)$$18.valueOf($$11));
         amd $$25 = amd.a(new YggdrasilAuthenticationService(Proxy.NO_PROXY), $$24);
         String $$26 = (String)Optional.ofNullable((String)$$18.valueOf($$12)).orElse($$21.a().l);
         etq $$27 = etq.b($$24.toPath());
         etq.c $$28 = $$27.d($$26);
         Dynamic<?> $$29;
         if ($$28.m()) {
            etr $$30;
            try {
               $$29 = $$28.h();
               $$30 = $$28.a($$29);
            } catch (uv | vb | IOException var41) {
               etq.b $$32 = $$28.e();
               a.warn("Failed to load world data from {}", $$32.b(), var41);
               a.info("Attempting to use fallback");

               try {
                  $$29 = $$28.i();
                  $$30 = $$28.a($$29);
               } catch (uv | vb | IOException var40) {
                  a.error("Failed to load world data from {}", $$32.c(), var40);
                  a.error("Failed to load world data from {} and {}. World files may be corrupted. Shutting down.", $$32.b(), $$32.c());
                  return;
               }

               $$28.n();
            }

            if ($$30.d()) {
               a.info("This world must be opened in an older version (like 1.6.4) to be safely converted");
               return;
            }

            if (!$$30.r()) {
               a.info("This world was created by an incompatible version.");
               return;
            }
         } else {
            $$29 = null;
         }

         Dynamic<?> $$39 = $$29;
         boolean $$40 = $$18.has($$9);
         if ($$40) {
            a.warn("Safe mode active, only vanilla datapack will be loaded");
         }

         aul $$41 = auo.a($$28);

         amh $$43;
         try {
            amg.c $$42 = a($$21.a(), $$39, $$40, $$41);
            $$43 = ae.<amh>c($$6x -> amg.a($$42, $$5xx -> {
                  kd<dzg> $$6xx = $$5xx.d().e(lz.bc);
                  if ($$39 != null) {
                     etn $$7x = etq.a($$39, $$5xx.b(), $$6xx, $$5xx.c());
                     return new amg.b<>($$7x.a(), $$7x.b().b());
                  } else {
                     a.info("No existing world data, creating new world");
                     dff $$8x;
                     ecd $$9x;
                     eca $$10x;
                     if ($$18.has($$4)) {
                        $$8x = MinecraftServer.d;
                        $$9x = ecd.b;
                        $$10x = eln.a($$5xx.c());
                     } else {
                        aqg $$11x = $$21.a();
                        $$8x = new dff($$11x.l, $$11x.k, $$11x.t, $$11x.j, false, new dex($$5xx.b().b()), $$5xx.b());
                        $$9x = $$18.has($$5) ? $$11x.aa.a(true) : $$11x.aa;
                        $$10x = $$11x.a($$5xx.c());
                     }

                     eca.b $$15x = $$10x.a($$6xx);
                     Lifecycle $$16x = $$15x.a().add($$5xx.c().d());
                     return new amg.b<>(new etu($$8x, $$9x, $$15x.d(), $$16x), $$15x.b());
                  }
               }, amh::new, ae.g(), $$6x)).get();
         } catch (Exception var39) {
            a.warn("Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", var39);
            return;
         }

         ke.b $$46 = $$43.c().a();
         boolean $$47 = $$18.has($$8);
         if ($$18.has($$6) || $$47) {
            a($$28, bau.a(), $$18.has($$7), () -> true, $$46, $$47);
         }

         etw $$48 = $$43.d();
         $$28.a($$46, $$48);
         final aqf $$49 = MinecraftServer.a((Function<Thread, aqf>)($$11x -> {
            aqf $$12x = new aqf($$11x, $$28, $$41, $$43, $$21, bau.a(), $$25, arz::b);
            $$12x.a((Integer)$$18.valueOf($$13));
            $$12x.c($$18.has($$4));
            $$12x.b((String)$$18.valueOf($$14));
            boolean $$13x = !$$18.has($$2) && !$$18.valuesOf($$17).contains("nogui");
            if ($$13x && !GraphicsEnvironment.isHeadless()) {
               $$12x.bt();
            }

            return $$12x;
         }));
         Thread $$50 = new Thread("Server Shutdown Thread") {
            @Override
            public void run() {
               $$49.a(true);
            }
         };
         $$50.setUncaughtExceptionHandler(new r(a));
         Runtime.getRuntime().addShutdownHook($$50);
      } catch (Exception var42) {
         a.error(LogUtils.FATAL_MARKER, "Failed to start the minecraft server", var42);
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

   private static amg.c a(aqg $$0, @Nullable Dynamic<?> $$1, boolean $$2, aul $$3) {
      boolean $$5;
      dfx $$6;
      if ($$1 != null) {
         dfx $$4 = etq.a($$1);
         $$5 = false;
         $$6 = $$4;
      } else {
         $$5 = true;
         $$6 = new dfx($$0.U, crh.i);
      }

      amg.d $$9 = new amg.d($$3, $$6, $$2, $$5);
      return new amg.c($$9, ex.a.b, $$0.A);
   }

   private static void a(etq.c $$0, DataFixer $$1, boolean $$2, BooleanSupplier $$3, ke $$4, boolean $$5) {
      a.info("Forcing world upgrade!");

      try (brr $$6 = new brr($$0, $$1, $$4, $$2, $$5)) {
         xi $$7 = null;

         while (!$$6.b()) {
            xi $$8 = $$6.h();
            if ($$7 != $$8) {
               $$7 = $$8;
               a.info($$6.h().getString());
            }

            int $$9 = $$6.e();
            if ($$9 > 0) {
               int $$10 = $$6.f() + $$6.g();
               a.info("{}% completed ({} / {} chunks)...", new Object[]{azk.d((float)$$10 / (float)$$9 * 100.0F), $$10, $$9});
            }

            if (!$$3.getAsBoolean()) {
               $$6.a();
            } else {
               try {
                  Thread.sleep(1000L);
               } catch (InterruptedException var12) {
               }
            }
         }
      }
   }
}
