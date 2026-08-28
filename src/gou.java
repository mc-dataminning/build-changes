public class gou<T extends cmx, M extends fvk<T> & fuj & fvs> extends goo<T, M> {
   private final gev a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gou(gmf<T, M> $$0, gev $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(btn $$0, cuq $$1, cun $$2, btg $$3, fbi $$4, gez $$5, int $$6) {
      if ($$1.a(cut.qX) && $$0.ft() == $$1 && $$0.aL == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(btn $$0, cuq $$1, btg $$2, fbi $$3, gez $$4, int $$5) {
      $$3.a();
      fyk $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = ayo.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      goa.a($$3, false);
      boolean $$8 = $$2 == btg.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cun.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}
