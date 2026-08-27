public class zs implements wo<yh> {
   private final int a;
   private final hx b;
   private final int c;
   private final boolean d;

   public zs(int $$0, hx $$1, int $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.d = $$3;
   }

   public zs(ty $$0) {
      this.a = $$0.readInt();
      this.b = $$0.e();
      this.c = $$0.readInt();
      this.d = $$0.readBoolean();
   }

   @Override
   public void a(ty $$0) {
      $$0.p(this.a);
      $$0.a(this.b);
      $$0.p(this.c);
      $$0.a(this.d);
   }

   public void a(yh $$0) {
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

   public hx f() {
      return this.b;
   }
}
