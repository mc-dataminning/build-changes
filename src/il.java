import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class il extends ij {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected ciw a(gw $$0, ciw $$1) {
      this.a(false);
      cir $$2 = $$1.d();
      if ($$2 instanceof cgp) {
         hb $$3 = $$0.e().c(cul.a);
         gv $$4 = $$0.d().a($$3);
         hb $$5 = $$0.g().t($$4.d()) ? $$3 : hb.b;

         try {
            this.a(((cgp)$$2).a((cle)(new clf($$0.g(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
