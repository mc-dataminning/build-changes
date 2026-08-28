public class grl extends gsv<cmm, gxt, gbj<gxt>> {
   private static final alz a = alz.b("textures/entity/enderman/enderman.png");
   private final bam b = bam.a();

   public grl(grp.a $$0) {
      super($$0, new gbj<>($$0.a(gem.aE)), 0.5F);
      this.a(new gvm(this));
      this.a(new gve(this, $$0.d()));
   }

   public fbx a(gxt $$0) {
      fbx $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.aa;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alz b(gxt $$0) {
      return a;
   }

   public gxt a() {
      return new gxt();
   }

   public void a(cmm $$0, gxt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsg.a($$0, $$1, $$2);
      $$1.a = $$0.go();
      $$1.b = $$0.x();
   }
}
