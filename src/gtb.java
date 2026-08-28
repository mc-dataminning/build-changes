import java.util.Map;

public class gtb extends gsm<gwq, gaq> {
   private final gaq a;
   private final gaq b;
   private final grx c;
   private static final Map<btw.a, alh> d = Map.of(
      btw.a.b,
      alh.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      btw.a.c,
      alh.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      btw.a.d,
      alh.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gtb(gpv<gwq, gaq> $$0, gax $$1, grx $$2) {
      super($$0);
      this.a = new gaq($$1.a(gba.dh));
      this.b = new gaq($$1.a(gba.dj));
      this.c = $$2;
   }

   public void a(fdt $$0, ghw $$1, int $$2, gwq $$3, float $$4, float $$5) {
      cvx $$6 = $$3.i;
      ddh $$7 = $$6.a(kt.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gaq $$8 = $$3.ae ? this.b : this.a;
         alh $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(ddf.d.d, $$9, $$8, $$6, gig::f, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fdt $$0, ghw $$1, int $$2, cvx $$3, fyu $$4) {
      btw.a $$5 = btw.b.a($$3);
      if ($$5 != btw.a.a) {
         alh $$6 = d.get($$5);
         fdx $$7 = $$1.getBuffer(gig.i($$6));
         $$4.a($$0, $$7, $$2, gxj.d);
      }
   }
}
