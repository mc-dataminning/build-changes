public abstract class hjx implements hkp {
   protected hkm a;
   protected final awl b;
   protected final ald c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hkp.a k = hkp.a.b;
   protected boolean l;
   protected azs m;

   protected hjx(awj $$0, awl $$1, azs $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hjx(ald $$0, awl $$1, azs $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ald a() {
      return this.c;
   }

   @Override
   public hlw a(hlv $$0) {
      if (this.c.equals(hlv.c)) {
         this.a = hlv.e;
         return hlv.d;
      } else {
         hlw $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hlv.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hkm b() {
      return this.a;
   }

   @Override
   public awl c() {
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
   public hkp.a k() {
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
