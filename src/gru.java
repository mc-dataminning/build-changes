public abstract class gru implements gsm {
   protected gsj a;
   protected final awa b;
   protected final ale c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected gsm.a k = gsm.a.b;
   protected boolean l;
   protected azg m;

   protected gru(avy $$0, awa $$1, azg $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected gru(ale $$0, awa $$1, azg $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ale a() {
      return this.c;
   }

   @Override
   public gtv a(gtu $$0) {
      if (this.c.equals(gtu.b)) {
         this.a = gtu.d;
         return gtu.c;
      } else {
         gtv $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = gtu.a;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public gsj b() {
      return this.a;
   }

   @Override
   public awa c() {
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
   public gsm.a k() {
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
