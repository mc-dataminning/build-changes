import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class kx extends ku {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cuq a(kq $$0, cuq $$1) {
      this.a(false);
      cul $$2 = $$1.g();
      if ($$2 instanceof cso) {
         je $$3 = $$0.d().c(dhf.b);
         iz $$4 = $$0.c().a($$3);
         je $$5 = $$0.b().u($$4.d()) ? $$3 : je.b;

         try {
            this.a(((cso)$$2).a((cyb)(new cyc($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
