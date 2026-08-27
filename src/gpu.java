public abstract class gpu implements gqm {
   protected gqj a;
   protected final avd b;
   protected final akh c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gqm.a k = gqm.a.b;
   protected boolean l;
   protected ayg m;

   protected gpu(avb $$0, avd $$1, ayg $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gpu(akh $$0, avd $$1, ayg $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public akh a() {
      return this.c;
   }

   @Override
   public grr a(grq $$0) {
      if (this.c.equals(grq.b)) {
         this.a = grq.d;
         return grq.c;
      } else {
         grr $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = grq.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gqj b() {
      return this.a;
   }

   @Override
   public avd c() {
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
   public gqm.a k() {
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
