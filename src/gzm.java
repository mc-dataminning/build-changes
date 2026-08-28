public abstract class gzm implements hae {
   protected hab a;
   protected final awe b;
   protected final alb c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hae.a k = hae.a.b;
   protected boolean l;
   protected azk m;

   protected gzm(awc $$0, awe $$1, azk $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gzm(alb $$0, awe $$1, azk $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public alb a() {
      return this.c;
   }

   @Override
   public hbk a(hbj $$0) {
      if (this.c.equals(hbj.c)) {
         this.a = hbj.e;
         return hbj.d;
      } else {
         hbk $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hbj.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hab b() {
      return this.a;
   }

   @Override
   public awe c() {
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
   public hae.a k() {
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
