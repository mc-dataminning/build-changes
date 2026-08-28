public class guo implements gua<eab> {
   private final guo.a a;

   public guo(gub.a $$0) {
      this($$0.f());
   }

   public guo(gkn $$0) {
      this.a = new guo.a($$0.a(gkq.cV));
   }

   public void a(eab $$0, float $$1, fld $$2, grn $$3, int $$4, int $$5, fgc $$6) {
      jc $$7 = $$0.m().a(dux.c, jc.b);
      czi $$8 = $$0.s();
      hmx $$9;
      if ($$8 == null) {
         $$9 = gsh.s;
      } else {
         $$9 = gsh.d($$8);
      }

      float $$11 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$7, $$11, $$9);
   }

   public void a(fld $$0, grn $$1, int $$2, int $$3, jc $$4, float $$5, hmx $$6) {
      $$0.a();
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$7 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$4.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$5);
      flg $$8 = $$6.a($$1, this.a::a);
      this.a.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   static class a extends gij {
      private final gkr a;

      public a(gkr $$0) {
         super($$0, gry::g);
         this.a = $$0.b("lid");
      }

      public void a(float $$0) {
         this.a.a(0.0F, 24.0F - $$0 * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0 * (float) (Math.PI / 180.0);
      }
   }
}
