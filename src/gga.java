public class gga extends gfl<cba, fpa<cba>> {
   private final fpa<cba> a;

   public gga(gcv<cba, fpa<cba>> $$0, fpf $$1) {
      super($$0);
      this.a = new fpa<>($$1.a(fpi.bZ));
   }

   public void a(esh $$0, fvt $$1, int $$2, cba $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gq()) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         esl $$10 = $$1.getBuffer(fwb.e(((cmm)cpg.oq).b()));
         this.a.a($$0, $$10, $$2, ggs.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
