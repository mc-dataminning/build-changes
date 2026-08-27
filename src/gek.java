public abstract class gek implements gfc {
   protected gez a;
   protected final aqs b;
   protected final agi c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gfc.a k = gfc.a.b;
   protected boolean l;
   protected ats m;

   protected gek(aqq $$0, aqs $$1, ats $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gek(agi $$0, aqs $$1, ats $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public agi a() {
      return this.c;
   }

   @Override
   public ggh a(ggg $$0) {
      if (this.c.equals(ggg.b)) {
         this.a = ggg.d;
         return ggg.c;
      } else {
         ggh $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = ggg.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gez b() {
      return this.a;
   }

   @Override
   public aqs c() {
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
   public gfc.a k() {
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
