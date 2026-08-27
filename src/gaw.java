public abstract class gaw implements gbo {
   protected gbl a;
   protected final aov b;
   protected final aep c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gbo.a k = gbo.a.b;
   protected boolean l;
   protected art m;

   protected gaw(aot $$0, aov $$1, art $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gaw(aep $$0, aov $$1, art $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public aep a() {
      return this.c;
   }

   @Override
   public gct a(gcs $$0) {
      if (this.c.equals(gcs.b)) {
         this.a = gcs.d;
         return gcs.c;
      } else {
         gct $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gcs.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gbl b() {
      return this.a;
   }

   @Override
   public aov c() {
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
   public gbo.a k() {
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
