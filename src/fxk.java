public class fxk<T extends cca, M extends fey<T> & fdz & ffg> extends fxe<T, M> {
   private final fnw a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public fxk(fuy<T, M> $$0, fnw $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bjm $$0, cjl $$1, cji $$2, bjg $$3, elj $$4, foa $$5, int $$6) {
      if ($$1.a(cjo.qj) && $$0.fp() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bjm $$0, cjl $$1, bjg $$2, elj $$3, foa $$4, int $$5) {
      $$3.a();
      fhx $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = asb.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      fwq.a($$3, false);
      boolean $$8 = $$2 == bjg.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cji.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}
