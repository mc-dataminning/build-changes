import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class jm extends jk {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cmx a(jg $$0, cmx $$1) {
      this.a(false);
      cms $$2 = $$1.d();
      if ($$2 instanceof ckq) {
         ic $$3 = $$0.d().c(cyu.b);
         hx $$4 = $$0.c().a($$3);
         ic $$5 = $$0.b().u($$4.d()) ? $$3 : ic.b;

         try {
            this.a(((ckq)$$2).a((cpg)(new cph($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
