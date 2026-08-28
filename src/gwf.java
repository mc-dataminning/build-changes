public class gwf extends gvy<gyz, gck> {
   public static final alz a = alz.b("textures/entity/trident_riptide.png");
   private final gdh b;

   public gwf(gtg<gyz, gck> $$0, ged $$1) {
      super($$0);
      this.b = new gdh($$1.a(geg.ck));
   }

   public void a(fgl $$0, gle $$1, int $$2, gyz $$3, float $$4, float $$5) {
      if ($$3.ag) {
         fgp $$6 = $$1.getBuffer(this.b.a(a));
         this.b.a($$3);
         this.b.a($$0, $$6, $$2, hav.d);
      }
   }
}
