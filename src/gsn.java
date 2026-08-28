public class gsn extends grn<clu, gxt> {
   private static final alz a = alz.b("textures/entity/lead_knot.png");
   private final gcb b;

   public gsn(gro.a $$0) {
      super($$0);
      this.b = new gcb($$0.a(gel.bo));
   }

   @Override
   public void a(gxt $$0, fgq $$1, glj $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      fgu $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hba.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gxt d() {
      return new gxt();
   }
}
