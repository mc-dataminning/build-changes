import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class jr extends jp {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cqm a(jl $$0, cqm $$1) {
      this.a(false);
      cqh $$2 = $$1.d();
      if ($$2 instanceof coh) {
         ih $$3 = $$0.d().c(dch.b);
         ib $$4 = $$0.c().a($$3);
         ih $$5 = $$0.b().u($$4.d()) ? $$3 : ih.b;

         try {
            this.a(((coh)$$2).a((csu)(new csv($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
