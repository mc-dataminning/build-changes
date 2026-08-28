import javax.annotation.Nullable;

public class heg implements hei {
   private static final int a = 600;
   private static final xi b = xi.c("tutorial.punch_tree.title");
   private static final xi c = xi.a("tutorial.punch_tree.description", heh.a("attack"));
   private final heh d;
   @Nullable
   private fnt e;
   private int f;
   private int g;

   public heg(heh $$0) {
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
               if ($$0.gk().a(axj.r)) {
                  this.d.a(hej.e);
                  return;
               }

               if (hed.a($$0)) {
                  this.d.a(hej.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fnt(fnt.a.c, b, c, true);
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
   public void a(gci $$0, jh $$1, dvj $$2, float $$3) {
      boolean $$4 = $$2.a(axa.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hej.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cwb $$0) {
      if ($$0.a(axj.r)) {
         this.d.a(hej.e);
      }
   }
}
