public class gbq extends gag<bzc, fkb<bzc>> {
   private final fkb<bzc> a = this.a();
   private final fkb<bzc> i;
   private static final ahh j = new ahh("textures/entity/fish/tropical_a.png");
   private static final ahh k = new ahh("textures/entity/fish/tropical_b.png");

   public gbq(fza.a $$0) {
      super($$0, new fmp<>($$0.a(fni.bH)), 0.15F);
      this.i = new fmq<>($$0.a(fni.bF));
      this.a(new gdv(this, $$0.f()));
   }

   public ahh a(bzc $$0) {
      return switch ($$0.gq().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(bzc $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      fkb<bzc> $$6 = switch ($$0.gq().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.go().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(bzc $$0, eqk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * aup.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aZ()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
