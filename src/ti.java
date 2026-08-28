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

   public static dtw a(int $$0) {
      switch ($$0) {
         case 0:
            return dtw.a;
         case 1:
            return dtw.b;
         case 2:
            return dtw.c;
         case 3:
            return dtw.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dtw $$0) {
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

   public static dzx a(ali $$0, iv $$1, ka $$2, dtw $$3, ars $$4) {
      ert $$5 = b(dzx.a($$1), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dne.pJ.m());
      dzx $$6 = (dzx)$$4.c_($$1);
      alh<sr> $$7 = alh.a(mh.bh, $$0);
      $$6.a(new dzx.a(Optional.of($$7), $$2, $$3, false, dzx.b.a, Optional.empty()));
      return $$6;
   }

   public static void a(ert $$0, ars $$1) {
      int $$2 = $$0.i() - 1;
      ert $$3 = new ert($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      iv.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.n().a($$3);
      $$1.a($$3);
      ffl $$4 = ffl.a($$3);
      List<bwt> $$5 = $$1.a(bwt.class, $$4, $$0x -> !($$0x instanceof crx));
      $$5.forEach(bwt::aq);
   }

   public static iv a(iv $$0, ka $$1, dtw $$2) {
      iv $$3 = $$0.a($$1).b(-1, -1, -1);
      return ewd.a($$3, dsf.a, $$2, $$0);
   }

   public static ert b(iv $$0, ka $$1, dtw $$2) {
      iv $$3 = a($$0, $$1, $$2);
      ert $$4 = ert.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<iv> a(iv $$0, int $$1, ars $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<iv> b(iv $$0, int $$1, ars $$2) {
      Comparator<iv> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<iv> c(iv $$0, int $$1, ars $$2) {
      ert $$3 = d($$0, $$1, $$2);
      return iv.a($$3).filter($$1x -> $$2.a_($$1x).a(dne.pJ)).map(iv::j);
   }

   private static ert d(iv $$0, int $$1, ars $$2) {
      iv $$3 = iv.a((double)$$0.u(), (double)$$2.a(ehd.a.b, $$0).v(), (double)$$0.w());
      return new ert($$3).c($$1, 10, $$1);
   }

   public static Stream<iv> a(iv $$0, bwt $$1, ars $$2) {
      int $$3 = 200;
      ffq $$4 = $$1.bD();
      ffq $$5 = $$4.e($$1.bS().c(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dye.U))
         .flatMap(Optional::stream)
         .filter($$2x -> $$2x.f().b($$4, $$5).isPresent())
         .map(dyc::aB_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, iv $$1, ars $$2) {
      ebe $$3;
      if ($$1.v() < $$0) {
         $$3 = dne.b.m();
      } else {
         $$3 = dne.a.m();
      }

      gb $$5 = new gb($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 818);
      $$2.a($$1, $$3.b());
   }

   private static boolean a(iv $$0, iv $$1, ars $$2) {
      return $$2.c_($$0) instanceof dzx $$3 ? $$3.d().b($$1) : false;
   }
}
