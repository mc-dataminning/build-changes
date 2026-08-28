import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ky extends kv {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cud a(kr $$0, cud $$1) {
      this.a(false);
      cty $$2 = $$1.g();
      if ($$2 instanceof csc) {
         jf $$3 = $$0.d().c(dhn.b);
         ja $$4 = $$0.c().a($$3);
         jf $$5 = $$0.b().u($$4.d()) ? $$3 : jf.b;

         try {
            this.a(((csc)$$2).a((cxn)(new cxo($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
