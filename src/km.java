import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class km extends kj {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected ctq a(kf $$0, ctq $$1) {
      this.a(false);
      ctl $$2 = $$1.g();
      if ($$2 instanceof cro) {
         it $$3 = $$0.d().c(dgf.b);
         io $$4 = $$0.c().a($$3);
         it $$5 = $$0.b().u($$4.d()) ? $$3 : it.b;

         try {
            this.a(((cro)$$2).a((cxb)(new cxc($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
