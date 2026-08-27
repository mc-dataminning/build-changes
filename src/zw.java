public class zw implements xf<za> {
   public static final int a = -1;
   public static final int b = -2;
   private final int c;
   private final int d;
   private final int e;
   private final cmy f;

   public zw(int $$0, int $$1, int $$2, cmy $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3.p();
   }

   public zw(ui $$0) {
      this.c = $$0.readByte();
      this.d = $$0.n();
      this.e = $$0.readShort();
      this.f = $$0.r();
   }

   @Override
   public void a(ui $$0) {
      $$0.k(this.c);
      $$0.c(this.d);
      $$0.l(this.e);
      $$0.a(this.f);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.c;
   }

   public int d() {
      return this.e;
   }

   public cmy e() {
      return this.f;
   }

   public int f() {
      return this.d;
   }
}
