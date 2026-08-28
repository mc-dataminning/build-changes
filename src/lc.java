import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lc extends kz {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cvp a(kv $$0, cvp $$1) {
      this.a(false);
      cvk $$2 = $$1.h();
      if ($$2 instanceof ctr) {
         jj $$3 = $$0.d().c(djo.b);
         je $$4 = $$0.c().a($$3);
         jj $$5 = $$0.b().u($$4.e()) ? $$3 : jj.b;

         try {
            this.a(((ctr)$$2).a((czk)(new czl($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
