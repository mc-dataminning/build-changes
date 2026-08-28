public abstract class hmp implements hnh {
   protected hne a;
   protected final awo b;
   protected final alg c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hnh.a k = hnh.a.b;
   protected boolean l;
   protected azv m;

   protected hmp(awm $$0, awo $$1, azv $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hmp(alg $$0, awo $$1, azv $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public alg a() {
      return this.c;
   }

   @Override
   public hoo a(hon $$0) {
      if (this.c.equals(hon.c)) {
         this.a = hon.e;
         return hon.d;
      } else {
         hoo $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hon.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hne b() {
      return this.a;
   }

   @Override
   public awo c() {
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
   public hnh.a k() {
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
