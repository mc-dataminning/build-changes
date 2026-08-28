import javax.annotation.Nullable;

public class hkn implements hks {
   private static final int a = 6000;
   private static final wo b = wo.c("tutorial.find_tree.title");
   private static final wo c = wo.c("tutorial.find_tree.description");
   private final hkr d;
   @Nullable
   private frc e;
   private int f;

   public hkn(hkr $$0) {
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
            if ($$1 != null && (b($$1) || a($$1))) {
               this.d.a(hkt.e);
               return;
            }
         }

         if (this.f >= 6000 && this.e == null) {
            this.e = new frc($$0.h, frc.a.c, b, c, false);
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
   public void a(gfw $$0, faw $$1) {
      if ($$1.d() == faw.a.b) {
         dwv $$2 = $$0.a_(((fau)$$1).b());
         if ($$2.a(awo.al)) {
            this.d.a(hkt.c);
         }
      }
   }

   @Override
   public void a(cwn $$0) {
      if ($$0.a(awx.aQ)) {
         this.d.a(hkt.e);
      }
   }

   private static boolean b(gkt $$0) {
      return $$0.gi().a_($$0x -> $$0x.a(awx.aQ));
   }

   public static boolean a(gkt $$0) {
      for (jr<djk> $$1 : mb.e.c(awo.al)) {
         djk $$2 = $$1.a();
         if ($$0.m().a(awj.a.b($$2)) > 0) {
            return true;
         }
      }

      return false;
   }
}
