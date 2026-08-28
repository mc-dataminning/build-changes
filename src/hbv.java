import java.util.Map;

public class hbv extends hbh<hfo, gjd> {
   private final gjd a;
   private final gjd b;
   private final has c;
   private static final Map<bwe.a, alg> d = Map.of(
      bwe.a.b,
      alg.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bwe.a.c,
      alg.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bwe.a.d,
      alg.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public hbv(gyq<hfo, gjd> $$0, gjk $$1, has $$2) {
      super($$0);
      this.a = new gjd($$1.a(gjn.ea));
      this.b = new gjd($$1.a(gjn.ec));
      this.c = $$2;
   }

   public void a(fjy $$0, gqm $$1, int $$2, hfo $$3, float $$4, float $$5) {
      czk $$6 = $$3.i;
      dht $$7 = $$6.a(kk.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         gjd $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hlp.d.d, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fjy $$0, gqm $$1, int $$2, czk $$3, ghg $$4) {
      bwe.a $$5 = bwe.b.a($$3);
      if ($$5 != bwe.a.a) {
         alg $$6 = d.get($$5);
         fkc $$7 = $$1.getBuffer(gqx.c($$6));
         $$4.a($$0, $$7, $$2, hja.d);
      }
   }
}
