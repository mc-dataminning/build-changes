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

   @ac(
      a = "System.out needed before bootstrap"
   )
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
            bqu.f.a(bqs.b);
         }

         ali.a();
         ali.c();
         af.p();
         Path $$20 = Paths.get("server.properties");
         aqi $$21 = new aqi($$20);
         $$21.b();
         edo.a($$21.a().M);
         Path $$22 = Paths.get("eula.txt");
         alm $$23 = new alm($$22);
         if ($$18.has($$3)) {
            a.info("Initialized '{}' and '{}'", $$20.toAbsolutePath(), $$22.toAbsolutePath());
            return;
         }

         if (!$$23.a()) {
            a.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
            return;
         }

         File $$24 = new File((String)$$18.valueOf($$11));
         amb $$25 = amb.a(new YggdrasilAuthenticationService(Proxy.NO_PROXY), $$24);
         String $$26 = (String)Optional.ofNullable((String)$$18.valueOf($$12)).orElse($$21.a().l);
         eyn $$27 = eyn.b($$24.toPath());
         eyn.c $$28 = $$27.d($$26);
         Dynamic<?> $$29;
         if ($$28.m()) {
            eyo $$30;
            try {
               $$29 = $$28.h();
               $$30 = $$28.a($$29);
            } catch (uk | uq | IOException var41) {
               eyn.b $$32 = $$28.e();
               a.warn("Failed to load world data from {}", $$32.b(), var41);
               a.info("Attempting to use fallback");

               try {
                  $$29 = $$28.i();
                  $$30 = $$28.a($$29);
               } catch (uk | uq | IOException var40) {
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

         aun $$41 = auq.a($$28);

         amf $$43;
         try {
            ame.c $$42 = a($$21.a(), $$39, $$40, $$41);
            $$43 = af.<amf>c($$6x -> ame.a($$42, $$5xx -> {
                  jr<edx> $$6xx = $$5xx.d().f(mg.bo);
                  if ($$39 != null) {
                     eyk $$7x = eyn.a($$39, $$5xx.b(), $$6xx, $$5xx.c());
                     return new ame.b<>($$7x.a(), $$7x.b().b());
                  } else {
                     a.info("No existing world data, creating new world");
                     diz $$8x;
                     egw $$9x;
                     egt $$10x;
                     if ($$18.has($$4)) {
                        $$8x = MinecraftServer.d;
                        $$9x = egw.b;
                        $$10x = eqj.a($$5xx.c());
                     } else {
                        aqh $$11x = $$21.a();
                        $$8x = new diz($$11x.l, $$11x.k, $$11x.t, $$11x.j, false, new dir($$5xx.b().b()), $$5xx.b());
                        $$9x = $$18.has($$5) ? $$11x.aa.a(true) : $$11x.aa;
                        $$10x = $$11x.a($$5xx.c());
                     }

                     egt.b $$15x = $$10x.a($$6xx);
                     Lifecycle $$16x = $$15x.a().add($$5xx.c().d());
                     return new ame.b<>(new eyr($$8x, $$9x, $$15x.d(), $$16x), $$15x.b());
                  }
               }, amf::new, af.h(), $$6x)).get();
         } catch (Exception var39) {
            a.warn("Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", var39);
            return;
         }

         js.b $$46 = $$43.c().a();
         eyt $$47 = $$43.d();
         boolean $$48 = $$18.has($$8);
         if ($$18.has($$6) || $$48) {
            a($$28, $$47, bbc.a(), $$18.has($$7), () -> true, $$46, $$48);
         }

         $$28.a($$46, $$47);
         final aqg $$49 = MinecraftServer.a((Function<Thread, aqg>)($$11x -> {
            aqg $$12x = new aqg($$11x, $$28, $$41, $$43, $$21, bbc.a(), $$25, asc::b);
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

   private static ame.c a(aqh $$0, @Nullable Dynamic<?> $$1, boolean $$2, aun $$3) {
      boolean $$5;
      djt $$6;
      if ($$1 != null) {
         djt $$4 = eyn.a($$1);
         $$5 = false;
         $$6 = $$4;
      } else {
         $$5 = true;
         $$6 = new djt($$0.U, cuj.h);
      }

      ame.d $$9 = new ame.d($$3, $$6, $$2, $$5);
      return new ame.c($$9, ej.a.b, $$0.A);
   }

   private static void a(eyn.c $$0, eyt $$1, DataFixer $$2, boolean $$3, BooleanSupplier $$4, js $$5, boolean $$6) {
      a.info("Forcing world upgrade!");

      try (btp $$7 = new btp($$0, $$2, $$1, $$5, $$3, $$6)) {
         wy $$8 = null;

         while (!$$7.b()) {
            wy $$9 = $$7.h();
            if ($$8 != $$9) {
               $$8 = $$9;
               a.info($$7.h().getString());
            }

            int $$10 = $$7.e();
            if ($$10 > 0) {
               int $$11 = $$7.f() + $$7.g();
               a.info("{}% completed ({} / {} chunks)...", new Object[]{azm.d((float)$$11 / (float)$$10 * 100.0F), $$11, $$10});
            }

            if (!$$4.getAsBoolean()) {
               $$7.a();
            } else {
               try {
                  Thread.sleep(1000L);
               } catch (InterruptedException var13) {
               }
            }
         }
      }
   }
}
