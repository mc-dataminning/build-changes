public class gsi extends gri<clq, gxo> {
   private static final alz a = alz.b("textures/entity/lead_knot.png");
   private final gbw b;

   public gsi(grj.a $$0) {
      super($$0);
      this.b = new gbw($$0.a(geg.bo));
   }

   @Override
   public void a(gxo $$0, fgl $$1, gle $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      fgp $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hav.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gxo d() {
      return new gxo();
   }
}
