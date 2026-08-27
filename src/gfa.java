public class gfa extends gbx<cjh> {
   private static final ajc a = new ajc("textures/entity/wither/wither_invulnerable.png");
   private static final ajc f = new ajc("textures/entity/wither/wither.png");
   private final fpb g;

   public gfa(gby.a $$0) {
      super($$0);
      this.g = new fpb($$0.a(fqe.bX));
   }

   public static fql a() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      $$1.a("head", fqk.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fqh.a);
      return fql.a($$0, 64, 64);
   }

   protected int a(cjh $$0, ib $$1) {
      return 15;
   }

   public void a(cjh $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = awm.j($$2, $$0.M, $$0.dz());
      float $$7 = awm.i($$2, $$0.N, $$0.dB());
      eth $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajc a(cjh $$0) {
      return $$0.z() ? a : f;
   }
}
