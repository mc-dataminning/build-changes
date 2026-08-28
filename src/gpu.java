public class gpu extends goj<bvg, gvr> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final gpi h;

   protected gpu(gok.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public gvr a() {
      return new gvr();
   }

   public void a(bvg $$0, gvr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cwb $$3 = $$0.o();
      $$1.b = $$3.v();
      $$1.a = !$$3.f() ? this.h.a($$3, $$0.dX(), null, 0) : null;
   }

   public void a(gvr $$0, feb $$1, gih $$2, int $$3) {
      haf $$4 = $$0.a;
      if ($$4 != null) {
         $$1.a();
         if ($$0.p <= 50.0F) {
            float $$5 = Math.min($$0.p, 50.0F) / 50.0F;
            $$1.b($$5, $$5, $$5);
         }

         float $$6 = azk.h($$0.p * 40.0F);
         $$1.a(a.d.rotationDegrees($$6));
         gpg.a(this.h, $$1, $$2, 15728880, $$0.b, $$4, $$4.b(), azs.a());
         $$1.b();
      }
   }
}
