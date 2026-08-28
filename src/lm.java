import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lm extends lj {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cyy a(ld $$0, cyy $$1) {
      this.a(false);
      cyu $$2 = $$1.h();
      if ($$2 instanceof cxg) {
         ja $$3 = $$0.d().c(dog.b);
         iu $$4 = $$0.c().a($$3);
         ja $$5 = $$0.b().v($$4.e()) ? $$3 : ja.b;

         try {
            this.a(((cxg)$$2).a((dcr)(new dcs($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
