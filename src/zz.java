public class zz implements wu<yo> {
   private final int a;
   private final hv b;
   private final int c;
   private final boolean d;

   public zz(int $$0, hv $$1, int $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.d = $$3;
   }

   public zz(ue $$0) {
      this.a = $$0.readInt();
      this.b = $$0.e();
      this.c = $$0.readInt();
      this.d = $$0.readBoolean();
   }

   @Override
   public void a(ue $$0) {
      $$0.p(this.a);
      $$0.a(this.b);
      $$0.p(this.c);
      $$0.a(this.d);
   }

   public void a(yo $$0) {
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

   public hv f() {
      return this.b;
   }
}
