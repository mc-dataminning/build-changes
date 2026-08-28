import javax.annotation.Nullable;

public class hfd implements hfj {
   private static final int a = 1200;
   private static final xj b = xj.c("tutorial.craft_planks.title");
   private static final xj c = xj.c("tutorial.craft_planks.description");
   private final hfi d;
   @Nullable
   private fop e;
   private int f;

   public hfd(hfi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hfk.f);
      } else {
         if (this.f == 1) {
            gic $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gg().a(axl.b)) {
                  this.d.a(hfk.f);
                  return;
               }

               if (a($$0, axl.b)) {
                  this.d.a(hfk.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fop(fop.a.e, b, c, false);
            this.d.e().aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.d();
         this.e = null;
      }
   }

   @Override
   public void a(cwm $$0) {
      if ($$0.a(axl.b)) {
         this.d.a(hfk.f);
      }
   }

   public static boolean a(gic $$0, axs<cwi> $$1) {
      for (jq<cwi> $$2 : lz.g.c($$1)) {
         if ($$0.m().a(awx.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
