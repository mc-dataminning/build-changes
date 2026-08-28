import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class kx extends ku {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cur a(kq $$0, cur $$1) {
      this.a(false);
      cum $$2 = $$1.g();
      if ($$2 instanceof csp) {
         je $$3 = $$0.d().c(dhg.b);
         iz $$4 = $$0.c().a($$3);
         je $$5 = $$0.b().u($$4.d()) ? $$3 : je.b;

         try {
            this.a(((csp)$$2).a((cyc)(new cyd($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
