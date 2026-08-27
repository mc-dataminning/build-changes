import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class kk extends ki {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected csd a(ke $$0, csd $$1) {
      this.a(false);
      cry $$2 = $$1.f();
      if ($$2 instanceof cqb) {
         ir $$3 = $$0.d().c(dfa.b);
         im $$4 = $$0.c().a($$3);
         ir $$5 = $$0.b().u($$4.d()) ? $$3 : ir.b;

         try {
            this.a(((cqb)$$2).a((cvl)(new cvm($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
