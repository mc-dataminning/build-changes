import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class kp extends kn {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cuh a(kj $$0, cuh $$1) {
      this.a(false);
      cuc $$2 = $$1.f();
      if ($$2 instanceof csc) {
         iw $$3 = $$0.d().c(dhi.b);
         ir $$4 = $$0.c().a($$3);
         iw $$5 = $$0.b().u($$4.d()) ? $$3 : iw.b;

         try {
            this.a(((csc)$$2).a((cyd)(new cye($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
