public abstract class gep implements gfh {
   protected gfe a;
   protected final aqw b;
   protected final agm c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gfh.a k = gfh.a.b;
   protected boolean l;
   protected atw m;

   protected gep(aqu $$0, aqw $$1, atw $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gep(agm $$0, aqw $$1, atw $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public agm a() {
      return this.c;
   }

   @Override
   public ggm a(ggl $$0) {
      if (this.c.equals(ggl.b)) {
         this.a = ggl.d;
         return ggl.c;
      } else {
         ggm $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = ggl.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gfe b() {
      return this.a;
   }

   @Override
   public aqw c() {
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
   public gfh.a k() {
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
