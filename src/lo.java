import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lo extends ll {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected dak a(lf $$0, dak $$1) {
      this.a(false);
      dag $$2 = $$1.h();
      if ($$2 instanceof cys) {
         jc $$3 = $$0.d().c(dpu.b);
         iw $$4 = $$0.c().a($$3);
         jc $$5 = $$0.b().v($$4.e()) ? $$3 : jc.b;

         try {
            this.a(((cys)$$2).a((ded)(new dee($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
