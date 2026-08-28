public abstract class gti implements gua {
   protected gtx a;
   protected final avq b;
   protected final akr c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gua.a k = gua.a.b;
   protected boolean l;
   protected ayw m;

   protected gti(avo $$0, avq $$1, ayw $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gti(akr $$0, avq $$1, ayw $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public akr a() {
      return this.c;
   }

   @Override
   public gvg a(gvf $$0) {
      if (this.c.equals(gvf.c)) {
         this.a = gvf.e;
         return gvf.d;
      } else {
         gvg $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gvf.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gtx b() {
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
   public gua.a k() {
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
