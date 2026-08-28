public abstract class hmw implements hno {
   protected hnl a;
   protected final awo b;
   protected final alg c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hno.a k = hno.a.b;
   protected boolean l;
   protected azv m;

   protected hmw(awm $$0, awo $$1, azv $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected hmw(alg $$0, awo $$1, azv $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public alg a() {
      return this.c;
   }

   @Override
   public hov a(hou $$0) {
      if (this.c.equals(hou.c)) {
         this.a = hou.e;
         return hou.d;
      } else {
         hov $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hou.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Override
   public hnl b() {
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
   public hno.a k() {
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
