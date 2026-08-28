import java.util.Map;

public class hbb extends han<heu, gij> {
   private final gij a;
   private final gij b;
   private final gzy c;
   private static final Map<bvz.a, alg> d = Map.of(
      bvz.a.b,
      alg.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bvz.a.c,
      alg.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bvz.a.d,
      alg.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public hbb(gxw<heu, gij> $$0, giq $$1, gzy $$2) {
      super($$0);
      this.a = new gij($$1.a(git.dY));
      this.b = new gij($$1.a(git.ea));
      this.c = $$2;
   }

   public void a(fjc $$0, gps $$1, int $$2, heu $$3, float $$4, float $$5) {
      cyy $$6 = $$3.i;
      dhh $$7 = $$6.a(kj.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         gij $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hkv.d.d, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fjc $$0, gps $$1, int $$2, cyy $$3, ggm $$4) {
      bvz.a $$5 = bvz.b.a($$3);
      if ($$5 != bvz.a.a) {
         alg $$6 = d.get($$5);
         fjg $$7 = $$1.getBuffer(gqc.c($$6));
         $$4.a($$0, $$7, $$2, hif.d);
      }
   }
}
