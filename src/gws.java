import java.util.Map;

public class gws extends gwe<hai, gec> {
   private final gec a;
   private final gec b;
   private final gvo c;
   private static final Map<bvg.a, alz> d = Map.of(
      bvg.a.b,
      alz.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bvg.a.c,
      alz.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bvg.a.d,
      alz.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gws(gtm<hai, gec> $$0, gej $$1, gvo $$2) {
      super($$0);
      this.a = new gec($$1.a(gem.dC));
      this.b = new gec($$1.a(gem.dE));
      this.c = $$2;
   }

   public void a(fgr $$0, glk $$1, int $$2, hai $$3, float $$4, float $$5) {
      cxo $$6 = $$3.i;
      dft $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gec $$8 = $$3.ae ? this.b : this.a;
         alz $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(dfr.d.d, $$9, $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fgr $$0, glk $$1, int $$2, cxo $$3, gcg $$4) {
      bvg.a $$5 = bvg.b.a($$3);
      if ($$5 != bvg.a.a) {
         alz $$6 = d.get($$5);
         fgv $$7 = $$1.getBuffer(glu.c($$6));
         $$4.a($$0, $$7, $$2, hbb.d);
      }
   }
}
