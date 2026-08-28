public class guk extends gsp<cni, gzz, gdu> {
   private static final alz a = alz.b("textures/entity/witch.png");

   public guk(grj.a $$0) {
      super($$0, new gdu($$0.a(geg.dt)), 0.5F);
      this.a(new gwk(this, $$0.b()));
   }

   public alz a(gzz $$0) {
      return a;
   }

   public gzz b() {
      return new gzz();
   }

   public void a(cni $$0, gzz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ar();
      $$1.b = !$$0.eX().f();
   }
}
