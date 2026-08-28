import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lm extends lj {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected czd a(ld $$0, czd $$1) {
      this.a(false);
      cyz $$2 = $$1.h();
      if ($$2 instanceof cxl) {
         ja $$3 = $$0.d().c(dol.b);
         iu $$4 = $$0.c().a($$3);
         ja $$5 = $$0.b().v($$4.e()) ? $$3 : ja.b;

         try {
            this.a(((cxl)$$2).a((dcw)(new dcx($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
