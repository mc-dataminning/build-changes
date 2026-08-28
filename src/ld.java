import java.util.List;

public class ld extends lb {
   public static final ld c = new ld();

   @Override
   protected cwn a(kz $$0, cwn $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(kz $$0, cwn $$1) {
      ji $$2 = $$0.c().a($$0.d().c(dlq.b));
      List<bvf> $$3 = $$0.b().a(bvf.class, new fat($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bvf $$4 = $$3.getFirst();
         bur $$5 = $$4.f($$1);
         cwn $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bvh $$7) {
            $$7.a($$5, 2.0F);
            $$7.aj();
         }

         return true;
      }
   }
}
