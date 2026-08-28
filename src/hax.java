public abstract class hax implements hbp {
   protected hbm a;
   protected final awl b;
   protected final alh c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hbp.a k = hbp.a.b;
   protected boolean l;
   protected azr m;

   protected hax(awj $$0, awl $$1, azr $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hax(alh $$0, awl $$1, azr $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public alh a() {
      return this.c;
   }

   @Override
   public hcv a(hcu $$0) {
      if (this.c.equals(hcu.c)) {
         this.a = hcu.e;
         return hcu.d;
      } else {
         hcv $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hcu.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hbm b() {
      return this.a;
   }

   @Override
   public awl c() {
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
   public hbp.a k() {
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
