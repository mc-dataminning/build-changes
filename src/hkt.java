import javax.annotation.Nullable;

public class hkt implements hkx {
   private static final int a = 40;
   private static final int b = 40;
   private static final int c = 100;
   private static final int d = 20;
   private static final int e = -1;
   private static final wp f = wp.a("tutorial.move.title", hkw.a("forward"), hkw.a("left"), hkw.a("back"), hkw.a("right"));
   private static final wp g = wp.a("tutorial.move.description", hkw.a("jump"));
   private static final wp h = wp.c("tutorial.look.title");
   private static final wp i = wp.c("tutorial.look.description");
   private final hkw j;
   @Nullable
   private fre k;
   @Nullable
   private fre l;
   private int m;
   private int n;
   private int o;
   private boolean p;
   private boolean q;
   private int r = -1;
   private int s = -1;

   public hkt(hkw $$0) {
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
            this.k.d();
            this.k = null;
         }

         this.r = this.m;
      }

      if (this.s == -1 && this.o > 40) {
         if (this.l != null) {
            this.l.d();
            this.l = null;
         }

         this.s = this.m;
      }

      if (this.r != -1 && this.s != -1) {
         if (this.j.f()) {
            this.j.a(hky.b);
         } else {
            this.j.a(hky.f);
         }
      }

      if (this.k != null) {
         this.k.a((float)this.n / 40.0F);
      }

      if (this.l != null) {
         this.l.a((float)this.o / 40.0F);
      }

      if (this.m >= 100) {
         fli $$0 = this.j.e();
         if (this.r == -1 && this.k == null) {
            this.k = new fre($$0.h, fre.a.a, f, g, true);
            $$0.aA().a(this.k);
         } else if (this.r != -1 && this.m - this.r >= 20 && this.s == -1 && this.l == null) {
            this.l = new fre($$0.h, fre.a.b, h, i, true);
            $$0.aA().a(this.l);
         }
      }
   }

   @Override
   public void b() {
      if (this.k != null) {
         this.k.d();
         this.k = null;
      }

      if (this.l != null) {
         this.l.d();
         this.l = null;
      }
   }

   @Override
   public void a(gkt $$0) {
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
