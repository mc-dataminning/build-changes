public class gwm extends gvd<hab, gdw> {
   public gwm(gti<hab, gdw> $$0, gsj $$1) {
      super($$0, $$1);
   }

   protected void a(hab $$0, fgl $$1) {
      if ($$0.ar.a(cxk.ti)) {
         this.d().e().a($$1);
         this.d().b().a($$1);
         this.d().c().a($$1);
         $$1.a(0.0625F, 0.25F, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(140.0F));
         $$1.a(a.f.rotationDegrees(10.0F));
         $$1.a(a.b.rotationDegrees(180.0F));
      } else {
         super.a($$0, $$1);
      }
   }
}
