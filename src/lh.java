import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lh extends le {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cxp a(ky $$0, cxp $$1) {
      this.a(false);
      cxl $$2 = $$1.h();
      if ($$2 instanceof cvv) {
         jm $$3 = $$0.d().c(dmt.b);
         jh $$4 = $$0.c().a($$3);
         jm $$5 = $$0.b().u($$4.e()) ? $$3 : jm.b;

         try {
            this.a(((cvv)$$2).a((dbg)(new dbh($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
