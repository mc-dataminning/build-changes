public abstract class gge implements ggw {
   protected ggt a;
   protected final ard b;
   protected final agt c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected ggw.a k = ggw.a.b;
   protected boolean l;
   protected auf m;

   protected gge(arb $$0, ard $$1, auf $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gge(agt $$0, ard $$1, auf $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public agt a() {
      return this.c;
   }

   @Override
   public gib a(gia $$0) {
      if (this.c.equals(gia.b)) {
         this.a = gia.d;
         return gia.c;
      } else {
         gib $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gia.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public ggt b() {
      return this.a;
   }

   @Override
   public ard c() {
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
   public ggw.a k() {
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
