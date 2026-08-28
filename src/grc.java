public class grc implements gqk<dxg> {
   private final gqg<dxg> a;
   private final gqn<dxg> b;

   public grc(gql.a $$0) {
      this.a = new gqg<>($$0);
      this.b = new gqn<>($$0);
   }

   public void a(dxg $$0, float $$1, fho $$2, gny $$3, int $$4, int $$5) {
      this.a.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public boolean a(dxg $$0) {
      return this.a.a($$0) || this.b.a($$0);
   }

   @Override
   public int aQ_() {
      return Math.max(this.a.aQ_(), this.b.aQ_());
   }

   public boolean a(dxg $$0, fcu $$1) {
      return this.a.a($$0, $$1) || this.b.a($$0, $$1);
   }
}
