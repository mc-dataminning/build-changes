import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class tb {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 10;
   public static final String b = "gameteststructures";
   public static String c = "gameteststructures";

   public static dqc a(int $$0) {
      switch ($$0) {
         case 0:
            return dqc.a;
         case 1:
            return dqc.b;
         case 2:
            return dqc.c;
         case 3:
            return dqc.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dqc $$0) {
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

   public static fat a(dvp $$0) {
      return fat.a(b($$0));
   }

   public static enc b(dvp $$0) {
      ji $$1 = c($$0);
      ji $$2 = a($$1, $$0.j(), $$0.s());
      return enc.a($$1, $$2);
   }

   public static ji c(dvp $$0) {
      return $$0.aA_().a((km)$$0.f());
   }

   public static void a(ji $$0, ji $$1, dqc $$2, arc $$3) {
      ji $$4 = erm.a($$0.a((km)$$1), doj.a, $$2, $$0);
      $$3.b($$4, djm.gi.m());
      duh $$5 = (duh)$$3.c_($$4);
      $$5.b().a("test runclosest");
      ji $$6 = erm.a($$4.b(0, 0, -1), doj.a, $$2, $$4);
      $$3.b($$6, djm.dZ.m().a($$2));
   }

   public static void a(String $$0, ji $$1, km $$2, dqc $$3, arc $$4) {
      enc $$5 = b($$1.d(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, djm.pC.m());
      dvp $$6 = (dvp)$$4.c_($$1);
      $$6.a(false);
      $$6.a(aku.a($$0));
      $$6.b($$0);
      $$6.a($$2);
      $$6.a(dye.a);
      $$6.e(true);
   }

   public static ji a(sl $$0, ji $$1, dqc $$2, arc $$3) {
      km $$4 = $$3.r().b(aku.a($$0.t())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.t())).a();
      ji $$5;
      if ($$2 == dqc.a) {
         $$5 = $$1;
      } else if ($$2 == dqc.b) {
         $$5 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dqc.c) {
         $$5 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dqc.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$5 = $$1.b(0, 0, $$4.u() - 1);
      }

      return $$5;
   }

   public static dvp b(sl $$0, ji $$1, dqc $$2, arc $$3) {
      km $$4 = $$3.r().b(aku.a($$0.t())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.t())).a();
      enc $$5 = b($$1, $$4, $$2);
      ji $$6 = a($$0, $$1, $$2, $$3);
      b($$5, $$3);
      a($$5, $$3);
      return c($$0, $$6.e(), $$2, $$3);
   }

   public static void a(fat $$0, arc $$1, boolean $$2) {
      ji $$3 = ji.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      ji $$4 = ji.a($$0.d, $$0.e, $$0.f);
      ji.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, djm.iu.m());
         }
      });
   }

   public static void a(fat $$0, arc $$1) {
      ji $$2 = ji.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      ji $$3 = ji.a($$0.d, $$0.e, $$0.f);
      ji.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(djm.iu) && ($$4 || $$5)) {
            $$1.b($$3x, djm.a.m());
         }
      });
   }

   private static void b(enc $$0, arc $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.h, $$1x.i, true));
   }

   public static void a(enc $$0, arc $$1) {
      int $$2 = $$0.i() - 1;
      enc $$3 = new enc($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      ji.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.n().a($$3);
      $$1.a($$3);
      fat $$4 = fat.a($$3);
      List<buj> $$5 = $$1.a(buj.class, $$4, $$0x -> !($$0x instanceof cov));
      $$5.forEach(buj::at);
   }

   public static ji a(ji $$0, km $$1, dqc $$2) {
      ji $$3 = $$0.a($$1).b(-1, -1, -1);
      return erm.a($$3, doj.a, $$2, $$0);
   }

   public static enc b(ji $$0, km $$1, dqc $$2) {
      ji $$3 = a($$0, $$1, $$2);
      enc $$4 = enc.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<ji> a(ji $$0, int $$1, arc $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<ji> b(ji $$0, int $$1, arc $$2) {
      Comparator<ji> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<ji> a(ji $$0, int $$1, arc $$2, String $$3) {
      return c($$0, $$1, $$2).map($$1x -> (dvp)$$2.c_($$1x)).filter(Objects::nonNull).filter($$1x -> Objects.equals($$1x.c(), $$3)).map(dtx::aA_).map(ji::j);
   }

   public static Stream<ji> c(ji $$0, int $$1, arc $$2) {
      enc $$3 = d($$0, $$1, $$2);
      return ji.a($$3).filter($$1x -> $$2.a_($$1x).a(djm.pC)).map(ji::j);
   }

   private static dvp c(sl $$0, ji $$1, dqc $$2, arc $$3) {
      $$3.b($$1, djm.pC.m());
      dvp $$4 = (dvp)$$3.c_($$1);
      $$4.a(dye.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(aku.a($$0.t()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.t());
      } else {
         return $$4;
      }
   }

   private static enc d(ji $$0, int $$1, arc $$2) {
      ji $$3 = ji.a((double)$$0.u(), (double)$$2.a(ecq.a.b, $$0).v(), (double)$$0.w());
      return new enc($$3).c($$1, 10, $$1);
   }

   public static Stream<ji> a(ji $$0, buj $$1, arc $$2) {
      int $$3 = 200;
      fay $$4 = $$1.bF();
      fay $$5 = $$4.e($$1.bT().c(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dtz.v))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dtx::aA_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, ji $$1, arc $$2) {
      dwv $$3;
      if ($$1.v() < $$0) {
         $$3 = djm.b.m();
      } else {
         $$3 = djm.a.m();
      }

      go $$5 = new go($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(ji $$0, ji $$1, arc $$2) {
      dvp $$3 = (dvp)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
