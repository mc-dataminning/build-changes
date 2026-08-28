import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class tx {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 10;
   public static final String b = "gameteststructures";
   public static String c = "gameteststructures";

   public static dqv a(int $$0) {
      switch ($$0) {
         case 0:
            return dqv.a;
         case 1:
            return dqv.b;
         case 2:
            return dqv.c;
         case 3:
            return dqv.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dqv $$0) {
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

   public static fbm a(dwi $$0) {
      return fbm.a(b($$0));
   }

   public static env b(dwi $$0) {
      jh $$1 = c($$0);
      jh $$2 = a($$1, $$0.j(), $$0.s());
      return env.a($$1, $$2);
   }

   public static jh c(dwi $$0) {
      return $$0.aB_().a((kl)$$0.f());
   }

   public static void a(jh $$0, jh $$1, dqv $$2, arx $$3) {
      jh $$4 = esf.a($$0.a((kl)$$1), dpc.a, $$2, $$0);
      $$3.b($$4, dkf.gi.m());
      dva $$5 = (dva)$$3.c_($$4);
      $$5.b().a("test runclosest");
      jh $$6 = esf.a($$4.b(0, 0, -1), dpc.a, $$2, $$4);
      $$3.b($$6, dkf.dZ.m().a($$2));
   }

   public static void a(String $$0, jh $$1, kl $$2, dqv $$3, arx $$4) {
      env $$5 = b($$1.d(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dkf.pC.m());
      dwi $$6 = (dwi)$$4.c_($$1);
      $$6.a(false);
      $$6.a(alp.a($$0));
      $$6.b($$0);
      $$6.a($$2);
      $$6.a(dyx.a);
      $$6.e(true);
   }

   public static jh a(th $$0, jh $$1, dqv $$2, arx $$3) {
      kl $$4 = $$3.r().b(alp.a($$0.t())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.t())).a();
      jh $$5;
      if ($$2 == dqv.a) {
         $$5 = $$1;
      } else if ($$2 == dqv.b) {
         $$5 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dqv.c) {
         $$5 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dqv.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$5 = $$1.b(0, 0, $$4.u() - 1);
      }

      return $$5;
   }

   public static dwi b(th $$0, jh $$1, dqv $$2, arx $$3) {
      kl $$4 = $$3.r().b(alp.a($$0.t())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.t())).a();
      env $$5 = b($$1, $$4, $$2);
      jh $$6 = a($$0, $$1, $$2, $$3);
      b($$5, $$3);
      a($$5, $$3);
      return c($$0, $$6.e(), $$2, $$3);
   }

   public static void a(fbm $$0, arx $$1, boolean $$2) {
      jh $$3 = jh.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      jh $$4 = jh.a($$0.d, $$0.e, $$0.f);
      jh.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dkf.iu.m());
         }
      });
   }

   public static void a(fbm $$0, arx $$1) {
      jh $$2 = jh.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      jh $$3 = jh.a($$0.d, $$0.e, $$0.f);
      jh.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dkf.iu) && ($$4 || $$5)) {
            $$1.b($$3x, dkf.a.m());
         }
      });
   }

   private static void b(env $$0, arx $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.h, $$1x.i, true));
   }

   public static void a(env $$0, arx $$1) {
      int $$2 = $$0.i() - 1;
      env $$3 = new env($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      jh.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.n().a($$3);
      $$1.a($$3);
      fbm $$4 = fbm.a($$3);
      List<bvb> $$5 = $$1.a(bvb.class, $$4, $$0x -> !($$0x instanceof cpo));
      $$5.forEach(bvb::at);
   }

   public static jh a(jh $$0, kl $$1, dqv $$2) {
      jh $$3 = $$0.a($$1).b(-1, -1, -1);
      return esf.a($$3, dpc.a, $$2, $$0);
   }

   public static env b(jh $$0, kl $$1, dqv $$2) {
      jh $$3 = a($$0, $$1, $$2);
      env $$4 = env.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<jh> a(jh $$0, int $$1, arx $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<jh> b(jh $$0, int $$1, arx $$2) {
      Comparator<jh> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<jh> a(jh $$0, int $$1, arx $$2, String $$3) {
      return c($$0, $$1, $$2).map($$1x -> (dwi)$$2.c_($$1x)).filter(Objects::nonNull).filter($$1x -> Objects.equals($$1x.c(), $$3)).map(duq::aB_).map(jh::j);
   }

   public static Stream<jh> c(jh $$0, int $$1, arx $$2) {
      env $$3 = d($$0, $$1, $$2);
      return jh.a($$3).filter($$1x -> $$2.a_($$1x).a(dkf.pC)).map(jh::j);
   }

   private static dwi c(th $$0, jh $$1, dqv $$2, arx $$3) {
      $$3.b($$1, dkf.pC.m());
      dwi $$4 = (dwi)$$3.c_($$1);
      $$4.a(dyx.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(alp.a($$0.t()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.t());
      } else {
         return $$4;
      }
   }

   private static env d(jh $$0, int $$1, arx $$2) {
      jh $$3 = jh.a((double)$$0.u(), (double)$$2.a(edj.a.b, $$0).v(), (double)$$0.w());
      return new env($$3).c($$1, 10, $$1);
   }

   public static Stream<jh> a(jh $$0, bvb $$1, arx $$2) {
      int $$3 = 200;
      fbr $$4 = $$1.bF();
      fbr $$5 = $$4.e($$1.bT().c(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dus.v))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(duq::aB_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, jh $$1, arx $$2) {
      dxo $$3;
      if ($$1.v() < $$0) {
         $$3 = dkf.b.m();
      } else {
         $$3 = dkf.a.m();
      }

      gn $$5 = new gn($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(jh $$0, jh $$1, arx $$2) {
      dwi $$3 = (dwi)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
