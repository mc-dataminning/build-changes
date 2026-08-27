import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ka extends jy {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected crj a(ju $$0, crj $$1) {
      this.a(false);
      cre $$2 = $$1.f();
      if ($$2 instanceof cph) {
         ih $$3 = $$0.d().c(ded.b);
         ib $$4 = $$0.c().a($$3);
         ih $$5 = $$0.b().u($$4.d()) ? $$3 : ih.b;

         try {
            this.a(((cph)$$2).a((cuo)(new cup($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
