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

         o.h();
         if ($$18.has($$15)) {
            bji.e.a(bjg.b);
         }

         aje.a();
         aje.c();
         ac.l();
         Path $$20 = Paths.get("server.properties");
         anz $$21 = new anz($$20);
         $$21.b();
         dpk.a($$21.a().N);
         Path $$22 = Paths.get("eula.txt");
         aji $$23 = new aji($$22);
         if ($$18.has($$3)) {
            a.info("Initialized '{}' and '{}'", $$20.toAbsolutePath(), $$22.toAbsolutePath());
            return;
         }

         if (!$$23.a()) {
            a.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
            return;
         }

         File $$24 = new File((String)$$18.valueOf($$11));
         ajv $$25 = ajv.a(new YggdrasilAuthenticationService(Proxy.NO_PROXY), $$24);
         String $$26 = (String)Optional.ofNullable((String)$$18.valueOf($$12)).orElse($$21.a().m);
         ejo $$27 = ejo.b($$24.toPath());
         ejo.c $$28 = $$27.d($$26);
         Dynamic<?> $$29;
         if ($$28.k()) {
            ejp $$30;
            try {
               $$29 = $$28.f();
               $$30 = $$28.a($$29);
            } catch (tj | tp | IOException var41) {
               ejo.b $$32 = $$28.c();
               a.warn("Failed to load world data from {}", $$32.b(), var41);
               a.info("Attempting to use fallback");

               try {
                  $$29 = $$28.g();
                  $$30 = $$28.a($$29);
               } catch (tj | tp | IOException var40) {
                  a.error("Failed to load world data from {}", $$32.c(), var40);
                  a.error("Failed to load world data from {} and {}. World files may be corrupted. Shutting down.", $$32.b(), $$32.c());
                  return;
               }

               $$28.l();
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

         arq $$41 = art.a($$28);

         ajy $$43;
         try {
            ajx.c $$42 = a($$21.a(), $$39, $$40, $$41);
            $$43 = ac.<ajy>c($$6x -> ajx.a($$42, $$5xx -> {
                  ix<dpr> $$6xx = $$5xx.d().d(ki.aO);
                  if ($$39 != null) {
                     ejl $$7x = ejo.a($$39, $$5xx.b(), $$6xx, $$5xx.c());
                     return new ajx.b<>($$7x.a(), $$7x.b().b());
                  } else {
                     a.info("No existing world data, creating new world");
                     cwi $$8x;
                     dso $$9x;
                     dsl $$10x;
                     if ($$18.has($$4)) {
                        $$8x = MinecraftServer.d;
                        $$9x = dso.b;
                        $$10x = ebw.a($$5xx.c());
                     } else {
                        any $$11x = $$21.a();
                        $$8x = new cwi($$11x.m, $$11x.l, $$11x.u, $$11x.k, false, new cwa(), $$5xx.b());
                        $$9x = $$18.has($$5) ? $$11x.Z.a(true) : $$11x.Z;
                        $$10x = $$11x.a($$5xx.c());
                     }

                     dsl.b $$15x = $$10x.a($$6xx);
                     Lifecycle $$16x = $$15x.a().add($$5xx.c().e());
                     return new ajx.b<>(new ejs($$8x, $$9x, $$15x.d(), $$16x), $$15x.b());
                  }
               }, ajy::new, ac.f(), $$6x)).get();
         } catch (Exception var39) {
            a.warn("Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", var39);
            return;
         }

         iy.b $$46 = $$43.c().a();
         boolean $$47 = $$18.has($$8);
         if ($$18.has($$6) || $$47) {
            a($$28, axt.a(), $$18.has($$7), () -> true, $$46, $$47);
         }

         eju $$48 = $$43.d();
         $$28.a($$46, $$48);
         final anx $$49 = MinecraftServer.a((Function<Thread, anx>)($$11x -> {
            anx $$12x = new anx($$11x, $$28, $$41, $$43, $$21, axt.a(), $$25, apl::b);
            $$12x.a((Integer)$$18.valueOf($$13));
            $$12x.c($$18.has($$4));
            $$12x.b((String)$$18.valueOf($$14));
            boolean $$13x = !$$18.has($$2) && !$$18.valuesOf($$17).contains("nogui");
            if ($$13x && !GraphicsEnvironment.isHeadless()) {
               $$12x.br();
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

   private static ajx.c a(any $$0, @Nullable Dynamic<?> $$1, boolean $$2, arq $$3) {
      boolean $$5;
      cwy $$6;
      if ($$1 != null) {
         cwy $$4 = ejo.a($$1);
         $$5 = false;
         $$6 = $$4;
      } else {
         $$5 = true;
         $$6 = new cwy($$0.U, ckn.h);
      }

      ajx.d $$9 = new ajx.d($$3, $$6, $$2, $$5);
      return new ajx.c($$9, dv.a.b, $$0.B);
   }

   private static void a(ejo.c $$0, DataFixer $$1, boolean $$2, BooleanSupplier $$3, iy $$4, boolean $$5) {
      a.info("Forcing world upgrade!");
      blz $$6 = new blz($$0, $$1, $$4, $$2, $$5);
      vs $$7 = null;

      while (!$$6.b()) {
         vs $$8 = $$6.h();
         if ($$7 != $$8) {
            $$7 = $$8;
            a.info($$6.h().getString());
         }

         int $$9 = $$6.e();
         if ($$9 > 0) {
            int $$10 = $$6.f() + $$6.g();
            a.info("{}% completed ({} / {} chunks)...", new Object[]{awm.d((float)$$10 / (float)$$9 * 100.0F), $$10, $$9});
         }

         if (!$$3.getAsBoolean()) {
            $$6.a();
         } else {
            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var11) {
            }
         }
      }
   }
}
