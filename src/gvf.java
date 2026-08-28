public class gvf extends gwe<gxk, gax> {
   private static final alz a = alz.b("textures/entity/cat/cat_collar.png");
   private final gax b;
   private final gax c;

   public gvf(gtm<gxk, gax> $$0, gej $$1) {
      super($$0);
      this.b = new gax($$1.a(gem.O));
      this.c = new gax($$1.a(gem.N));
   }

   public void a(fgr $$0, glk $$1, int $$2, gxk $$3, float $$4, float $$5) {
      cwl $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gax $$8 = $$3.ae ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
