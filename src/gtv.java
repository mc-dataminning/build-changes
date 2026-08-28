public class gtv implements gtd<dzm> {
   private final gsz<dzm> a;
   private final gtg<dzm> b;

   public gtv(gte.a $$0) {
      this.a = new gsz<>($$0);
      this.b = new gtg<>($$0);
   }

   public void a(dzm $$0, float $$1, fkd $$2, gqr $$3, int $$4, int $$5, ffc $$6) {
      this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public boolean a(dzm $$0) {
      return this.a.a($$0) || this.b.a($$0);
   }

   @Override
   public int aR_() {
      return Math.max(this.a.aR_(), this.b.aR_());
   }

   public boolean a(dzm $$0, ffc $$1) {
      return this.a.a($$0, $$1) || this.b.a($$0, $$1);
   }
}
