public abstract class gbq implements gci {
   protected gcf a;
   protected final aph b;
   protected final aez c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gci.a k = gci.a.b;
   protected boolean l;
   protected ash m;

   protected gbq(apf $$0, aph $$1, ash $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gbq(aez $$0, aph $$1, ash $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public aez a() {
      return this.c;
   }

   @Override
   public gdn a(gdm $$0) {
      if (this.c.equals(gdm.b)) {
         this.a = gdm.d;
         return gdm.c;
      } else {
         gdn $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gdm.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gcf b() {
      return this.a;
   }

   @Override
   public aph c() {
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
   public gci.a k() {
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
