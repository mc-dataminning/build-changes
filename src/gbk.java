public abstract class gbk implements gcc {
   protected gbz a;
   protected final aox b;
   protected final aer c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gcc.a k = gcc.a.b;
   protected boolean l;
   protected aru m;

   protected gbk(aov $$0, aox $$1, aru $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gbk(aer $$0, aox $$1, aru $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public aer a() {
      return this.c;
   }

   @Override
   public gdh a(gdg $$0) {
      if (this.c.equals(gdg.b)) {
         this.a = gdg.d;
         return gdg.c;
      } else {
         gdh $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gdg.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gbz b() {
      return this.a;
   }

   @Override
   public aox c() {
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
   public gcc.a k() {
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
