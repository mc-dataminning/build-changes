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

   public static dst a(int $$0) {
      switch ($$0) {
         case 0:
            return dst.a;
         case 1:
            return dst.b;
         case 2:
            return dst.c;
         case 3:
            return dst.d;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
      }
   }

   public static int a(dst $$0) {
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

   public static dys a(alg $$0, iu $$1, jz $$2, dst $$3, arq $$4) {
      eql $$5 = b(dys.a($$1), $$2, $$3);
      a($$5, $$4);
      $$4.b($$1, dmc.pG.m());
      dys $$6 = (dys)$$4.c_($$1);
      alf<sr> $$7 = alf.a(mg.bg, $$0);
      $$6.a(new dys.a(Optional.of($$7), $$2, $$3, false, dys.b.a, Optional.empty()));
      return $$6;
   }

   public static void a(eql $$0, arq $$1) {
      int $$2 = $$0.i() - 1;
      eql $$3 = new eql($$0.h() - 2, $$0.i() - 3, $$0.j() - 3, $$0.k() + 3, $$0.l() + 20, $$0.m() + 3);
      iu.a($$3).forEach($$2x -> a($$2, $$2x, $$1));
      $$1.n().a($$3);
      $$1.a($$3);
      fed $$4 = fed.a($$3);
      List<bwd> $$5 = $$1.a(bwd.class, $$4, $$0x -> !($$0x instanceof cqy));
      $$5.forEach(bwd::at);
   }

   public static iu a(iu $$0, jz $$1, dst $$2) {
      iu $$3 = $$0.a($$1).b(-1, -1, -1);
      return euv.a($$3, drc.a, $$2, $$0);
   }

   public static eql b(iu $$0, jz $$1, dst $$2) {
      iu $$3 = a($$0, $$1, $$2);
      eql $$4 = eql.a($$0, $$3);
      int $$5 = Math.min($$4.h(), $$4.k());
      int $$6 = Math.min($$4.j(), $$4.m());
      return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
   }

   public static Optional<iu> a(iu $$0, int $$1, arq $$2) {
      return c($$0, $$1, $$2).filter($$2x -> a($$2x, $$0, $$2)).findFirst();
   }

   public static Optional<iu> b(iu $$0, int $$1, arq $$2) {
      Comparator<iu> $$3 = Comparator.comparingInt($$1x -> $$1x.k($$0));
      return c($$0, $$1, $$2).min($$3);
   }

   public static Stream<iu> c(iu $$0, int $$1, arq $$2) {
      eql $$3 = d($$0, $$1, $$2);
      return iu.a($$3).filter($$1x -> $$2.a_($$1x).a(dmc.pG)).map(iu::j);
   }

   private static eql d(iu $$0, int $$1, arq $$2) {
      iu $$3 = iu.a((double)$$0.u(), (double)$$2.a(efy.a.b, $$0).v(), (double)$$0.w());
      return new eql($$3).c($$1, 10, $$1);
   }

   public static Stream<iu> a(iu $$0, bwd $$1, arq $$2) {
      int $$3 = 200;
      fei $$4 = $$1.bE();
      fei $$5 = $$4.e($$1.bT().c(200.0));
      return c($$0, 200, $$2)
         .map($$1x -> $$2.a($$1x, dwz.U))
         .flatMap(Optional::stream)
         .filter($$2x -> $$2x.f().b($$4, $$5).isPresent())
         .map(dwx::aw_)
         .sorted(Comparator.comparing($$0::j))
         .limit(1L);
   }

   private static void a(int $$0, iu $$1, arq $$2) {
      dzz $$3;
      if ($$1.v() < $$0) {
         $$3 = dmc.b.m();
      } else {
         $$3 = dmc.a.m();
      }

      ga $$5 = new ga($$3, Collections.emptySet(), null);
      $$5.a($$2, $$1, 306);
      $$2.a($$1, $$3.b());
   }

   private static boolean a(iu $$0, iu $$1, arq $$2) {
      return $$2.c_($$0) instanceof dys $$3 ? $$3.d().b($$1) : false;
   }
}
