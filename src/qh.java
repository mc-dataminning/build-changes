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

public class qh {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";
   private static final int d = 4;

   public static czc a(int $$0) {
      switch ($$0) {
         case 0:
            return czc.a;
         case 1:
            return czc.b;
         case 2:
            return czc.c;
         case 3:
            return czc.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(czc $$0) {
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
      aew.a();
      Files.walk(Paths.get(b)).filter($$0x -> $$0x.toString().endsWith(".snbt")).forEach($$0x -> {
         try {
            String $$1 = Files.readString($$0x);
            qu $$2 = rg.a($$1);
            qu $$3 = ml.a($$0x.toString(), $$2);
            mj.a(ji.a, $$0x, rg.c($$3));
         } catch (IOException | CommandSyntaxException var4) {
            c.error("Something went wrong upgrading: {}", $$0x, var4);
         }
      });
   }

   public static ehd a(ded $$0) {
      gw $$1 = $$0.p();
      gw $$2 = $$1.a($$0.j().c(-1, -1, -1));
      gw $$3 = dyw.a($$2, cxl.a, $$0.w(), $$1);
      return new ehd($$1, $$3);
   }

   public static duv b(ded $$0) {
      gw $$1 = $$0.p();
      gw $$2 = $$1.a($$0.j().c(-1, -1, -1));
      gw $$3 = dyw.a($$2, cxl.a, $$0.w(), $$1);
      return duv.a($$1, $$3);
   }

   public static void a(gw $$0, gw $$1, czc $$2, akn $$3) {
      gw $$4 = dyw.a($$0.a((ib)$$1), cxl.a, $$2, $$0);
      $$3.b($$4, csr.fN.n());
      dda $$5 = (dda)$$3.c_($$4);
      $$5.c().a("test runthis");
      gw $$6 = dyw.a($$4.b(0, 0, -1), cxl.a, $$2, $$4);
      $$3.b($$6, csr.dM.n().a($$2));
   }

   public static void a(String $$0, gw $$1, ib $$2, czc $$3, akn $$4) {
      duv $$5 = a($$1, $$2, $$3);
      a($$5, $$1.v(), $$4);
      $$4.b($$1, csr.pa.n());
      ded $$6 = (ded)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new aeu($$0));
      $$6.a($$2);
      $$6.a(dgo.a);
      $$6.e(true);
   }

   public static ded a(String $$0, gw $$1, czc $$2, int $$3, akn $$4, boolean $$5) {
      ib $$6 = a($$0, $$4).a();
      duv $$7 = a($$1, $$6, $$2);
      gw $$8;
      if ($$2 == czc.a) {
         $$8 = $$1;
      } else if ($$2 == czc.b) {
         $$8 = $$1.b($$6.w() - 1, 0, 0);
      } else if ($$2 == czc.c) {
         $$8 = $$1.b($$6.u() - 1, 0, $$6.w() - 1);
      } else {
         if ($$2 != czc.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$8 = $$1.b(0, 0, $$6.u() - 1);
      }

      a($$1, $$4);
      a($$7, $$1.v(), $$4);
      ded $$13 = a($$0, $$8, $$2, $$4, $$5);
      $$4.l().a($$7);
      $$4.a($$7);
      return $$13;
   }

   private static void a(gw $$0, akn $$1) {
      cox $$2 = new cox($$0);

      for (int $$3 = -1; $$3 < 4; $$3++) {
         for (int $$4 = -1; $$4 < 4; $$4++) {
            int $$5 = $$2.e + $$3;
            int $$6 = $$2.f + $$4;
            $$1.a($$5, $$6, true);
         }
      }
   }

   public static void a(duv $$0, int $$1, akn $$2) {
      duv $$3 = new duv($$0.g() - 2, $$0.h() - 3, $$0.i() - 3, $$0.j() + 3, $$0.k() + 20, $$0.l() + 3);
      gw.a($$3).forEach($$2x -> a($$1, $$2x, $$2));
      $$2.l().a($$3);
      $$2.a($$3);
      ehd $$4 = new ehd((double)$$3.g(), (double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l());
      List<bil> $$5 = $$2.a(bil.class, $$4, $$0x -> !($$0x instanceof cbp));
      $$5.forEach(bil::ak);
   }

   public static duv a(gw $$0, ib $$1, czc $$2) {
      gw $$3 = $$0.a($$1).b(-1, -1, -1);
      gw $$4 = dyw.a($$3, cxl.a, $$2, $$0);
      duv $$5 = duv.a($$0, $$4);
      int $$6 = Math.min($$5.g(), $$5.j());
      int $$7 = Math.min($$5.i(), $$5.l());
      return $$5.a($$0.u() - $$6, 0, $$0.w() - $$7);
   }

   public static Optional<gw> a(gw $$0, int $$1, akn $$2) {
      return c($$0, $$1, $$2).stream().filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   @Nullable
   public static gw b(gw $$0, int $$1, akn $$2) {
      Comparator<gw> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      Collection<gw> $$4 = c($$0, $$1, $$2);
      Optional<gw> $$5 = $$4.stream().min($$3);
      return $$5.orElse(null);
   }

   public static Collection<gw> c(gw $$0, int $$1, akn $$2) {
      Collection<gw> $$3 = Lists.newArrayList();
      ehd $$4 = new ehd($$0);
      $$4 = $$4.g((double)$$1);

      for (int $$5 = (int)$$4.a; $$5 <= (int)$$4.d; $$5++) {
         for (int $$6 = (int)$$4.b; $$6 <= (int)$$4.e; $$6++) {
            for (int $$7 = (int)$$4.c; $$7 <= (int)$$4.f; $$7++) {
               gw $$8 = new gw($$5, $$6, $$7);
               dfe $$9 = $$2.a_($$8);
               if ($$9.a(csr.pa)) {
                  $$3.add($$8);
               }
            }
         }
      }

      return $$3;
   }

   private static dyw a(String $$0, akn $$1) {
      dyx $$2 = $$1.p();
      Optional<dyw> $$3 = $$2.b(new aeu($$0));
      if ($$3.isPresent()) {
         return $$3.get();
      } else {
         String $$4 = $$0 + ".snbt";
         Path $$5 = Paths.get(b, $$4);
         qu $$6 = a($$5);
         if ($$6 == null) {
            throw new RuntimeException("Could not find structure file " + $$5 + ", and the structure is not available in the world structures either.");
         } else {
            return $$2.a($$6);
         }
      }
   }

   private static ded a(String $$0, gw $$1, czc $$2, akn $$3, boolean $$4) {
      $$3.b($$1, csr.pa.n());
      ded $$5 = (ded)$$3.c_($$1);
      $$5.a(dgo.b);
      $$5.a($$2);
      $$5.a(false);
      $$5.a(new aeu($$0));
      $$5.a($$3, $$4);
      if ($$5.j() != ib.g) {
         return $$5;
      } else {
         dyw $$6 = a($$0, $$3);
         $$5.a($$3, $$4, $$6);
         if ($$5.j() == ib.g) {
            throw new RuntimeException("Failed to load structure " + $$0);
         } else {
            return $$5;
         }
      }
   }

   @Nullable
   private static qu a(Path $$0) {
      try {
         BufferedReader $$1 = Files.newBufferedReader($$0);
         String $$2 = IOUtils.toString($$1);
         return rg.a($$2);
      } catch (IOException var3) {
         return null;
      } catch (CommandSyntaxException var4) {
         throw new RuntimeException("Error while trying to load structure " + $$0, var4);
      }
   }

   private static void a(int $$0, gw $$1, akn $$2) {
      dfe $$3 = null;
      hu $$4 = $$2.B_();
      dtg $$5 = dtg.a($$4.b(je.ap), $$4.b(je.aB), $$4.b(je.ay));
      List<dfe> $$6 = $$5.f();
      int $$7 = $$1.v() - $$2.C_();
      if ($$1.v() < $$0 && $$7 > 0 && $$7 <= $$6.size()) {
         $$3 = $$6.get($$7 - 1);
      }

      if ($$3 == null) {
         $$3 = csr.a.n();
      }

      ff $$8 = new ff($$3, Collections.emptySet(), null);
      $$8.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(gw $$0, gw $$1, akn $$2) {
      ded $$3 = (ded)$$2.c_($$0);
      ehd $$4 = a($$3).g(1.0);
      return $$4.d(ehi.b($$1));
   }
}
