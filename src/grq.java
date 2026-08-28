public abstract class grq implements gsi {
   protected gsf a;
   protected final avx b;
   protected final alb c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gsi.a k = gsi.a.b;
   protected boolean l;
   protected azc m;

   protected grq(avv $$0, avx $$1, azc $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected grq(alb $$0, avx $$1, azc $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public alb a() {
      return this.c;
   }

   @Override
   public gtr a(gtq $$0) {
      if (this.c.equals(gtq.b)) {
         this.a = gtq.d;
         return gtq.c;
      } else {
         gtr $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gtq.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gsf b() {
      return this.a;
   }

   @Override
   public avx c() {
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
   public gsi.a k() {
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
