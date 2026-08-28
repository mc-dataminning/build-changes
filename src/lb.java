import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lb extends ky {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cuo a(ku $$0, cuo $$1) {
      this.a(false);
      cuj $$2 = $$1.g();
      if ($$2 instanceof csm) {
         ji $$3 = $$0.d().c(dib.b);
         jd $$4 = $$0.c().a($$3);
         ji $$5 = $$0.b().u($$4.d()) ? $$3 : ji.b;

         try {
            this.a(((csm)$$2).a((cyb)(new cyc($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
