public class gsy extends gqd<cij, gyx, gcf> {
   private static final alz a = alz.b("textures/entity/pig/pig.png");

   public gsy(grj.a $$0) {
      super($$0, new gcf($$0.a(geg.bM)), new gcf($$0.a(geg.bX)), 0.7F);
      this.a(new gvz<>(this, new gcf($$0.a(geg.bZ)), new gcf($$0.a(geg.bY)), alz.b("textures/entity/pig/pig_saddle.png")));
   }

   public alz a(gyx $$0) {
      return a;
   }

   public gyx b() {
      return new gyx();
   }

   public void a(cij $$0, gyx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}
