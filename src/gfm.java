public class gfm implements gfq {
   private static final int a = 40;
   private static final int b = 40;
   private static final int c = 100;
   private static final int d = 20;
   private static final int e = -1;
   private static final ui f = ui.a("tutorial.move.title", gfp.a("forward"), gfp.a("left"), gfp.a("back"), gfp.a("right"));
   private static final ui g = ui.a("tutorial.move.description", gfp.a("jump"));
   private static final ui h = ui.c("tutorial.look.title");
   private static final ui i = ui.c("tutorial.look.description");
   private final gfp j;
   private evt k;
   private evt l;
   private int m;
   private int n;
   private int o;
   private boolean p;
   private boolean q;
   private int r = -1;
   private int s = -1;

   public gfm(gfp $$0) {
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
            this.k.c();
            this.k = null;
         }

         this.r = this.m;
      }

      if (this.s == -1 && this.o > 40) {
         if (this.l != null) {
            this.l.c();
            this.l = null;
         }

         this.s = this.m;
      }

      if (this.r != -1 && this.s != -1) {
         if (this.j.f()) {
            this.j.a(gfr.b);
         } else {
            this.j.a(gfr.f);
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
            this.k = new evt(evt.a.a, f, g, true);
            this.j.e().ay().a(this.k);
         } else if (this.r != -1 && this.m - this.r >= 20 && this.s == -1 && this.l == null) {
            this.l = new evt(evt.a.b, h, i, true);
            this.j.e().ay().a(this.l);
         }
      }
   }

   @Override
   public void b() {
      if (this.k != null) {
         this.k.c();
         this.k = null;
      }

      if (this.l != null) {
         this.l.c();
         this.l = null;
      }
   }

   @Override
   public void a(foa $$0) {
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
