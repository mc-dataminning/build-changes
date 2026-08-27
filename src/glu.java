public abstract class glu implements gmm {
   protected gmj a;
   protected final atz b;
   protected final ajh c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gmm.a k = gmm.a.b;
   protected boolean l;
   protected axd m;

   protected glu(atx $$0, atz $$1, axd $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected glu(ajh $$0, atz $$1, axd $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ajh a() {
      return this.c;
   }

   @Override
   public gnr a(gnq $$0) {
      if (this.c.equals(gnq.b)) {
         this.a = gnq.d;
         return gnq.c;
      } else {
         gnr $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gnq.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gmj b() {
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
   public gmm.a k() {
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
