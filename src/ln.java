import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ln extends lk {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected czk a(le $$0, czk $$1) {
      this.a(false);
      czg $$2 = $$1.h();
      if ($$2 instanceof cxs) {
         jb $$3 = $$0.d().c(dos.b);
         iv $$4 = $$0.c().a($$3);
         jb $$5 = $$0.b().v($$4.e()) ? $$3 : jb.b;

         try {
            this.a(((cxs)$$2).a((ddd)(new dde($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
