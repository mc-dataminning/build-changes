import javax.annotation.Nullable;

public class hdg implements hdi {
   private static final int a = 600;
   private static final xe b = xe.c("tutorial.punch_tree.title");
   private static final xe c = xe.a("tutorial.punch_tree.description", hdh.a("attack"));
   private final hdh d;
   @Nullable
   private fna e;
   private int f;
   private int g;

   public hdg(hdh $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hdj.f);
      } else {
         if (this.f == 1) {
            ggh $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gd().a(axe.r)) {
                  this.d.a(hdj.e);
                  return;
               }

               if (hdd.a($$0)) {
                  this.d.a(hdj.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fna(fna.a.c, b, c, true);
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
   public void a(gbm $$0, jf $$1, dus $$2, float $$3) {
      boolean $$4 = $$2.a(awv.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hdj.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cvs $$0) {
      if ($$0.a(axe.r)) {
         this.d.a(hdj.e);
      }
   }
}
