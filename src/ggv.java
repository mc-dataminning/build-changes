public abstract class ggv implements ghn {
   protected ghk a;
   protected final arn b;
   protected final ahd c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected ghn.a k = ghn.a.b;
   protected boolean l;
   protected aup m;

   protected ggv(arl $$0, arn $$1, aup $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected ggv(ahd $$0, arn $$1, aup $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ahd a() {
      return this.c;
   }

   @Override
   public gis a(gir $$0) {
      if (this.c.equals(gir.b)) {
         this.a = gir.d;
         return gir.c;
      } else {
         gis $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gir.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public ghk b() {
      return this.a;
   }

   @Override
   public arn c() {
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
   public ghn.a k() {
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
