public class gre extends grw<gwa, fxf> {
   private static final alc a = alc.b("textures/entity/zombie/drowned_outer_layer.png");
   private final fxf b;
   private final fxf c;

   public gre(gpf<gwa, fxf> $$0, gah $$1) {
      super($$0);
      this.b = new fxf($$1.a(gak.al));
      this.c = new fxf($$1.a(gak.ap));
   }

   public void a(fde $$0, ghg $$1, int $$2, gwa $$3, float $$4, float $$5) {
      fxf $$6 = $$3.ae ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
