import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ti {
   public static final int a = 10;
   public static final String b = "Minecraft.Server/src/test/convertables/data";
   public static Path c = Paths.get("Minecraft.Server/src/test/convertables/data");

   public static dtg a(int $$0) {
      switch ($$0) {
         case 0:
            return dtg.a;
         case 1:
            return dtg.b;
         case 2:
            return dtg.c;
         case 3:
            return dtg.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dtg $$0) {
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

   public static dzh a(alg $$0, iv $$1, ka $$2, dtg $$3, arq $$4) {
      era $$5 = b(dzh.a($$1), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dmo.pJ.m());
      dzh $$6 = (dzh)$$4.c_($$1);
      alf<sr> $$7 = alf.a(mh.bh, $$0);
      $$6.a(new dzh.a(Optional.of($$7), $$2, $$3, false, dzh.b.a, Optional.empty()));
      return $$6;
   }

   public static void a(era $$0, arq $$1) {
      int $$2 = $$0.i() - 1;
      era $$3 = new era($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      iv.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.n().a($$3);
      $$1.a($$3);
      fes $$4 = fes.a($$3);
      List<bwi> $$5 = $$1.a(bwi.class, $$4, $$0x -> !($$0x instanceof crj));
      $$5.forEach(bwi::aq);
   }

   public static iv a(iv $$0, ka $$1, dtg $$2) {
      iv $$3 = $$0.a($$1).b(-1, -1, -1);
      return evk.a($$3, drp.a, $$2, $$0);
   }

   public static era b(iv $$0, ka $$1, dtg $$2) {
      iv $$3 = a($$0, $$1, $$2);
      era $$4 = era.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<iv> a(iv $$0, int $$1, arq $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<iv> b(iv $$0, int $$1, arq $$2) {
      Comparator<iv> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<iv> c(iv $$0, int $$1, arq $$2) {
      era $$3 = d($$0, $$1, $$2);
      return iv.a($$3).filter($$1x -> $$2.a_($$1x).a(dmo.pJ)).map(iv::j);
   }

   private static era d(iv $$0, int $$1, arq $$2) {
      iv $$3 = iv.a((double)$$0.u(), (double)$$2.a(egn.a.b, $$0).v(), (double)$$0.w());
      return new era($$3).c($$1, 10, $$1);
   }

   public static Stream<iv> a(iv $$0, bwi $$1, arq $$2) {
      int $$3 = 200;
      fex $$4 = $$1.bC();
      fex $$5 = $$4.e($$1.bR().c(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dxo.U))
         .flatMap(Optional::stream)
         .filter($$2x -> $$2x.f().b($$4, $$5).isPresent())
         .map(dxm::ax_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, iv $$1, arq $$2) {
      eao $$3;
      if ($$1.v() < $$0) {
         $$3 = dmo.b.m();
      } else {
         $$3 = dmo.a.m();
      }

      gb $$5 = new gb($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 818);
      $$2.a($$1, $$3.b());
   }

   private static boolean a(iv $$0, iv $$1, arq $$2) {
      return $$2.c_($$0) instanceof dzh $$3 ? $$3.d().b($$1) : false;
   }
}
