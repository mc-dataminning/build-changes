import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class jl extends jj {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected clo a(jf $$0, clo $$1) {
      this.a(false);
      clj $$2 = $$1.d();
      if ($$2 instanceof cjh) {
         ib $$3 = $$0.d().c(cxk.b);
         hx $$4 = $$0.c().a($$3);
         ib $$5 = $$0.b().t($$4.d()) ? $$3 : ib.b;

         try {
            this.a(((cjh)$$2).a((cnw)(new cnx($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
