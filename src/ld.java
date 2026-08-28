import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ld extends la {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cvs a(kw $$0, cvs $$1) {
      this.a(false);
      cvn $$2 = $$1.h();
      if ($$2 instanceof ctu) {
         jk $$3 = $$0.d().c(djr.b);
         jf $$4 = $$0.c().a($$3);
         jk $$5 = $$0.b().u($$4.e()) ? $$3 : jk.b;

         try {
            this.a(((ctu)$$2).a((czn)(new czo($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
