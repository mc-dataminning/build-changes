public class gus extends gsa<cnn, haf, gdz> {
   private static final alz a = alz.b("textures/entity/piglin/zombified_piglin.png");

   public gus(grj.a $$0, gef $$1, gef $$2, gef $$3, gef $$4, gef $$5, gef $$6) {
      super($$0, new gdz($$0.a($$1)), new gdz($$0.a($$2)), 0.5F, gsz.a);
      this.a(new gvn<>(this, new gbr($$0.a($$3)), new gbr($$0.a($$4)), new gbr($$0.a($$5)), new gbr($$0.a($$5)), $$0.h()));
   }

   public alz a(haf $$0) {
      return a;
   }

   public haf b() {
      return new haf();
   }

   public void a(cnn $$0, haf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gb();
   }
}
