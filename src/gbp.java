public abstract class gbp implements gch {
   protected gce a;
   protected final apa b;
   protected final aeu c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gch.a k = gch.a.b;
   protected boolean l;
   protected arx m;

   protected gbp(aoy $$0, apa $$1, arx $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gbp(aeu $$0, apa $$1, arx $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public aeu a() {
      return this.c;
   }

   @Override
   public gdm a(gdl $$0) {
      if (this.c.equals(gdl.b)) {
         this.a = gdl.d;
         return gdl.c;
      } else {
         gdm $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gdl.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gce b() {
      return this.a;
   }

   @Override
   public apa c() {
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
   public gch.a k() {
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
