public class gup extends gsu<cnm, hae, gdz> {
   private static final alz a = alz.b("textures/entity/witch.png");

   public gup(gro.a $$0) {
      super($$0, new gdz($$0.a(gel.dt)), 0.5F);
      this.a(new gwp(this, $$0.b()));
   }

   public alz a(hae $$0) {
      return a;
   }

   public hae b() {
      return new hae();
   }

   public void a(cnm $$0, hae $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ar();
      $$1.b = !$$0.eX().f();
   }
}
