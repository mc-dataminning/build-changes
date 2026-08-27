import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class jq extends jo {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cpq a(jk $$0, cpq $$1) {
      this.a(false);
      cpl $$2 = $$1.d();
      if ($$2 instanceof cnl) {
         ih $$3 = $$0.d().c(dbk.b);
         ib $$4 = $$0.c().a($$3);
         ih $$5 = $$0.b().u($$4.d()) ? $$3 : ih.b;

         try {
            this.a(((cnl)$$2).a((crx)(new cry($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
