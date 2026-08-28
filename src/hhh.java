import javax.annotation.Nullable;

public class hhh implements hhj {
   private static final int a = 600;
   private static final xv b = xv.c("tutorial.punch_tree.title");
   private static final xv c = xv.a("tutorial.punch_tree.description", hhi.a("attack"));
   private final hhi d;
   @Nullable
   private fql e;
   private int f;
   private int g;

   public hhh(hhi $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhk.f);
      } else {
         if (this.f == 1) {
            gka $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gg().a(ayd.r)) {
                  this.d.a(hhk.e);
                  return;
               }

               if (hhe.a($$0)) {
                  this.d.a(hhk.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fql(fql.a.c, b, c, true);
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
   public void a(gfd $$0, jh $$1, dxn $$2, float $$3) {
      boolean $$4 = $$2.a(axu.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hhk.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cxk $$0) {
      if ($$0.a(ayd.r)) {
         this.d.a(hhk.e);
      }
   }
}
