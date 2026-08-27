public abstract class gbb implements gbt {
   protected gbq a;
   protected final aox b;
   protected final aer c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gbt.a k = gbt.a.b;
   protected boolean l;
   protected aru m;

   protected gbb(aov $$0, aox $$1, aru $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gbb(aer $$0, aox $$1, aru $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public aer a() {
      return this.c;
   }

   @Override
   public gcy a(gcx $$0) {
      if (this.c.equals(gcx.b)) {
         this.a = gcx.d;
         return gcx.c;
      } else {
         gcy $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gcx.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gbq b() {
      return this.a;
   }

   @Override
   public aox c() {
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
   public gbt.a k() {
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
