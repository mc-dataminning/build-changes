public class grm<T extends bui & cph> extends goz<T, gxe> {
   private final gpy a;
   private final float b;
   private final boolean h;

   public grm(gpa.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.b = $$1;
      this.h = $$2;
   }

   public grm(gpa.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, jh $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(gxe $$0, fek $$1, gix $$2, int $$3) {
      $$1.a();
      $$1.b(this.b, this.b, this.b);
      $$1.a(this.e.b());
      if ($$0.a != null) {
         this.a.a($$0.b, cwd.h, false, $$1, $$2, $$3, gyk.d, $$0.a);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gxe a() {
      return new gxe();
   }

   public void a(T $$0, gxe $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cwf $$3 = $$0.m();
      $$1.a = !$$3.f() ? this.a.a($$3, $$0.dY(), null, $$0.as()) : null;
      $$1.b = $$3.v();
   }
}
