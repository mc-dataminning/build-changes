public class gtc extends gsp<cil, gzb, gbf<gxo>> {
   private static final alz a = alz.b("textures/entity/fish/pufferfish.png");
   private final gbf<gxo> b;
   private final gbf<gxo> k;
   private final gbf<gxo> l = this.c();

   public gtc(grj.a $$0) {
      super($$0, new gcm($$0.a(geg.cn)), 0.2F);
      this.k = new gcn($$0.a(geg.co));
      this.b = new gco($$0.a(geg.cp));
   }

   public alz a(gzb $$0) {
      return a;
   }

   public gzb b() {
      return new gzb();
   }

   public void a(gzb $$0, fgl $$1, gle $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      this.f = 0.1F + 0.1F * (float)$$0.a;
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cil $$0, gzb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gn();
   }

   protected void a(gzb $$0, fgl $$1, float $$2, float $$3) {
      $$1.a(0.0F, bae.b($$0.p * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
