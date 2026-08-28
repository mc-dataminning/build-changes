public class gtw<T extends bvf & cqi> extends gri<T, gzp> {
   private final gsh a;
   private final float b;
   private final boolean h;

   public gtw(grj.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.b = $$1;
      this.h = $$2;
   }

   public gtw(grj.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, jh $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(gzp $$0, fgl $$1, gle $$2, int $$3) {
      $$1.a();
      $$1.b(this.b, this.b, this.b);
      $$1.a(this.e.b());
      if ($$0.a != null) {
         this.a.a($$0.b, cxi.h, false, $$1, $$2, $$3, hav.d, $$0.a);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzp a() {
      return new gzp();
   }

   public void a(T $$0, gzp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cxk $$3 = $$0.l();
      $$1.a = !$$3.f() ? this.a.a($$3, $$0.dV(), null, $$0.ar()) : null;
      $$1.b = $$3.v();
   }
}
