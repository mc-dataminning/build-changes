import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class kc extends ka {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected crs a(jw $$0, crs $$1) {
      this.a(false);
      crn $$2 = $$1.f();
      if ($$2 instanceof cpq) {
         ij $$3 = $$0.d().c(dem.b);
         id $$4 = $$0.c().a($$3);
         ij $$5 = $$0.b().u($$4.d()) ? $$3 : ij.b;

         try {
            this.a(((cpq)$$2).a((cux)(new cuy($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
