import java.util.Map;

public class hcb extends hbm<hfu, gji> {
   private final gji a;
   private final gji b;
   private final hax c;
   private static final Map<bwe.a, alg> d = Map.of(
      bwe.a.b,
      alg.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bwe.a.c,
      alg.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bwe.a.d,
      alg.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public hcb(gyv<hfu, gji> $$0, gjp $$1, hax $$2) {
      super($$0);
      this.a = new gji($$1.a(gjs.ec));
      this.b = new gji($$1.a(gjs.ee));
      this.c = $$2;
   }

   public void a(fkd $$0, gqr $$1, int $$2, hfu $$3, float $$4, float $$5) {
      czn $$6 = $$3.i;
      dhw $$7 = $$6.a(kk.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         gji $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hlw.d.d, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fkd $$0, gqr $$1, int $$2, czn $$3, ghl $$4) {
      bwe.a $$5 = bwe.b.a($$3);
      if ($$5 != bwe.a.a) {
         alg $$6 = d.get($$5);
         fkh $$7 = $$1.getBuffer(grc.c($$6));
         $$4.a($$0, $$7, $$2, hjg.d);
      }
   }
}
