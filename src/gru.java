public class gru extends gsm<gwr, fxu> {
   private static final alh a = alh.b("textures/entity/zombie/drowned_outer_layer.png");
   private final fxu b;
   private final fxu c;

   public gru(gpv<gwr, fxu> $$0, gax $$1) {
      super($$0);
      this.b = new fxu($$1.a(gba.al));
      this.c = new fxu($$1.a(gba.ap));
   }

   public void a(fdt $$0, ghw $$1, int $$2, gwr $$3, float $$4, float $$5) {
      fxu $$6 = $$3.ae ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
