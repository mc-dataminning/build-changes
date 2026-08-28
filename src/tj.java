import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class tj {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 10;
   public static final String b = "gameteststructures";
   public static String c = "gameteststructures";

   public static dls a(int $$0) {
      switch ($$0) {
         case 0:
            return dls.a;
         case 1:
            return dls.b;
         case 2:
            return dls.c;
         case 3:
            return dls.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dls $$0) {
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

   public static evu a(drc $$0) {
      return evu.a(b($$0));
   }

   public static eii b(drc $$0) {
      ja $$1 = c($$0);
      ja $$2 = a($$1, $$0.j(), $$0.l());
      return eii.a($$1, $$2);
   }

   public static ja c(drc $$0) {
      return $$0.az_().a((ke)$$0.f());
   }

   public static void a(ja $$0, ja $$1, dls $$2, aqk $$3) {
      ja $$4 = emq.a($$0.a((ke)$$1), dkc.a, $$2, $$0);
      $$3.b($$4, dfh.fN.o());
      dpx $$5 = (dpx)$$3.c_($$4);
      $$5.b().a("test runclosest");
      ja $$6 = emq.a($$4.b(0, 0, -1), dkc.a, $$2, $$4);
      $$3.b($$6, dfh.dM.o().a($$2));
   }

   public static void a(String $$0, ja $$1, ke $$2, dls $$3, aqk $$4) {
      eii $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dfh.pa.o());
      drc $$6 = (drc)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new akk($$0));
      $$6.a($$2);
      $$6.a(dtr.a);
      $$6.e(true);
   }

   public static drc a(st $$0, ja $$1, dls $$2, aqk $$3) {
      ke $$4 = $$3.q().b(new akk($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      eii $$5 = b($$1, $$4, $$2);
      ja $$6;
      if ($$2 == dls.a) {
         $$6 = $$1;
      } else if ($$2 == dls.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dls.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dls.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   public static void a(evu $$0, aqk $$1, boolean $$2) {
      ja $$3 = ja.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      ja $$4 = ja.a($$0.d, $$0.e, $$0.f);
      ja.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dfh.hW.o());
         }
      });
   }

   public static void a(evu $$0, aqk $$1) {
      ja $$2 = ja.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      ja $$3 = ja.a($$0.d, $$0.e, $$0.f);
      ja.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dfh.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dfh.a.o());
         }
      });
   }

   private static void b(eii $$0, aqk $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(eii $$0, aqk $$1) {
      int $$2 = $$0.i() - 1;
      eii $$3 = new eii($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      ja.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      evu $$4 = new evu((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<bsd> $$5 = $$1.a(bsd.class, $$4, $$0x -> !($$0x instanceof cmh));
      $$5.forEach(bsd::ao);
   }

   public static ja a(ja $$0, ke $$1, dls $$2) {
      ja $$3 = $$0.a($$1).b(-1, -1, -1);
      return emq.a($$3, dkc.a, $$2, $$0);
   }

   public static eii b(ja $$0, ke $$1, dls $$2) {
      ja $$3 = a($$0, $$1, $$2);
      eii $$4 = eii.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<ja> a(ja $$0, int $$1, aqk $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<ja> b(ja $$0, int $$1, aqk $$2) {
      Comparator<ja> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<ja> a(ja $$0, int $$1, aqk $$2, String $$3) {
      return c($$0, $$1, $$2).map($$1x -> (drc)$$2.c_($$1x)).filter(Objects::nonNull).filter($$1x -> Objects.equals($$1x.c(), $$3)).map(dpn::az_).map(ja::i);
   }

   public static Stream<ja> c(ja $$0, int $$1, aqk $$2) {
      eii $$3 = d($$0, $$1, $$2);
      return ja.a($$3).filter($$1x -> $$2.a_($$1x).a(dfh.pa)).map(ja::i);
   }

   private static drc b(st $$0, ja $$1, dls $$2, aqk $$3) {
      $$3.b($$1, dfh.pa.o());
      drc $$4 = (drc)$$3.c_($$1);
      $$4.a(dtr.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new akk($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   private static eii d(ja $$0, int $$1, aqk $$2) {
      ja $$3 = ja.a((double)$$0.u(), (double)$$2.a(dxz.a.b, $$0).v(), (double)$$0.w());
      return new eii($$3).c($$1, 10, $$1);
   }

   public static Stream<ja> a(ja $$0, bsd $$1, aqk $$2) {
      int $$3 = 200;
      evz $$4 = $$1.bx();
      evz $$5 = $$4.e($$1.bL().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dpp.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dpn::az_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, ja $$1, aqk $$2) {
      dsh $$3;
      if ($$1.v() < $$0) {
         $$3 = dfh.b.o();
      } else {
         $$3 = dfh.a.o();
      }

      gh $$5 = new gh($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(ja $$0, ja $$1, aqk $$2) {
      drc $$3 = (drc)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
