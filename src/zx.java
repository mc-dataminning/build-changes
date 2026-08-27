public class zx implements ux<wp> {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private final String d;
   private final tf e;
   private final eig.a f;
   private final int g;

   public zx(eia $$0, int $$1) {
      this.d = $$0.b();
      this.e = $$0.d();
      this.f = $$0.f();
      this.g = $$1;
   }

   public zx(si $$0) {
      this.d = $$0.r();
      this.g = $$0.readByte();
      if (this.g != 0 && this.g != 2) {
         this.e = te.a;
         this.f = eig.a.a;
      } else {
         this.e = $$0.l();
         this.f = $$0.b(eig.a.class);
      }
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.d);
      $$0.k(this.g);
      if (this.g == 0 || this.g == 2) {
         $$0.a(this.e);
         $$0.a(this.f);
      }
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.d;
   }

   public tf d() {
      return this.e;
   }

   public int e() {
      return this.g;
   }

   public eig.a f() {
      return this.f;
   }
}
