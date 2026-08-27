public abstract class gjw implements gko {
   protected gkl a;
   protected final atm b;
   protected final aiy c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gko.a k = gko.a.b;
   protected boolean l;
   protected awp m;

   protected gjw(atk $$0, atm $$1, awp $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gjw(aiy $$0, atm $$1, awp $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public aiy a() {
      return this.c;
   }

   @Override
   public glt a(gls $$0) {
      if (this.c.equals(gls.b)) {
         this.a = gls.d;
         return gls.c;
      } else {
         glt $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gls.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gkl b() {
      return this.a;
   }

   @Override
   public atm c() {
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
   public gko.a k() {
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
