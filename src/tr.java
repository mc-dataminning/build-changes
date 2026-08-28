import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class tr {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 10;
   public static final String b = "gameteststructures";
   public static String c = "gameteststructures";

   public static doa a(int $$0) {
      switch ($$0) {
         case 0:
            return doa.a;
         case 1:
            return doa.b;
         case 2:
            return doa.c;
         case 3:
            return doa.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(doa $$0) {
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

   public static eyr a(dtm $$0) {
      return eyr.a(b($$0));
   }

   public static eky b(dtm $$0) {
      jf $$1 = c($$0);
      jf $$2 = a($$1, $$0.j(), $$0.t());
      return eky.a($$1, $$2);
   }

   public static jf c(dtm $$0) {
      return $$0.aC_().a((kj)$$0.f());
   }

   public static void a(jf $$0, jf $$1, doa $$2, arj $$3) {
      jf $$4 = epi.a($$0.a((kj)$$1), dmj.a, $$2, $$0);
      $$3.b($$4, dho.fN.n());
      dsf $$5 = (dsf)$$3.c_($$4);
      $$5.b().a("test runclosest");
      jf $$6 = epi.a($$4.b(0, 0, -1), dmj.a, $$2, $$4);
      $$3.b($$6, dho.dM.n().a($$2));
   }

   public static void a(String $$0, jf $$1, kj $$2, doa $$3, arj $$4) {
      eky $$5 = b($$1.d(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dho.pa.n());
      dtm $$6 = (dtm)$$4.c_($$1);
      $$6.a(false);
      $$6.a(ale.a($$0));
      $$6.b($$0);
      $$6.a($$2);
      $$6.a(dwc.a);
      $$6.e(true);
   }

   public static jf a(tb $$0, jf $$1, doa $$2, arj $$3) {
      kj $$4 = $$3.q().b(ale.a($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      jf $$5;
      if ($$2 == doa.a) {
         $$5 = $$1;
      } else if ($$2 == doa.b) {
         $$5 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == doa.c) {
         $$5 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != doa.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$5 = $$1.b(0, 0, $$4.u() - 1);
      }

      return $$5;
   }

   public static dtm b(tb $$0, jf $$1, doa $$2, arj $$3) {
      kj $$4 = $$3.q().b(ale.a($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      eky $$5 = b($$1, $$4, $$2);
      jf $$6 = a($$0, $$1, $$2, $$3);
      b($$5, $$3);
      a($$5, $$3);
      return c($$0, $$6.e(), $$2, $$3);
   }

   public static void a(eyr $$0, arj $$1, boolean $$2) {
      jf $$3 = jf.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      jf $$4 = jf.a($$0.d, $$0.e, $$0.f);
      jf.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dho.hW.n());
         }
      });
   }

   public static void a(eyr $$0, arj $$1) {
      jf $$2 = jf.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      jf $$3 = jf.a($$0.d, $$0.e, $$0.f);
      jf.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dho.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dho.a.n());
         }
      });
   }

   private static void b(eky $$0, arj $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(eky $$0, arj $$1) {
      int $$2 = $$0.i() - 1;
      eky $$3 = new eky($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      jf.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      eyr $$4 = eyr.a($$3);
      List<btr> $$5 = $$1.a(btr.class, $$4, $$0x -> !($$0x instanceof cnx));
      $$5.forEach(btr::as);
   }

   public static jf a(jf $$0, kj $$1, doa $$2) {
      jf $$3 = $$0.a($$1).b(-1, -1, -1);
      return epi.a($$3, dmj.a, $$2, $$0);
   }

   public static eky b(jf $$0, kj $$1, doa $$2) {
      jf $$3 = a($$0, $$1, $$2);
      eky $$4 = eky.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<jf> a(jf $$0, int $$1, arj $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<jf> b(jf $$0, int $$1, arj $$2) {
      Comparator<jf> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<jf> a(jf $$0, int $$1, arj $$2, String $$3) {
      return c($$0, $$1, $$2).map($$1x -> (dtm)$$2.c_($$1x)).filter(Objects::nonNull).filter($$1x -> Objects.equals($$1x.c(), $$3)).map(drv::aC_).map(jf::j);
   }

   public static Stream<jf> c(jf $$0, int $$1, arj $$2) {
      eky $$3 = d($$0, $$1, $$2);
      return jf.a($$3).filter($$1x -> $$2.a_($$1x).a(dho.pa)).map(jf::j);
   }

   private static dtm c(tb $$0, jf $$1, doa $$2, arj $$3) {
      $$3.b($$1, dho.pa.n());
      dtm $$4 = (dtm)$$3.c_($$1);
      $$4.a(dwc.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(ale.a($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   private static eky d(jf $$0, int $$1, arj $$2) {
      jf $$3 = jf.a((double)$$0.u(), (double)$$2.a(eao.a.b, $$0).v(), (double)$$0.w());
      return new eky($$3).c($$1, 10, $$1);
   }

   public static Stream<jf> a(jf $$0, btr $$1, arj $$2) {
      int $$3 = 200;
      eyw $$4 = $$1.bC();
      eyw $$5 = $$4.e($$1.bQ().c(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, drx.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(drv::aC_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, jf $$1, arj $$2) {
      dus $$3;
      if ($$1.v() < $$0) {
         $$3 = dho.b.n();
      } else {
         $$3 = dho.a.n();
      }

      gl $$5 = new gl($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(jf $$0, jf $$1, arj $$2) {
      dtm $$3 = (dtm)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
