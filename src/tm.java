import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class tm {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 10;
   public static final String b = "gameteststructures";
   public static String c = "gameteststructures";

   public static dmk a(int $$0) {
      switch ($$0) {
         case 0:
            return dmk.a;
         case 1:
            return dmk.b;
         case 2:
            return dmk.c;
         case 3:
            return dmk.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dmk $$0) {
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

   public static ewr a(drv $$0) {
      return ewr.a(b($$0));
   }

   public static eje b(drv $$0) {
      jd $$1 = c($$0);
      jd $$2 = a($$1, $$0.j(), $$0.l());
      return eje.a($$1, $$2);
   }

   public static jd c(drv $$0) {
      return $$0.az_().a((kh)$$0.f());
   }

   public static void a(jd $$0, jd $$1, dmk $$2, aqt $$3) {
      jd $$4 = enn.a($$0.a((kh)$$1), dkt.a, $$2, $$0);
      $$3.b($$4, dfy.fN.o());
      dqp $$5 = (dqp)$$3.c_($$4);
      $$5.b().a("test runclosest");
      jd $$6 = enn.a($$4.b(0, 0, -1), dkt.a, $$2, $$4);
      $$3.b($$6, dfy.dM.o().a($$2));
   }

   public static void a(String $$0, jd $$1, kh $$2, dmk $$3, aqt $$4) {
      eje $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dfy.pa.o());
      drv $$6 = (drv)$$4.c_($$1);
      $$6.a(false);
      $$6.a(akq.a($$0));
      $$6.a($$2);
      $$6.a(duk.a);
      $$6.e(true);
   }

   public static drv a(sw $$0, jd $$1, dmk $$2, aqt $$3) {
      kh $$4 = $$3.q().b(akq.a($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      eje $$5 = b($$1, $$4, $$2);
      jd $$6;
      if ($$2 == dmk.a) {
         $$6 = $$1;
      } else if ($$2 == dmk.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dmk.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dmk.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   public static void a(ewr $$0, aqt $$1, boolean $$2) {
      jd $$3 = jd.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      jd $$4 = jd.a($$0.d, $$0.e, $$0.f);
      jd.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dfy.hW.o());
         }
      });
   }

   public static void a(ewr $$0, aqt $$1) {
      jd $$2 = jd.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      jd $$3 = jd.a($$0.d, $$0.e, $$0.f);
      jd.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dfy.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dfy.a.o());
         }
      });
   }

   private static void b(eje $$0, aqt $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(eje $$0, aqt $$1) {
      int $$2 = $$0.i() - 1;
      eje $$3 = new eje($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      jd.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      ewr $$4 = new ewr((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<bsq> $$5 = $$1.a(bsq.class, $$4, $$0x -> !($$0x instanceof cmv));
      $$5.forEach(bsq::aq);
   }

   public static jd a(jd $$0, kh $$1, dmk $$2) {
      jd $$3 = $$0.a($$1).b(-1, -1, -1);
      return enn.a($$3, dkt.a, $$2, $$0);
   }

   public static eje b(jd $$0, kh $$1, dmk $$2) {
      jd $$3 = a($$0, $$1, $$2);
      eje $$4 = eje.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<jd> a(jd $$0, int $$1, aqt $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<jd> b(jd $$0, int $$1, aqt $$2) {
      Comparator<jd> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<jd> a(jd $$0, int $$1, aqt $$2, String $$3) {
      return c($$0, $$1, $$2).map($$1x -> (drv)$$2.c_($$1x)).filter(Objects::nonNull).filter($$1x -> Objects.equals($$1x.c(), $$3)).map(dqf::az_).map(jd::i);
   }

   public static Stream<jd> c(jd $$0, int $$1, aqt $$2) {
      eje $$3 = d($$0, $$1, $$2);
      return jd.a($$3).filter($$1x -> $$2.a_($$1x).a(dfy.pa)).map(jd::i);
   }

   private static drv b(sw $$0, jd $$1, dmk $$2, aqt $$3) {
      $$3.b($$1, dfy.pa.o());
      drv $$4 = (drv)$$3.c_($$1);
      $$4.a(duk.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(akq.a($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   private static eje d(jd $$0, int $$1, aqt $$2) {
      jd $$3 = jd.a((double)$$0.u(), (double)$$2.a(dyv.a.b, $$0).v(), (double)$$0.w());
      return new eje($$3).c($$1, 10, $$1);
   }

   public static Stream<jd> a(jd $$0, bsq $$1, aqt $$2) {
      int $$3 = 200;
      eww $$4 = $$1.by();
      eww $$5 = $$4.e($$1.bM().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dqh.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dqf::az_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, jd $$1, aqt $$2) {
      dta $$3;
      if ($$1.v() < $$0) {
         $$3 = dfy.b.o();
      } else {
         $$3 = dfy.a.o();
      }

      gk $$5 = new gk($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(jd $$0, jd $$1, aqt $$2) {
      drv $$3 = (drv)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
