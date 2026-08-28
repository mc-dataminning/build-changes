import java.util.List;

public class lb extends kz {
   public static final lb c = new lb();

   @Override
   protected cvx a(kx $$0, cvx $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(kx $$0, cvx $$1) {
      jg $$2 = $$0.c().a($$0.d().c(dkd.b));
      List<buv> $$3 = $$0.b().a(buv.class, new ezc($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         buv $$4 = $$3.getFirst();
         buh $$5 = $$4.f($$1);
         cvx $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bux $$7) {
            $$7.a($$5, 2.0F);
            $$7.gb();
         }

         return true;
      }
   }
}
