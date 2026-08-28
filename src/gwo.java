import java.util.Map;

public class gwo extends gwa<hae, gdy> {
   private final gdy a;
   private final gdy b;
   private final gvk c;
   private static final Map<buy.a, alp> d = Map.of(
      buy.a.b,
      alp.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      buy.a.c,
      alp.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      buy.a.d,
      alp.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gwo(gti<hae, gdy> $$0, gef $$1, gvk $$2) {
      super($$0);
      this.a = new gdy($$1.a(gei.dI));
      this.b = new gdy($$1.a(gei.dK));
      this.c = $$2;
   }

   public void a(fgl $$0, glg $$1, int $$2, hae $$3, float $$4, float $$5) {
      cxg $$6 = $$3.i;
      dfl $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gdy $$8 = $$3.ae ? this.b : this.a;
         alp $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(dfj.d.d, $$9, $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fgl $$0, glg $$1, int $$2, cxg $$3, gcc $$4) {
      buy.a $$5 = buy.b.a($$3);
      if ($$5 != buy.a.a) {
         alp $$6 = d.get($$5);
         fgp $$7 = $$1.getBuffer(glq.c($$6));
         $$4.a($$0, $$7, $$2, hax.d);
      }
   }
}
