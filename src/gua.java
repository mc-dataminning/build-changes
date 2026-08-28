public class gua extends gsv<cnj, gzt, gdp> {
   private static final alz a = alz.b("textures/entity/strider/strider.png");
   private static final alz b = alz.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gua(grp.a $$0) {
      super($$0, new gdp($$0.a(gem.da)), 0.5F);
      this.a(new gwf<>(this, new gdp($$0.a(gem.db)), alz.b("textures/entity/strider/strider_saddle.png")));
   }

   public alz a(gzt $$0) {
      return $$0.b ? b : a;
   }

   protected float b(gzt $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gzt b() {
      return new gzt();
   }

   public void a(cnj $$0, gzt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.p();
      $$1.c = $$0.ca();
   }

   protected void a(gzt $$0, fgr $$1) {
      float $$2 = $$0.ab;
      $$1.b($$2, $$2, $$2);
   }

   protected boolean c(gzt $$0) {
      return super.a($$0) || $$0.b;
   }
}
