public class yj implements vf<wy> {
   private final int a;
   private final gw b;
   private final int c;
   private final boolean d;

   public yj(int $$0, gw $$1, int $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.d = $$3;
   }

   public yj(sq $$0) {
      this.a = $$0.readInt();
      this.b = $$0.e();
      this.c = $$0.readInt();
      this.d = $$0.readBoolean();
   }

   @Override
   public void a(sq $$0) {
      $$0.p(this.a);
      $$0.a(this.b);
      $$0.p(this.c);
      $$0.a(this.d);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.d;
   }

   public int d() {
      return this.a;
   }

   public int e() {
      return this.c;
   }

   public gw f() {
      return this.b;
   }
}
