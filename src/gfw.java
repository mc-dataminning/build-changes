public class gfw implements gfn<dqa> {
   public static final grc a = new grc(gox.e, new ale("entity/enchanting_table_book"));
   private final fth b;

   public gfw(gfo.a $$0) {
      this.b = new fth($$0.a(fwy.r));
   }

   public void a(dqa $$0, float $$1, ezx $$2, gdn $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + ayy.a($$6 * 0.1F) * 0.01F, 0.0F);
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
      float $$9 = ayy.i($$1, $$0.c, $$0.b);
      float $$10 = ayy.h($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = ayy.h($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = ayy.i($$1, $$0.g, $$0.f);
      this.b.a($$6, ayy.a($$10, 0.0F, 1.0F), ayy.a($$11, 0.0F, 1.0F), $$12);
      fab $$13 = a.a($$3, gdv::c);
      this.b.b($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
