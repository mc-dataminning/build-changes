public class hcs extends hcy<hfs, giv> {
   private final giv a;
   private final giv b;
   private final hcj c;

   public hcs(hah<hfs, giv> $$0, glc $$1, hcj $$2) {
      super($$0);
      this.c = $$2;
      this.a = new giv($$1.a(glf.bH));
      this.b = new giv($$1.a(glf.bG));
   }

   public void a(flq $$0, gsc $$1, int $$2, hfs $$3, float $$4, float $$5) {
      daa $$6 = $$3.c;
      dij $$7 = $$6.a(kl.D);
      if ($$7 != null && $$7.d().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.d().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, daa.k, dii.m, $$2);
      }
   }

   private void a(flq $$0, gsc $$1, hfs $$2, daa $$3, alj<dih> $$4, int $$5) {
      giv $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hni.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
