public abstract class hby implements hcq {
   protected hcn a;
   protected final awp b;
   protected final all c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hcq.a k = hcq.a.b;
   protected boolean l;
   protected azv m;

   protected hby(awn $$0, awp $$1, azv $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hby(all $$0, awp $$1, azv $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public all a() {
      return this.c;
   }

   @Override
   public hdw a(hdv $$0) {
      if (this.c.equals(hdv.c)) {
         this.a = hdv.e;
         return hdv.d;
      } else {
         hdw $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hdv.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hcn b() {
      return this.a;
   }

   @Override
   public awp c() {
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
   public hcq.a k() {
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
