public class gss extends grx<chx, gze, gct> {
   private static final aku a = aku.b("textures/entity/dolphin.png");

   public gss(gtd.a $$0) {
      super($$0, new gct($$0.a(ggb.ar)), new gct($$0.a(ggb.as)), 0.7F);
      this.a(new gwy(this));
   }

   public aku a(gze $$0) {
      return a;
   }

   public gze a() {
      return new gze();
   }

   public void a(chx $$0, gze $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gzy.a($$0, $$1, this.i);
      $$1.a = $$0.dx().j() > 1.0E-7;
   }
}
