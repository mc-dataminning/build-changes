import java.util.List;

public class lh extends lf {
   public static final lh c = new lh();

   @Override
   protected cyy a(ld $$0, cyy $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(ld $$0, cyy $$1) {
      iu $$2 = $$0.c().a($$0.d().c(dog.b));
      List<bxc> $$3 = $$0.b().a(bxc.class, new fed($$2), $$1x -> $$1x.f($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bxc $$4 = $$3.getFirst();
         bwn $$5 = $$4.g($$1);
         cyy $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bxe $$7) {
            $$7.g($$5);
            $$7.fY();
         }

         return true;
      }
   }
}
