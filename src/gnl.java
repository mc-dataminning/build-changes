public class gnl<T extends bsy, M extends fui<T> & fth> extends gns<T, M> {
   private final gdt a;

   public gnl(glc<T, M> $$0, gdt $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fag $$0, gdx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fq() == bss.b;
      cua $$11 = $$10 ? $$3.eU() : $$3.eT();
      cua $$12 = $$10 ? $$3.eT() : $$3.eU();
      if (!$$11.e() || !$$12.e()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, ctx.c, bss.b, $$0, $$1, $$2);
         this.a($$3, $$11, ctx.b, bss.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bsy $$0, cua $$1, ctx $$2, bss $$3, fag $$4, gdx $$5, int $$6) {
      if (!$$1.e()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bss.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
