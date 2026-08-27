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

public class qk {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";
   private static final int d = 4;

   public static czh a(int $$0) {
      switch ($$0) {
         case 0:
            return czh.a;
         case 1:
            return czh.b;
         case 2:
            return czh.c;
         case 3:
            return czh.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(czh $$0) {
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

   public static ehi a(dei $$0) {
      gw $$1 = $$0.p();
      gw $$2 = $$1.a($$0.j().c(-1, -1, -1));
      gw $$3 = dzb.a($$2, cxq.a, $$0.w(), $$1);
      return new ehi($$1, $$3);
   }

   public static dva b(dei $$0) {
      gw $$1 = $$0.p();
      gw $$2 = $$1.a($$0.j().c(-1, -1, -1));
      gw $$3 = dzb.a($$2, cxq.a, $$0.w(), $$1);
      return dva.a($$1, $$3);
   }

   public static void a(gw $$0, gw $$1, czh $$2, akr $$3) {
      gw $$4 = dzb.a($$0.a((ib)$$1), cxq.a, $$2, $$0);
      $$3.b($$4, csw.fN.n());
      ddf $$5 = (ddf)$$3.c_($$4);
      $$5.c().a("test runthis");
      gw $$6 = dzb.a($$4.b(0, 0, -1), cxq.a, $$2, $$4);
      $$3.b($$6, csw.dM.n().a($$2));
   }

   public static void a(String $$0, gw $$1, ib $$2, czh $$3, akr $$4) {
      dva $$5 = a($$1, $$2, $$3);
      a($$5, $$1.v(), $$4);
      $$4.b($$1, csw.pa.n());
      dei $$6 = (dei)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new aex($$0));
      $$6.a($$2);
      $$6.a(dgt.a);
      $$6.e(true);
   }

   public static dei a(String $$0, gw $$1, czh $$2, int $$3, akr $$4, boolean $$5) {
      ib $$6 = a($$0, $$4).a();
      dva $$7 = a($$1, $$6, $$2);
      gw $$8;
      if ($$2 == czh.a) {
         $$8 = $$1;
      } else if ($$2 == czh.b) {
         $$8 = $$1.b($$6.w() - 1, 0, 0);
      } else if ($$2 == czh.c) {
         $$8 = $$1.b($$6.u() - 1, 0, $$6.w() - 1);
      } else {
         if ($$2 != czh.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$8 = $$1.b(0, 0, $$6.u() - 1);
      }

      a($$1, $$4);
      a($$7, $$1.v(), $$4);
      dei $$13 = a($$0, $$8, $$2, $$4, $$5);
      $$4.l().a($$7);
      $$4.a($$7);
      return $$13;
   }

   private static void a(gw $$0, akr $$1) {
      cpc $$2 = new cpc($$0);

      for (int $$3 = -1; $$3 < 4; $$3++) {
         for (int $$4 = -1; $$4 < 4; $$4++) {
            int $$5 = $$2.e + $$3;
            int $$6 = $$2.f + $$4;
            $$1.a($$5, $$6, true);
         }
      }
   }

   public static void a(dva $$0, int $$1, akr $$2) {
      dva $$3 = new dva($$0.g() - 2, $$0.h() - 3, $$0.i() - 3, $$0.j() + 3, $$0.k() + 20, $$0.l() + 3);
      gw.a($$3).forEach($$2x -> a($$1, $$2x, $$2));
      $$2.l().a($$3);
      $$2.a($$3);
      ehi $$4 = new ehi((double)$$3.g(), (double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l());
      List<biq> $$5 = $$2.a(biq.class, $$4, $$0x -> !($$0x instanceof cbu));
      $$5.forEach(biq::al);
   }

   public static dva a(gw $$0, ib $$1, czh $$2) {
      gw $$3 = $$0.a($$1).b(-1, -1, -1);
      gw $$4 = dzb.a($$3, cxq.a, $$2, $$0);
      dva $$5 = dva.a($$0, $$4);
      int $$6 = Math.min($$5.g(), $$5.j());
      int $$7 = Math.min($$5.i(), $$5.l());
      return $$5.a($$0.u() - $$6, 0, $$0.w() - $$7);
   }

   public static Optional<gw> a(gw $$0, int $$1, akr $$2) {
      return c($$0, $$1, $$2).stream().filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   @Nullable
   public static gw b(gw $$0, int $$1, akr $$2) {
      Comparator<gw> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      Collection<gw> $$4 = c($$0, $$1, $$2);
      Optional<gw> $$5 = $$4.stream().min($$3);
      return $$5.orElse(null);
   }

   public static Collection<gw> c(gw $$0, int $$1, akr $$2) {
      Collection<gw> $$3 = Lists.newArrayList();
      ehi $$4 = new ehi($$0);
      $$4 = $$4.g((double)$$1);

      for (int $$5 = (int)$$4.a; $$5 <= (int)$$4.d; $$5++) {
         for (int $$6 = (int)$$4.b; $$6 <= (int)$$4.e; $$6++) {
            for (int $$7 = (int)$$4.c; $$7 <= (int)$$4.f; $$7++) {
               gw $$8 = new gw($$5, $$6, $$7);
               dfj $$9 = $$2.a_($$8);
               if ($$9.a(csw.pa)) {
                  $$3.add($$8);
               }
            }
         }
      }

      return $$3;
   }

   private static dzb a(String $$0, akr $$1) {
      dzc $$2 = $$1.p();
      Optional<dzb> $$3 = $$2.b(new aex($$0));
      if ($$3.isPresent()) {
         return $$3.get();
      } else {
         String $$4 = $$0 + ".snbt";
         Path $$5 = Paths.get(b, $$4);
         qx $$6 = a($$5);
         if ($$6 == null) {
            throw new RuntimeException("Could not find structure file " + $$5 + ", and the structure is not available in the world structures either.");
         } else {
            return $$2.a($$6);
         }
      }
   }

   private static dei a(String $$0, gw $$1, czh $$2, akr $$3, boolean $$4) {
      $$3.b($$1, csw.pa.n());
      dei $$5 = (dei)$$3.c_($$1);
      $$5.a(dgt.b);
      $$5.a($$2);
      $$5.a(false);
      $$5.a(new aex($$0));
      $$5.a($$3, $$4);
      if ($$5.j() != ib.g) {
         return $$5;
      } else {
         dzb $$6 = a($$0, $$3);
         $$5.a($$3, $$4, $$6);
         if ($$5.j() == ib.g) {
            throw new RuntimeException("Failed to load structure " + $$0);
         } else {
            return $$5;
         }
      }
   }

   @Nullable
   private static qx a(Path $$0) {
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

   private static void a(int $$0, gw $$1, akr $$2) {
      dfj $$3 = null;
      hu $$4 = $$2.G_();
      dtl $$5 = dtl.a($$4.b(je.ap), $$4.b(je.aB), $$4.b(je.ay));
      List<dfj> $$6 = $$5.f();
      int $$7 = $$1.v() - $$2.H_();
      if ($$1.v() < $$0 && $$7 > 0 && $$7 <= $$6.size()) {
         $$3 = $$6.get($$7 - 1);
      }

      if ($$3 == null) {
         $$3 = csw.a.n();
      }

      ff $$8 = new ff($$3, Collections.emptySet(), null);
      $$8.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(gw $$0, gw $$1, akr $$2) {
      dei $$3 = (dei)$$2.c_($$0);
      ehi $$4 = a($$3).g(1.0);
      return $$4.d(ehn.b($$1));
   }
}
