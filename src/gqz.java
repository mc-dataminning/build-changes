public class gqz extends gpf<cmc, gwn, gao> {
   private static final alh a = alh.b("textures/entity/witch.png");

   public gqz(gnz.a $$0) {
      super($$0, new gao($$0.a(gba.cY)), 0.5F);
      this.a(new gsz(this, $$0.b()));
   }

   public alh a(gwn $$0) {
      return a;
   }

   public gwn c() {
      return new gwn();
   }

   public void a(cmc $$0, gwn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ar();
      $$1.b = !$$0.fb().f();
   }
}
