public abstract class gpj implements gqb {
   protected gpy a;
   protected final ava b;
   protected final akf c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gqb.a k = gqb.a.b;
   protected boolean l;
   protected ayd m;

   protected gpj(auy $$0, ava $$1, ayd $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gpj(akf $$0, ava $$1, ayd $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public akf a() {
      return this.c;
   }

   @Override
   public grg a(grf $$0) {
      if (this.c.equals(grf.b)) {
         this.a = grf.d;
         return grf.c;
      } else {
         grg $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = grf.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gpy b() {
      return this.a;
   }

   @Override
   public ava c() {
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
   public gqb.a k() {
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
