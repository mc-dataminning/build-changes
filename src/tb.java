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

   public static dqw a(int $$0) {
      switch ($$0) {
         case 0:
            return dqw.a;
         case 1:
            return dqw.b;
         case 2:
            return dqw.c;
         case 3:
            return dqw.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dqw $$0) {
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

   public static fbs a(dwk $$0) {
      return fbs.a(b($$0));
   }

   public static eob b(dwk $$0) {
      ji $$1 = c($$0);
      ji $$2 = a($$1, $$0.j(), $$0.s());
      return eob.a($$1, $$2);
   }

   public static ji c(dwk $$0) {
      return $$0.aA_().a((km)$$0.f());
   }

   public static void a(ji $$0, ji $$1, dqw $$2, ard $$3) {
      ji $$4 = esl.a($$0.a((km)$$1), dpf.a, $$2, $$0);
      $$3.b($$4, dkg.gi.m());
      dvc $$5 = (dvc)$$3.c_($$4);
      $$5.b().a("test runclosest");
      ji $$6 = esl.a($$4.b(0, 0, -1), dpf.a, $$2, $$4);
      $$3.b($$6, dkg.dZ.m().a($$2));
   }

   public static void a(String $$0, ji $$1, km $$2, dqw $$3, ard $$4) {
      eob $$5 = b($$1.d(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dkg.pC.m());
      dwk $$6 = (dwk)$$4.c_($$1);
      $$6.a(false);
      $$6.b(false);
      $$6.a(aku.a($$0));
      $$6.b($$0);
      $$6.a($$2);
      $$6.a(dza.a);
      $$6.f(true);
   }

   public static ji a(sl $$0, ji $$1, dqw $$2, ard $$3) {
      km $$4 = $$3.r().b(aku.a($$0.t())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.t())).a();
      ji $$5;
      if ($$2 == dqw.a) {
         $$5 = $$1;
      } else if ($$2 == dqw.b) {
         $$5 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dqw.c) {
         $$5 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dqw.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$5 = $$1.b(0, 0, $$4.u() - 1);
      }

      return $$5;
   }

   public static dwk b(sl $$0, ji $$1, dqw $$2, ard $$3) {
      km $$4 = $$3.r().b(aku.a($$0.t())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.t())).a();
      eob $$5 = b($$1, $$4, $$2);
      ji $$6 = a($$0, $$1, $$2, $$3);
      b($$5, $$3);
      a($$5, $$3);
      return c($$0, $$6.e(), $$2, $$3);
   }

   public static void a(fbs $$0, ard $$1, boolean $$2) {
      ji $$3 = ji.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      ji $$4 = ji.a($$0.d, $$0.e, $$0.f);
      ji.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dkg.iu.m());
         }
      });
   }

   public static void a(fbs $$0, ard $$1) {
      ji $$2 = ji.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      ji $$3 = ji.a($$0.d, $$0.e, $$0.f);
      ji.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dkg.iu) && ($$4 || $$5)) {
            $$1.b($$3x, dkg.a.m());
         }
      });
   }

   private static void b(eob $$0, ard $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.h, $$1x.i, true));
   }

   public static void a(eob $$0, ard $$1) {
      int $$2 = $$0.i() - 1;
      eob $$3 = new eob($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      ji.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.n().a($$3);
      $$1.a($$3);
      fbs $$4 = fbs.a($$3);
      List<bva> $$5 = $$1.a(bva.class, $$4, $$0x -> !($$0x instanceof cpr));
      $$5.forEach(bva::at);
   }

   public static ji a(ji $$0, km $$1, dqw $$2) {
      ji $$3 = $$0.a($$1).b(-1, -1, -1);
      return esl.a($$3, dpf.a, $$2, $$0);
   }

   public static eob b(ji $$0, km $$1, dqw $$2) {
      ji $$3 = a($$0, $$1, $$2);
      eob $$4 = eob.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<ji> a(ji $$0, int $$1, ard $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<ji> b(ji $$0, int $$1, ard $$2) {
      Comparator<ji> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<ji> a(ji $$0, int $$1, ard $$2, String $$3) {
      return c($$0, $$1, $$2).map($$1x -> (dwk)$$2.c_($$1x)).filter(Objects::nonNull).filter($$1x -> Objects.equals($$1x.c(), $$3)).map(dus::aA_).map(ji::j);
   }

   public static Stream<ji> c(ji $$0, int $$1, ard $$2) {
      eob $$3 = d($$0, $$1, $$2);
      return ji.a($$3).filter($$1x -> $$2.a_($$1x).a(dkg.pC)).map(ji::j);
   }

   private static dwk c(sl $$0, ji $$1, dqw $$2, ard $$3) {
      $$3.b($$1, dkg.pC.m());
      dwk $$4 = (dwk)$$3.c_($$1);
      $$4.a(dza.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.b(false);
      $$4.a(aku.a($$0.t()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.t());
      } else {
         return $$4;
      }
   }

   private static eob d(ji $$0, int $$1, ard $$2) {
      ji $$3 = ji.a((double)$$0.u(), (double)$$2.a(edo.a.b, $$0).v(), (double)$$0.w());
      return new eob($$3).c($$1, 10, $$1);
   }

   public static Stream<ji> a(ji $$0, bva $$1, ard $$2) {
      int $$3 = 200;
      fbx $$4 = $$1.bD();
      fbx $$5 = $$4.e($$1.bS().c(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, duu.v))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dus::aA_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, ji $$1, ard $$2) {
      dxq $$3;
      if ($$1.v() < $$0) {
         $$3 = dkg.b.m();
      } else {
         $$3 = dkg.a.m();
      }

      go $$5 = new go($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 306);
      $$2.a($$1, $$3.b());
   }

   private static boolean a(ji $$0, ji $$1, ard $$2) {
      dwk $$3 = (dwk)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
