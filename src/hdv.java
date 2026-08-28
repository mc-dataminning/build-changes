import javax.annotation.Nullable;

public class hdv implements hdx {
   private static final int a = 600;
   private static final xh b = xh.c("tutorial.punch_tree.title");
   private static final xh c = xh.a("tutorial.punch_tree.description", hdw.a("attack"));
   private final hdw d;
   @Nullable
   private fnl e;
   private int f;
   private int g;

   public hdv(hdw $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hdy.f);
      } else {
         if (this.f == 1) {
            ggs $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gk().a(axi.r)) {
                  this.d.a(hdy.e);
                  return;
               }

               if (hds.a($$0)) {
                  this.d.a(hdy.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fnl(fnl.a.c, b, c, true);
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
   public void a(gbx $$0, jg $$1, dvd $$2, float $$3) {
      boolean $$4 = $$2.a(awz.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hdy.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cvx $$0) {
      if ($$0.a(axi.r)) {
         this.d.a(hdy.e);
      }
   }
}
