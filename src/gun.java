import java.util.Map;

public class gun extends gty<gyc, gca> {
   private final gca a;
   private final gca b;
   private final gtj c;
   private static final Map<bui.a, alj> d = Map.of(
      bui.a.b,
      alj.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bui.a.c,
      alj.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bui.a.d,
      alj.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gun(grh<gyc, gca> $$0, gch $$1, gtj $$2) {
      super($$0);
      this.a = new gca($$1.a(gck.dz));
      this.b = new gca($$1.a(gck.dB));
      this.c = $$2;
   }

   public void a(fer $$0, gjg $$1, int $$2, gyc $$3, float $$4, float $$5) {
      cwm $$6 = $$3.i;
      ddy $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gca $$8 = $$3.ae ? this.b : this.a;
         alj $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(ddw.d.d, $$9, $$8, $$6, gjq::f, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fer $$0, gjg $$1, int $$2, cwm $$3, gae $$4) {
      bui.a $$5 = bui.b.a($$3);
      if ($$5 != bui.a.a) {
         alj $$6 = d.get($$5);
         fev $$7 = $$1.getBuffer(gjq.i($$6));
         $$4.a($$0, $$7, $$2, gyv.d);
      }
   }
}
