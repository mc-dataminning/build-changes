import java.util.List;

public class li extends lg {
   public static final li c = new li();

   @Override
   protected czn a(le $$0, czn $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(le $$0, czn $$1) {
      iv $$2 = $$0.c().a($$0.d().c(dox.b));
      List<bxj> $$3 = $$0.b().a(bxj.class, new fex($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bxj $$4 = $$3.getFirst();
         bws $$5 = $$4.f($$1);
         czn $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bxl $$7) {
            $$7.g($$5);
            $$7.gb();
         }

         return true;
      }
   }
}
