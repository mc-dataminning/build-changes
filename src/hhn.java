import javax.annotation.Nullable;

public class hhn implements hhp {
   private static final int a = 600;
   private static final xv b = xv.c("tutorial.punch_tree.title");
   private static final xv c = xv.a("tutorial.punch_tree.description", hho.a("attack"));
   private final hho d;
   @Nullable
   private fqr e;
   private int f;
   private int g;

   public hhn(hho $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhq.f);
      } else {
         if (this.f == 1) {
            gkg $$0 = this.d.e().t;
            if ($$0 != null) {
               if ($$0.gi().a(ayd.r)) {
                  this.d.a(hhq.e);
                  return;
               }

               if (hhk.a($$0)) {
                  this.d.a(hhq.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fqr(fqr.a.c, b, c, true);
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
   public void a(gfj $$0, jh $$1, dxu $$2, float $$3) {
      boolean $$4 = $$2.a(axu.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hhq.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cxo $$0) {
      if ($$0.a(ayd.r)) {
         this.d.a(hhq.e);
      }
   }
}
