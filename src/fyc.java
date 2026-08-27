public class fyc implements fxt<djr> {
   public static final gje a = new gje(gha.e, new aiy("entity/enchanting_table_book"));
   private final flq b;

   public fyc(fxu.a $$0) {
      this.b = new flq($$0.a(fpi.n));
   }

   public void a(djr $$0, float $$1, esh $$2, fvt $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + awi.a($$6 * 0.1F) * 0.01F, 0.0F);
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
      float $$9 = awi.i($$1, $$0.c, $$0.b);
      float $$10 = awi.h($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = awi.h($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = awi.i($$1, $$0.g, $$0.f);
      this.b.a($$6, awi.a($$10, 0.0F, 1.0F), awi.a($$11, 0.0F, 1.0F), $$12);
      esl $$13 = a.a($$3, fwb::c);
      this.b.b($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
