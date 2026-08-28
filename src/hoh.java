public abstract class hoh implements hoz {
   protected how a;
   protected final aws b;
   protected final alk c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hoz.a k = hoz.a.b;
   protected boolean l;
   protected azz m;

   protected hoh(awq $$0, aws $$1, azz $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hoh(alk $$0, aws $$1, azz $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public alk a() {
      return this.c;
   }

   @Override
   public hqg a(hqf $$0) {
      if (this.c.equals(hqf.c)) {
         this.a = hqf.e;
         return hqf.d;
      } else {
         hqg $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hqf.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public how b() {
      return this.a;
   }

   @Override
   public aws c() {
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
   public hoz.a k() {
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
