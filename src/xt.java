public class xt implements ve<wx> {
   public static final int a = -1;
   public static final int b = -2;
   private final int c;
   private final int d;
   private final int e;
   private final cjf f;

   public xt(int $$0, int $$1, int $$2, cjf $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3.p();
   }

   public xt(sp $$0) {
      this.c = $$0.readByte();
      this.d = $$0.m();
      this.e = $$0.readShort();
      this.f = $$0.q();
   }

   @Override
   public void a(sp $$0) {
      $$0.k(this.c);
      $$0.c(this.d);
      $$0.l(this.e);
      $$0.a(this.f);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.c;
   }

   public int d() {
      return this.e;
   }

   public cjf e() {
      return this.f;
   }

   public int f() {
      return this.d;
   }
}
