import java.util.Map;

public class gwt extends gwf<haj, ged> {
   private final ged a;
   private final ged b;
   private final gvp c;
   private static final Map<bvh.a, alz> d = Map.of(
      bvh.a.b,
      alz.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bvh.a.c,
      alz.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bvh.a.d,
      alz.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gwt(gtn<haj, ged> $$0, gek $$1, gvp $$2) {
      super($$0);
      this.a = new ged($$1.a(gen.dC));
      this.b = new ged($$1.a(gen.dE));
      this.c = $$2;
   }

   public void a(fgs $$0, gll $$1, int $$2, haj $$3, float $$4, float $$5) {
      cxp $$6 = $$3.i;
      dfu $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         ged $$8 = $$3.ae ? this.b : this.a;
         alz $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(dfs.d.d, $$9, $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fgs $$0, gll $$1, int $$2, cxp $$3, gch $$4) {
      bvh.a $$5 = bvh.b.a($$3);
      if ($$5 != bvh.a.a) {
         alz $$6 = d.get($$5);
         fgw $$7 = $$1.getBuffer(glv.c($$6));
         $$4.a($$0, $$7, $$2, hbc.d);
      }
   }
}
