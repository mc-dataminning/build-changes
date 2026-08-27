public class zl implements wb<xu> {
   private final int a;
   private final cpy b;
   private final int c;
   private final int d;
   private final boolean e;
   private final boolean f;

   public zl(int $$0, cpy $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.a = $$0;
      this.b = $$1.b();
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public zl(tl $$0) {
      this.a = $$0.n();
      this.b = cpy.b($$0);
      this.c = $$0.n();
      this.d = $$0.n();
      this.e = $$0.readBoolean();
      this.f = $$0.readBoolean();
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      this.b.a($$0);
      $$0.c(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public cpy d() {
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
