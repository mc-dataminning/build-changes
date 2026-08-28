import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ln extends lk {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected czy a(le $$0, czy $$1) {
      this.a(false);
      czu $$2 = $$1.h();
      if ($$2 instanceof cyg) {
         jb $$3 = $$0.d().c(dpi.b);
         iv $$4 = $$0.c().a($$3);
         jb $$5 = $$0.b().v($$4.e()) ? $$3 : jb.b;

         try {
            this.a(((cyg)$$2).a((ddr)(new dds($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
