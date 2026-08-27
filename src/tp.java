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

   public static dkl a(int $$0) {
      switch ($$0) {
         case 0:
            return dkl.a;
         case 1:
            return dkl.b;
         case 2:
            return dkl.c;
         case 3:
            return dkl.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dkl $$0) {
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

   public static euf a(dpv $$0) {
      return euf.a(b($$0));
   }

   public static ehb b(dpv $$0) {
      io $$1 = c($$0);
      io $$2 = a($$1, $$0.j(), $$0.l());
      return ehb.a($$1, $$2);
   }

   public static io c(dpv $$0) {
      return $$0.az_().a((js)$$0.f());
   }

   public static void a(io $$0, io $$1, dkl $$2, aqm $$3) {
      io $$4 = elj.a($$0.a((js)$$1), div.a, $$2, $$0);
      $$3.b($$4, dea.fN.n());
      doq $$5 = (doq)$$3.c_($$4);
      $$5.b().a("test runclosest");
      io $$6 = elj.a($$4.b(0, 0, -1), div.a, $$2, $$4);
      $$3.b($$6, dea.dM.n().a($$2));
   }

   public static void a(String $$0, io $$1, js $$2, dkl $$3, aqm $$4) {
      ehb $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dea.pa.n());
      dpv $$6 = (dpv)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new akm($$0));
      $$6.a($$2);
      $$6.a(dsl.a);
      $$6.e(true);
   }

   public static dpv a(sz $$0, io $$1, dkl $$2, aqm $$3) {
      js $$4 = $$3.q().b(new akm($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      ehb $$5 = b($$1, $$4, $$2);
      io $$6;
      if ($$2 == dkl.a) {
         $$6 = $$1;
      } else if ($$2 == dkl.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dkl.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dkl.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   public static void a(euf $$0, aqm $$1, boolean $$2) {
      io $$3 = io.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      io $$4 = io.a($$0.d, $$0.e, $$0.f);
      io.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dea.hW.n());
         }
      });
   }

   public static void a(euf $$0, aqm $$1) {
      io $$2 = io.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      io $$3 = io.a($$0.d, $$0.e, $$0.f);
      io.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dea.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dea.a.n());
         }
      });
   }

   private static void b(ehb $$0, aqm $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(ehb $$0, aqm $$1) {
      int $$2 = $$0.i() - 1;
      ehb $$3 = new ehb($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      io.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      euf $$4 = new euf((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<bru> $$5 = $$1.a(bru.class, $$4, $$0x -> !($$0x instanceof clw));
      $$5.forEach(bru::ao);
   }

   public static io a(io $$0, js $$1, dkl $$2) {
      io $$3 = $$0.a($$1).b(-1, -1, -1);
      return elj.a($$3, div.a, $$2, $$0);
   }

   public static ehb b(io $$0, js $$1, dkl $$2) {
      io $$3 = a($$0, $$1, $$2);
      ehb $$4 = ehb.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<io> a(io $$0, int $$1, aqm $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<io> b(io $$0, int $$1, aqm $$2) {
      Comparator<io> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<io> c(io $$0, int $$1, aqm $$2) {
      ehb $$3 = new ehb($$0).a($$1);
      return io.a($$3).filter($$1x -> $$2.a_($$1x).a(dea.pa)).map(io::i);
   }

   private static dpv b(sz $$0, io $$1, dkl $$2, aqm $$3) {
      $$3.b($$1, dea.pa.n());
      dpv $$4 = (dpv)$$3.c_($$1);
      $$4.a(dsl.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new akm($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   public static Stream<io> a(int $$0, euk $$1, aqm $$2) {
      io $$3 = io.a($$1.c, (double)$$2.a(dwt.a.b, io.a($$1)).v(), $$1.e);
      io $$4 = $$3.b(-$$0, 0, -$$0);
      io $$5 = $$3.b($$0, 0, $$0);
      return io.d($$4, $$5).filter($$1x -> $$2.a_($$1x).a(dea.pa));
   }

   public static Stream<io> a(io $$0, bru $$1, aqm $$2) {
      int $$3 = 200;
      euk $$4 = $$1.bx();
      euk $$5 = $$4.e($$1.bL().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, doi.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dog::az_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, io $$1, aqm $$2) {
      drb $$3;
      if ($$1.v() < $$0) {
         $$3 = dea.b.n();
      } else {
         $$3 = dea.a.n();
      }

      fv $$5 = new fv($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(io $$0, io $$1, aqm $$2) {
      dpv $$3 = (dpv)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
