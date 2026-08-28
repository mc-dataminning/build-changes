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

   public static dlv a(int $$0) {
      switch ($$0) {
         case 0:
            return dlv.a;
         case 1:
            return dlv.b;
         case 2:
            return dlv.c;
         case 3:
            return dlv.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dlv $$0) {
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

   public static ewc a(drg $$0) {
      return ewc.a(b($$0));
   }

   public static eip b(drg $$0) {
      ja $$1 = c($$0);
      ja $$2 = a($$1, $$0.j(), $$0.l());
      return eip.a($$1, $$2);
   }

   public static ja c(drg $$0) {
      return $$0.az_().a((ke)$$0.f());
   }

   public static void a(ja $$0, ja $$1, dlv $$2, aqm $$3) {
      ja $$4 = emy.a($$0.a((ke)$$1), dkf.a, $$2, $$0);
      $$3.b($$4, dfk.fN.o());
      dqa $$5 = (dqa)$$3.c_($$4);
      $$5.b().a("test runclosest");
      ja $$6 = emy.a($$4.b(0, 0, -1), dkf.a, $$2, $$4);
      $$3.b($$6, dfk.dM.o().a($$2));
   }

   public static void a(String $$0, ja $$1, ke $$2, dlv $$3, aqm $$4) {
      eip $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dfk.pa.o());
      drg $$6 = (drg)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new akk($$0));
      $$6.a($$2);
      $$6.a(dtv.a);
      $$6.e(true);
   }

   public static drg a(st $$0, ja $$1, dlv $$2, aqm $$3) {
      ke $$4 = $$3.q().b(new akk($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      eip $$5 = b($$1, $$4, $$2);
      ja $$6;
      if ($$2 == dlv.a) {
         $$6 = $$1;
      } else if ($$2 == dlv.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dlv.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dlv.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   public static void a(ewc $$0, aqm $$1, boolean $$2) {
      ja $$3 = ja.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      ja $$4 = ja.a($$0.d, $$0.e, $$0.f);
      ja.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dfk.hW.o());
         }
      });
   }

   public static void a(ewc $$0, aqm $$1) {
      ja $$2 = ja.a($$0.a, $$0.b, $$0.c).b(-1, 0, -1);
      ja $$3 = ja.a($$0.d, $$0.e, $$0.f);
      ja.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dfk.hW) && ($$4 || $$5)) {
            $$1.b($$3x, dfk.a.o());
         }
      });
   }

   private static void b(eip $$0, aqm $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(eip $$0, aqm $$1) {
      int $$2 = $$0.i() - 1;
      eip $$3 = new eip($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      ja.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      ewc $$4 = new ewc((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<bsh> $$5 = $$1.a(bsh.class, $$4, $$0x -> !($$0x instanceof cml));
      $$5.forEach(bsh::aq);
   }

   public static ja a(ja $$0, ke $$1, dlv $$2) {
      ja $$3 = $$0.a($$1).b(-1, -1, -1);
      return emy.a($$3, dkf.a, $$2, $$0);
   }

   public static eip b(ja $$0, ke $$1, dlv $$2) {
      ja $$3 = a($$0, $$1, $$2);
      eip $$4 = eip.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<ja> a(ja $$0, int $$1, aqm $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<ja> b(ja $$0, int $$1, aqm $$2) {
      Comparator<ja> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<ja> a(ja $$0, int $$1, aqm $$2, String $$3) {
      return c($$0, $$1, $$2).map($$1x -> (drg)$$2.c_($$1x)).filter(Objects::nonNull).filter($$1x -> Objects.equals($$1x.c(), $$3)).map(dpq::az_).map(ja::i);
   }

   public static Stream<ja> c(ja $$0, int $$1, aqm $$2) {
      eip $$3 = d($$0, $$1, $$2);
      return ja.a($$3).filter($$1x -> $$2.a_($$1x).a(dfk.pa)).map(ja::i);
   }

   private static drg b(st $$0, ja $$1, dlv $$2, aqm $$3) {
      $$3.b($$1, dfk.pa.o());
      drg $$4 = (drg)$$3.c_($$1);
      $$4.a(dtv.b);
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

   private static eip d(ja $$0, int $$1, aqm $$2) {
      ja $$3 = ja.a((double)$$0.u(), (double)$$2.a(dyg.a.b, $$0).v(), (double)$$0.w());
      return new eip($$3).c($$1, 10, $$1);
   }

   public static Stream<ja> a(ja $$0, bsh $$1, aqm $$2) {
      int $$3 = 200;
      ewh $$4 = $$1.bz();
      ewh $$5 = $$4.e($$1.bN().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dps.u))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dpq::az_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, ja $$1, aqm $$2) {
      dsl $$3;
      if ($$1.v() < $$0) {
         $$3 = dfk.b.o();
      } else {
         $$3 = dfk.a.o();
      }

      gh $$5 = new gh($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(ja $$0, ja $$1, aqm $$2) {
      drg $$3 = (drg)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
