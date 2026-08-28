import javax.annotation.Nullable;

public class hdb implements hdd {
   private static final int a = 600;
   private static final xd b = xd.c("tutorial.punch_tree.title");
   private static final xd c = xd.a("tutorial.punch_tree.description", hdc.a("attack"));
   private final hdc d;
   @Nullable
   private fmw e;
   private int f;
   private int g;

   public hdb(hdc $$0) {
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
               if ($$0.gc().a(axc.r)) {
                  this.d.a(hde.e);
                  return;
               }

               if (hcy.a($$0)) {
                  this.d.a(hde.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fmw(fmw.a.c, b, c, true);
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
   public void a(gbh $$0, je $$1, duo $$2, float $$3) {
      boolean $$4 = $$2.a(awt.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hde.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cvp $$0) {
      if ($$0.a(axc.r)) {
         this.d.a(hde.e);
      }
   }
}
