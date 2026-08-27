public abstract class ghg implements ghy {
   protected ghv a;
   protected final ars b;
   protected final ahg c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected ghy.a k = ghy.a.b;
   protected boolean l;
   protected auu m;

   protected ghg(arq $$0, ars $$1, auu $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected ghg(ahg $$0, ars $$1, auu $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ahg a() {
      return this.c;
   }

   @Override
   public gjd a(gjc $$0) {
      if (this.c.equals(gjc.b)) {
         this.a = gjc.d;
         return gjc.c;
      } else {
         gjd $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gjc.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public ghv b() {
      return this.a;
   }

   @Override
   public ars c() {
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
   public ghy.a k() {
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
