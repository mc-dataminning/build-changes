public abstract class hej implements hfb {
   protected hey a;
   protected final axg b;
   protected final alz c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hfb.a k = hfb.a.b;
   protected boolean l;
   protected bam m;

   protected hej(axe $$0, axg $$1, bam $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hej(alz $$0, axg $$1, bam $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public alz a() {
      return this.c;
   }

   @Override
   public hgh a(hgg $$0) {
      if (this.c.equals(hgg.c)) {
         this.a = hgg.e;
         return hgg.d;
      } else {
         hgh $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hgg.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hey b() {
      return this.a;
   }

   @Override
   public axg c() {
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
   public hfb.a k() {
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
