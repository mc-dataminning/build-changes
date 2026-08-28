import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lk extends lh {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cxy a(lb $$0, cxy $$1) {
      this.a(false);
      cxu $$2 = $$1.h();
      if ($$2 instanceof cwf) {
         jo $$3 = $$0.d().c(dna.b);
         jj $$4 = $$0.c().a($$3);
         jo $$5 = $$0.b().u($$4.e()) ? $$3 : jo.b;

         try {
            this.a(((cwf)$$2).a((dbn)(new dbo($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
