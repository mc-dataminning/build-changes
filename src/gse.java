public abstract class gse implements gsw {
   protected gst a;
   protected final avg b;
   protected final akk c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gsw.a k = gsw.a.b;
   protected boolean l;
   protected aym m;

   protected gse(ave $$0, avg $$1, aym $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gse(akk $$0, avg $$1, aym $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public akk a() {
      return this.c;
   }

   @Override
   public guc a(gub $$0) {
      if (this.c.equals(gub.b)) {
         this.a = gub.d;
         return gub.c;
      } else {
         guc $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gub.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gst b() {
      return this.a;
   }

   @Override
   public avg c() {
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
   public gsw.a k() {
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
