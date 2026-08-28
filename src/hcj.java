public abstract class hcj implements hdb {
   protected hcy a;
   protected final awo b;
   protected final alj c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hdb.a k = hdb.a.b;
   protected boolean l;
   protected azu m;

   protected hcj(awm $$0, awo $$1, azu $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hcj(alj $$0, awo $$1, azu $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public alj a() {
      return this.c;
   }

   @Override
   public heh a(heg $$0) {
      if (this.c.equals(heg.c)) {
         this.a = heg.e;
         return heg.d;
      } else {
         heh $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = heg.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hcy b() {
      return this.a;
   }

   @Override
   public awo c() {
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
   public hdb.a k() {
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
