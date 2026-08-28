public class goi extends gni<cjy, gtl> {
   private static final alc a = alc.b("textures/entity/lead_knot.png");
   private final fyb b;

   public goi(gnj.a $$0) {
      super($$0);
      this.b = new fyb($$0.a(gak.bb));
   }

   @Override
   public void a(gtl $$0, fde $$1, ghg $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      fdi $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gws.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public alc a(gtl $$0) {
      return a;
   }

   @Override
   public gtl b() {
      return new gtl();
   }
}
