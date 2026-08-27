import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class jo extends jm {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected coz a(ji $$0, coz $$1) {
      this.a(false);
      cou $$2 = $$1.d();
      if ($$2 instanceof cms) {
         ie $$3 = $$0.d().c(dat.b);
         hz $$4 = $$0.c().a($$3);
         ie $$5 = $$0.b().u($$4.d()) ? $$3 : ie.b;

         try {
            this.a(((cms)$$2).a((crg)(new crh($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
