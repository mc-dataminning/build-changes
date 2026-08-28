public class guz extends gvy<gxe, gar> {
   private static final alz a = alz.b("textures/entity/cat/cat_collar.png");
   private final gar b;
   private final gar c;

   public guz(gtg<gxe, gar> $$0, ged $$1) {
      super($$0);
      this.b = new gar($$1.a(geg.O));
      this.c = new gar($$1.a(geg.N));
   }

   public void a(fgl $$0, gle $$1, int $$2, gxe $$3, float $$4, float $$5) {
      cwh $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gar $$8 = $$3.ae ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
