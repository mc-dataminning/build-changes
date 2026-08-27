public abstract class gtu implements gum {
   protected guj a;
   protected final avq b;
   protected final akt c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gum.a k = gum.a.b;
   protected boolean l;
   protected ayt m;

   protected gtu(avn $$0, avq $$1, ayt $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gtu(akt $$0, avq $$1, ayt $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public akt a() {
      return this.c;
   }

   @Override
   public gvr a(gvq $$0) {
      if (this.c.equals(gvq.b)) {
         this.a = gvq.d;
         return gvq.c;
      } else {
         gvr $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gvq.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public guj b() {
      return this.a;
   }

   @Override
   public avq c() {
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
   public gum.a k() {
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
