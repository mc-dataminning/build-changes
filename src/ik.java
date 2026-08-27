import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ik extends ii {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected ciy a(gv $$0, ciy $$1) {
      this.a(false);
      cit $$2 = $$1.d();
      if ($$2 instanceof cgr) {
         ha $$3 = $$0.e().c(cun.a);
         gu $$4 = $$0.d().a($$3);
         ha $$5 = $$0.g().t($$4.d()) ? $$3 : ha.b;

         try {
            this.a(((cgr)$$2).a((clg)(new clh($$0.g(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
