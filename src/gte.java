public class gte implements gsm<dza> {
   private final gsi<dza> a;
   private final gsp<dza> b;

   public gte(gsn.a $$0) {
      this.a = new gsi<>($$0);
      this.b = new gsp<>($$0);
   }

   public void a(dza $$0, float $$1, fjj $$2, gqa $$3, int $$4, int $$5, feq $$6) {
      this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public boolean a(dza $$0) {
      return this.a.a($$0) || this.b.a($$0);
   }

   @Override
   public int aR_() {
      return Math.max(this.a.aR_(), this.b.aR_());
   }

   public boolean a(dza $$0, feq $$1) {
      return this.a.a($$0, $$1) || this.b.a($$0, $$1);
   }
}
