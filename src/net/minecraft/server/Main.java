package net.minecraft.server;

import com.mojang.authlib.GameProfile;
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
      OptionSpec<String> $$10 = $$1.accepts("singleplayer").withRequiredArg();
      OptionSpec<String> $$11 = $$1.accepts("universe").withRequiredArg().defaultsTo(".", new String[0]);
      OptionSpec<String> $$12 = $$1.accepts("world").withRequiredArg();
      OptionSpec<Integer> $$13 = $$1.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(-1, new Integer[0]);
      OptionSpec<String> $$14 = $$1.accepts("serverId").withRequiredArg();
      OptionSpec<Void> $$15 = $$1.accepts("jfrProfile");
      OptionSpec<Path> $$16 = $$1.accepts("pidFile").withRequiredArg().withValuesConvertedBy(new PathConverter(new PathProperties[0]));
      OptionSpec<String> $$17 = $$1.nonOptions();

      try {
         OptionSet $$18 = $$1.parse($$0);
         if ($$18.has($$9)) {
            $$1.printHelpOn(System.err);
            return;
         }

         Path $$19 = (Path)$$18.valueOf($$16);
         if ($$19 != null) {
            a($$19);
         }

         o.h();
         if ($$18.has($$15)) {
            bat.e.a(bar.b);
         }

         acs.a();
         acs.c();
         ac.l();
         Path $$20 = Paths.get("server.properties");
         ahg $$21 = new ahg($$20);
         $$21.b();
         Path $$22 = Paths.get("eula.txt");
         acw $$23 = new acw($$22);
         if ($$18.has($$3)) {
            a.info("Initialized '{}' and '{}'", $$20.toAbsolutePath(), $$22.toAbsolutePath());
            return;
         }

         if (!$$23.a()) {
            a.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
            return;
         }

         File $$24 = new File((String)$$18.valueOf($$11));
         adh $$25 = adh.a(new YggdrasilAuthenticationService(Proxy.NO_PROXY), $$24);
         String $$26 = (String)Optional.ofNullable((String)$$18.valueOf($$12)).orElse($$21.a().m);
         dyy $$27 = dyy.b($$24.toPath());
         dyy.c $$28 = $$27.c($$26);
         dyz $$29 = $$28.c();
         if ($$29 != null) {
            if ($$29.d()) {
               a.info("This world must be opened in an older version (like 1.6.4) to be safely converted");
               return;
            }

            if (!$$29.r()) {
               a.info("This world was created by an incompatible version.");
               return;
            }
         }

         boolean $$30 = $$18.has($$8);
         if ($$30) {
            a.warn("Safe mode active, only vanilla datapack will be loaded");
         }

         aki $$31 = akl.a($$28.a(dyw.j));

         adk $$33;
         try {
            adj.c $$32 = a($$21.a(), $$28, $$30, $$31);
            $$33 = ac.<adk>c($$6x -> adj.a($$32, $$5xx -> {
                  hr<dfl> $$6xx = $$5xx.d().d(jc.aI);
                  DynamicOps<rk> $$7x = aco.a(rc.a, $$5xx.c());
                  Pair<dze, dif.b> $$8x = $$28.a($$7x, $$5xx.b(), $$6xx, $$5xx.c().d());
                  if ($$8x != null) {
                     return new adj.b<>((dze)$$8x.getFirst(), ((dif.b)$$8x.getSecond()).b());
                  } else {
                     cmq $$9x;
                     dii $$10x;
                     dif $$11x;
                     if ($$18.has($$4)) {
                        $$9x = MinecraftServer.f;
                        $$10x = dii.b;
                        $$11x = drq.a($$5xx.c());
                     } else {
                        ahf $$12x = $$21.a();
                        $$9x = new cmq($$12x.m, $$12x.l, $$12x.u, $$12x.k, false, new cmi(), $$5xx.b());
                        $$10x = $$18.has($$5) ? $$12x.X.a(true) : $$12x.X;
                        $$11x = $$12x.a($$5xx.c());
                     }

                     dif.b $$16x = $$11x.a($$6xx);
                     Lifecycle $$17x = $$16x.a().add($$5xx.c().d());
                     return new adj.b<>(new dzc($$9x, $$10x, $$16x.d(), $$17x), $$16x.b());
                  }
               }, adk::new, ac.f(), $$6x)).get();
         } catch (Exception var37) {
            a.warn("Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", var37);
            return;
         }

         hs.b $$36 = $$33.c().a();
         if ($$18.has($$6)) {
            a($$28, aqd.a(), $$18.has($$7), () -> true, $$36.d(jc.aI));
         }

         dze $$37 = $$33.d();
         $$28.a($$36, $$37);
         final ahe $$38 = MinecraftServer.a((Function<Thread, ahe>)($$12x -> {
            ahe $$13x = new ahe($$12x, $$28, $$31, $$33, $$21, aqd.a(), $$25, aiq::new);
            $$13x.b($$18.has($$10) ? new GameProfile(null, (String)$$18.valueOf($$10)) : null);
            $$13x.a((Integer)$$18.valueOf($$13));
            $$13x.c($$18.has($$4));
            $$13x.b((String)$$18.valueOf($$14));
            boolean $$14x = !$$18.has($$2) && !$$18.valuesOf($$17).contains("nogui");
            if ($$14x && !GraphicsEnvironment.isHeadless()) {
               $$13x.bh();
            }

            return $$13x;
         }));
         Thread $$39 = new Thread("Server Shutdown Thread") {
            @Override
            public void run() {
               $$38.a(true);
            }
         };
         $$39.setUncaughtExceptionHandler(new r(a));
         Runtime.getRuntime().addShutdownHook($$39);
      } catch (Exception var38) {
         a.error(LogUtils.FATAL_MARKER, "Failed to start the minecraft server", var38);
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

   private static adj.c a(ahf $$0, dyy.c $$1, boolean $$2, aki $$3) {
      cnf $$4 = $$1.d();
      cnf $$6;
      boolean $$5;
      if ($$4 != null) {
         $$5 = false;
         $$6 = $$4;
      } else {
         $$5 = true;
         $$6 = new cnf($$0.T, cay.f);
      }

      adj.d $$9 = new adj.d($$3, $$6, $$2, $$5);
      return new adj.c($$9, dt.a.b, $$0.B);
   }

   private static void a(dyy.c $$0, DataFixer $$1, boolean $$2, BooleanSupplier $$3, hr<dfl> $$4) {
      a.info("Forcing world upgrade!");
      bdl $$5 = new bdl($$0, $$1, $$4, $$2);
      sw $$6 = null;

      while (!$$5.b()) {
         sw $$7 = $$5.h();
         if ($$6 != $$7) {
            $$6 = $$7;
            a.info($$5.h().getString());
         }

         int $$8 = $$5.e();
         if ($$8 > 0) {
            int $$9 = $$5.f() + $$5.g();
            a.info("{}% completed ({} / {} chunks)...", new Object[]{apa.d((float)$$9 / (float)$$8 * 100.0F), $$9, $$8});
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
