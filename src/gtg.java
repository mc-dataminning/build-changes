public abstract class gtg implements gty {
   protected gtv a;
   protected final avq b;
   protected final akr c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gty.a k = gty.a.b;
   protected boolean l;
   protected ayw m;

   protected gtg(avo $$0, avq $$1, ayw $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gtg(akr $$0, avq $$1, ayw $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public akr a() {
      return this.c;
   }

   @Override
   public gve a(gvd $$0) {
      if (this.c.equals(gvd.c)) {
         this.a = gvd.e;
         return gvd.d;
      } else {
         gve $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gvd.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gtv b() {
      return this.a;
   }

   @Override
   public avq c() {
      return this.b;
   }

   @Override
   public boolean d() {
      return this.i;
   }

   @Override
   public int e() {
      return this.j;
   }

   @Override
   public float f() {
      return this.d * this.a.c().a(this.m);
   }

   @Override
   public float g() {
      return this.e * this.a.d().a(this.m);
   }

   @Override
   public double h() {
      return this.f;
   }

   @Override
   public double i() {
      return this.g;
   }

   @Override
   public double j() {
      return this.h;
   }

   @Override
   public gty.a k() {
      return this.k;
   }

   @Override
   public boolean l() {
      return this.l;
   }

   @Override
   public String toString() {
      return "SoundInstance[" + this.c + "]";
   }
}
