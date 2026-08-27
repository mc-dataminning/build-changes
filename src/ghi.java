public class ghi<T extends cis, M extends foc<T> & fnc & fok> extends ghc<T, M> {
   private final fxm a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public ghi(get<T, M> $$0, fxm $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bpo $$0, cqk $$1, cqh $$2, bpi $$3, etz $$4, fxq $$5, int $$6) {
      if ($$1.a(cqn.qW) && $$0.fu() == $$1 && $$0.aK == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bpo $$0, cqk $$1, bpi $$2, etz $$3, fxq $$4, int $$5) {
      $$3.a();
      frd $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = aww.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      ggo.a($$3, false);
      boolean $$8 = $$2 == bpi.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cqh.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}
