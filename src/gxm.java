public class gxm extends gxa<coi, heb> {
   private static final ali a = ali.b("textures/entity/skeleton/bogged.png");
   private static final ali j = ali.b("textures/entity/skeleton/bogged_overlay.png");

   public gxm(gyi.a $$0) {
      super($$0, gld.G, gld.H, new ghe($$0.a(gld.F)));
      this.a(new hda<>(this, $$0.f(), gld.I, j));
   }

   public ali a(heb $$0) {
      return a;
   }

   public heb a() {
      return new heb();
   }

   public void a(coi $$0, heb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gv();
   }
}
