public class gvh implements gup<dzz> {
   private final gul<dzz> a;
   private final gus<dzz> b;

   public gvh(guq.a $$0) {
      this.a = new gul<>($$0);
      this.b = new gus<>($$0);
   }

   public void a(dzz $$0, float $$1, flq $$2, gsc $$3, int $$4, int $$5, ffs $$6) {
      this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public boolean a(dzz $$0) {
      return this.a.a($$0) || this.b.a($$0);
   }

   @Override
   public int aV_() {
      return Math.max(this.a.aV_(), this.b.aV_());
   }

   public boolean a(dzz $$0, ffs $$1) {
      return this.a.a($$0, $$1) || this.b.a($$0, $$1);
   }
}
