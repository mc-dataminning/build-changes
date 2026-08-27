public class geq implements geu {
   private static final int a = 40;
   private static final int b = 40;
   private static final int c = 100;
   private static final int d = 20;
   private static final int e = -1;
   private static final tm f = tm.a("tutorial.move.title", get.a("forward"), get.a("left"), get.a("back"), get.a("right"));
   private static final tm g = tm.a("tutorial.move.description", get.a("jump"));
   private static final tm h = tm.c("tutorial.look.title");
   private static final tm i = tm.c("tutorial.look.description");
   private final get j;
   private euz k;
   private euz l;
   private int m;
   private int n;
   private int o;
   private boolean p;
   private boolean q;
   private int r = -1;
   private int s = -1;

   public geq(get $$0) {
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
            this.j.a(gev.b);
         } else {
            this.j.a(gev.f);
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
            this.k = new euz(euz.a.a, f, g, true);
            this.j.e().ay().a(this.k);
         } else if (this.r != -1 && this.m - this.r >= 20 && this.s == -1 && this.l == null) {
            this.l = new euz(euz.a.b, h, i, true);
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
   public void a(fne $$0) {
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
