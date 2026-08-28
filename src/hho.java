import javax.annotation.Nullable;

public class hho implements hhq {
   private static final int a = 600;
   private static final xv b = xv.c("tutorial.punch_tree.title");
   private static final xv c = xv.a("tutorial.punch_tree.description", hhp.a("attack"));
   private final hhp d;
   @Nullable
   private fqs e;
   private int f;
   private int g;

   public hho(hhp $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhr.f);
      } else {
         if (this.f == 1) {
            gkh $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gi().a(ayd.r)) {
                  this.d.a(hhr.e);
                  return;
               }

               if (hhl.a($$0)) {
                  this.d.a(hhr.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fqs(fqs.a.c, b, c, true);
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
   public void a(gfk $$0, jh $$1, dxv $$2, float $$3) {
      boolean $$4 = $$2.a(axu.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hhr.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cxp $$0) {
      if ($$0.a(ayd.r)) {
         this.d.a(hhr.e);
      }
   }
}
