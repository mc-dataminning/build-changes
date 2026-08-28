import javax.annotation.Nullable;

public class hoz implements hpd {
   private static final int a = 40;
   private static final int b = 40;
   private static final int c = 100;
   private static final int d = 20;
   private static final int e = -1;
   private static final wy f = wy.a("tutorial.move.title", hpc.a("forward"), hpc.a("left"), hpc.a("back"), hpc.a("right"));
   private static final wy g = wy.a("tutorial.move.description", hpc.a("jump"));
   private static final wy h = wy.c("tutorial.look.title");
   private static final wy i = wy.c("tutorial.look.description");
   private final hpc j;
   @Nullable
   private fuv k;
   @Nullable
   private fuv l;
   private int m;
   private int n;
   private int o;
   private boolean p;
   private boolean q;
   private int r = -1;
   private int s = -1;

   public hoz(hpc $$0) {
      this.j = $$0;
   }

   @Override
   public void a() {
      this.m++;
      if (this.p) {
         this.n++;
         this.p = false;
      }

      if (this.q) {
         this.o++;
         this.q = false;
      }

      if (this.r == -1 && this.n > 40) {
         if (this.k != null) {
            this.k.e();
            this.k = null;
         }

         this.r = this.m;
      }

      if (this.s == -1 && this.o > 40) {
         if (this.l != null) {
            this.l.e();
            this.l = null;
         }

         this.s = this.m;
      }

      if (this.r != -1 && this.s != -1) {
         if (this.j.f()) {
            this.j.a(hpe.b);
         } else {
            this.j.a(hpe.f);
         }
      }

      if (this.k != null) {
         this.k.a((float)this.n / 40.0F);
      }

      if (this.l != null) {
         this.l.a((float)this.o / 40.0F);
      }

      if (this.m >= 100) {
         foz $$0 = this.j.e();
         if (this.r == -1 && this.k == null) {
            this.k = new fuv($$0.h, fuv.a.a, f, g, true);
            $$0.aA().a(this.k);
         } else if (this.r != -1 && this.m - this.r >= 20 && this.s == -1 && this.l == null) {
            this.l = new fuv($$0.h, fuv.a.b, h, i, true);
            $$0.aA().a(this.l);
         }
      }
   }

   @Override
   public void b() {
      if (this.k != null) {
         this.k.e();
         this.k = null;
      }

      if (this.l != null) {
         this.l.e();
         this.l = null;
      }
   }

   @Override
   public void a(gov $$0) {
      if ($$0.a.a() || $$0.a.b() || $$0.a.c() || $$0.a.d() || $$0.a.e()) {
         this.p = true;
      }
   }

   @Override
   public void a(double $$0, double $$1) {
      if (Math.abs($$0) > 0.01 || Math.abs($$1) > 0.01) {
         this.q = true;
      }
   }
}
