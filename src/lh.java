import java.util.List;

public class lh extends lf {
   public static final lh c = new lh();

   @Override
   protected cys a(ld $$0, cys $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(ld $$0, cys $$1) {
      iu $$2 = $$0.c().a($$0.d().c(doa.b));
      List<bwz> $$3 = $$0.b().a(bwz.class, new fdr($$2), $$1x -> $$1x.f($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bwz $$4 = $$3.getFirst();
         bwk $$5 = $$4.g($$1);
         cys $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bxb $$7) {
            $$7.g($$5);
            $$7.fY();
         }

         return true;
      }
   }
}
