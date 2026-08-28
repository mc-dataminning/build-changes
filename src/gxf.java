import java.util.Map;

public class gxf extends gwr<hay, ger> {
   private final ger a;
   private final ger b;
   private final gwb c;
   private static final Map<buh.a, aku> d = Map.of(
      buh.a.b,
      aku.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      buh.a.c,
      aku.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      buh.a.d,
      aku.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gxf(gtz<hay, ger> $$0, gey $$1, gwb $$2) {
      super($$0);
      this.a = new ger($$1.a(gfb.dI));
      this.b = new ger($$1.a(gfb.dK));
      this.c = $$2;
   }

   public void a(ffu $$0, glx $$1, int $$2, hay $$3, float $$4, float $$5) {
      cwp $$6 = $$3.i;
      deu $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         ger $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hgq.d.d, $$7.c().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(ffu $$0, glx $$1, int $$2, cwp $$3, gcv $$4) {
      buh.a $$5 = buh.b.a($$3);
      if ($$5 != buh.a.a) {
         aku $$6 = d.get($$5);
         ffy $$7 = $$1.getBuffer(gmh.c($$6));
         $$4.a($$0, $$7, $$2, hea.d);
      }
   }
}
