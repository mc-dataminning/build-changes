import javax.annotation.Nullable;

public class hcx implements hdd {
   private static final int a = 1200;
   private static final xd b = xd.c("tutorial.craft_planks.title");
   private static final xd c = xd.c("tutorial.craft_planks.description");
   private final hdc d;
   @Nullable
   private fmw e;
   private int f;

   public hcx(hdc $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hde.f);
      } else {
         if (this.f == 1) {
            ggc $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gc().a(axc.b)) {
                  this.d.a(hde.f);
                  return;
               }

               if (a($$0, axc.b)) {
                  this.d.a(hde.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new fmw(fmw.a.e, b, c, false);
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
   public void a(cvp $$0) {
      if ($$0.a(axc.b)) {
         this.d.a(hde.f);
      }
   }

   public static boolean a(ggc $$0, axj<cvk> $$1) {
      for (jn<cvk> $$2 : lu.g.b($$1)) {
         if ($$0.i().a(awo.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
