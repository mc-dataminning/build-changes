public class gjl implements gjc<drz> {
   public static final gyq a = new gyq(gwj.d, alb.b("entity/enchanting_table_book"));
   private final fwk b;

   public gjl(gjd.a $$0) {
      this.b = new fwk($$0.a(gaa.A));
   }

   public void a(drz $$0, float $$1, fcu $$2, ggv $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + azc.a($$6 * 0.1F) * 0.01F, 0.0F);
      float $$7 = $$0.h - $$0.i;

      while ($$7 >= (float) Math.PI) {
         $$7 -= (float) (Math.PI * 2);
      }

      while ($$7 < (float) -Math.PI) {
         $$7 += (float) (Math.PI * 2);
      }

      float $$8 = $$0.i + $$7 * $$1;
      $$2.a(a.d.rotation(-$$8));
      $$2.a(a.f.rotationDegrees(80.0F));
      float $$9 = azc.h($$1, $$0.c, $$0.b);
      float $$10 = azc.h($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = azc.h($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = azc.h($$1, $$0.g, $$0.f);
      this.b.a($$6, azc.a($$10, 0.0F, 1.0F), azc.a($$11, 0.0F, 1.0F), $$12);
      fcy $$13 = a.a($$3, ghe::c);
      this.b.a($$2, $$13, $$4, $$5);
      $$2.b();
   }
}
