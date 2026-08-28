import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ud {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 10;
   public static final String b = "gameteststructures";
   public static String c = "gameteststructures";

   public static dll a(int $$0) {
      switch ($$0) {
         case 0:
            return dll.a;
         case 1:
            return dll.b;
         case 2:
            return dll.c;
         case 3:
            return dll.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dll $$0) {
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

   public static evl a(dqv $$0) {
      return evl.a(b($$0));
   }

   public static eib b(dqv $$0) {
      iz $$1 = c($$0);
      iz $$2 = a($$1, $$0.j(), $$0.l());
      return eib.a($$1, $$2);
   }

   public static iz c(dqv $$0) {
      return $$0.ay_().a((kd)$$0.f());
   }

   public static void a(iz $$0, iz $$1, dll $$2, are $$3) {
      iz $$4 = emj.a($$0.a((kd)$$1), djv.a, $$2, $$0);
      $$3.b($$4, dfa.fN.o());
      dpq $$5 = (dpq)$$3.c_($$4);
      $$5.b().a("test runclosest");
      iz $$6 = emj.a($$4.b(0, 0, -1), djv.a, $$2, $$4);
      $$3.b($$6, dfa.dM.o().a($$2));
   }

   public static void a(String $$0, iz $$1, kd $$2, dll $$3, are $$4) {
      eib $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dfa.pa.o());
      dqv $$6 = (dqv)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new ale($$0));
      $$6.a($$2);
      $$6.a(dtl.a);
      $$6.e(true);
   }

   public static dqv a(tn $$0, iz $$1, dll $$2, are $$3) {
      kd $$4 = $$3.q().b(new ale($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      eib $$5 = b($$1, $$4, $$2);
      iz $$6;
      if ($$2 == dll.a) {
         $$6 = $$1;
      } else if ($$2 == dll.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dll.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dll.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   public static void a(evl $$0, are $$1, boolean $$2) {
      iz $$3 = iz.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      iz $$4 = iz.a($$0.d, $$0.e, $$0.f);
      iz.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dfa.hW.o());
         }
      });
   }

   public static void a(evl $$0, are $$1) {
      iz $$2 = iz.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      iz $$3 = iz.a($$0.d, $$0.e, $$0.f);
      iz.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dfa.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dfa.a.o());
         }
      });
   }

   private static void b(eib $$0, are $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(eib $$0, are $$1) {
      int $$2 = $$0.i() - 1;
      eib $$3 = new eib($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      iz.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      evl $$4 = new evl((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<bst> $$5 = $$1.a(bst.class, $$4, $$0x -> !($$0x instanceof cmw));
      $$5.forEach(bst::ao);
   }

   public static iz a(iz $$0, kd $$1, dll $$2) {
      iz $$3 = $$0.a($$1).b(-1, -1, -1);
      return emj.a($$3, djv.a, $$2, $$0);
   }

   public static eib b(iz $$0, kd $$1, dll $$2) {
      iz $$3 = a($$0, $$1, $$2);
      eib $$4 = eib.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<iz> a(iz $$0, int $$1, are $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<iz> b(iz $$0, int $$1, are $$2) {
      Comparator<iz> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<iz> a(iz $$0, int $$1, are $$2, String $$3) {
      return c($$0, $$1, $$2).map($$1x -> (dqv)$$2.c_($$1x)).filter(Objects::nonNull).filter($$1x -> Objects.equals($$1x.c(), $$3)).map(dpg::ay_).map(iz::i);
   }

   public static Stream<iz> c(iz $$0, int $$1, are $$2) {
      eib $$3 = d($$0, $$1, $$2);
      return iz.a($$3).filter($$1x -> $$2.a_($$1x).a(dfa.pa)).map(iz::i);
   }

   private static dqv b(tn $$0, iz $$1, dll $$2, are $$3) {
      $$3.b($$1, dfa.pa.o());
      dqv $$4 = (dqv)$$3.c_($$1);
      $$4.a(dtl.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new ale($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   private static eib d(iz $$0, int $$1, are $$2) {
      iz $$3 = iz.a((double)$$0.u(), (double)$$2.a(dxt.a.b, $$0).v(), (double)$$0.w());
      return new eib($$3).c($$1, 10, $$1);
   }

   public static Stream<iz> a(iz $$0, bst $$1, are $$2) {
      int $$3 = 200;
      evq $$4 = $$1.bx();
      evq $$5 = $$4.e($$1.bL().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dpi.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dpg::ay_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, iz $$1, are $$2) {
      dsb $$3;
      if ($$1.v() < $$0) {
         $$3 = dfa.b.o();
      } else {
         $$3 = dfa.a.o();
      }

      gg $$5 = new gg($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(iz $$0, iz $$1, are $$2) {
      dqv $$3 = (dqv)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
