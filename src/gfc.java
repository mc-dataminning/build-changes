public class gfc<T extends chh, M extends fmb<T> & flb & fmj> extends gew<T, M> {
   private final fvh a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public gfc(gcn<T, M> $$0, fvh $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(bog $$0, coz $$1, cow $$2, boa $$3, esa $$4, fvl $$5, int $$6) {
      if ($$1.a(cpc.qW) && $$0.fp() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(bog $$0, coz $$1, boa $$2, esa $$3, fvl $$4, int $$5) {
      $$3.a();
      fpc $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = awh.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      gei.a($$3, false);
      boolean $$8 = $$2 == boa.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, cow.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}
