import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class tw {
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "gameteststructures";
   public static String b = "gameteststructures";

   public static dmd a(int $$0) {
      switch ($$0) {
         case 0:
            return dmd.a;
         case 1:
            return dmd.b;
         case 2:
            return dmd.c;
         case 3:
            return dmd.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dmd $$0) {
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

   public static ewp a(drw $$0) {
      return ewp.a(b($$0));
   }

   public static ejl b(drw $$0) {
      ir $$1 = c($$0);
      ir $$2 = a($$1, $$0.j(), $$0.l());
      return ejl.a($$1, $$2);
   }

   public static ir c(drw $$0) {
      return $$0.az_().a((jv)$$0.f());
   }

   public static void a(ir $$0, ir $$1, dmd $$2, aqt $$3) {
      ir $$4 = ent.a($$0.a((jv)$$1), dke.a, $$2, $$0);
      $$3.b($$4, dfe.gG.n());
      dqm $$5 = (dqm)$$3.c_($$4);
      $$5.b().a("test runclosest");
      ir $$6 = ent.a($$4.b(0, 0, -1), dke.a, $$2, $$4);
      $$3.b($$6, dfe.eA.n().a($$2));
   }

   public static void a(String $$0, ir $$1, jv $$2, dmd $$3, aqt $$4) {
      ejl $$5 = b($$1.c(), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dfe.ql.n());
      drw $$6 = (drw)$$4.c_($$1);
      $$6.a(false);
      $$6.a(new akt($$0));
      $$6.a($$2);
      $$6.a(dum.a);
      $$6.e(true);
   }

   public static drw a(tg $$0, ir $$1, dmd $$2, aqt $$3) {
      jv $$4 = $$3.q().b(new akt($$0.s())).orElseThrow(() -> new IllegalStateException("Missing test structure: " + $$0.s())).a();
      ejl $$5 = b($$1, $$4, $$2);
      ir $$6;
      if ($$2 == dmd.a) {
         $$6 = $$1;
      } else if ($$2 == dmd.b) {
         $$6 = $$1.b($$4.w() - 1, 0, 0);
      } else if ($$2 == dmd.c) {
         $$6 = $$1.b($$4.u() - 1, 0, $$4.w() - 1);
      } else {
         if ($$2 != dmd.d) {
            throw new IllegalArgumentException("Invalid rotation: " + $$2);
         }

         $$6 = $$1.b(0, 0, $$4.u() - 1);
      }

      b($$5, $$3);
      a($$5, $$3);
      return b($$0, $$6.d(), $$2, $$3);
   }

   public static void a(ewp $$0, aqt $$1, boolean $$2) {
      ir $$3 = ir.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      ir $$4 = ir.a($$0.d, $$0.e, $$0.f);
      ir.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$1.b($$4x, dfe.iQ.n());
         }
      });
   }

   public static void a(ewp $$0, aqt $$1) {
      ir $$2 = ir.a($$0.a, $$0.b, $$0.c).b(-1, 1, -1);
      ir $$3 = ir.a($$0.d, $$0.e, $$0.f);
      ir.d($$2, $$3).forEach($$3x -> {
         boolean $$4 = $$3x.u() == $$2.u() || $$3x.u() == $$3.u() || $$3x.w() == $$2.w() || $$3x.w() == $$3.w();
         boolean $$5 = $$3x.v() == $$3.v();
         if ($$1.a_($$3x).a(dfe.iQ) && ($$4 || $$5)) {
            $$1.b($$3x, dfe.a.n());
         }
      });
   }

   private static void b(ejl $$0, aqt $$1) {
      $$0.b().forEach($$1x -> $$1.a($$1x.e, $$1x.f, true));
   }

   public static void a(ejl $$0, aqt $$1) {
      int $$2 = $$0.i() - 1;
      ejl $$3 = new ejl($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      ir.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.m().a($$3);
      $$1.a($$3);
      ewp $$4 = new ewp((double)$$3.h(), (double)$$3.i(), (double)$$3.j(), (double)$$3.k(), (double)$$3.l(), (double)$$3.m());
      List<brv> $$5 = $$1.a(brv.class, $$4, $$0x -> !($$0x instanceof cly));
      $$5.forEach(brv::ao);
   }

   public static ir a(ir $$0, jv $$1, dmd $$2) {
      ir $$3 = $$0.a($$1).b(-1, -1, -1);
      return ent.a($$3, dke.a, $$2, $$0);
   }

   public static ejl b(ir $$0, jv $$1, dmd $$2) {
      ir $$3 = a($$0, $$1, $$2);
      ejl $$4 = ejl.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<ir> a(ir $$0, int $$1, aqt $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<ir> b(ir $$0, int $$1, aqt $$2) {
      Comparator<ir> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<ir> c(ir $$0, int $$1, aqt $$2) {
      ejl $$3 = new ejl($$0).a($$1);
      return ir.a($$3).filter($$1x -> $$2.a_($$1x).a(dfe.ql)).map(ir::i);
   }

   private static drw b(tg $$0, ir $$1, dmd $$2, aqt $$3) {
      $$3.b($$1, dfe.ql.n());
      drw $$4 = (drw)$$3.c_($$1);
      $$4.a(dum.b);
      $$4.a($$2);
      $$4.a(false);
      $$4.a(new akt($$0.s()));
      $$4.b($$0.b());
      if (!$$4.b($$3)) {
         throw new RuntimeException("Failed to load structure info for test: " + $$0.b() + ". Structure name: " + $$0.s());
      } else {
         return $$4;
      }
   }

   public static Stream<ir> a(int $$0, ewu $$1, aqt $$2) {
      ir $$3 = ir.a($$1.c, (double)$$2.a(dyu.a.b, ir.a($$1)).v(), $$1.e);
      ir $$4 = $$3.b(-$$0, 0, -$$0);
      ir $$5 = $$3.b($$0, 0, $$0);
      return ir.d($$4, $$5).filter($$1x -> $$2.a_($$1x).a(dfe.ql));
   }

   public static Stream<ir> a(ir $$0, brv $$1, aqt $$2) {
      int $$3 = 200;
      ewu $$4 = $$1.bC();
      ewu $$5 = $$4.e($$1.bQ().a(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dqe.v))
         .flatMap(Optional::stream)
         .filter($$2x -> a($$2x).b($$4, $$5).isPresent())
         .map(dqc::az_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, ir $$1, aqt $$2) {
      dtc $$3;
      if ($$1.v() < $$0) {
         $$3 = dfe.b.n();
      } else {
         $$3 = dfe.a.n();
      }

      fy $$5 = new fy($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 2);
      $$2.b($$1, $$3.b());
   }

   private static boolean a(ir $$0, ir $$1, aqt $$2) {
      drw $$3 = (drw)$$2.c_($$0);
      return b($$3).b($$1);
   }
}
