import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class tp {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";

   public static dkn a(int $$0) {
      switch ($$0) {
         case 0:
            return dkn.a;
         case 1:
            return dkn.b;
         case 2:
            return dkn.c;
         case 3:
            return dkn.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dkn $$0) {
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

   public static euh a(dpx $$0) {
      return euh.a(b($$0));
   }

   public static ehd b(dpx $$0) {
      io $$1 = c($$0);
      io $$2 = a($$1, $$0.j(), $$0.l());
      return ehd.a($$1, $$2);
   }

   public static io c(dpx $$0) {
      return $$0.aA_().a((js)$$0.f());
   }

   public static void a(io $$0, io $$1, dkn $$2, aqn $$3) {
      io $$4 = ell.a($$0.a((js)$$1), dix.a, $$2, $$0);
      $$3.b($$4, dec.fN.n());
      dos $$5 = (dos)$$3.c_($$4);
      $$5.b().a("test runclosest");
      io $$6 = ell.a($$4.b(0, 0, -1), dix.a, $$2, $$4);
      $$3.b($$6, dec.dM.n().a($$2));
   }

   public static void a(String $$0, io $$1, js $$2, dkn $$3, aqn $$4) {
      ehd $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dec.pa.n());
      dpx $$6 = (dpx)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new akn($$0));
      $$6.a($$2);
      $$6.a(dsn.a);
      $$6.e(true);
   }

   public static dpx a(sz $$0, io $$1, dkn $$2, aqn $$3) {
      js $$4 = $$3.q().b(new akn($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      ehd $$5 = b($$1, $$4, $$2);
      io $$6;
      if ($$2 == dkn.a) {
         $$6 = $$1;
      } else if ($$2 == dkn.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dkn.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dkn.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   public static void a(euh $$0, aqn $$1, boolean $$2) {
      io $$3 = io.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      io $$4 = io.a($$0.d, $$0.e, $$0.f);
      io.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dec.hW.n());
         }
      });
   }

   public static void a(euh $$0, aqn $$1) {
      io $$2 = io.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      io $$3 = io.a($$0.d, $$0.e, $$0.f);
      io.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dec.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dec.a.n());
         }
      });
   }

   private static void b(ehd $$0, aqn $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(ehd $$0, aqn $$1) {
      int $$2 = $$0.i() - 1;
      ehd $$3 = new ehd($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      io.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      euh $$4 = new euh((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<brw> $$5 = $$1.a(brw.class, $$4, $$0x -> !($$0x instanceof cly));
      $$5.forEach(brw::ao);
   }

   public static io a(io $$0, js $$1, dkn $$2) {
      io $$3 = $$0.a($$1).b(-1, -1, -1);
      return ell.a($$3, dix.a, $$2, $$0);
   }

   public static ehd b(io $$0, js $$1, dkn $$2) {
      io $$3 = a($$0, $$1, $$2);
      ehd $$4 = ehd.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<io> a(io $$0, int $$1, aqn $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<io> b(io $$0, int $$1, aqn $$2) {
      Comparator<io> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<io> c(io $$0, int $$1, aqn $$2) {
      ehd $$3 = new ehd($$0).a($$1);
      return io.a($$3).filter($$1x -> $$2.a_($$1x).a(dec.pa)).map(io::i);
   }

   private static dpx b(sz $$0, io $$1, dkn $$2, aqn $$3) {
      $$3.b($$1, dec.pa.n());
      dpx $$4 = (dpx)$$3.c_($$1);
      $$4.a(dsn.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new akn($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   public static Stream<io> a(int $$0, eum $$1, aqn $$2) {
      io $$3 = io.a($$1.c, (double)$$2.a(dwv.a.b, io.a($$1)).v(), $$1.e);
      io $$4 = $$3.b(-$$0, 0, -$$0);
      io $$5 = $$3.b($$0, 0, $$0);
      return io.d($$4, $$5).filter($$1x -> $$2.a_($$1x).a(dec.pa));
   }

   public static Stream<io> a(io $$0, brw $$1, aqn $$2) {
      int $$3 = 200;
      eum $$4 = $$1.bx();
      eum $$5 = $$4.e($$1.bL().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dok.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(doi::aA_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, io $$1, aqn $$2) {
      drd $$3;
      if ($$1.v() < $$0) {
         $$3 = dec.b.n();
      } else {
         $$3 = dec.a.n();
      }

      fv $$5 = new fv($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(io $$0, io $$1, aqn $$2) {
      dpx $$3 = (dpx)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
