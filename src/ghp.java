public class ghp implements ghg<dqw> {
   public static final gtc a = new gtc(gqx.e, new akt("entity/enchanting_table_book"));
   private final fuy b;

   public ghp(ghh.a $$0) {
      this.b = new fuy($$0.a(fyr.s));
   }

   public void a(dqw $$0, float $$1, fbc $$2, gfg $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + aym.a($$6 * 0.1F) * 0.01F, 0.0F);
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
      float $$9 = aym.i($$1, $$0.c, $$0.b);
      float $$10 = aym.h($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = aym.h($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = aym.i($$1, $$0.g, $$0.f);
      this.b.a($$6, aym.a($$10, 0.0F, 1.0F), aym.a($$11, 0.0F, 1.0F), $$12);
      fbg $$13 = a.a($$3, gfo::c);
      this.b.b($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
