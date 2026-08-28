import java.util.Map;

public class gxh extends gwt<hba, ges> {
   private final ges a;
   private final ges b;
   private final gwd c;
   private static final Map<bui.a, akv> d = Map.of(
      bui.a.b,
      akv.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bui.a.c,
      akv.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bui.a.d,
      akv.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gxh(gub<hba, ges> $$0, gez $$1, gwd $$2) {
      super($$0);
      this.a = new ges($$1.a(gfc.dI));
      this.b = new ges($$1.a(gfc.dK));
      this.c = $$2;
   }

   public void a(ffu $$0, gly $$1, int $$2, hba $$3, float $$4, float $$5) {
      cwp $$6 = $$3.i;
      deu $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         ges $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hgy.d.d, $$7.c().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(ffu $$0, gly $$1, int $$2, cwp $$3, gcw $$4) {
      bui.a $$5 = bui.b.a($$3);
      if ($$5 != bui.a.a) {
         akv $$6 = d.get($$5);
         ffy $$7 = $$1.getBuffer(gmi.c($$6));
         $$4.a($$0, $$7, $$2, hei.d);
      }
   }
}
