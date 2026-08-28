import javax.annotation.Nullable;

public class hkm implements hks {
   private static final int a = 1200;
   private static final wo b = wo.c("tutorial.craft_planks.title");
   private static final wo c = wo.c("tutorial.craft_planks.description");
   private final hkr d;
   @Nullable
   private frc e;
   private int f;

   public hkm(hkr $$0) {
      this.d = $$0;
   }

   @Override
   public void a() {
      this.f++;
      if (!this.d.f()) {
         this.d.a(hkt.f);
      } else {
         flh $$0 = this.d.e();
         if (this.f == 1) {
            gkt $$1 = $$0.t;
            if ($$1 != null) {
               if ($$1.gi().a(awx.b)) {
                  this.d.a(hkt.f);
                  return;
               }

               if (a($$1, awx.b)) {
                  this.d.a(hkt.f);
                  return;
               }
            }
         }

         if (this.f >= 1200 && this.e == null) {
            this.e = new frc($$0.h, frc.a.e, b, c, false);
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
   public void a(cwn $$0) {
      if ($$0.a(awx.b)) {
         this.d.a(hkt.f);
      }
   }

   public static boolean a(gkt $$0, axe<cwj> $$1) {
      for (jr<cwj> $$2 : mb.g.c($$1)) {
         if ($$0.m().a(awj.b.b($$2.a())) > 0) {
            return true;
         }
      }

      return false;
   }
}
