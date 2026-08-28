public class gwh extends gwa<gzb, gcm> {
   public static final alp a = alp.b("textures/entity/trident_riptide.png");
   private final gdj b;

   public gwh(gti<gzb, gcm> $$0, gef $$1) {
      super($$0);
      this.b = new gdj($$1.a(gei.cn));
   }

   public void a(fgl $$0, glg $$1, int $$2, gzb $$3, float $$4, float $$5) {
      if ($$3.ag) {
         fgp $$6 = $$1.getBuffer(this.b.a(a));
         this.b.a($$3);
         this.b.a($$0, $$6, $$2, hax.d);
      }
   }
}
