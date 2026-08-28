public class gqa<T extends btr & coo> extends gnn<T, gvr> {
   private final gom a;
   private final float b;
   private final boolean h;

   public gqa(gno.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.b = $$1;
      this.h = $$2;
   }

   public gqa(gno.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, jf $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(gvr $$0, fdi $$1, ghl $$2, int $$3) {
      $$1.a();
      $$1.b(this.b, this.b, this.b);
      $$1.a(this.e.b());
      if ($$0.a != null) {
         this.a.a($$0.b, cvp.h, false, $$1, $$2, $$3, gwx.d, $$0.a);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gvr a() {
      return new gvr();
   }

   public void a(T $$0, gvr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cvs $$3 = $$0.m();
      $$1.a = !$$3.f() ? this.a.a($$3, $$0.dS(), null, $$0.ap()) : null;
      $$1.b = $$3.u();
   }
}
