import java.util.List;

public class lc extends la {
   public static final lc c = new lc();

   @Override
   protected cwb a(ky $$0, cwb $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(ky $$0, cwb $$1) {
      jh $$2 = $$0.c().a($$0.d().c(dkj.b));
      List<bva> $$3 = $$0.b().a(bva.class, new ezi($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bva $$4 = $$3.getFirst();
         bum $$5 = $$4.f($$1);
         cwb $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bvc $$7) {
            $$7.a($$5, 2.0F);
            $$7.ga();
         }

         return true;
      }
   }
}
