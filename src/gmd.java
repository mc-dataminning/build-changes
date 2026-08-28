public class gmd extends gks<cfr, fug<cfr>> {
   private final fug<cfr> a = this.a();
   private final fug<cfr> i;
   private static final akk j = new akk("textures/entity/fish/tropical_a.png");
   private static final akk k = new akk("textures/entity/fish/tropical_b.png");

   public gmd(gjm.a $$0) {
      super($$0, new fwu<>($$0.a(fxn.bL)), 0.15F);
      this.i = new fwv<>($$0.a(fxn.bJ));
      this.a(new goi(this, $$0.f()));
   }

   public akk a(cfr $$0) {
      return switch ($$0.gz().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cfr $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      fug<cfr> $$6 = switch ($$0.gz().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gx().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cfr $$0, fam $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayg.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bf()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
