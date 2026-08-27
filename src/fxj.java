public class fxj<T extends cbp, M extends fey<T> & fdz & ffg> extends fxd<T, M> {
   private final fnv a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public fxj(fux<T, M> $$0, fnv $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bjb $$0, cja $$1, cix $$2, biv $$3, elk $$4, fnz $$5, int $$6) {
      if ($$1.a(cjd.qj) && $$0.fn() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bjb $$0, cja $$1, biv $$2, elk $$3, fnz $$4, int $$5) {
      $$3.a();
      fhx $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = ars.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      fwp.a($$3, false);
      boolean $$8 = $$2 == biv.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cix.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}
