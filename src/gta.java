public class gta implements gsm<dys> {
   private final gta.a a;

   public gta(gsn.a $$0) {
      this($$0.f());
   }

   public gta(giy $$0) {
      this.a = new gta.a($$0.a(gjb.cT));
   }

   public void a(dys $$0, float $$1, fjj $$2, gqa $$3, int $$4, int $$5, feq $$6) {
      ja $$7 = $$0.m().a(dto.c, ja.b);
      cyb $$8 = $$0.s();
      hle $$9;
      if ($$8 == null) {
         $$9 = gqv.s;
      } else {
         $$9 = gqv.d($$8);
      }

      float $$11 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$7, $$11, $$9);
   }

   public void a(fjj $$0, gqa $$1, int $$2, int $$3, ja $$4, float $$5, hle $$6) {
      $$0.a();
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$7 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$4.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$5);
      fjn $$8 = $$6.a($$1, this.a::a);
      this.a.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   static class a extends ggu {
      private final gjc a;

      public a(gjc $$0) {
         super($$0, gqk::g);
         this.a = $$0.b("lid");
      }

      public void a(float $$0) {
         this.a.a(0.0F, 24.0F - $$0 * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0 * (float) (Math.PI / 180.0);
      }
   }
}
