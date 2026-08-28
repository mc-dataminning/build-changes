import java.util.Map;

public class hbj extends hav<hfc, gir> {
   private final gir a;
   private final gir b;
   private final hag c;
   private static final Map<bwb.a, alg> d = Map.of(
      bwb.a.b,
      alg.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bwb.a.c,
      alg.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bwb.a.d,
      alg.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public hbj(gye<hfc, gir> $$0, giy $$1, hag $$2) {
      super($$0);
      this.a = new gir($$1.a(gjb.ea));
      this.b = new gir($$1.a(gjb.ec));
      this.c = $$2;
   }

   public void a(fjj $$0, gqa $$1, int $$2, hfc $$3, float $$4, float $$5) {
      czd $$6 = $$3.i;
      dhm $$7 = $$6.a(kj.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         gir $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hld.d.d, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fjj $$0, gqa $$1, int $$2, czd $$3, ggu $$4) {
      bwb.a $$5 = bwb.b.a($$3);
      if ($$5 != bwb.a.a) {
         alg $$6 = d.get($$5);
         fjn $$7 = $$1.getBuffer(gqk.c($$6));
         $$4.a($$0, $$7, $$2, hin.d);
      }
   }
}
