import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class sm {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";

   public static dgo a(int $$0) {
      switch ($$0) {
         case 0:
            return dgo.a;
         case 1:
            return dgo.b;
         case 2:
            return dgo.c;
         case 3:
            return dgo.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dgo $$0) {
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

   public static epo a(dlw $$0) {
      return epo.a(b($$0));
   }

   public static ecw b(dlw $$0) {
      ib $$1 = c($$0);
      ib $$2 = a($$1, $$0.j(), $$0.l());
      return ecw.a($$1, $$2);
   }

   public static ib c(dlw $$0) {
      return $$0.aC_().a((jg)$$0.f());
   }

   public static void a(ib $$0, ib $$1, dgo $$2, apf $$3) {
      ib $$4 = ehe.a($$0.a((jg)$$1), dey.a, $$2, $$0);
      $$3.b($$4, dae.fN.o());
      dks $$5 = (dks)$$3.c_($$4);
      $$5.b().a("test runclosest");
      ib $$6 = ehe.a($$4.b(0, 0, -1), dey.a, $$2, $$4);
      $$3.b($$6, dae.dM.o().a($$2));
   }

   public static void a(String $$0, ib $$1, jg $$2, dgo $$3, apf $$4) {
      ecw $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dae.pa.o());
      dlw $$6 = (dlw)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new ajh($$0));
      $$6.a($$2);
      $$6.a(dol.a);
      $$6.e(true);
   }

   public static dlw a(rw $$0, ib $$1, dgo $$2, apf $$3) {
      jg $$4 = $$3.q().b(new ajh($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      ecw $$5 = b($$1, $$4, $$2);
      ib $$6;
      if ($$2 == dgo.a) {
         $$6 = $$1;
      } else if ($$2 == dgo.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dgo.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dgo.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   public static void a(epo $$0, apf $$1, boolean $$2) {
      ib $$3 = ib.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      ib $$4 = ib.a($$0.d, $$0.e, $$0.f);
      ib.b($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dae.hW.o());
         }
      });
   }

   public static void a(epo $$0, apf $$1) {
      ib $$2 = ib.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      ib $$3 = ib.a($$0.d, $$0.e, $$0.f);
      ib.b($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dae.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dae.a.o());
         }
      });
   }

   private static void b(ecw $$0, apf $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(ecw $$0, apf $$1) {
      int $$2 = $$0.i() - 1;
      ecw $$3 = new ecw($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      ib.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      epo $$4 = new epo((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<box> $$5 = $$1.a(box.class, $$4, $$0x -> !($$0x instanceof ciu));
      $$5.forEach(box::am);
   }

   public static ib a(ib $$0, jg $$1, dgo $$2) {
      ib $$3 = $$0.a($$1).b(-1, -1, -1);
      return ehe.a($$3, dey.a, $$2, $$0);
   }

   public static ecw b(ib $$0, jg $$1, dgo $$2) {
      ib $$3 = a($$0, $$1, $$2);
      ecw $$4 = ecw.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<ib> a(ib $$0, int $$1, apf $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<ib> b(ib $$0, int $$1, apf $$2) {
      Comparator<ib> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<ib> c(ib $$0, int $$1, apf $$2) {
      ecw $$3 = new ecw($$0).a($$1);
      return ib.a($$3).filter($$1x -> $$2.a_($$1x).a(dae.pa)).map(ib::i);
   }

   private static dlw b(rw $$0, ib $$1, dgo $$2, apf $$3) {
      $$3.b($$1, dae.pa.o());
      dlw $$4 = (dlw)$$3.c_($$1);
      $$4.a(dol.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new ajh($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   public static Stream<ib> a(int $$0, ept $$1, apf $$2) {
      ib $$3 = ib.a($$1.c, (double)$$2.a(dso.a.b, ib.a($$1)).v(), $$1.e);
      ib $$4 = $$3.b(-$$0, 0, -$$0);
      ib $$5 = $$3.b($$0, 0, $$0);
      return ib.b($$4, $$5).filter($$1x -> $$2.a_($$1x).a(dae.pa));
   }

   public static Stream<ib> a(ib $$0, box $$1, apf $$2) {
      int $$3 = 200;
      ept $$4 = $$1.bu();
      ept $$5 = $$4.e($$1.bI().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dkk.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dki::aC_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, ib $$1, apf $$2) {
      dnb $$3;
      if ($$1.v() < $$0) {
         $$3 = dae.b.o();
      } else {
         $$3 = dae.a.o();
      }

      fj $$5 = new fj($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(ib $$0, ib $$1, apf $$2) {
      dlw $$3 = (dlw)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
