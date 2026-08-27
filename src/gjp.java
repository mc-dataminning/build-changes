public abstract class gjp implements gkh {
   protected gke a;
   protected final atl b;
   protected final aiy c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gkh.a k = gkh.a.b;
   protected boolean l;
   protected awo m;

   protected gjp(atj $$0, atl $$1, awo $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gjp(aiy $$0, atl $$1, awo $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public aiy a() {
      return this.c;
   }

   @Override
   public glm a(gll $$0) {
      if (this.c.equals(gll.b)) {
         this.a = gll.d;
         return gll.c;
      } else {
         glm $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gll.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gke b() {
      return this.a;
   }

   @Override
   public atl c() {
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
   public gkh.a k() {
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
