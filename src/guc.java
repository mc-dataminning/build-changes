import java.util.Map;

public class guc extends gtn<gxr, gbr> {
   private final gbr a;
   private final gbr b;
   private final gsy c;
   private static final Map<buf.a, all> d = Map.of(
      buf.a.b,
      all.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      buf.a.c,
      all.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      buf.a.d,
      all.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public guc(gqw<gxr, gbr> $$0, gby $$1, gsy $$2) {
      super($$0);
      this.a = new gbr($$1.a(gcb.dh));
      this.b = new gbr($$1.a(gcb.dj));
      this.c = $$2;
   }

   public void a(fek $$0, gix $$1, int $$2, gxr $$3, float $$4, float $$5) {
      cwf $$6 = $$3.i;
      ddr $$7 = $$6.a(ku.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gbr $$8 = $$3.ae ? this.b : this.a;
         all $$9 = $$7.c().get();
         $$8.a($$3);
         this.c.a(ddp.d.d, $$9, $$8, $$6, gjh::f, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fek $$0, gix $$1, int $$2, cwf $$3, fzv $$4) {
      buf.a $$5 = buf.b.a($$3);
      if ($$5 != buf.a.a) {
         all $$6 = d.get($$5);
         feo $$7 = $$1.getBuffer(gjh.i($$6));
         $$4.a($$0, $$7, $$2, gyk.d);
      }
   }
}
