import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class jk extends ji {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cmh a(je $$0, cmh $$1) {
      this.a(false);
      cmc $$2 = $$1.d();
      if ($$2 instanceof cka) {
         ia $$3 = $$0.d().c(cye.b);
         hv $$4 = $$0.c().a($$3);
         ia $$5 = $$0.b().t($$4.d()) ? $$3 : ia.b;

         try {
            this.a(((cka)$$2).a((coq)(new cor($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
