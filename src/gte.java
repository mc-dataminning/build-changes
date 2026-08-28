public class gte extends gsr<cih, gzd, gbh<gxq>> {
   private static final alp a = alp.b("textures/entity/fish/pufferfish.png");
   private final gbh<gxq> b;
   private final gbh<gxq> k;
   private final gbh<gxq> l = this.c();

   public gte(grl.a $$0) {
      super($$0, new gco($$0.a(gei.cq)), 0.2F);
      this.k = new gcp($$0.a(gei.cr));
      this.b = new gcq($$0.a(gei.cs));
   }

   public alp a(gzd $$0) {
      return a;
   }

   public gzd b() {
      return new gzd();
   }

   protected float b(gzd $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(gzd $$0, fgl $$1, glg $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cih $$0, gzd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gp();
   }

   protected void a(gzd $$0, fgl $$1, float $$2, float $$3) {
      $$1.a(0.0F, azu.b($$0.p * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
