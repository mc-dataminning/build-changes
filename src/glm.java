public class glm extends gkb<cgd, ftq<cgd>> {
   private final ftq<cgd> a = this.a();
   private final ftq<cgd> i;
   private static final ale j = new ale("textures/entity/fish/tropical_a.png");
   private static final ale k = new ale("textures/entity/fish/tropical_b.png");

   public glm(giv.a $$0) {
      super($$0, new fwe<>($$0.a(fwx.bL)), 0.15F);
      this.i = new fwf<>($$0.a(fwx.bJ));
      this.a(new gnr(this, $$0.f()));
   }

   public ale a(cgd $$0) {
      return switch ($$0.gB().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cgd $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      ftq<cgd> $$6 = switch ($$0.gB().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gz().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cgd $$0, ezw $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayx.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
