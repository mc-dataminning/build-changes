public abstract class ghw implements gio {
   protected gil a;
   protected final aru b;
   protected final ahh c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gio.a k = gio.a.b;
   protected boolean l;
   protected auw m;

   protected ghw(ars $$0, aru $$1, auw $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected ghw(ahh $$0, aru $$1, auw $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ahh a() {
      return this.c;
   }

   @Override
   public gjt a(gjs $$0) {
      if (this.c.equals(gjs.b)) {
         this.a = gjs.d;
         return gjs.c;
      } else {
         gjt $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gjs.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gil b() {
      return this.a;
   }

   @Override
   public aru c() {
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
   public gio.a k() {
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
