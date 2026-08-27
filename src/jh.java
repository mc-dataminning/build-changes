import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class jh extends jf {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected ckj a(jb $$0, ckj $$1) {
      this.a(false);
      cke $$2 = $$1.d();
      if ($$2 instanceof cic) {
         hx $$3 = $$0.d().c(cwd.b);
         ht $$4 = $$0.c().a($$3);
         hx $$5 = $$0.b().t($$4.d()) ? $$3 : hx.b;

         try {
            this.a(((cic)$$2).a((cmr)(new cms($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
