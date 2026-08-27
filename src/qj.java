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

public class qj {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";
   private static final int d = 4;

   public static czn a(int $$0) {
      switch ($$0) {
         case 0:
            return czn.a;
         case 1:
            return czn.b;
         case 2:
            return czn.c;
         case 3:
            return czn.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(czn $$0) {
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

   public static ehc a(dem $$0) {
      gw $$1 = $$0.p();
      gw $$2 = $$1.a($$0.j().c(-1, -1, -1));
      gw $$3 = dyv.a($$2, cxx.a, $$0.w(), $$1);
      return new ehc($$1, $$3);
   }

   public static duu b(dem $$0) {
      gw $$1 = $$0.p();
      gw $$2 = $$1.a($$0.j().c(-1, -1, -1));
      gw $$3 = dyv.a($$2, cxx.a, $$0.w(), $$1);
      return duu.a($$1, $$3);
   }

   public static void a(gw $$0, gw $$1, czn $$2, akt $$3) {
      gw $$4 = dyv.a($$0.a((hy)$$1), cxx.a, $$2, $$0);
      $$3.b($$4, cte.fN.o());
      ddj $$5 = (ddj)$$3.c_($$4);
      $$5.c().a("test runthis");
      gw $$6 = dyv.a($$4.b(0, 0, -1), cxx.a, $$2, $$4);
      $$3.b($$6, cte.dM.o().a($$2));
   }

   public static void a(String $$0, gw $$1, hy $$2, czn $$3, akt $$4) {
      duu $$5 = a($$1, $$2, $$3);
      a($$5, $$1.v(), $$4);
      $$4.b($$1, cte.pa.o());
      dem $$6 = (dem)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new aez($$0));
      $$6.a($$2);
      $$6.a(dgn.a);
      $$6.e(true);
   }

   public static dem a(String $$0, gw $$1, czn $$2, int $$3, akt $$4, boolean $$5) {
      hy $$6 = a($$0, $$4).a();
      duu $$7 = a($$1, $$6, $$2);
      gw $$8;
      if ($$2 == czn.a) {
         $$8 = $$1;
      } else if ($$2 == czn.b) {
         $$8 = $$1.b($$6.w() - 1, 0, 0);
      } else if ($$2 == czn.c) {
         $$8 = $$1.b($$6.u() - 1, 0, $$6.w() - 1);
      } else {
         if ($$2 != czn.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$8 = $$1.b(0, 0, $$6.u() - 1);
      }

      a($$1, $$4);
      a($$7, $$1.v(), $$4);
      dem $$13 = a($$0, $$8, $$2, $$4, $$5);
      $$4.l().a($$7);
      $$4.a($$7);
      return $$13;
   }

   private static void a(gw $$0, akt $$1) {
      cpi $$2 = new cpi($$0);

      for (int $$3 = -1; $$3 < 4; $$3++) {
         for (int $$4 = -1; $$4 < 4; $$4++) {
            int $$5 = $$2.e + $$3;
            int $$6 = $$2.f + $$4;
            $$1.a($$5, $$6, true);
         }
      }
   }

   public static void a(duu $$0, int $$1, akt $$2) {
      duu $$3 = new duu($$0.g() - 2, $$0.h() - 3, $$0.i() - 3, $$0.j() + 3, $$0.k() + 20, $$0.l() + 3);
      gw.a($$3).forEach($$2x -> a($$1, $$2x, $$2));
      $$2.l().a($$3);
      $$2.a($$3);
      ehc $$4 = new ehc((double)$$3.g(), (double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l());
      List<biw> $$5 = $$2.a(biw.class, $$4, $$0x -> !($$0x instanceof cca));
      $$5.forEach(biw::ak);
   }

   public static duu a(gw $$0, hy $$1, czn $$2) {
      gw $$3 = $$0.a($$1).b(-1, -1, -1);
      gw $$4 = dyv.a($$3, cxx.a, $$2, $$0);
      duu $$5 = duu.a($$0, $$4);
      int $$6 = Math.min($$5.g(), $$5.j());
      int $$7 = Math.min($$5.i(), $$5.l());
      return $$5.a($$0.u() - $$6, 0, $$0.w() - $$7);
   }

   public static Optional<gw> a(gw $$0, int $$1, akt $$2) {
      return c($$0, $$1, $$2).stream().filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   @Nullable
   public static gw b(gw $$0, int $$1, akt $$2) {
      Comparator<gw> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      Collection<gw> $$4 = c($$0, $$1, $$2);
      Optional<gw> $$5 = $$4.stream().min($$3);
      return $$5.orElse(null);
   }

   public static Collection<gw> c(gw $$0, int $$1, akt $$2) {
      Collection<gw> $$3 = Lists.newArrayList();
      ehc $$4 = new ehc($$0);
      $$4 = $$4.g((double)$$1);

      for (int $$5 = (int)$$4.a; $$5 <= (int)$$4.d; $$5++) {
         for (int $$6 = (int)$$4.b; $$6 <= (int)$$4.e; $$6++) {
            for (int $$7 = (int)$$4.c; $$7 <= (int)$$4.f; $$7++) {
               gw $$8 = new gw($$5, $$6, $$7);
               dfd $$9 = $$2.a_($$8);
               if ($$9.a(cte.pa)) {
                  $$3.add($$8);
               }
            }
         }
      }

      return $$3;
   }

   private static dyv a(String $$0, akt $$1) {
      dyw $$2 = $$1.p();
      Optional<dyv> $$3 = $$2.b(new aez($$0));
      if ($$3.isPresent()) {
         return $$3.get();
      } else {
         String $$4 = $$0 + ".snbt";
         Path $$5 = Paths.get(b, $$4);
         qw $$6 = a($$5);
         if ($$6 == null) {
            throw new RuntimeException("Could not find structure file " + $$5 + ", and the structure is not available in the world structures either.");
         } else {
            return $$2.a($$6);
         }
      }
   }

   private static dem a(String $$0, gw $$1, czn $$2, akt $$3, boolean $$4) {
      $$3.b($$1, cte.pa.o());
      dem $$5 = (dem)$$3.c_($$1);
      $$5.a(dgn.b);
      $$5.a($$2);
      $$5.a(false);
      $$5.a(new aez($$0));
      $$5.a($$3, $$4);
      if ($$5.j() != hy.g) {
         return $$5;
      } else {
         dyv $$6 = a($$0, $$3);
         $$5.a($$3, $$4, $$6);
         if ($$5.j() == hy.g) {
            throw new RuntimeException("Failed to load structure " + $$0);
         } else {
            return $$5;
         }
      }
   }

   @Nullable
   private static qw a(Path $$0) {
      try {
         BufferedReader $$1 = Files.newBufferedReader($$0);
         String $$2 = IOUtils.toString($$1);
         return rj.a($$2);
      } catch (IOException var3) {
         return null;
      } catch (CommandSyntaxException var4) {
         throw new RuntimeException("Error while trying to load structure " + $$0, var4);
      }
   }

   private static void a(int $$0, gw $$1, akt $$2) {
      dfd $$3 = null;
      hr $$4 = $$2.G_();
      dtf $$5 = dtf.a($$4.b(jc.aq), $$4.b(jc.aC), $$4.b(jc.az));
      List<dfd> $$6 = $$5.f();
      int $$7 = $$1.v() - $$2.H_();
      if ($$1.v() < $$0 && $$7 > 0 && $$7 <= $$6.size()) {
         $$3 = $$6.get($$7 - 1);
      }

      if ($$3 == null) {
         $$3 = cte.a.o();
      }

      ff $$8 = new ff($$3, Collections.emptySet(), null);
      $$8.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(gw $$0, gw $$1, akt $$2) {
      dem $$3 = (dem)$$2.c_($$0);
      ehc $$4 = a($$3).g(1.0);
      return $$4.d(ehh.b($$1));
   }
}
