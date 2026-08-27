import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class rr {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";

   public static dbr a(int $$0) {
      switch ($$0) {
         case 0:
            return dbr.a;
         case 1:
            return dbr.b;
         case 2:
            return dbr.c;
         case 3:
            return dbr.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dbr $$0) {
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

   public static eju a(dgw $$0) {
      return eju.a(b($$0));
   }

   public static dxe b(dgw $$0) {
      hx $$1 = c($$0);
      hx $$2 = a($$1, $$0.l(), $$0.w());
      return dxe.a($$1, $$2);
   }

   public static hx c(dgw $$0) {
      return $$0.aC_().a((ja)$$0.k());
   }

   public static void a(hx $$0, hx $$1, dbr $$2, ami $$3) {
      hx $$4 = ebm.a($$0.a((ja)$$1), dab.a, $$2, $$0);
      $$3.b($$4, cvh.fN.o());
      dfs $$5 = (dfs)$$3.c_($$4);
      $$5.c().a("test runthis");
      hx $$6 = ebm.a($$4.b(0, 0, -1), dab.a, $$2, $$4);
      $$3.b($$6, cvh.dM.o().a($$2));
   }

   public static void a(String $$0, hx $$1, ja $$2, dbr $$3, ami $$4) {
      dxe $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, cvh.pa.o());
      dgw $$6 = (dgw)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new agm($$0));
      $$6.a($$2);
      $$6.a(dix.a);
      $$6.e(true);
   }

   public static dgw a(String $$0, hx $$1, dbr $$2, ami $$3) {
      ja $$4 = $$3.p().b(new agm($$0)).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0)).a();
      dxe $$5 = b($$1, $$4, $$2);
      hx $$6;
      if ($$2 == dbr.a) {
         $$6 = $$1;
      } else if ($$2 == dbr.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dbr.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dbr.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   private static void b(dxe $$0, ami $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(dxe $$0, ami $$1) {
      int $$2 = $$0.i() - 1;
      dxe $$3 = new dxe($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      hx.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.l().a($$3);
      $$1.a($$3);
      eju $$4 = new eju((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<bkv> $$5 = $$1.a(bkv.class, $$4, $$0x -> !($$0x instanceof cdz));
      $$5.forEach(bkv::am);
   }

   public static hx a(hx $$0, ja $$1, dbr $$2) {
      hx $$3 = $$0.a($$1).b(-1, -1, -1);
      return ebm.a($$3, dab.a, $$2, $$0);
   }

   public static dxe b(hx $$0, ja $$1, dbr $$2) {
      hx $$3 = a($$0, $$1, $$2);
      dxe $$4 = dxe.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<hx> a(hx $$0, int $$1, ami $$2) {
      return c($$0, $$1, $$2).stream().filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   @Nullable
   public static hx b(hx $$0, int $$1, ami $$2) {
      Comparator<hx> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      Collection<hx> $$4 = c($$0, $$1, $$2);
      Optional<hx> $$5 = $$4.stream().min($$3);
      return $$5.orElse(null);
   }

   public static Collection<hx> c(hx $$0, int $$1, ami $$2) {
      Collection<hx> $$3 = Lists.newArrayList();
      dxe $$4 = new dxe($$0).a($$1);
      hx.a($$4).forEach($$2x -> {
         if ($$2.a_($$2x).a(cvh.pa)) {
            $$3.add($$2x.i());
         }
      });
      return $$3;
   }

   private static dgw b(String $$0, hx $$1, dbr $$2, ami $$3) {
      $$3.b($$1, cvh.pa.o());
      dgw $$4 = (dgw)$$3.c_($$1);
      $$4.a(dix.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new agm($$0));
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info " + $$0);
      } else {
         return $$4;
      }
   }

   private static void a(int $$0, hx $$1, ami $$2) {
      dhn $$3;
      if ($$1.v() < $$0) {
         $$3 = cvh.b.o();
      } else {
         $$3 = cvh.a.o();
      }

      fh $$5 = new fh($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(hx $$0, hx $$1, ami $$2) {
      dgw $$3 = (dgw)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
