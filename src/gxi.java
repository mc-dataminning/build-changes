import java.util.Map;

public class gxi extends gwu<hbb, get> {
   private final get a;
   private final get b;
   private final gwe c;
   private static final Map<buj.a, akv> d = Map.of(
      buj.a.b,
      akv.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      buj.a.c,
      akv.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      buj.a.d,
      akv.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gxi(guc<hbb, get> $$0, gfa $$1, gwe $$2) {
      super($$0);
      this.a = new get($$1.a(gfd.dI));
      this.b = new get($$1.a(gfd.dK));
      this.c = $$2;
   }

   public void a(ffv $$0, glz $$1, int $$2, hbb $$3, float $$4, float $$5) {
      cwq $$6 = $$3.i;
      dev $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         get $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hgz.d.d, $$7.c().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(ffv $$0, glz $$1, int $$2, cwq $$3, gcx $$4) {
      buj.a $$5 = buj.b.a($$3);
      if ($$5 != buj.a.a) {
         akv $$6 = d.get($$5);
         ffz $$7 = $$1.getBuffer(gmj.c($$6));
         $$4.a($$0, $$7, $$2, hej.d);
      }
   }
}
