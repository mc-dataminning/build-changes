import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class qf {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";
   private static final int d = 4;

   public static cyw a(int $$0) {
      switch ($$0) {
         case 0:
            return cyw.a;
         case 1:
            return cyw.b;
         case 2:
            return cyw.c;
         case 3:
            return cyw.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(cyw $$0) {
      switch ($$0) {
         case a:
            return 0;
         case b:
            return 1;
         case c:
            return 2;
         case d:
            return 3;
         default:
            throw new IllegalArgumentException("Unknown rotation value, don't know how many steps it represents: " + $$0);
      }
   }

   public static void a(String[] $$0) throws IOException {
      aer.a();
      Files.walk(Paths.get(b)).filter($$0x -> $$0x.toString().endsWith(".snbt")).forEach($$0x -> {
         try {
            String $$1 = Files.readString($$0x);
            qs $$2 = re.a($$1);
            qs $$3 = mj.a($$0x.toString(), $$2);
            mh.a(jh.a, $$0x, re.c($$3));
         } catch (IOException | CommandSyntaxException var4) {
            c.error("Something went wrong upgrading: {}", $$0x, var4);
         }
      });
   }

   public static eha a(ddx $$0) {
      gv $$1 = $$0.p();
      gv $$2 = $$1.a($$0.j().c(-1, -1, -1));
      gv $$3 = dyq.a($$2, cxf.a, $$0.w(), $$1);
      return new eha($$1, $$3);
   }

   public static dup b(ddx $$0) {
      gv $$1 = $$0.p();
      gv $$2 = $$1.a($$0.j().c(-1, -1, -1));
      gv $$3 = dyq.a($$2, cxf.a, $$0.w(), $$1);
      return dup.a($$1, $$3);
   }

   public static void a(gv $$0, gv $$1, cyw $$2, aki $$3) {
      gv $$4 = dyq.a($$0.a((ia)$$1), cxf.a, $$2, $$0);
      $$3.b($$4, csl.fN.n());
      dcu $$5 = (dcu)$$3.c_($$4);
      $$5.c().a("test runthis");
      gv $$6 = dyq.a($$4.b(0, 0, -1), cxf.a, $$2, $$4);
      $$3.b($$6, csl.dM.n().a($$2));
   }

   public static void a(String $$0, gv $$1, ia $$2, cyw $$3, aki $$4) {
      dup $$5 = a($$1, $$2, $$3);
      a($$5, $$1.v(), $$4);
      $$4.b($$1, csl.pa.n());
      ddx $$6 = (ddx)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new aep($$0));
      $$6.a($$2);
      $$6.a(dgi.a);
      $$6.e(true);
   }

   public static ddx a(String $$0, gv $$1, cyw $$2, int $$3, aki $$4, boolean $$5) {
      ia $$6 = a($$0, $$4).a();
      dup $$7 = a($$1, $$6, $$2);
      gv $$8;
      if ($$2 == cyw.a) {
         $$8 = $$1;
      } else if ($$2 == cyw.b) {
         $$8 = $$1.b($$6.w() - 1, 0, 0);
      } else if ($$2 == cyw.c) {
         $$8 = $$1.b($$6.u() - 1, 0, $$6.w() - 1);
      } else {
         if ($$2 != cyw.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$8 = $$1.b(0, 0, $$6.u() - 1);
      }

      a($$1, $$4);
      a($$7, $$1.v(), $$4);
      ddx $$13 = a($$0, $$8, $$2, $$4, $$5);
      $$4.l().a($$7);
      $$4.a($$7);
      return $$13;
   }

   private static void a(gv $$0, aki $$1) {
      cor $$2 = new cor($$0);

      for (int $$3 = -1; $$3 < 4; $$3++) {
         for (int $$4 = -1; $$4 < 4; $$4++) {
            int $$5 = $$2.e + $$3;
            int $$6 = $$2.f + $$4;
            $$1.a($$5, $$6, true);
         }
      }
   }

   public static void a(dup $$0, int $$1, aki $$2) {
      dup $$3 = new dup($$0.g() - 2, $$0.h() - 3, $$0.i() - 3, $$0.j() + 3, $$0.k() + 20, $$0.l() + 3);
      gv.a($$3).forEach($$2x -> a($$1, $$2x, $$2));
      $$2.l().a($$3);
      $$2.a($$3);
      eha $$4 = new eha((double)$$3.g(), (double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l());
      List<big> $$5 = $$2.a(big.class, $$4, $$0x -> !($$0x instanceof cbl));
      $$5.forEach(big::ak);
   }

   public static dup a(gv $$0, ia $$1, cyw $$2) {
      gv $$3 = $$0.a($$1).b(-1, -1, -1);
      gv $$4 = dyq.a($$3, cxf.a, $$2, $$0);
      dup $$5 = dup.a($$0, $$4);
      int $$6 = Math.min($$5.g(), $$5.j());
      int $$7 = Math.min($$5.i(), $$5.l());
      return $$5.a($$0.u() - $$6, 0, $$0.w() - $$7);
   }

   public static Optional<gv> a(gv $$0, int $$1, aki $$2) {
      return c($$0, $$1, $$2).stream().filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   @Nullable
   public static gv b(gv $$0, int $$1, aki $$2) {
      Comparator<gv> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      Collection<gv> $$4 = c($$0, $$1, $$2);
      Optional<gv> $$5 = $$4.stream().min($$3);
      return $$5.orElse(null);
   }

   public static Collection<gv> c(gv $$0, int $$1, aki $$2) {
      Collection<gv> $$3 = Lists.newArrayList();
      eha $$4 = new eha($$0);
      $$4 = $$4.g((double)$$1);

      for (int $$5 = (int)$$4.a; $$5 <= (int)$$4.d; $$5++) {
         for (int $$6 = (int)$$4.b; $$6 <= (int)$$4.e; $$6++) {
            for (int $$7 = (int)$$4.c; $$7 <= (int)$$4.f; $$7++) {
               gv $$8 = new gv($$5, $$6, $$7);
               dey $$9 = $$2.a_($$8);
               if ($$9.a(csl.pa)) {
                  $$3.add($$8);
               }
            }
         }
      }

      return $$3;
   }

   private static dyq a(String $$0, aki $$1) {
      dyr $$2 = $$1.p();
      Optional<dyq> $$3 = $$2.b(new aep($$0));
      if ($$3.isPresent()) {
         return $$3.get();
      } else {
         String $$4 = $$0 + ".snbt";
         Path $$5 = Paths.get(b, $$4);
         qs $$6 = a($$5);
         if ($$6 == null) {
            throw new RuntimeException("Could not find structure file " + $$5 + ", and the structure is not available in the world structures either.");
         } else {
            return $$2.a($$6);
         }
      }
   }

   private static ddx a(String $$0, gv $$1, cyw $$2, aki $$3, boolean $$4) {
      $$3.b($$1, csl.pa.n());
      ddx $$5 = (ddx)$$3.c_($$1);
      $$5.a(dgi.b);
      $$5.a($$2);
      $$5.a(false);
      $$5.a(new aep($$0));
      $$5.a($$3, $$4);
      if ($$5.j() != ia.g) {
         return $$5;
      } else {
         dyq $$6 = a($$0, $$3);
         $$5.a($$3, $$4, $$6);
         if ($$5.j() == ia.g) {
            throw new RuntimeException("Failed to load structure " + $$0);
         } else {
            return $$5;
         }
      }
   }

   @Nullable
   private static qs a(Path $$0) {
      try {
         BufferedReader $$1 = Files.newBufferedReader($$0);
         String $$2 = IOUtils.toString($$1);
         return re.a($$2);
      } catch (IOException var3) {
         return null;
      } catch (CommandSyntaxException var4) {
         throw new RuntimeException("Error while trying to load structure " + $$0, var4);
      }
   }

   private static void a(int $$0, gv $$1, aki $$2) {
      dey $$3 = null;
      ht $$4 = $$2.B_();
      dta $$5 = dta.a($$4.b(jd.ap), $$4.b(jd.aB), $$4.b(jd.ay));
      List<dey> $$6 = $$5.f();
      int $$7 = $$1.v() - $$2.C_();
      if ($$1.v() < $$0 && $$7 > 0 && $$7 <= $$6.size()) {
         $$3 = $$6.get($$7 - 1);
      }

      if ($$3 == null) {
         $$3 = csl.a.n();
      }

      fe $$8 = new fe($$3, Collections.emptySet(), null);
      $$8.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(gv $$0, gv $$1, aki $$2) {
      ddx $$3 = (ddx)$$2.c_($$0);
      eha $$4 = a($$3).g(1.0);
      return $$4.d(ehf.b($$1));
   }
}
