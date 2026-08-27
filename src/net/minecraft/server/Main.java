package net.minecraft.server;

import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
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
            bdn.e.a(bdl.b);
         }

         aet.a();
         aet.c();
         ac.l();
         Path $$19 = Paths.get("server.properties");
         ajk $$20 = new ajk($$19);
         $$20.b();
         Path $$21 = Paths.get("eula.txt");
         aex $$22 = new aex($$21);
         if ($$17.has($$3)) {
            a.info("Initialized '{}' and '{}'", $$19.toAbsolutePath(), $$21.toAbsolutePath());
            return;
         }

         if (!$$22.a()) {
            a.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
            return;
         }

         File $$23 = new File((String)$$17.valueOf($$10));
         afj $$24 = afj.a(new YggdrasilAuthenticationService(Proxy.NO_PROXY), $$23);
         String $$25 = (String)Optional.ofNullable((String)$$17.valueOf($$11)).orElse($$20.a().m);
         ebw $$26 = ebw.b($$23.toPath());
         ebw.c $$27 = $$26.c($$25);
         ebx $$28 = $$27.d();
         if ($$28 != null) {
            if ($$28.d()) {
               a.info("This world must be opened in an older version (like 1.6.4) to be safely converted");
               return;
            }

            if (!$$28.r()) {
               a.info("This world was created by an incompatible version.");
               return;
            }
         }

         boolean $$29 = $$17.has($$8);
         if ($$29) {
            a.warn("Safe mode active, only vanilla datapack will be loaded");
         }

         amx $$30 = ana.a($$27);

         afm $$32;
         try {
            afl.c $$31 = a($$20.a(), $$27, $$29, $$30);
            $$32 = ac.<afm>c($$6x -> afl.a($$31, $$5xx -> {
                  hr<dij> $$6xx = $$5xx.d().d(jc.aI);
                  DynamicOps<rk> $$7x = aep.a(rc.a, $$5xx.c());
                  Pair<ecc, dld.b> $$8x = $$27.a($$7x, $$5xx.b(), $$6xx, $$5xx.c().d());
                  if ($$8x != null) {
                     return new afl.b<>((ecc)$$8x.getFirst(), ((dld.b)$$8x.getSecond()).b());
                  } else {
                     cpp $$9x;
                     dlg $$10x;
                     dld $$11x;
                     if ($$17.has($$4)) {
                        $$9x = MinecraftServer.f;
                        $$10x = dlg.b;
                        $$11x = duo.a($$5xx.c());
                     } else {
                        ajj $$12x = $$20.a();
                        $$9x = new cpp($$12x.m, $$12x.l, $$12x.u, $$12x.k, false, new cph(), $$5xx.b());
                        $$10x = $$17.has($$5) ? $$12x.Y.a(true) : $$12x.Y;
                        $$11x = $$12x.a($$5xx.c());
                     }

                     dld.b $$16x = $$11x.a($$6xx);
                     Lifecycle $$17x = $$16x.a().add($$5xx.c().d());
                     return new afl.b<>(new eca($$9x, $$10x, $$16x.d(), $$17x), $$16x.b());
                  }
               }, afm::new, ac.f(), $$6x)).get();
         } catch (Exception var36) {
            a.warn("Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", var36);
            return;
         }

         hs.b $$35 = $$32.c().a();
         if ($$17.has($$6)) {
            a($$27, ast.a(), $$17.has($$7), () -> true, $$35.d(jc.aI));
         }

         ecc $$36 = $$32.d();
         $$27.a($$35, $$36);
         final aji $$37 = MinecraftServer.a((Function<Thread, aji>)($$11x -> {
            aji $$12x = new aji($$11x, $$27, $$30, $$32, $$20, ast.a(), $$24, akv::new);
            $$12x.a((Integer)$$17.valueOf($$12));
            $$12x.c($$17.has($$4));
            $$12x.b((String)$$17.valueOf($$13));
            boolean $$13x = !$$17.has($$2) && !$$17.valuesOf($$16).contains("nogui");
            if ($$13x && !GraphicsEnvironment.isHeadless()) {
               $$12x.bh();
            }

            return $$12x;
         }));
         Thread $$38 = new Thread("Server Shutdown Thread") {
            @Override
            public void run() {
               $$37.a(true);
            }
         };
         $$38.setUncaughtExceptionHandler(new r(a));
         Runtime.getRuntime().addShutdownHook($$38);
      } catch (Exception var37) {
         a.error(LogUtils.FATAL_MARKER, "Failed to start the minecraft server", var37);
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

   private static afl.c a(ajj $$0, ebw.c $$1, boolean $$2, amx $$3) {
      cqe $$4 = $$1.e();
      cqe $$6;
      boolean $$5;
      if ($$4 != null) {
         $$5 = false;
         $$6 = $$4;
      } else {
         $$5 = true;
         $$6 = new cqe($$0.T, cdw.g);
      }

      afl.d $$9 = new afl.d($$3, $$6, $$2, $$5);
      return new afl.c($$9, ds.a.b, $$0.B);
   }

   private static void a(ebw.c $$0, DataFixer $$1, boolean $$2, BooleanSupplier $$3, hr<dij> $$4) {
      a.info("Forcing world upgrade!");
      bge $$5 = new bge($$0, $$1, $$4, $$2);
      tf $$6 = null;

      while (!$$5.b()) {
         tf $$7 = $$5.h();
         if ($$6 != $$7) {
            $$6 = $$7;
            a.info($$5.h().getString());
         }

         int $$8 = $$5.e();
         if ($$8 > 0) {
            int $$9 = $$5.f() + $$5.g();
            a.info("{}% completed ({} / {} chunks)...", new Object[]{arp.d((float)$$9 / (float)$$8 * 100.0F), $$9, $$8});
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
