public class gtq implements gsy<dzh> {
   private final gsu<dzh> a;
   private final gtb<dzh> b;

   public gtq(gsz.a $$0) {
      this.a = new gsu<>($$0);
      this.b = new gtb<>($$0);
   }

   public void a(dzh $$0, float $$1, fjy $$2, gqm $$3, int $$4, int $$5, fex $$6) {
      this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public boolean a(dzh $$0) {
      return this.a.a($$0) || this.b.a($$0);
   }

   @Override
   public int aR_() {
      return Math.max(this.a.aR_(), this.b.aR_());
   }

   public boolean a(dzh $$0, fex $$1) {
      return this.a.a($$0, $$1) || this.b.a($$0, $$1);
   }
}
