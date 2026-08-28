public class gwe extends gwr<gyy, gcl> {
   private final gcl a;
   private final gcl b;
   private final gwb c;

   public gwe(gtz<gyy, gcl> $$0, gey $$1, gwb $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gcl($$1.a(gfb.be));
      this.b = new gcl($$1.a(gfb.bg));
   }

   public void a(ffu $$0, glx $$1, int $$2, gyy $$3, float $$4, float $$5) {
      cwp $$6 = $$3.i;
      deu $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gcl $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hgq.d.e, $$7.c().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
