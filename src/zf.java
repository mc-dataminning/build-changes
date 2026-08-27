public class zf implements wb<xu> {
   private final int a;
   private final ht b;
   private final int c;
   private final boolean d;

   public zf(int $$0, ht $$1, int $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.d = $$3;
   }

   public zf(tl $$0) {
      this.a = $$0.readInt();
      this.b = $$0.e();
      this.c = $$0.readInt();
      this.d = $$0.readBoolean();
   }

   @Override
   public void a(tl $$0) {
      $$0.p(this.a);
      $$0.a(this.b);
      $$0.p(this.c);
      $$0.a(this.d);
   }

   public void a(xu $$0) {
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

   public ht f() {
      return this.b;
   }
}
