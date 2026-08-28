public abstract class hbi implements hca {
   protected hbx a;
   protected final awm b;
   protected final ali c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hca.a k = hca.a.b;
   protected boolean l;
   protected azs m;

   protected hbi(awk $$0, awm $$1, azs $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hbi(ali $$0, awm $$1, azs $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ali a() {
      return this.c;
   }

   @Override
   public hdg a(hdf $$0) {
      if (this.c.equals(hdf.c)) {
         this.a = hdf.e;
         return hdf.d;
      } else {
         hdg $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hdf.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hbx b() {
      return this.a;
   }

   @Override
   public awm c() {
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
   public hca.a k() {
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
