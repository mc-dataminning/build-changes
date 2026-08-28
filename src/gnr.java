public class gnr<T extends cmh, M extends fui<T> & fth & fuq> extends gnl<T, M> {
   private final gdt a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gnr(glc<T, M> $$0, gdt $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bsy $$0, cua $$1, ctx $$2, bss $$3, fag $$4, gdx $$5, int $$6) {
      if ($$1.a(cud.qX) && $$0.ft() == $$1 && $$0.aL == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bsy $$0, cua $$1, bss $$2, fag $$3, gdx $$4, int $$5) {
      $$3.a();
      fxi $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = aye.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gmx.a($$3, false);
      boolean $$8 = $$2 == bss.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, ctx.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}
