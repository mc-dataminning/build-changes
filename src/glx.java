public abstract class glx implements gmp {
   protected gmm a;
   protected final atz b;
   protected final ajh c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gmp.a k = gmp.a.b;
   protected boolean l;
   protected axd m;

   protected glx(atx $$0, atz $$1, axd $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected glx(ajh $$0, atz $$1, axd $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ajh a() {
      return this.c;
   }

   @Override
   public gnu a(gnt $$0) {
      if (this.c.equals(gnt.b)) {
         this.a = gnt.d;
         return gnt.c;
      } else {
         gnu $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gnt.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gmm b() {
      return this.a;
   }

   @Override
   public atz c() {
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
   public gmp.a k() {
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
