import java.util.Map;

public class gyg extends gxs<hbz, gfr> {
   private final gfr a;
   private final gfr b;
   private final gxc c;
   private static final Map<buw.a, aku> d = Map.of(
      buw.a.b,
      aku.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      buw.a.c,
      aku.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      buw.a.d,
      aku.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gyg(gva<hbz, gfr> $$0, gfy $$1, gxc $$2) {
      super($$0);
      this.a = new gfr($$1.a(ggb.dK));
      this.b = new gfr($$1.a(ggb.dM));
      this.c = $$2;
   }

   public void a(fgr $$0, gmx $$1, int $$2, hbz $$3, float $$4, float $$5) {
      cxh $$6 = $$3.i;
      dfm $$7 = $$6.a(kv.E);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gfr $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hhx.d.d, $$7.c().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fgr $$0, gmx $$1, int $$2, cxh $$3, gdv $$4) {
      buw.a $$5 = buw.b.a($$3);
      if ($$5 != buw.a.a) {
         aku $$6 = d.get($$5);
         fgv $$7 = $$1.getBuffer(gnh.c($$6));
         $$4.a($$0, $$7, $$2, hfh.d);
      }
   }
}
