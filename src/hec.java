import javax.annotation.Nullable;

public class hec implements hei {
   private static final int a = 1200;
   private static final xi b = xi.c("tutorial.craft_planks.title");
   private static final xi c = xi.c("tutorial.craft_planks.description");
   private final heh d;
   @Nullable
   private fnt e;
   private int f;

   public hec(heh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hej.f);
      } else {
         if (this.f == 1) {
            ghd $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gk().a(axj.b)) {
                  this.d.a(hej.f);
                  return;
               }

               if (a($$0, axj.b)) {
                  this.d.a(hej.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fnt(fnt.a.e, b, c, false);
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
   public void a(cwb $$0) {
      if ($$0.a(axj.b)) {
         this.d.a(hej.f);
      }
   }

   public static boolean a(ghd $$0, axq<cvx> $$1) {
      for (jq<cvx> $$2 : ly.g.c($$1)) {
         if ($$0.i().a(awv.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
