import javax.annotation.Nullable;

public class hpb implements hpd {
   private static final int a = 600;
   private static final wy b = wy.c("tutorial.punch_tree.title");
   private static final wy c = wy.a("tutorial.punch_tree.description", hpc.a("attack"));
   private final hpc d;
   @Nullable
   private fuv e;
   private int f;
   private int g;

   public hpb(hpc $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hpe.f);
      } else {
         foz $$0 = this.d.e();
         if (this.f == 1) {
            gox $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gj().a(axk.r)) {
                  this.d.a(hpe.e);
                  return;
               }

               if (hoy.a($$1)) {
                  this.d.a(hpe.e);
                  return;
               }
            }
         }

         if ((this.f >= 600 || this.g > 3) && this.e == null) {
            this.e = new fuv($$0.h, fuv.a.c, b, c, true);
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
   public void a(gjz $$0, iu $$1, eah $$2, float $$3) {
      boolean $$4 = $$2.a(axc.u);
      if ($$4 && $$3 > 0.0F) {
         if (this.e != null) {
            this.e.a($$3);
         }

         if ($$3 >= 1.0F) {
            this.d.a(hpe.d);
         }
      } else if (this.e != null) {
         this.e.a(0.0F);
      } else if ($$4) {
         this.g++;
      }
   }

   @Override
   public void a(czd $$0) {
      if ($$0.a(axk.r)) {
         this.d.a(hpe.e);
      }
   }
}
