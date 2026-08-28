import java.util.Map;

public class gxe extends gwq<hax, gep> {
   private final gep a;
   private final gep b;
   private final gwa c;
   private static final Map<bug.a, aku> d = Map.of(
      bug.a.b,
      aku.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bug.a.c,
      aku.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bug.a.d,
      aku.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gxe(gty<hax, gep> $$0, gew $$1, gwa $$2) {
      super($$0);
      this.a = new gep($$1.a(gez.dI));
      this.b = new gep($$1.a(gez.dK));
      this.c = $$2;
   }

   public void a(ffs $$0, glv $$1, int $$2, hax $$3, float $$4, float $$5) {
      cwn $$6 = $$3.i;
      des $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gep $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hgr.d.d, $$7.c().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(ffs $$0, glv $$1, int $$2, cwn $$3, gct $$4) {
      bug.a $$5 = bug.b.a($$3);
      if ($$5 != bug.a.a) {
         aku $$6 = d.get($$5);
         ffw $$7 = $$1.getBuffer(gmf.c($$6));
         $$4.a($$0, $$7, $$2, hec.d);
      }
   }
}
