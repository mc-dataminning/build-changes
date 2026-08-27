public class yp implements vf<wy> {
   private final int a;
   private final cow b;
   private final int c;
   private final int d;
   private final boolean e;
   private final boolean f;

   public yp(int $$0, cow $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.a = $$0;
      this.b = $$1.b();
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public yp(sq $$0) {
      this.a = $$0.m();
      this.b = cow.b($$0);
      this.c = $$0.m();
      this.d = $$0.m();
      this.e = $$0.readBoolean();
      this.f = $$0.readBoolean();
   }

   @Override
   public void a(sq $$0) {
      $$0.c(this.a);
      this.b.a($$0);
      $$0.c(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public cow d() {
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
