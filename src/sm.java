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

   public static dgm a(int $$0) {
      switch ($$0) {
         case 0:
            return dgm.a;
         case 1:
            return dgm.b;
         case 2:
            return dgm.c;
         case 3:
            return dgm.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dgm $$0) {
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

   public static epm a(dlu $$0) {
      return epm.a(b($$0));
   }

   public static ecu b(dlu $$0) {
      ib $$1 = c($$0);
      ib $$2 = a($$1, $$0.j(), $$0.l());
      return ecu.a($$1, $$2);
   }

   public static ib c(dlu $$0) {
      return $$0.aC_().a((jg)$$0.f());
   }

   public static void a(ib $$0, ib $$1, dgm $$2, apf $$3) {
      ib $$4 = ehc.a($$0.a((jg)$$1), dew.a, $$2, $$0);
      $$3.b($$4, dac.fN.o());
      dkq $$5 = (dkq)$$3.c_($$4);
      $$5.b().a("test runclosest");
      ib $$6 = ehc.a($$4.b(0, 0, -1), dew.a, $$2, $$4);
      $$3.b($$6, dac.dM.o().a($$2));
   }

   public static void a(String $$0, ib $$1, jg $$2, dgm $$3, apf $$4) {
      ecu $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dac.pa.o());
      dlu $$6 = (dlu)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new ajh($$0));
      $$6.a($$2);
      $$6.a(doj.a);
      $$6.e(true);
   }

   public static dlu a(rw $$0, ib $$1, dgm $$2, apf $$3) {
      jg $$4 = $$3.q().b(new ajh($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      ecu $$5 = b($$1, $$4, $$2);
      ib $$6;
      if ($$2 == dgm.a) {
         $$6 = $$1;
      } else if ($$2 == dgm.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dgm.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dgm.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   private static void b(ecu $$0, apf $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(ecu $$0, apf $$1) {
      int $$2 = $$0.i() - 1;
      ecu $$3 = new ecu($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      ib.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      epm $$4 = new epm((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<bow> $$5 = $$1.a(bow.class, $$4, $$0x -> !($$0x instanceof cis));
      $$5.forEach(bow::am);
   }

   public static ib a(ib $$0, jg $$1, dgm $$2) {
      ib $$3 = $$0.a($$1).b(-1, -1, -1);
      return ehc.a($$3, dew.a, $$2, $$0);
   }

   public static ecu b(ib $$0, jg $$1, dgm $$2) {
      ib $$3 = a($$0, $$1, $$2);
      ecu $$4 = ecu.a($$0, $$3);
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
      ecu $$3 = new ecu($$0).a($$1);
      return ib.a($$3).filter($$1x -> $$2.a_($$1x).a(dac.pa)).map(ib::i);
   }

   private static dlu b(rw $$0, ib $$1, dgm $$2, apf $$3) {
      $$3.b($$1, dac.pa.o());
      dlu $$4 = (dlu)$$3.c_($$1);
      $$4.a(doj.b);
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

   public static Stream<ib> a(int $$0, epr $$1, apf $$2) {
      ib $$3 = ib.a($$1.c, (double)$$2.a(dsm.a.b, ib.a($$1)).v(), $$1.e);
      ib $$4 = $$3.b(-$$0, 0, -$$0);
      ib $$5 = $$3.b($$0, 0, $$0);
      return ib.b($$4, $$5).filter($$1x -> $$2.a_($$1x).a(dac.pa));
   }

   public static Stream<ib> a(ib $$0, bow $$1, apf $$2) {
      int $$3 = 200;
      epr $$4 = $$1.bu();
      epr $$5 = $$4.e($$1.bI().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dki.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dkg::aC_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, ib $$1, apf $$2) {
      dmz $$3;
      if ($$1.v() < $$0) {
         $$3 = dac.b.o();
      } else {
         $$3 = dac.a.o();
      }

      fj $$5 = new fj($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(ib $$0, ib $$1, apf $$2) {
      dlu $$3 = (dlu)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
