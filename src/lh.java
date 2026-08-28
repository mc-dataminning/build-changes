import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lh extends le {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cxk a(ky $$0, cxk $$1) {
      this.a(false);
      cxg $$2 = $$1.h();
      if ($$2 instanceof cvq) {
         jm $$3 = $$0.d().c(dml.b);
         jh $$4 = $$0.c().a($$3);
         jm $$5 = $$0.b().u($$4.e()) ? $$3 : jm.b;

         try {
            this.a(((cvq)$$2).a((dbb)(new dbc($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
