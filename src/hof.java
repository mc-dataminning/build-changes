public abstract class hof implements hox {
   protected hou a;
   protected final awq b;
   protected final ali c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hox.a k = hox.a.b;
   protected boolean l;
   protected azx m;

   protected hof(awo $$0, awq $$1, azx $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hof(ali $$0, awq $$1, azx $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ali a() {
      return this.c;
   }

   @Override
   public hqe a(hqd $$0) {
      if (this.c.equals(hqd.c)) {
         this.a = hqd.e;
         return hqd.d;
      } else {
         hqe $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hqd.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hou b() {
      return this.a;
   }

   @Override
   public awq c() {
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
   public hox.a k() {
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
