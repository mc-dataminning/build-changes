public class guz extends gsh<cns, ham, geg> {
   private static final alz a = alz.b("textures/entity/piglin/zombified_piglin.png");

   public guz(grq.a $$0, gem $$1, gem $$2, gem $$3, gem $$4, gem $$5, gem $$6) {
      super($$0, new geg($$0.a($$1)), new geg($$0.a($$2)), 0.5F, gtg.a);
      this.a(new gvu<>(this, new gby($$0.a($$3)), new gby($$0.a($$4)), new gby($$0.a($$5)), new gby($$0.a($$5)), $$0.h()));
   }

   public alz a(ham $$0) {
      return a;
   }

   public ham b() {
      return new ham();
   }

   public void a(cns $$0, ham $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gd();
   }
}
