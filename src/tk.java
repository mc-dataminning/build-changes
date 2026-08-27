import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class tk {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";

   public static dji a(int $$0) {
      switch ($$0) {
         case 0:
            return dji.a;
         case 1:
            return dji.b;
         case 2:
            return dji.c;
         case 3:
            return dji.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dji $$0) {
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

   public static eta a(dos $$0) {
      return eta.a(b($$0));
   }

   public static efy b(dos $$0) {
      im $$1 = c($$0);
      im $$2 = a($$1, $$0.j(), $$0.l());
      return efy.a($$1, $$2);
   }

   public static im c(dos $$0) {
      return $$0.az_().a((jq)$$0.f());
   }

   public static void a(im $$0, im $$1, dji $$2, aqe $$3) {
      im $$4 = ekg.a($$0.a((jq)$$1), dhs.a, $$2, $$0);
      $$3.b($$4, dcx.fN.n());
      dnn $$5 = (dnn)$$3.c_($$4);
      $$5.b().a("test runclosest");
      im $$6 = ekg.a($$4.b(0, 0, -1), dhs.a, $$2, $$4);
      $$3.b($$6, dcx.dM.n().a($$2));
   }

   public static void a(String $$0, im $$1, jq $$2, dji $$3, aqe $$4) {
      efy $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dcx.pa.n());
      dos $$6 = (dos)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new akf($$0));
      $$6.a($$2);
      $$6.a(dri.a);
      $$6.e(true);
   }

   public static dos a(su $$0, im $$1, dji $$2, aqe $$3) {
      jq $$4 = $$3.q().b(new akf($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      efy $$5 = b($$1, $$4, $$2);
      im $$6;
      if ($$2 == dji.a) {
         $$6 = $$1;
      } else if ($$2 == dji.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dji.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dji.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   public static void a(eta $$0, aqe $$1, boolean $$2) {
      im $$3 = im.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      im $$4 = im.a($$0.d, $$0.e, $$0.f);
      im.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dcx.hW.n());
         }
      });
   }

   public static void a(eta $$0, aqe $$1) {
      im $$2 = im.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      im $$3 = im.a($$0.d, $$0.e, $$0.f);
      im.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dcx.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dcx.a.n());
         }
      });
   }

   private static void b(efy $$0, aqe $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(efy $$0, aqe $$1) {
      int $$2 = $$0.i() - 1;
      efy $$3 = new efy($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      im.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      eta $$4 = new eta((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<bql> $$5 = $$1.a(bql.class, $$4, $$0x -> !($$0x instanceof ckl));
      $$5.forEach(bql::am);
   }

   public static im a(im $$0, jq $$1, dji $$2) {
      im $$3 = $$0.a($$1).b(-1, -1, -1);
      return ekg.a($$3, dhs.a, $$2, $$0);
   }

   public static efy b(im $$0, jq $$1, dji $$2) {
      im $$3 = a($$0, $$1, $$2);
      efy $$4 = efy.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<im> a(im $$0, int $$1, aqe $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<im> b(im $$0, int $$1, aqe $$2) {
      Comparator<im> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<im> c(im $$0, int $$1, aqe $$2) {
      efy $$3 = new efy($$0).a($$1);
      return im.a($$3).filter($$1x -> $$2.a_($$1x).a(dcx.pa)).map(im::i);
   }

   private static dos b(su $$0, im $$1, dji $$2, aqe $$3) {
      $$3.b($$1, dcx.pa.n());
      dos $$4 = (dos)$$3.c_($$1);
      $$4.a(dri.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new akf($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   public static Stream<im> a(int $$0, etf $$1, aqe $$2) {
      im $$3 = im.a($$1.c, (double)$$2.a(dvq.a.b, im.a($$1)).v(), $$1.e);
      im $$4 = $$3.b(-$$0, 0, -$$0);
      im $$5 = $$3.b($$0, 0, $$0);
      return im.d($$4, $$5).filter($$1x -> $$2.a_($$1x).a(dcx.pa));
   }

   public static Stream<im> a(im $$0, bql $$1, aqe $$2) {
      int $$3 = 200;
      etf $$4 = $$1.bv();
      etf $$5 = $$4.e($$1.bJ().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dnf.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dnd::az_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, im $$1, aqe $$2) {
      dpy $$3;
      if ($$1.v() < $$0) {
         $$3 = dcx.b.n();
      } else {
         $$3 = dcx.a.n();
      }

      fs $$5 = new fs($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(im $$0, im $$1, aqe $$2) {
      dos $$3 = (dos)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
