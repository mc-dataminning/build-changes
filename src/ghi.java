public abstract class ghi implements gia {
   protected ghx a;
   protected final art b;
   protected final ahg c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gia.a k = gia.a.b;
   protected boolean l;
   protected auv m;

   protected ghi(arr $$0, art $$1, auv $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected ghi(ahg $$0, art $$1, auv $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ahg a() {
      return this.c;
   }

   @Override
   public gjf a(gje $$0) {
      if (this.c.equals(gje.b)) {
         this.a = gje.d;
         return gje.c;
      } else {
         gjf $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gje.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public ghx b() {
      return this.a;
   }

   @Override
   public art c() {
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
   public gia.a k() {
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
