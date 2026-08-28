public class goo<T extends cmv, M extends fve<T> & fud & fvm> extends goi<T, M> {
   private final gep a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public goo(glz<T, M> $$0, gep $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(btl $$0, cuo $$1, cul $$2, btf $$3, fbc $$4, get $$5, int $$6) {
      if ($$1.a(cur.qX) && $$0.fu() == $$1 && $$0.aL == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(btl $$0, cuo $$1, btf $$2, fbc $$3, get $$4, int $$5) {
      $$3.a();
      fye $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = ayn.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gnu.a($$3, false);
      boolean $$8 = $$2 == btf.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cul.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}
