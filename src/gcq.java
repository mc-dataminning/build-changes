public abstract class gcq implements gdi {
   protected gdf a;
   protected final aqe b;
   protected final afw c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gdi.a k = gdi.a.b;
   protected boolean l;
   protected ate m;

   protected gcq(aqc $$0, aqe $$1, ate $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gcq(afw $$0, aqe $$1, ate $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public afw a() {
      return this.c;
   }

   @Override
   public gen a(gem $$0) {
      if (this.c.equals(gem.b)) {
         this.a = gem.d;
         return gem.c;
      } else {
         gen $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gem.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gdf b() {
      return this.a;
   }

   @Override
   public aqe c() {
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
   public gdi.a k() {
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
