public class wk implements uo<ur> {
   private final int a;
   private final cll b;
   private final int c;
   private final int d;
   private final boolean e;
   private final boolean f;

   public wk(int $$0, cll $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public wk(sf $$0) {
      this.a = $$0.m();
      this.b = cll.b($$0);
      this.c = $$0.m();
      this.d = $$0.m();
      this.e = $$0.readBoolean();
      this.f = $$0.readBoolean();
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      this.b.a($$0);
      $$0.d(this.c);
      $$0.d(this.d);
      $$0.writeBoolean(this.e);
      $$0.writeBoolean(this.f);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public cll c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }

   public boolean f() {
      return this.e;
   }

   public boolean g() {
      return this.f;
   }
}
