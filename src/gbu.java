public abstract class gbu implements gcm {
   protected gcj a;
   protected final apf b;
   protected final aex c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gcm.a k = gcm.a.b;
   protected boolean l;
   protected asc m;

   protected gbu(apd $$0, apf $$1, asc $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gbu(aex $$0, apf $$1, asc $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public aex a() {
      return this.c;
   }

   @Override
   public gdr a(gdq $$0) {
      if (this.c.equals(gdq.b)) {
         this.a = gdq.d;
         return gdq.c;
      } else {
         gdr $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gdq.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gcj b() {
      return this.a;
   }

   @Override
   public apf c() {
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
   public gcm.a k() {
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
