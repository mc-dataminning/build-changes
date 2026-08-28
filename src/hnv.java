public abstract class hnv implements hon {
   protected hok a;
   protected final awz b;
   protected final alr c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hon.a k = hon.a.b;
   protected boolean l;
   protected bai m;

   protected hnv(awx $$0, awz $$1, bai $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hnv(alr $$0, awz $$1, bai $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public alr a() {
      return this.c;
   }

   @Override
   public hpu a(hpt $$0) {
      if (this.c.equals(hpt.c)) {
         this.a = hpt.e;
         return hpt.d;
      } else {
         hpu $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hpt.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hok b() {
      return this.a;
   }

   @Override
   public awz c() {
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
   public hon.a k() {
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
