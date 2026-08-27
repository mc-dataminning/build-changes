public abstract class goe implements gow {
   protected got a;
   protected final aun b;
   protected final ajt c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gow.a k = gow.a.b;
   protected boolean l;
   protected axr m;

   protected goe(aul $$0, aun $$1, axr $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected goe(ajt $$0, aun $$1, axr $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ajt a() {
      return this.c;
   }

   @Override
   public gqb a(gqa $$0) {
      if (this.c.equals(gqa.b)) {
         this.a = gqa.d;
         return gqa.c;
      } else {
         gqb $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gqa.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public got b() {
      return this.a;
   }

   @Override
   public aun c() {
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
   public gow.a k() {
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
