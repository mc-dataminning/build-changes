public class gti extends gsv<cip, gzh, gbl<gxu>> {
   private static final alz a = alz.b("textures/entity/fish/pufferfish.png");
   private final gbl<gxu> b;
   private final gbl<gxu> k;
   private final gbl<gxu> l = this.c();

   public gti(grp.a $$0) {
      super($$0, new gcs($$0.a(gem.cn)), 0.2F);
      this.k = new gct($$0.a(gem.co));
      this.b = new gcu($$0.a(gem.cp));
   }

   public alz a(gzh $$0) {
      return a;
   }

   public gzh b() {
      return new gzh();
   }

   public void a(gzh $$0, fgr $$1, glk $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      this.f = 0.1F + 0.1F * (float)$$0.a;
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cip $$0, gzh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gp();
   }

   protected void a(gzh $$0, fgr $$1, float $$2, float $$3) {
      $$1.a(0.0F, bae.b($$0.p * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
