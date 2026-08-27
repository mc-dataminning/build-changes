import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class im extends ik {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cjf a(gx $$0, cjf $$1) {
      this.a(false);
      cja $$2 = $$1.d();
      if ($$2 instanceof cgy) {
         hc $$3 = $$0.e().c(cuw.a);
         gw $$4 = $$0.d().a($$3);
         hc $$5 = $$0.g().t($$4.d()) ? $$3 : hc.b;

         try {
            this.a(((cgy)$$2).a((cln)(new clo($$0.g(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
