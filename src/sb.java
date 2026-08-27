import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class sb {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";

   public static ddc a(int $$0) {
      switch ($$0) {
         case 0:
            return ddc.a;
         case 1:
            return ddc.b;
         case 2:
            return ddc.c;
         case 3:
            return ddc.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(ddc $$0) {
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

   public static elo a(dij $$0) {
      return elo.a(b($$0));
   }

   public static dyy b(dij $$0) {
      hx $$1 = c($$0);
      hx $$2 = a($$1, $$0.k(), $$0.m());
      return dyy.a($$1, $$2);
   }

   public static hx c(dij $$0) {
      return $$0.aB_().a((jb)$$0.g());
   }

   public static void a(hx $$0, hx $$1, ddc $$2, and $$3) {
      hx $$4 = edg.a($$0.a((jb)$$1), dbm.a, $$2, $$0);
      $$3.b($$4, cws.fN.o());
      dhf $$5 = (dhf)$$3.c_($$4);
      $$5.c().a("test runthis");
      hx $$6 = edg.a($$4.b(0, 0, -1), dbm.a, $$2, $$4);
      $$3.b($$6, cws.dM.o().a($$2));
   }

   public static void a(String $$0, hx $$1, jb $$2, ddc $$3, and $$4) {
      dyy $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, cws.pa.o());
      dij $$6 = (dij)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new ahg($$0));
      $$6.a($$2);
      $$6.a(dkr.a);
      $$6.e(true);
   }

   public static dij a(ro $$0, hx $$1, ddc $$2, and $$3) {
      jb $$4 = $$3.q().b(new ahg($$0.u())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.u())).a();
      dyy $$5 = b($$1, $$4, $$2);
      hx $$6;
      if ($$2 == ddc.a) {
         $$6 = $$1;
      } else if ($$2 == ddc.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == ddc.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != ddc.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   private static void b(dyy $$0, and $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(dyy $$0, and $$1) {
      int $$2 = $$0.i() - 1;
      dyy $$3 = new dyy($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      hx.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      elo $$4 = new elo((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<blv> $$5 = $$1.a(blv.class, $$4, $$0x -> !($$0x instanceof cfi));
      $$5.forEach(blv::am);
   }

   public static hx a(hx $$0, jb $$1, ddc $$2) {
      hx $$3 = $$0.a($$1).b(-1, -1, -1);
      return edg.a($$3, dbm.a, $$2, $$0);
   }

   public static dyy b(hx $$0, jb $$1, ddc $$2) {
      hx $$3 = a($$0, $$1, $$2);
      dyy $$4 = dyy.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<hx> a(hx $$0, int $$1, and $$2) {
      return c($$0, $$1, $$2).stream().filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   @Nullable
   public static hx b(hx $$0, int $$1, and $$2) {
      Comparator<hx> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      Collection<hx> $$4 = c($$0, $$1, $$2);
      Optional<hx> $$5 = $$4.stream().min($$3);
      return $$5.orElse(null);
   }

   public static Collection<hx> c(hx $$0, int $$1, and $$2) {
      Collection<hx> $$3 = Lists.newArrayList();
      dyy $$4 = new dyy($$0).a($$1);
      hx.a($$4).forEach($$2x -> {
         if ($$2.a_($$2x).a(cws.pa)) {
            $$3.add($$2x.i());
         }
      });
      return $$3;
   }

   private static dij b(ro $$0, hx $$1, ddc $$2, and $$3) {
      $$3.b($$1, cws.pa.o());
      dij $$4 = (dij)$$3.c_($$1);
      $$4.a(dkr.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new ahg($$0.u()));
      $$4.b($$0.c());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.c() + ". Structure name: " + $$0.u());
      } else {
         return $$4;
      }
   }

   private static void a(int $$0, hx $$1, and $$2) {
      djh $$3;
      if ($$1.v() < $$0) {
         $$3 = cws.b.o();
      } else {
         $$3 = cws.a.o();
      }

      fh $$5 = new fh($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(hx $$0, hx $$1, and $$2) {
      dij $$3 = (dij)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
