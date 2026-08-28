import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class tg {
   public static final int a = 10;
   public static final String b = "Minecraft.Server/src/test/convertables/data";
   public static Path c = Paths.get("Minecraft.Server/src/test/convertables/data");

   public static drm a(int $$0) {
      switch ($$0) {
         case 0:
            return drm.a;
         case 1:
            return drm.b;
         case 2:
            return drm.c;
         case 3:
            return drm.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(drm $$0) {
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

   public static dxg a(ald $$0, jj $$1, kn $$2, drm $$3, arn $$4) {
      eoy $$5 = b(dxg.a($$1), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dkw.pF.m());
      dxg $$6 = (dxg)$$4.c_($$1);
      alc<sp> $$7 = alc.a(me.bf, $$0);
      $$6.a(new dxg.a(Optional.of($$7), $$2, $$3, false, dxg.b.a, Optional.empty()));
      return $$6;
   }

   public static void a(eoy $$0, arn $$1) {
      int $$2 = $$0.i() - 1;
      eoy $$3 = new eoy($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      jj.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.n().a($$3);
      $$1.a($$3);
      fcp $$4 = fcp.a($$3);
      List<bvs> $$5 = $$1.a(bvs.class, $$4, $$0x -> !($$0x instanceof cqi));
      $$5.forEach(bvs::at);
   }

   public static jj a(jj $$0, kn $$1, drm $$2) {
      jj $$3 = $$0.a($$1).b(-1, -1, -1);
      return eti.a($$3, dpv.a, $$2, $$0);
   }

   public static eoy b(jj $$0, kn $$1, drm $$2) {
      jj $$3 = a($$0, $$1, $$2);
      eoy $$4 = eoy.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<jj> a(jj $$0, int $$1, arn $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<jj> b(jj $$0, int $$1, arn $$2) {
      Comparator<jj> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<jj> c(jj $$0, int $$1, arn $$2) {
      eoy $$3 = d($$0, $$1, $$2);
      return jj.a($$3).filter($$1x -> $$2.a_($$1x).a(dkw.pF)).map(jj::j);
   }

   private static eoy d(jj $$0, int $$1, arn $$2) {
      jj $$3 = jj.a((double)$$0.u(), (double)$$2.a(eel.a.b, $$0).v(), (double)$$0.w());
      return new eoy($$3).c($$1, 10, $$1);
   }

   public static Stream<jj> a(jj $$0, bvs $$1, arn $$2) {
      int $$3 = 200;
      fcu $$4 = $$1.bE();
      fcu $$5 = $$4.e($$1.bT().c(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dvn.U))
         .flatMap(Optional::stream)
         .filter($$2x -> $$2x.f().b($$4, $$5).isPresent())
         .map(dvl::aw_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, jj $$1, arn $$2) {
      dym $$3;
      if ($$1.v() < $$0) {
         $$3 = dkw.b.m();
      } else {
         $$3 = dkw.a.m();
      }

      gp $$5 = new gp($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 306);
      $$2.a($$1, $$3.b());
   }

   private static boolean a(jj $$0, jj $$1, arn $$2) {
      return $$2.c_($$0) instanceof dxg $$3 ? $$3.d().b($$1) : false;
   }
}
