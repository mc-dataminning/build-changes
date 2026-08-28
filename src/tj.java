import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class tj {
   public static final int a = 10;
   public static final String b = "Minecraft.Server/src/test/convertables/data";
   public static Path c = Paths.get("Minecraft.Server/src/test/convertables/data");

   public static dui a(int $$0) {
      switch ($$0) {
         case 0:
            return dui.a;
         case 1:
            return dui.b;
         case 2:
            return dui.c;
         case 3:
            return dui.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dui $$0) {
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

   public static eaj a(alr $$0, iw $$1, kb $$2, dui $$3, asb $$4) {
      esf $$5 = b(eaj.a($$1), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dnq.pJ.m());
      eaj $$6 = (eaj)$$4.c_($$1);
      alq<ss> $$7 = alq.a(mi.bh, $$0);
      $$6.a(new eaj.a(Optional.of($$7), $$2, $$3, false, eaj.b.a, Optional.empty()));
      return $$6;
   }

   public static void a(esf $$0, asb $$1) {
      int $$2 = $$0.i() - 1;
      esf $$3 = new esf($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      iw.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.n().a($$3);
      $$1.a($$3);
      ffx $$4 = ffx.a($$3);
      List<bxe> $$5 = $$1.a(bxe.class, $$4, $$0x -> !($$0x instanceof csi));
      $$5.forEach(bxe::aq);
   }

   public static iw a(iw $$0, kb $$1, dui $$2) {
      iw $$3 = $$0.a($$1).b(-1, -1, -1);
      return ewp.a($$3, dsr.a, $$2, $$0);
   }

   public static esf b(iw $$0, kb $$1, dui $$2) {
      iw $$3 = a($$0, $$1, $$2);
      esf $$4 = esf.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<iw> a(iw $$0, int $$1, asb $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<iw> b(iw $$0, int $$1, asb $$2) {
      Comparator<iw> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<iw> c(iw $$0, int $$1, asb $$2) {
      esf $$3 = d($$0, $$1, $$2);
      return iw.a($$3).filter($$1x -> $$2.a_($$1x).a(dnq.pJ)).map(iw::j);
   }

   private static esf d(iw $$0, int $$1, asb $$2) {
      iw $$3 = iw.a((double)$$0.u(), (double)$$2.a(ehp.a.b, $$0).v(), (double)$$0.w());
      return new esf($$3).c($$1, 10, $$1);
   }

   public static Stream<iw> a(iw $$0, bxe $$1, asb $$2) {
      int $$3 = 200;
      fgc $$4 = $$1.bD();
      fgc $$5 = $$4.e($$1.bS().c(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dyq.U))
         .flatMap(Optional::stream)
         .filter($$2x -> $$2x.f().b($$4, $$5).isPresent())
         .map(dyo::aC_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, iw $$1, asb $$2) {
      ebq $$3;
      if ($$1.v() < $$0) {
         $$3 = dnq.b.m();
      } else {
         $$3 = dnq.a.m();
      }

      gc $$5 = new gc($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 818);
      $$2.a($$1, $$3.b());
   }

   private static boolean a(iw $$0, iw $$1, asb $$2) {
      return $$2.c_($$0) instanceof eaj $$3 ? $$3.d().b($$1) : false;
   }
}
