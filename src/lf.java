import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lf extends lc {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cvx a(kx $$0, cvx $$1) {
      this.a(false);
      cvt $$2 = $$1.h();
      if ($$2 instanceof cuc) {
         jl $$3 = $$0.d().c(dkd.b);
         jg $$4 = $$0.c().a($$3);
         jl $$5 = $$0.b().u($$4.e()) ? $$3 : jl.b;

         try {
            this.a(((cuc)$$2).a((czm)(new czn($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
