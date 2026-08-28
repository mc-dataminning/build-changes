import javax.annotation.Nullable;

public class hhk implements hhm {
   private static final int a = 600;
   private static final xk b = xk.c("tutorial.punch_tree.title");
   private static final xk c = xk.a("tutorial.punch_tree.description", hhl.a("attack"));
   private final hhl d;
   @Nullable
   private fql e;
   private int f;
   private int g;

   public hhk(hhl $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hhn.f);
      } else {
         flz $$0 = this.d.e();
         if (this.f == 1) {
            gkc $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(axt.r)) {
                  this.d.a(hhn.e);
                  return;
               }

               if (hhh.a($$1)) {
                  this.d.a(hhn.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fql($$0.h, fql.a.c, b, c, true);
            $$0.aA().a(this.e);
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
   public void a(gff $$0, jh $$1, dxo $$2, float $$3) {
      boolean $$4 = $$2.a(axk.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hhn.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(cxg $$0) {
      if ($$0.a(axt.r)) {
         this.d.a(hhn.e);
      }
   }
}
