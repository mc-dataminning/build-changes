public class gek extends gbx<cjf> {
   public static final ajc a = new ajc("textures/entity/trident.png");
   private final fpk f;

   public gek(gby.a $$0) {
      super($$0);
      this.f = new fpk($$0.a(fqe.bE));
   }

   public void a(cjf $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(awm.i($$2, $$0.M, $$0.dz()) - 90.0F));
      $$3.a(a.f.rotationDegrees(awm.i($$2, $$0.N, $$0.dB()) + 90.0F));
      eth $$6 = gcw.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajc a(cjf $$0) {
      return a;
   }
}
