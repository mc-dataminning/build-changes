public class hat<T extends ckq> extends gxe<T, hgq, gkg> {
   private static final alk a = alk.b("textures/entity/squid/squid.png");

   public hat(gyk.a $$0, gkg $$1, gkg $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alk a(hgq $$0) {
      return a;
   }

   public hgq b() {
      return new hgq();
   }

   public void a(T $$0, hgq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azq.h($$2, $$0.bP, $$0.bO);
      $$1.b = azq.h($$2, $$0.bJ, $$0.bI);
      $$1.c = azq.h($$2, $$0.bL, $$0.bK);
   }

   protected void a(hgq $$0, flq $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.aj ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.aj ? -0.6F : -1.2F, 0.0F);
   }
}
