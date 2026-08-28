import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class li extends lf {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cwn a(kz $$0, cwn $$1) {
      this.a(false);
      cwj $$2 = $$1.h();
      if ($$2 instanceof cut) {
         jn $$3 = $$0.d().c(dlq.b);
         ji $$4 = $$0.c().a($$3);
         jn $$5 = $$0.b().u($$4.e()) ? $$3 : jn.b;

         try {
            this.a(((cut)$$2).a((dae)(new daf($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
