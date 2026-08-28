import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lc extends kz {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cvl a(kv $$0, cvl $$1) {
      this.a(false);
      cvg $$2 = $$1.h();
      if ($$2 instanceof ctl) {
         jj $$3 = $$0.d().c(dja.b);
         je $$4 = $$0.c().a($$3);
         jj $$5 = $$0.b().u($$4.e()) ? $$3 : jj.b;

         try {
            this.a(((ctl)$$2).a((cyw)(new cyx($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
