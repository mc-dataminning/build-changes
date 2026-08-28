import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class tq {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 10;
   public static final String b = "gameteststructures";
   public static String c = "gameteststructures";

   public static dnx a(int $$0) {
      switch ($$0) {
         case 0:
            return dnx.a;
         case 1:
            return dnx.b;
         case 2:
            return dnx.c;
         case 3:
            return dnx.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dnx $$0) {
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

   public static eyn a(dtj $$0) {
      return eyn.a(b($$0));
   }

   public static eku b(dtj $$0) {
      je $$1 = c($$0);
      je $$2 = a($$1, $$0.j(), $$0.t());
      return eku.a($$1, $$2);
   }

   public static je c(dtj $$0) {
      return $$0.aB_().a((ki)$$0.f());
   }

   public static void a(je $$0, je $$1, dnx $$2, arh $$3) {
      je $$4 = epe.a($$0.a((ki)$$1), dmg.a, $$2, $$0);
      $$3.b($$4, dhl.fN.o());
      dsc $$5 = (dsc)$$3.c_($$4);
      $$5.b().a("test runclosest");
      je $$6 = epe.a($$4.b(0, 0, -1), dmg.a, $$2, $$4);
      $$3.b($$6, dhl.dM.o().a($$2));
   }

   public static void a(String $$0, je $$1, ki $$2, dnx $$3, arh $$4) {
      eku $$5 = b($$1.d(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dhl.pa.o());
      dtj $$6 = (dtj)$$4.c_($$1);
      $$6.a(false);
      $$6.a(alc.a($$0));
      $$6.b($$0);
      $$6.a($$2);
      $$6.a(dvy.a);
      $$6.e(true);
   }

   public static je a(ta $$0, je $$1, dnx $$2, arh $$3) {
      ki $$4 = $$3.q().b(alc.a($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      je $$5;
      if ($$2 == dnx.a) {
         $$5 = $$1;
      } else if ($$2 == dnx.b) {
         $$5 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dnx.c) {
         $$5 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dnx.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$5 = $$1.b(0, 0, $$4.u() - 1);
      }

      return $$5;
   }

   public static dtj b(ta $$0, je $$1, dnx $$2, arh $$3) {
      ki $$4 = $$3.q().b(alc.a($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      eku $$5 = b($$1, $$4, $$2);
      je $$6 = a($$0, $$1, $$2, $$3);
      b($$5, $$3);
      a($$5, $$3);
      return c($$0, $$6.e(), $$2, $$3);
   }

   public static void a(eyn $$0, arh $$1, boolean $$2) {
      je $$3 = je.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      je $$4 = je.a($$0.d, $$0.e, $$0.f);
      je.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dhl.hW.o());
         }
      });
   }

   public static void a(eyn $$0, arh $$1) {
      je $$2 = je.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      je $$3 = je.a($$0.d, $$0.e, $$0.f);
      je.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dhl.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dhl.a.o());
         }
      });
   }

   private static void b(eku $$0, arh $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(eku $$0, arh $$1) {
      int $$2 = $$0.i() - 1;
      eku $$3 = new eku($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      je.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      eyn $$4 = eyn.a($$3);
      List<bto> $$5 = $$1.a(bto.class, $$4, $$0x -> !($$0x instanceof cnu));
      $$5.forEach(bto::as);
   }

   public static je a(je $$0, ki $$1, dnx $$2) {
      je $$3 = $$0.a($$1).b(-1, -1, -1);
      return epe.a($$3, dmg.a, $$2, $$0);
   }

   public static eku b(je $$0, ki $$1, dnx $$2) {
      je $$3 = a($$0, $$1, $$2);
      eku $$4 = eku.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<je> a(je $$0, int $$1, arh $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<je> b(je $$0, int $$1, arh $$2) {
      Comparator<je> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<je> a(je $$0, int $$1, arh $$2, String $$3) {
      return c($$0, $$1, $$2).map($$1x -> (dtj)$$2.c_($$1x)).filter(Objects::nonNull).filter($$1x -> Objects.equals($$1x.c(), $$3)).map(drs::aB_).map(je::j);
   }

   public static Stream<je> c(je $$0, int $$1, arh $$2) {
      eku $$3 = d($$0, $$1, $$2);
      return je.a($$3).filter($$1x -> $$2.a_($$1x).a(dhl.pa)).map(je::j);
   }

   private static dtj c(ta $$0, je $$1, dnx $$2, arh $$3) {
      $$3.b($$1, dhl.pa.o());
      dtj $$4 = (dtj)$$3.c_($$1);
      $$4.a(dvy.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(alc.a($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   private static eku d(je $$0, int $$1, arh $$2) {
      je $$3 = je.a((double)$$0.u(), (double)$$2.a(eak.a.b, $$0).v(), (double)$$0.w());
      return new eku($$3).c($$1, 10, $$1);
   }

   public static Stream<je> a(je $$0, bto $$1, arh $$2) {
      int $$3 = 200;
      eys $$4 = $$1.bC();
      eys $$5 = $$4.e($$1.bQ().c(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dru.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(drs::aB_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, je $$1, arh $$2) {
      duo $$3;
      if ($$1.v() < $$0) {
         $$3 = dhl.b.o();
      } else {
         $$3 = dhl.a.o();
      }

      gk $$5 = new gk($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(je $$0, je $$1, arh $$2) {
      dtj $$3 = (dtj)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
