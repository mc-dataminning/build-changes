public class xl implements uw<wo> {
   public static final int a = -1;
   public static final int b = -2;
   private final int c;
   private final int d;
   private final int e;
   private final ciw f;

   public xl(int $$0, int $$1, int $$2, ciw $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3.p();
   }

   public xl(sh $$0) {
      this.c = $$0.readByte();
      this.d = $$0.m();
      this.e = $$0.readShort();
      this.f = $$0.q();
   }

   @Override
   public void a(sh $$0) {
      $$0.k(this.c);
      $$0.c(this.d);
      $$0.l(this.e);
      $$0.a(this.f);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.c;
   }

   public int d() {
      return this.e;
   }

   public ciw e() {
      return this.f;
   }

   public int f() {
      return this.d;
   }
}
