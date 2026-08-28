public class gln extends gkc<cge, ftr<cge>> {
   private final ftr<cge> a = this.a();
   private final ftr<cge> i;
   private static final ale j = new ale("textures/entity/fish/tropical_a.png");
   private static final ale k = new ale("textures/entity/fish/tropical_b.png");

   public gln(giw.a $$0) {
      super($$0, new fwf<>($$0.a(fwy.bL)), 0.15F);
      this.i = new fwg<>($$0.a(fwy.bJ));
      this.a(new gns(this, $$0.f()));
   }

   public ale a(cge $$0) {
      return switch ($$0.gB().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cge $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      ftr<cge> $$6 = switch ($$0.gB().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gz().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cge $$0, ezx $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayy.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
