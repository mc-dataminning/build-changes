import javax.annotation.Nullable;

public class hod implements hof {
   private static final int a = 600;
   private static final ww b = ww.c("tutorial.punch_tree.title");
   private static final ww c = ww.a("tutorial.punch_tree.description", hoe.a("attack"));
   private final hoe d;
   @Nullable
   private fuc e;
   private int f;
   private int g;

   public hod(hoe $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hog.f);
      } else {
         fof $$0 = this.d.e();
         if (this.f == 1) {
            goa $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(axi.r)) {
                  this.d.a(hog.e);
                  return;
               }

               if (hoa.a($$1)) {
                  this.d.a(hog.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fuc($$0.h, fuc.a.c, b, c, true);
            $$0.aA().a(this.e);
         }
      }
   }

   @Override
   public void b() {
      if (this.e != null) {
         this.e.e();
         this.e = null;
      }
   }

   @Override
   public void a(gjd $$0, iu $$1, dzo $$2, float $$3) {
      boolean $$4 = $$2.a(axa.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hog.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cys $$0) {
      if ($$0.a(axi.r)) {
         this.d.a(hog.e);
      }
   }
}
