public abstract class hai implements hba {
   protected hax a;
   protected final awh b;
   protected final ale c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hba.a k = hba.a.b;
   protected boolean l;
   protected azn m;

   protected hai(awf $$0, awh $$1, azn $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hai(ale $$0, awh $$1, azn $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ale a() {
      return this.c;
   }

   @Override
   public hcg a(hcf $$0) {
      if (this.c.equals(hcf.c)) {
         this.a = hcf.e;
         return hcf.d;
      } else {
         hcg $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hcf.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hax b() {
      return this.a;
   }

   @Override
   public awh c() {
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
   public hba.a k() {
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
