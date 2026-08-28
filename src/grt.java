public abstract class grt implements gsl {
   protected gsi a;
   protected final awa b;
   protected final ale c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gsl.a k = gsl.a.b;
   protected boolean l;
   protected azf m;

   protected grt(avy $$0, awa $$1, azf $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected grt(ale $$0, awa $$1, azf $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ale a() {
      return this.c;
   }

   @Override
   public gtu a(gtt $$0) {
      if (this.c.equals(gtt.b)) {
         this.a = gtt.d;
         return gtt.c;
      } else {
         gtu $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gtt.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gsi b() {
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
   public gsl.a k() {
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
