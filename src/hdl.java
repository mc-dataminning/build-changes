import java.util.Map;

public class hdl extends hcw<hhe, gkt> {
   private final gkt a;
   private final gkt b;
   private final hch c;
   private static final Map<bwp.a, ali> d = Map.of(
      bwp.a.b,
      ali.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bwp.a.c,
      ali.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bwp.a.d,
      ali.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public hdl(haf<hhe, gkt> $$0, gla $$1, hch $$2) {
      super($$0);
      this.a = new gkt($$1.a(gld.ec));
      this.b = new gkt($$1.a(gld.ee));
      this.c = $$2;
   }

   public void a(flo $$0, gsa $$1, int $$2, hhe $$3, float $$4, float $$5) {
      czy $$6 = $$3.i;
      dih $$7 = $$6.a(kk.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         gkt $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hng.d.d, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(flo $$0, gsa $$1, int $$2, czy $$3, giw $$4) {
      bwp.a $$5 = bwp.b.a($$3);
      if ($$5 != bwp.a.a) {
         ali $$6 = d.get($$5);
         flr $$7 = $$1.getBuffer(gsl.c($$6));
         $$4.a($$0, $$7, $$2, hkq.d);
      }
   }
}
