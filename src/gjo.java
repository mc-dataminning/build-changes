public abstract class gjo implements gkg {
   protected gkd a;
   protected final atl b;
   protected final aiy c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gkg.a k = gkg.a.b;
   protected boolean l;
   protected awo m;

   protected gjo(atj $$0, atl $$1, awo $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gjo(aiy $$0, atl $$1, awo $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public aiy a() {
      return this.c;
   }

   @Override
   public gll a(glk $$0) {
      if (this.c.equals(glk.b)) {
         this.a = glk.d;
         return glk.c;
      } else {
         gll $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = glk.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gkd b() {
      return this.a;
   }

   @Override
   public atl c() {
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
   public gkg.a k() {
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
