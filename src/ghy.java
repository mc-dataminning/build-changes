public class ghy extends ggo<cdd, fqe<cdd>> {
   private final fqe<cdd> a = this.a();
   private final fqe<cdd> i;
   private static final ajt j = new ajt("textures/entity/fish/tropical_a.png");
   private static final ajt k = new ajt("textures/entity/fish/tropical_b.png");

   public ghy(gfi.a $$0) {
      super($$0, new fss<>($$0.a(ftl.bL)), 0.15F);
      this.i = new fst<>($$0.a(ftl.bJ));
      this.a(new gkd(this, $$0.f()));
   }

   public ajt a(cdd $$0) {
      return switch ($$0.gy().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cdd $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      fqe<cdd> $$6 = switch ($$0.gy().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gw().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cdd $$0, ewi $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * axk.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bc()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
