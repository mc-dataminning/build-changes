public class gqy extends grw<gtc, fwx> {
   private static final alc a = alc.b("textures/entity/cat/cat_collar.png");
   private final fwx b;
   private final fwx c;

   public gqy(gpf<gtc, fwx> $$0, gah $$1) {
      super($$0);
      this.b = new fwx($$1.a(gak.F));
      this.c = new fwx($$1.a(gak.G));
   }

   public void a(fde $$0, ghg $$1, int $$2, gtc $$3, float $$4, float $$5) {
      cuj $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         fwx $$8 = $$3.ae ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
