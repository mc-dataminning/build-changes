import java.util.List;

public class lc extends la {
   public static final lc c = new lc();

   @Override
   protected cxo a(ky $$0, cxo $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(ky $$0, cxo $$1) {
      jh $$2 = $$0.c().a($$0.d().c(dms.b));
      List<bwf> $$3 = $$0.b().a(bwf.class, new fbs($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         bwf $$4 = $$3.getFirst();
         bvr $$5 = $$4.f($$1);
         cxo $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof bwh $$7) {
            $$7.a($$5, 2.0F);
            $$7.ai();
         }

         return true;
      }
   }
}
