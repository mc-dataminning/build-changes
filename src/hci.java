import javax.annotation.Nullable;

public class hci implements hcm {
   private static final int a = 40;
   private static final int b = 40;
   private static final int c = 100;
   private static final int d = 20;
   private static final int e = -1;
   private static final xd f = xd.a("tutorial.move.title", hcl.a("forward"), hcl.a("left"), hcl.a("back"), hcl.a("right"));
   private static final xd g = xd.a("tutorial.move.description", hcl.a("jump"));
   private static final xd h = xd.c("tutorial.look.title");
   private static final xd i = xd.c("tutorial.look.description");
   private final hcl j;
   @Nullable
   private fmm k;
   @Nullable
   private fmm l;
   private int m;
   private int n;
   private int o;
   private boolean p;
   private boolean q;
   private int r = -1;
   private int s = -1;

   public hci(hcl $$0) {
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
            this.j.a(hcn.b);
         } else {
            this.j.a(hcn.f);
         }
      }

      if (this.k != null) {
         this.k.a((float)this.n / 40.0F);
      }

      if (this.l != null) {
         this.l.a((float)this.o / 40.0F);
      }

      if (this.m >= 100) {
         if (this.r == -1 && this.k == null) {
            this.k = new fmm(fmm.a.a, f, g, true);
            this.j.e().az().a(this.k);
         } else if (this.r != -1 && this.m - this.r >= 20 && this.s == -1 && this.l == null) {
            this.l = new fmm(fmm.a.b, h, i, true);
            this.j.e().az().a(this.l);
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
   public void a(gfq $$0) {
      if ($$0.c || $$0.d || $$0.e || $$0.f || $$0.g) {
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
