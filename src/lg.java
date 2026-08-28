import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lg extends ld {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cwb a(ky $$0, cwb $$1) {
      this.a(false);
      cvx $$2 = $$1.h();
      if ($$2 instanceof cuh) {
         jm $$3 = $$0.d().c(dkj.b);
         jh $$4 = $$0.c().a($$3);
         jm $$5 = $$0.b().u($$4.e()) ? $$3 : jm.b;

         try {
            this.a(((cuh)$$2).a((czs)(new czt($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
