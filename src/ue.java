import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ue {
   private static final Logger d = LogUtils.getLogger();
   public static final int a = 10;
   public static final String b = "gameteststructures";
   public static String c = "gameteststructures";

   public static dlo a(int $$0) {
      switch ($$0) {
         case 0:
            return dlo.a;
         case 1:
            return dlo.b;
         case 2:
            return dlo.c;
         case 3:
            return dlo.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dlo $$0) {
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

   public static evo a(dqy $$0) {
      return evo.a(b($$0));
   }

   public static eie b(dqy $$0) {
      iz $$1 = c($$0);
      iz $$2 = a($$1, $$0.j(), $$0.l());
      return eie.a($$1, $$2);
   }

   public static iz c(dqy $$0) {
      return $$0.ay_().a((kd)$$0.f());
   }

   public static void a(iz $$0, iz $$1, dlo $$2, arf $$3) {
      iz $$4 = emm.a($$0.a((kd)$$1), djy.a, $$2, $$0);
      $$3.b($$4, dfd.fN.o());
      dpt $$5 = (dpt)$$3.c_($$4);
      $$5.b().a("test runclosest");
      iz $$6 = emm.a($$4.b(0, 0, -1), djy.a, $$2, $$4);
      $$3.b($$6, dfd.dM.o().a($$2));
   }

   public static void a(String $$0, iz $$1, kd $$2, dlo $$3, arf $$4) {
      eie $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dfd.pa.o());
      dqy $$6 = (dqy)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new alf($$0));
      $$6.a($$2);
      $$6.a(dto.a);
      $$6.e(true);
   }

   public static dqy a(to $$0, iz $$1, dlo $$2, arf $$3) {
      kd $$4 = $$3.q().b(new alf($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      eie $$5 = b($$1, $$4, $$2);
      iz $$6;
      if ($$2 == dlo.a) {
         $$6 = $$1;
      } else if ($$2 == dlo.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dlo.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dlo.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   public static void a(evo $$0, arf $$1, boolean $$2) {
      iz $$3 = iz.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      iz $$4 = iz.a($$0.d, $$0.e, $$0.f);
      iz.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dfd.hW.o());
         }
      });
   }

   public static void a(evo $$0, arf $$1) {
      iz $$2 = iz.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      iz $$3 = iz.a($$0.d, $$0.e, $$0.f);
      iz.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dfd.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dfd.a.o());
         }
      });
   }

   private static void b(eie $$0, arf $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(eie $$0, arf $$1) {
      int $$2 = $$0.i() - 1;
      eie $$3 = new eie($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      iz.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      evo $$4 = new evo((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<bsw> $$5 = $$1.a(bsw.class, $$4, $$0x -> !($$0x instanceof cmz));
      $$5.forEach(bsw::ao);
   }

   public static iz a(iz $$0, kd $$1, dlo $$2) {
      iz $$3 = $$0.a($$1).b(-1, -1, -1);
      return emm.a($$3, djy.a, $$2, $$0);
   }

   public static eie b(iz $$0, kd $$1, dlo $$2) {
      iz $$3 = a($$0, $$1, $$2);
      eie $$4 = eie.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<iz> a(iz $$0, int $$1, arf $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<iz> b(iz $$0, int $$1, arf $$2) {
      Comparator<iz> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<iz> a(iz $$0, int $$1, arf $$2, String $$3) {
      return c($$0, $$1, $$2).map($$1x -> (dqy)$$2.c_($$1x)).filter(Objects::nonNull).filter($$1x -> Objects.equals($$1x.c(), $$3)).map(dpj::ay_).map(iz::i);
   }

   public static Stream<iz> c(iz $$0, int $$1, arf $$2) {
      eie $$3 = d($$0, $$1, $$2);
      return iz.a($$3).filter($$1x -> $$2.a_($$1x).a(dfd.pa)).map(iz::i);
   }

   private static dqy b(to $$0, iz $$1, dlo $$2, arf $$3) {
      $$3.b($$1, dfd.pa.o());
      dqy $$4 = (dqy)$$3.c_($$1);
      $$4.a(dto.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new alf($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   private static eie d(iz $$0, int $$1, arf $$2) {
      iz $$3 = iz.a((double)$$0.u(), (double)$$2.a(dxw.a.b, $$0).v(), (double)$$0.w());
      return new eie($$3).c($$1, 10, $$1);
   }

   public static Stream<iz> a(iz $$0, bsw $$1, arf $$2) {
      int $$3 = 200;
      evt $$4 = $$1.bx();
      evt $$5 = $$4.e($$1.bL().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dpl.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dpj::ay_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, iz $$1, arf $$2) {
      dse $$3;
      if ($$1.v() < $$0) {
         $$3 = dfd.b.o();
      } else {
         $$3 = dfd.a.o();
      }

      gg $$5 = new gg($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(iz $$0, iz $$1, arf $$2) {
      dqy $$3 = (dqy)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
