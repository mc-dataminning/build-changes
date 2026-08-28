public class grz extends gsx<gue, fxx> {
   private static final ali a = ali.b("textures/entity/cat/cat_collar.png");
   private final fxx b;
   private final fxx c;

   public grz(gqg<gue, fxx> $$0, gbi $$1) {
      super($$0);
      this.b = new fxx($$1.a(gbl.F));
      this.c = new fxx($$1.a(gbl.G));
   }

   public void a(feb $$0, gih $$1, int $$2, gue $$3, float $$4, float $$5) {
      cuy $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         fxx $$8 = $$3.ae ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
