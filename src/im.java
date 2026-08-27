import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class im extends ik {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cja a(gx $$0, cja $$1) {
      this.a(false);
      civ $$2 = $$1.d();
      if ($$2 instanceof cgt) {
         hc $$3 = $$0.e().c(cur.a);
         gw $$4 = $$0.d().a($$3);
         hc $$5 = $$0.g().t($$4.d()) ? $$3 : hc.b;

         try {
            this.a(((cgt)$$2).a((cli)(new clj($$0.g(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
