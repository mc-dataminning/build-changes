import java.util.Map;

public class hcy extends hcj<hgu, gkg> {
   private final gkg a;
   private final gkg b;
   private final hbu c;
   private static final Map<bxa.a, alr> d = Map.of(
      bxa.a.b,
      alr.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bxa.a.c,
      alr.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bxa.a.d,
      alr.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public hcy(gzs<hgu, gkg> $$0, gkn $$1, hbu $$2) {
      super($$0);
      this.a = new gkg($$1.a(gkq.ec));
      this.b = new gkg($$1.a(gkq.ee));
      this.c = $$2;
   }

   public void a(fld $$0, grn $$1, int $$2, hgu $$3, float $$4, float $$5) {
      dak $$6 = $$3.i;
      dit $$7 = $$6.a(kl.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         gkg $$8 = $$3.am ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hmw.d.d, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fld $$0, grn $$1, int $$2, dak $$3, gij $$4) {
      bxa.a $$5 = bxa.b.a($$3);
      if ($$5 != bxa.a.a) {
         alr $$6 = d.get($$5);
         flg $$7 = $$1.getBuffer(gry.c($$6));
         $$4.a($$0, $$7, $$2, hkg.d);
      }
   }
}
