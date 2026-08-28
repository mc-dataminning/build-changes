import java.util.Map;

public class hdn extends hcy<hhg, gkv> {
   private final gkv a;
   private final gkv b;
   private final hcj c;
   private static final Map<bwr.a, alk> d = Map.of(
      bwr.a.b,
      alk.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bwr.a.c,
      alk.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bwr.a.d,
      alk.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public hdn(hah<hhg, gkv> $$0, glc $$1, hcj $$2) {
      super($$0);
      this.a = new gkv($$1.a(glf.ec));
      this.b = new gkv($$1.a(glf.ee));
      this.c = $$2;
   }

   public void a(flq $$0, gsc $$1, int $$2, hhg $$3, float $$4, float $$5) {
      daa $$6 = $$3.i;
      dij $$7 = $$6.a(kl.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         gkv $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hni.d.d, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(flq $$0, gsc $$1, int $$2, daa $$3, giy $$4) {
      bwr.a $$5 = bwr.b.a($$3);
      if ($$5 != bwr.a.a) {
         alk $$6 = d.get($$5);
         flt $$7 = $$1.getBuffer(gsn.c($$6));
         $$4.a($$0, $$7, $$2, hks.d);
      }
   }
}
