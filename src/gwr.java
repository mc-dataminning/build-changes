import java.util.Map;

public class gwr extends gwd<hah, geb> {
   private final geb a;
   private final geb b;
   private final gvn c;
   private static final Map<bvg.a, alz> d = Map.of(
      bvg.a.b,
      alz.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bvg.a.c,
      alz.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bvg.a.d,
      alz.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gwr(gtl<hah, geb> $$0, gei $$1, gvn $$2) {
      super($$0);
      this.a = new geb($$1.a(gel.dC));
      this.b = new geb($$1.a(gel.dE));
      this.c = $$2;
   }

   public void a(fgq $$0, glj $$1, int $$2, hah $$3, float $$4, float $$5) {
      cxo $$6 = $$3.i;
      dft $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         geb $$8 = $$3.ae ? this.b : this.a;
         alz $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(dfr.d.d, $$9, $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fgq $$0, glj $$1, int $$2, cxo $$3, gcf $$4) {
      bvg.a $$5 = bvg.b.a($$3);
      if ($$5 != bvg.a.a) {
         alz $$6 = d.get($$5);
         fgu $$7 = $$1.getBuffer(glt.i($$6));
         $$4.a($$0, $$7, $$2, hba.d);
      }
   }
}
