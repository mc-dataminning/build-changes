import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class kl extends kj {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected csz a(kf $$0, csz $$1) {
      this.a(false);
      csu $$2 = $$1.f();
      if ($$2 instanceof cqx) {
         is $$3 = $$0.d().c(dfj.b);
         in $$4 = $$0.c().a($$3);
         is $$5 = $$0.b().u($$4.d()) ? $$3 : is.b;

         try {
            this.a(((cqx)$$2).a((cwi)(new cwj($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
