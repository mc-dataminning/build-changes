public class gvo extends grx<cnf, hbk, gfe> {
   private static final aku a = aku.b("textures/entity/strider/strider.png");
   private static final aku b = aku.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gvo(gtd.a $$0) {
      super($$0, new gfe($$0.a(ggb.df)), new gfe($$0.a(ggb.dh)), 0.5F);
      this.a(new gxt<>(this, new gfe($$0.a(ggb.dg)), new gfe($$0.a(ggb.di)), aku.b("textures/entity/strider/strider_saddle.png")));
   }

   public aku a(hbk $$0) {
      return $$0.b ? b : a;
   }

   protected float b(hbk $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hbk b() {
      return new hbk();
   }

   public void a(cnf $$0, hbk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.q();
      $$1.c = $$0.bZ();
   }

   protected boolean c(hbk $$0) {
      return super.a($$0) || $$0.b;
   }
}
