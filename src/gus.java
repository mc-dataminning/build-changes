public class gus implements gua<eaj> {
   private final gtw<eaj> a;
   private final gud<eaj> b;

   public gus(gub.a $$0) {
      this.a = new gtw<>($$0);
      this.b = new gud<>($$0);
   }

   public void a(eaj $$0, float $$1, fld $$2, grn $$3, int $$4, int $$5, fgc $$6) {
      this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public boolean a(eaj $$0) {
      return this.a.a($$0) || this.b.a($$0);
   }

   @Override
   public int aR_() {
      return Math.max(this.a.aR_(), this.b.aR_());
   }

   public boolean a(eaj $$0, fgc $$1) {
      return this.a.a($$0, $$1) || this.b.a($$0, $$1);
   }
}
