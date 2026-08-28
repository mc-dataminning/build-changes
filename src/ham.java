import java.util.Map;

public class ham extends gzy<hee, ghv> {
   private final ghv a;
   private final ghv b;
   private final gzj c;
   private static final Map<bvw.a, ale> d = Map.of(
      bvw.a.b,
      ale.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bvw.a.c,
      ale.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bvw.a.d,
      ale.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public ham(gxh<hee, ghv> $$0, gic $$1, gzj $$2) {
      super($$0);
      this.a = new ghv($$1.a(gif.dU));
      this.b = new ghv($$1.a(gif.dW));
      this.c = $$2;
   }

   public void a(fiq $$0, gpd $$1, int $$2, hee $$3, float $$4, float $$5) {
      cys $$6 = $$3.i;
      dhb $$7 = $$6.a(kj.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         ghv $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hkf.d.d, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fiq $$0, gpd $$1, int $$2, cys $$3, gfz $$4) {
      bvw.a $$5 = bvw.b.a($$3);
      if ($$5 != bvw.a.a) {
         ale $$6 = d.get($$5);
         fiu $$7 = $$1.getBuffer(gpn.c($$6));
         $$4.a($$0, $$7, $$2, hhp.d);
      }
   }
}
