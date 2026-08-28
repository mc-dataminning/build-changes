public abstract class hle implements hlw {
   protected hlt a;
   protected final awm b;
   protected final ale c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hlw.a k = hlw.a.b;
   protected boolean l;
   protected azt m;

   protected hle(awk $$0, awm $$1, azt $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hle(ale $$0, awm $$1, azt $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ale a() {
      return this.c;
   }

   @Override
   public hnd a(hnc $$0) {
      if (this.c.equals(hnc.c)) {
         this.a = hnc.e;
         return hnc.d;
      } else {
         hnd $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hnc.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hlt b() {
      return this.a;
   }

   @Override
   public awm c() {
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
   public hlw.a k() {
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
