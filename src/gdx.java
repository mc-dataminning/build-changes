public abstract class gdx implements gep {
   protected gem a;
   protected final aqo b;
   protected final agg c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gep.a k = gep.a.b;
   protected boolean l;
   protected ato m;

   protected gdx(aqm $$0, aqo $$1, ato $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gdx(agg $$0, aqo $$1, ato $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public agg a() {
      return this.c;
   }

   @Override
   public gfu a(gft $$0) {
      if (this.c.equals(gft.b)) {
         this.a = gft.d;
         return gft.c;
      } else {
         gfu $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gft.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gem b() {
      return this.a;
   }

   @Override
   public aqo c() {
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
   public gep.a k() {
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
