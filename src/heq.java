public abstract class heq implements hfi {
   protected hff a;
   protected final axg b;
   protected final alz c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hfi.a k = hfi.a.b;
   protected boolean l;
   protected bam m;

   protected heq(axe $$0, axg $$1, bam $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected heq(alz $$0, axg $$1, bam $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public alz a() {
      return this.c;
   }

   @Override
   public hgo a(hgn $$0) {
      if (this.c.equals(hgn.c)) {
         this.a = hgn.e;
         return hgn.d;
      } else {
         hgo $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hgn.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hff b() {
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
   public hfi.a k() {
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
