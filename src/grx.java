public abstract class grx implements gsp {
   protected gsm a;
   protected final awb b;
   protected final alf c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gsp.a k = gsp.a.b;
   protected boolean l;
   protected azh m;

   protected grx(avz $$0, awb $$1, azh $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected grx(alf $$0, awb $$1, azh $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public alf a() {
      return this.c;
   }

   @Override
   public gty a(gtx $$0) {
      if (this.c.equals(gtx.b)) {
         this.a = gtx.d;
         return gtx.c;
      } else {
         gty $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gtx.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gsm b() {
      return this.a;
   }

   @Override
   public awb c() {
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
   public gsp.a k() {
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
