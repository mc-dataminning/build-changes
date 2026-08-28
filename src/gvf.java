public class gvf implements gun<dzx> {
   private final guj<dzx> a;
   private final guq<dzx> b;

   public gvf(guo.a $$0) {
      this.a = new guj<>($$0);
      this.b = new guq<>($$0);
   }

   public void a(dzx $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public boolean a(dzx $$0) {
      return this.a.a($$0) || this.b.a($$0);
   }

   @Override
   public int aV_() {
      return Math.max(this.a.aV_(), this.b.aV_());
   }

   public boolean a(dzx $$0, ffq $$1) {
      return this.a.a($$0, $$1) || this.b.a($$0, $$1);
   }
}
