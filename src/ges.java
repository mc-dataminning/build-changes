public class ges extends gde<chn, fpq<chn>> {
   private static final ajc a = new ajc("textures/entity/villager/villager.png");

   public ges(gby.a $$0) {
      super($$0, new fpq<>($$0.a(fqe.bL)), 0.5F);
      this.a(new gfo<>(this, $$0.f(), $$0.d()));
      this.a(new ggu<>(this, $$0.e(), "villager"));
      this.a(new gfn<>(this, $$0.d()));
   }

   public ajc a(chn $$0) {
      return a;
   }

   protected void a(chn $$0, etd $$1, float $$2) {
      float $$3 = 0.9375F * $$0.dX();
      $$1.b($$3, $$3, $$3);
   }

   protected float b(chn $$0) {
      float $$1 = super.b($$0);
      return $$0.o_() ? $$1 * 0.5F : $$1;
   }
}
