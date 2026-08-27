public abstract class gku implements glm {
   protected glj a;
   protected final atq b;
   protected final ajc c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected glm.a k = glm.a.b;
   protected boolean l;
   protected awt m;

   protected gku(ato $$0, atq $$1, awt $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gku(ajc $$0, atq $$1, awt $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ajc a() {
      return this.c;
   }

   @Override
   public gmr a(gmq $$0) {
      if (this.c.equals(gmq.b)) {
         this.a = gmq.d;
         return gmq.c;
      } else {
         gmr $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gmq.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public glj b() {
      return this.a;
   }

   @Override
   public atq c() {
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
   public glm.a k() {
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
