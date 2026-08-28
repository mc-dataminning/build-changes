public class gud<T extends bvk & cqn> extends grp<T, gzw> {
   private final gso a;
   private final float b;
   private final boolean h;

   public gud(grq.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.b = $$1;
      this.h = $$2;
   }

   public gud(grq.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, jh $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(gzw $$0, fgs $$1, gll $$2, int $$3) {
      $$1.a();
      $$1.b(this.b, this.b, this.b);
      $$1.a(this.e.b());
      if ($$0.a != null) {
         this.a.a($$0.b, cxn.h, false, $$1, $$2, $$3, hbc.d, $$0.a);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzw a() {
      return new gzw();
   }

   public void a(T $$0, gzw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cxp $$3 = $$0.l();
      $$1.a = !$$3.f() ? this.a.a($$3, $$0.dW(), null, $$0.ar()) : null;
      $$1.b = $$3.v();
   }
}
