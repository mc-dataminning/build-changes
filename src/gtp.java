public class gtp extends gse<bvo, gzg> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final hbn h;
   private final azh i = azh.a();

   protected gtp(gsf.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public gzg a() {
      return new gzg();
   }

   public void a(bvo $$0, gzg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cwq $$3 = $$0.m();
      $$1.a($$0, $$3, this.h);
   }

   public void a(gzg $$0, ffv $$1, glz $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         if ($$0.u <= 50.0F) {
            float $$4 = Math.min($$0.u, 50.0F) / 50.0F;
            $$1.b($$4, $$4, $$4);
         }

         float $$5 = ayz.h($$0.u * 40.0F);
         $$1.a(a.d.rotationDegrees($$5));
         gtb.a($$1, $$2, 15728880, $$0, this.i);
         $$1.b();
      }
   }
}
