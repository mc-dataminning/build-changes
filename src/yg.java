public class yg implements uw<wo> {
   private final int a;
   private final coi b;
   private final int c;
   private final int d;
   private final boolean e;
   private final boolean f;

   public yg(int $$0, coi $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public yg(sh $$0) {
      this.a = $$0.m();
      this.b = coi.b($$0);
      this.c = $$0.m();
      this.d = $$0.m();
      this.e = $$0.readBoolean();
      this.f = $$0.readBoolean();
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      this.b.a($$0);
      $$0.c(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public coi d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public boolean g() {
      return this.e;
   }

   public boolean h() {
      return this.f;
   }
}
