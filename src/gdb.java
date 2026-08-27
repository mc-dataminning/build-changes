public class gdb extends gbx<cir> {
   private static final ajc a = new ajc("textures/entity/llama/spit.png");
   private final fny<cir> f;

   public gdb(gby.a $$0) {
      super($$0);
      this.f = new fny<>($$0.a(fqe.av));
   }

   public void a(cir $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(awm.i($$2, $$0.M, $$0.dz()) - 90.0F));
      $$3.a(a.f.rotationDegrees(awm.i($$2, $$0.N, $$0.dB())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eth $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajc a(cir $$0) {
      return a;
   }
}
