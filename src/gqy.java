public class gqy implements gqk<dwy> {
   private final gqy.a a;

   public gqy(gql.a $$0) {
      this($$0.f());
   }

   public gqy(ggz $$0) {
      this.a = new gqy.a($$0.a(ghc.cP));
   }

   public void a(dwy $$0, float $$1, fho $$2, gny $$3, int $$4, int $$5) {
      jo $$6 = $$0.m().a(drz.c, jo.b);
      cwv $$7 = $$0.s();
      hiz $$8;
      if ($$7 == null) {
         $$8 = got.i;
      } else {
         $$8 = got.d($$7);
      }

      float $$10 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$6, $$10, $$8);
   }

   public void a(fho $$0, gny $$1, int $$2, int $$3, jo $$4, float $$5, hiz $$6) {
      $$0.a();
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$7 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$4.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$5);
      fhs $$8 = $$6.a($$1, this.a::a);
      this.a.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   static class a extends gew {
      private final ghd a;

      public a(ghd $$0) {
         super($$0, goi::g);
         this.a = $$0.b("lid");
      }

      public void a(float $$0) {
         this.a.a(0.0F, 24.0F - $$0 * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0 * (float) (Math.PI / 180.0);
      }
   }
}
