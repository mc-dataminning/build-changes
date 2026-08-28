public class gur extends gsw<cnn, hag, geb> {
   private static final alz a = alz.b("textures/entity/witch.png");

   public gur(grq.a $$0) {
      super($$0, new geb($$0.a(gen.dt)), 0.5F);
      this.a(new gwr(this, $$0.b()));
   }

   public alz a(hag $$0) {
      return a;
   }

   public hag b() {
      return new hag();
   }

   public void a(cnn $$0, hag $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ar();
      $$1.b = !$$0.eZ().f();
   }
}
