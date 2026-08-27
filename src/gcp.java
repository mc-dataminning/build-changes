public class gcp<T extends cfb, M extends fjp<T> & fip & fjx> extends gcj<T, M> {
   private final fsv a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gcp(gaa<T, M> $$0, fsv $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bmf $$0, cmr $$1, cmo $$2, blz $$3, ept $$4, fsz $$5, int $$6) {
      if ($$1.a(cmu.qU) && $$0.fp() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bmf $$0, cmr $$1, blz $$2, ept $$3, fsz $$4, int $$5) {
      $$3.a();
      fmp $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = aui.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gbv.a($$3, false);
      boolean $$8 = $$2 == blz.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cmo.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}
