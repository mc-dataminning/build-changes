public abstract class gtb implements gtt {
   protected gtq a;
   protected final avp b;
   protected final akq c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gtt.a k = gtt.a.b;
   protected boolean l;
   protected ayv m;

   protected gtb(avn $$0, avp $$1, ayv $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gtb(akq $$0, avp $$1, ayv $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public akq a() {
      return this.c;
   }

   @Override
   public guz a(guy $$0) {
      if (this.c.equals(guy.c)) {
         this.a = guy.e;
         return guy.d;
      } else {
         guz $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = guy.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gtq b() {
      return this.a;
   }

   @Override
   public avp c() {
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
   public gtt.a k() {
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
