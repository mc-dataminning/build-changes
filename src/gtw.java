public class gtw extends gqf<cnb, gzp, gdl> {
   private static final alp a = alp.b("textures/entity/strider/strider.png");
   private static final alp b = alp.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gtw(grl.a $$0) {
      super($$0, new gdl($$0.a(gei.dd)), new gdl($$0.a(gei.df)), 0.5F);
      this.a(new gwb<>(this, new gdl($$0.a(gei.de)), new gdl($$0.a(gei.dg)), alp.b("textures/entity/strider/strider_saddle.png")));
   }

   public alp a(gzp $$0) {
      return $$0.b ? b : a;
   }

   protected float b(gzp $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.5F : $$1;
   }

   public gzp b() {
      return new gzp();
   }

   public void a(cnb $$0, gzp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.p();
      $$1.c = $$0.ca();
   }

   protected boolean c(gzp $$0) {
      return super.a($$0) || $$0.b;
   }
}
