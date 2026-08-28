public abstract class hel implements hfd {
   protected hfa a;
   protected final aww b;
   protected final alp c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hfd.a k = hfd.a.b;
   protected boolean l;
   protected bac m;

   protected hel(awu $$0, aww $$1, bac $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hel(alp $$0, aww $$1, bac $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public alp a() {
      return this.c;
   }

   @Override
   public hgk a(hgj $$0) {
      if (this.c.equals(hgj.c)) {
         this.a = hgj.e;
         return hgj.d;
      } else {
         hgk $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hgj.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hfa b() {
      return this.a;
   }

   @Override
   public aww c() {
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
   public hfd.a k() {
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
