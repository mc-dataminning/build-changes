public class gzc<T extends ckd> extends gvn<T, hey, gio> {
   private static final alg a = alg.b("textures/entity/squid/squid.png");

   public gzc(gwt.a $$0, gio $$1, gio $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alg a(hey $$0) {
      return a;
   }

   public hey b() {
      return new hey();
   }

   public void a(T $$0, hey $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azm.h($$2, $$0.bN, $$0.bM);
      $$1.b = azm.h($$2, $$0.bH, $$0.bG);
      $$1.c = azm.h($$2, $$0.bJ, $$0.bI);
   }

   protected void a(hey $$0, fjy $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.aj ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.aj ? -0.6F : -1.2F, 0.0F);
   }
}
