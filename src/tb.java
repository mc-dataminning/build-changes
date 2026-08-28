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

   public static dqe a(int $$0) {
      switch ($$0) {
         case 0:
            return dqe.a;
         case 1:
            return dqe.b;
         case 2:
            return dqe.c;
         case 3:
            return dqe.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dqe $$0) {
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

   public static fav a(dvr $$0) {
      return fav.a(b($$0));
   }

   public static ene b(dvr $$0) {
      ji $$1 = c($$0);
      ji $$2 = a($$1, $$0.j(), $$0.s());
      return ene.a($$1, $$2);
   }

   public static ji c(dvr $$0) {
      return $$0.aA_().a((km)$$0.f());
   }

   public static void a(ji $$0, ji $$1, dqe $$2, ard $$3) {
      ji $$4 = ero.a($$0.a((km)$$1), dol.a, $$2, $$0);
      $$3.b($$4, djo.gi.m());
      duj $$5 = (duj)$$3.c_($$4);
      $$5.b().a("test runclosest");
      ji $$6 = ero.a($$4.b(0, 0, -1), dol.a, $$2, $$4);
      $$3.b($$6, djo.dZ.m().a($$2));
   }

   public static void a(String $$0, ji $$1, km $$2, dqe $$3, ard $$4) {
      ene $$5 = b($$1.d(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, djo.pC.m());
      dvr $$6 = (dvr)$$4.c_($$1);
      $$6.a(false);
      $$6.a(akv.a($$0));
      $$6.b($$0);
      $$6.a($$2);
      $$6.a(dyg.a);
      $$6.e(true);
   }

   public static ji a(sl $$0, ji $$1, dqe $$2, ard $$3) {
      km $$4 = $$3.r().b(akv.a($$0.t())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.t())).a();
      ji $$5;
      if ($$2 == dqe.a) {
         $$5 = $$1;
      } else if ($$2 == dqe.b) {
         $$5 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dqe.c) {
         $$5 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dqe.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$5 = $$1.b(0, 0, $$4.u() - 1);
      }

      return $$5;
   }

   public static dvr b(sl $$0, ji $$1, dqe $$2, ard $$3) {
      km $$4 = $$3.r().b(akv.a($$0.t())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.t())).a();
      ene $$5 = b($$1, $$4, $$2);
      ji $$6 = a($$0, $$1, $$2, $$3);
      b($$5, $$3);
      a($$5, $$3);
      return c($$0, $$6.e(), $$2, $$3);
   }

   public static void a(fav $$0, ard $$1, boolean $$2) {
      ji $$3 = ji.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      ji $$4 = ji.a($$0.d, $$0.e, $$0.f);
      ji.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, djo.iu.m());
         }
      });
   }

   public static void a(fav $$0, ard $$1) {
      ji $$2 = ji.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      ji $$3 = ji.a($$0.d, $$0.e, $$0.f);
      ji.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(djo.iu) && ($$4 || $$5)) {
            $$1.b($$3x, djo.a.m());
         }
      });
   }

   private static void b(ene $$0, ard $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.h, $$1x.i, true));
   }

   public static void a(ene $$0, ard $$1) {
      int $$2 = $$0.i() - 1;
      ene $$3 = new ene($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      ji.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.n().a($$3);
      $$1.a($$3);
      fav $$4 = fav.a($$3);
      List<bul> $$5 = $$1.a(bul.class, $$4, $$0x -> !($$0x instanceof cox));
      $$5.forEach(bul::at);
   }

   public static ji a(ji $$0, km $$1, dqe $$2) {
      ji $$3 = $$0.a($$1).b(-1, -1, -1);
      return ero.a($$3, dol.a, $$2, $$0);
   }

   public static ene b(ji $$0, km $$1, dqe $$2) {
      ji $$3 = a($$0, $$1, $$2);
      ene $$4 = ene.a($$0, $$3);
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
      return c($$0, $$1, $$2).map($$1x -> (dvr)$$2.c_($$1x)).filter(Objects::nonNull).filter($$1x -> Objects.equals($$1x.c(), $$3)).map(dtz::aA_).map(ji::j);
   }

   public static Stream<ji> c(ji $$0, int $$1, ard $$2) {
      ene $$3 = d($$0, $$1, $$2);
      return ji.a($$3).filter($$1x -> $$2.a_($$1x).a(djo.pC)).map(ji::j);
   }

   private static dvr c(sl $$0, ji $$1, dqe $$2, ard $$3) {
      $$3.b($$1, djo.pC.m());
      dvr $$4 = (dvr)$$3.c_($$1);
      $$4.a(dyg.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(akv.a($$0.t()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.t());
      } else {
         return $$4;
      }
   }

   private static ene d(ji $$0, int $$1, ard $$2) {
      ji $$3 = ji.a((double)$$0.u(), (double)$$2.a(ecs.a.b, $$0).v(), (double)$$0.w());
      return new ene($$3).c($$1, 10, $$1);
   }

   public static Stream<ji> a(ji $$0, bul $$1, ard $$2) {
      int $$3 = 200;
      fba $$4 = $$1.bF();
      fba $$5 = $$4.e($$1.bT().c(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dub.v))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dtz::aA_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, ji $$1, ard $$2) {
      dwx $$3;
      if ($$1.v() < $$0) {
         $$3 = djo.b.m();
      } else {
         $$3 = djo.a.m();
      }

      go $$5 = new go($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(ji $$0, ji $$1, ard $$2) {
      dvr $$3 = (dvr)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
