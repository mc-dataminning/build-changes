public class hae<T extends ckz> extends gwp<T, hge, gjr> {
   private static final alr a = alr.b("textures/entity/squid/squid.png");

   public hae(gxv.a $$0, gjr $$1, gjr $$2) {
      super($$0, $$1, $$2, 0.7F);
   }

   public alr a(hge $$0) {
      return a;
   }

   public hge b() {
      return new hge();
   }

   public void a(T $$0, hge $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azz.h($$2, $$0.bP, $$0.bO);
      $$1.b = azz.h($$2, $$0.bJ, $$0.bI);
      $$1.c = azz.h($$2, $$0.bL, $$0.bK);
   }

   protected void a(hge $$0, fld $$1, float $$2, float $$3) {
      $$1.a(0.0F, $$0.am ? 0.25F : 0.5F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$2));
      $$1.a(a.b.rotationDegrees($$0.b));
      $$1.a(a.d.rotationDegrees($$0.c));
      $$1.a(0.0F, $$0.am ? -0.6F : -1.2F, 0.0F);
   }
}
