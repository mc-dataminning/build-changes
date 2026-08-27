public class ggi<T extends cia, M extends fne<T> & fme & fnm> extends ggc<T, M> {
   private final fwm a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public ggi(gdt<T, M> $$0, fwm $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(box $$0, cpq $$1, cpn $$2, bor $$3, etd $$4, fwq $$5, int $$6) {
      if ($$1.a(cpt.qW) && $$0.fr() == $$1 && $$0.aI == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(box $$0, cpq $$1, bor $$2, etd $$3, fwq $$4, int $$5) {
      $$3.a();
      fqf $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = awm.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gfo.a($$3, false);
      boolean $$8 = $$2 == bor.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cpn.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}
