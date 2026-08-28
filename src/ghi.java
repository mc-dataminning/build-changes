public class ghi implements ggz<drc> {
   public static final gsq a = new gsq(gqk.e, akr.b("entity/enchanting_table_book"));
   private final fus b;

   public ghi(gha.a $$0) {
      this.b = new fus($$0.a(fyj.r));
   }

   public void a(drc $$0, float $$1, fbi $$2, gez $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + ayo.a($$6 * 0.1F) * 0.01F, 0.0F);
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
      float $$9 = ayo.i($$1, $$0.c, $$0.b);
      float $$10 = ayo.h($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = ayo.h($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = ayo.i($$1, $$0.g, $$0.f);
      this.b.a($$6, ayo.a($$10, 0.0F, 1.0F), ayo.a($$11, 0.0F, 1.0F), $$12);
      fbm $$13 = a.a($$3, gfh::c);
      this.b.b($$2, $$13, $$4, $$5, -1);
      $$2.b();
   }
}
