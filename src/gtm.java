import java.util.Map;

public class gtm extends gsx<gxb, gbb> {
   private final gbb a;
   private final gbb b;
   private final gsi c;
   private static final Map<bub.a, ali> d = Map.of(
      bub.a.b,
      ali.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bub.a.c,
      ali.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bub.a.d,
      ali.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gtm(gqg<gxb, gbb> $$0, gbi $$1, gsi $$2) {
      super($$0);
      this.a = new gbb($$1.a(gbl.dh));
      this.b = new gbb($$1.a(gbl.dj));
      this.c = $$2;
   }

   public void a(feb $$0, gih $$1, int $$2, gxb $$3, float $$4, float $$5) {
      cwb $$6 = $$3.i;
      ddn $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gbb $$8 = $$3.ae ? this.b : this.a;
         ali $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(ddl.d.d, $$9, $$8, $$6, gir::f, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(feb $$0, gih $$1, int $$2, cwb $$3, fzf $$4) {
      bub.a $$5 = bub.b.a($$3);
      if ($$5 != bub.a.a) {
         ali $$6 = d.get($$5);
         fef $$7 = $$1.getBuffer(gir.i($$6));
         $$4.a($$0, $$7, $$2, gxu.d);
      }
   }
}
