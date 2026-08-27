public abstract class gqr implements grj {
   protected grg a;
   protected final avi b;
   protected final akm c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected grj.a k = grj.a.b;
   protected boolean l;
   protected ayk m;

   protected gqr(avg $$0, avi $$1, ayk $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gqr(akm $$0, avi $$1, ayk $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public akm a() {
      return this.c;
   }

   @Override
   public gso a(gsn $$0) {
      if (this.c.equals(gsn.b)) {
         this.a = gsn.d;
         return gsn.c;
      } else {
         gso $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gsn.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public grg b() {
      return this.a;
   }

   @Override
   public avi c() {
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
   public grj.a k() {
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
