public abstract class had implements hav {
   protected has a;
   protected final awf b;
   protected final alc c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hav.a k = hav.a.b;
   protected boolean l;
   protected azl m;

   protected had(awd $$0, awf $$1, azl $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected had(alc $$0, awf $$1, azl $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public alc a() {
      return this.c;
   }

   @Override
   public hcb a(hca $$0) {
      if (this.c.equals(hca.c)) {
         this.a = hca.e;
         return hca.d;
      } else {
         hcb $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hca.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public has b() {
      return this.a;
   }

   @Override
   public awf c() {
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
   public hav.a k() {
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
