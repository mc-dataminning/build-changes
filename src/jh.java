import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class jh extends jf {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected clb a(jb $$0, clb $$1) {
      this.a(false);
      ckw $$2 = $$1.d();
      if ($$2 instanceof ciu) {
         hx $$3 = $$0.d().c(cwx.b);
         ht $$4 = $$0.c().a($$3);
         hx $$5 = $$0.b().t($$4.d()) ? $$3 : hx.b;

         try {
            this.a(((ciu)$$2).a((cnj)(new cnk($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
