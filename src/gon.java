public abstract class gon implements gpf {
   protected gpc a;
   protected final aup b;
   protected final ajv c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gpf.a k = gpf.a.b;
   protected boolean l;
   protected axt m;

   protected gon(aun $$0, aup $$1, axt $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gon(ajv $$0, aup $$1, axt $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ajv a() {
      return this.c;
   }

   @Override
   public gqk a(gqj $$0) {
      if (this.c.equals(gqj.b)) {
         this.a = gqj.d;
         return gqj.c;
      } else {
         gqk $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gqj.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gpc b() {
      return this.a;
   }

   @Override
   public aup c() {
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
   public gpf.a k() {
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
