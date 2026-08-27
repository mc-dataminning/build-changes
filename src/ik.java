import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ik extends ii {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cix a(gv $$0, cix $$1) {
      this.a(false);
      cis $$2 = $$1.d();
      if ($$2 instanceof cgq) {
         ha $$3 = $$0.e().c(cum.a);
         gu $$4 = $$0.d().a($$3);
         ha $$5 = $$0.g().t($$4.d()) ? $$3 : ha.b;

         try {
            this.a(((cgq)$$2).a((clf)(new clg($$0.g(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
