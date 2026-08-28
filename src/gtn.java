public class gtn extends guj<cmm, gzu, gdf> {
   private static final aku a = aku.b("textures/entity/ghast/ghast.png");
   private static final aku b = aku.b("textures/entity/ghast/ghast_shooting.png");

   public gtn(gtd.a $$0) {
      super($$0, new gdf($$0.a(ggb.aT)), 1.5F);
   }

   public aku a(gzu $$0) {
      return $$0.a ? b : a;
   }

   public gzu b() {
      return new gzu();
   }

   public void a(cmm $$0, gzu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}
