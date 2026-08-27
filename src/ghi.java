public class ghi extends gid<cii, fso<cii>> {
   private static final akh a = new akh("textures/entity/zombie/zombie.png");
   private final float i;

   public ghi(ggx.a $$0, float $$1) {
      super($$0, new fsg($$0.a(fva.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new glb<>(this, $$0.d()));
      this.a(new gky<>(this, new fsg($$0.a(fva.ai)), new fsg($$0.a(fva.aj)), $$0.g()));
   }

   protected void a(cii $$0, exx $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public akh a(cii $$0) {
      return a;
   }
}
