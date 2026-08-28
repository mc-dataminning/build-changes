public class gyx extends gyt<hcg, gfz> {
   private final gfz a;

   public gyx(gwc<hcg, gfz> $$0, ggz $$1) {
      super($$0);
      this.a = new gfz($$1.a(ghc.db));
   }

   public void a(fho $$0, gny $$1, int $$2, hcg $$3, float $$4, float $$5) {
      boolean $$6 = $$3.ao && $$3.z;
      if (!$$3.z || $$6) {
         fhs $$7;
         if ($$6) {
            $$7 = $$1.getBuffer(goi.s(gwj.a));
         } else {
            $$7 = $$1.getBuffer(goi.j(gwj.a));
         }

         this.a.a($$3);
         this.a.a($$0, $$7, $$2, gvg.a($$3, 0.0F));
      }
   }
}
