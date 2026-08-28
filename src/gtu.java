public class gtu extends gth<chp, gzv, gby<gyh>> {
   private static final aku a = aku.b("textures/entity/fish/pufferfish.png");
   private final gby<gyh> b;
   private final gby<gyh> k;
   private final gby<gyh> l = this.c();

   public gtu(gsb.a $$0) {
      super($$0, new gdf($$0.a(gez.cq)), 0.2F);
      this.k = new gdg($$0.a(gez.cr));
      this.b = new gdh($$0.a(gez.cs));
   }

   public aku a(gzv $$0) {
      return a;
   }

   public gzv b() {
      return new gzv();
   }

   protected float b(gzv $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(gzv $$0, ffs $$1, glv $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(chp $$0, gzv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gq();
   }

   protected void a(gzv $$0, ffs $$1, float $$2, float $$3) {
      $$1.a(0.0F, ayy.b($$0.u * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
