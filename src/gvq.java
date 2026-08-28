public class gvq<T extends bva & cqh> extends gtc<T, hbm> {
   private final hcl a;
   private final float b;
   private final boolean h;

   public gvq(gtd.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.b = $$1;
      this.h = $$2;
   }

   public gvq(gtd.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, ji $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(hbm $$0, fgr $$1, gmx $$2, int $$3) {
      $$1.a();
      $$1.b(this.b, this.b, this.b);
      $$1.a(this.e.b());
      $$0.a.a($$1, $$2, $$3, hfh.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hbm a() {
      return new hbm();
   }

   public void a(T $$0, hbm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      this.a.a($$1.a, $$0.f(), cxf.h, $$0);
   }
}
