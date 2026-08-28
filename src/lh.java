import java.util.List;

public class lh extends lf {
   public static final lh c = new lh();

   @Override
   protected czd a(ld $$0, czd $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(ld $$0, czd $$1) {
      iu $$2 = $$0.c().a($$0.d().c(dol.b));
      List<bxe> $$3 = $$0.b().a(bxe.class, new fel($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bxe $$4 = $$3.getFirst();
         bwp $$5 = $$4.f($$1);
         czd $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bxg $$7) {
            $$7.g($$5);
            $$7.fZ();
         }

         return true;
      }
   }
}
