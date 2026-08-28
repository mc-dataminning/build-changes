import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lh extends le {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cwf a(ky $$0, cwf $$1) {
      this.a(false);
      cwb $$2 = $$1.h();
      if ($$2 instanceof cul) {
         jm $$3 = $$0.d().c(dko.b);
         jh $$4 = $$0.c().a($$3);
         jm $$5 = $$0.b().u($$4.e()) ? $$3 : jm.b;

         try {
            this.a(((cul)$$2).a((czw)(new czx($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
