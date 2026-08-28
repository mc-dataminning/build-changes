import java.util.Map;

public class gxg extends gws<haz, ger> {
   private final ger a;
   private final ger b;
   private final gwc c;
   private static final Map<buh.a, akv> d = Map.of(
      buh.a.b,
      akv.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      buh.a.c,
      akv.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      buh.a.d,
      akv.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gxg(gua<haz, ger> $$0, gey $$1, gwc $$2) {
      super($$0);
      this.a = new ger($$1.a(gfb.dI));
      this.b = new ger($$1.a(gfb.dK));
      this.c = $$2;
   }

   public void a(fft $$0, glx $$1, int $$2, haz $$3, float $$4, float $$5) {
      cwo $$6 = $$3.i;
      det $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         ger $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hgx.d.d, $$7.c().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fft $$0, glx $$1, int $$2, cwo $$3, gcv $$4) {
      buh.a $$5 = buh.b.a($$3);
      if ($$5 != buh.a.a) {
         akv $$6 = d.get($$5);
         ffx $$7 = $$1.getBuffer(gmh.c($$6));
         $$4.a($$0, $$7, $$2, heh.d);
      }
   }
}
