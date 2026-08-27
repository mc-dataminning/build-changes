import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class rx {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";

   public static dcl a(int $$0) {
      switch ($$0) {
         case 0:
            return dcl.a;
         case 1:
            return dcl.b;
         case 2:
            return dcl.c;
         case 3:
            return dcl.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dcl $$0) {
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

   public static ekw a(dhr $$0) {
      return ekw.a(b($$0));
   }

   public static dyg b(dhr $$0) {
      hv $$1 = c($$0);
      hv $$2 = a($$1, $$0.k(), $$0.m());
      return dyg.a($$1, $$2);
   }

   public static hv c(dhr $$0) {
      return $$0.aB_().a((iz)$$0.g());
   }

   public static void a(hv $$0, hv $$1, dcl $$2, amp $$3) {
      hv $$4 = eco.a($$0.a((iz)$$1), dav.a, $$2, $$0);
      $$3.b($$4, cwb.fN.o());
      dgn $$5 = (dgn)$$3.c_($$4);
      $$5.c().a("test runthis");
      hv $$6 = eco.a($$4.b(0, 0, -1), dav.a, $$2, $$4);
      $$3.b($$6, cwb.dM.o().a($$2));
   }

   public static void a(String $$0, hv $$1, iz $$2, dcl $$3, amp $$4) {
      dyg $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, cwb.pa.o());
      dhr $$6 = (dhr)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new agt($$0));
      $$6.a($$2);
      $$6.a(djz.a);
      $$6.e(true);
   }

   public static dhr a(rk $$0, hv $$1, dcl $$2, amp $$3) {
      iz $$4 = $$3.p().b(new agt($$0.u())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.u())).a();
      dyg $$5 = b($$1, $$4, $$2);
      hv $$6;
      if ($$2 == dcl.a) {
         $$6 = $$1;
      } else if ($$2 == dcl.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dcl.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dcl.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   private static void b(dyg $$0, amp $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(dyg $$0, amp $$1) {
      int $$2 = $$0.i() - 1;
      dyg $$3 = new dyg($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      hv.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.l().a($$3);
      $$1.a($$3);
      ekw $$4 = new ekw((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<blf> $$5 = $$1.a(blf.class, $$4, $$0x -> !($$0x instanceof cer));
      $$5.forEach(blf::am);
   }

   public static hv a(hv $$0, iz $$1, dcl $$2) {
      hv $$3 = $$0.a($$1).b(-1, -1, -1);
      return eco.a($$3, dav.a, $$2, $$0);
   }

   public static dyg b(hv $$0, iz $$1, dcl $$2) {
      hv $$3 = a($$0, $$1, $$2);
      dyg $$4 = dyg.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<hv> a(hv $$0, int $$1, amp $$2) {
      return c($$0, $$1, $$2).stream().filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   @Nullable
   public static hv b(hv $$0, int $$1, amp $$2) {
      Comparator<hv> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      Collection<hv> $$4 = c($$0, $$1, $$2);
      Optional<hv> $$5 = $$4.stream().min($$3);
      return $$5.orElse(null);
   }

   public static Collection<hv> c(hv $$0, int $$1, amp $$2) {
      Collection<hv> $$3 = Lists.newArrayList();
      dyg $$4 = new dyg($$0).a($$1);
      hv.a($$4).forEach($$2x -> {
         if ($$2.a_($$2x).a(cwb.pa)) {
            $$3.add($$2x.i());
         }
      });
      return $$3;
   }

   private static dhr b(rk $$0, hv $$1, dcl $$2, amp $$3) {
      $$3.b($$1, cwb.pa.o());
      dhr $$4 = (dhr)$$3.c_($$1);
      $$4.a(djz.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new agt($$0.u()));
      $$4.b($$0.c());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.c() + ". Structure name: " + $$0.u());
      } else {
         return $$4;
      }
   }

   private static void a(int $$0, hv $$1, amp $$2) {
      dip $$3;
      if ($$1.v() < $$0) {
         $$3 = cwb.b.o();
      } else {
         $$3 = cwb.a.o();
      }

      ff $$5 = new ff($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(hv $$0, hv $$1, amp $$2) {
      dhr $$3 = (dhr)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
