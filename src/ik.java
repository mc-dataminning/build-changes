import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ik extends ii {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cjf a(id $$0, cjf $$1) {
      this.a(false);
      cja $$2 = $$1.d();
      if ($$2 instanceof cgy) {
         ha $$3 = $$0.d().c(cuw.a);
         gw $$4 = $$0.c().a($$3);
         ha $$5 = $$0.b().t($$4.d()) ? $$3 : ha.b;

         try {
            this.a(((cgy)$$2).a((cln)(new clo($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
