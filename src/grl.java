public class grl extends gth<chc, gzh, gbn> {
   private static final aku a = aku.b("textures/entity/fish/cod.png");

   public grl(gsb.a $$0) {
      super($$0, new gbn($$0.a(gez.Z)), 0.3F);
   }

   @Override
   public aku b(gzh $$0) {
      return a;
   }

   public gzh a() {
      return new gzh();
   }

   @Override
   protected void a(gzh $$0, ffs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * ayy.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
