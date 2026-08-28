public class gtw extends gtj<chq, gzx, gca<gyj>> {
   private static final akv a = akv.b("textures/entity/fish/pufferfish.png");
   private final gca<gyj> b;
   private final gca<gyj> k;
   private final gca<gyj> l = this.c();

   public gtw(gsd.a $$0) {
      super($$0, new gdh($$0.a(gfb.cq)), 0.2F);
      this.k = new gdi($$0.a(gfb.cr));
      this.b = new gdj($$0.a(gfb.cs));
   }

   public akv a(gzx $$0) {
      return a;
   }

   public gzx b() {
      return new gzx();
   }

   protected float b(gzx $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(gzx $$0, fft $$1, glx $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(chq $$0, gzx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gt();
   }

   protected void a(gzx $$0, fft $$1, float $$2, float $$3) {
      $$1.a(0.0F, ayz.b($$0.u * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
