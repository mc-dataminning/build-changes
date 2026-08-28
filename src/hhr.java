public abstract class hhr implements hij {
   protected hig a;
   protected final awa b;
   protected final aku c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hij.a k = hij.a.b;
   protected boolean l;
   protected azg m;

   protected hhr(avy $$0, awa $$1, azg $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hhr(aku $$0, awa $$1, azg $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public aku a() {
      return this.c;
   }

   @Override
   public hjq a(hjp $$0) {
      if (this.c.equals(hjp.c)) {
         this.a = hjp.e;
         return hjp.d;
      } else {
         hjq $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hjp.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hig b() {
      return this.a;
   }

   @Override
   public awa c() {
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
   public hij.a k() {
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
