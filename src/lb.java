import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lb extends ky {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cuq a(ku $$0, cuq $$1) {
      this.a(false);
      cul $$2 = $$1.g();
      if ($$2 instanceof cso) {
         ji $$3 = $$0.d().c(did.b);
         jd $$4 = $$0.c().a($$3);
         ji $$5 = $$0.b().u($$4.e()) ? $$3 : ji.b;

         try {
            this.a(((cso)$$2).a((cyd)(new cye($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
