import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class jr extends jp {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cqk a(jl $$0, cqk $$1) {
      this.a(false);
      cqf $$2 = $$1.d();
      if ($$2 instanceof cof) {
         ih $$3 = $$0.d().c(dcf.b);
         ib $$4 = $$0.c().a($$3);
         ih $$5 = $$0.b().u($$4.d()) ? $$3 : ih.b;

         try {
            this.a(((cof)$$2).a((css)(new cst($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
