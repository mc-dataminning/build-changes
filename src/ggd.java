public class ggd extends gda<cka> {
   private static final ajh a = new ajh("textures/entity/wither/wither_invulnerable.png");
   private static final ajh f = new ajh("textures/entity/wither/wither.png");
   private final fqb g;

   public ggd(gdb.a $$0) {
      super($$0);
      this.g = new fqb($$0.a(fre.cb));
   }

   public static frl a() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      $$1.a("head", frk.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), frh.a);
      return frl.a($$0, 64, 64);
   }

   protected int a(cka $$0, ib $$1) {
      return 15;
   }

   public void a(cka $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = aww.j($$2, $$0.N, $$0.dC());
      float $$7 = aww.i($$2, $$0.O, $$0.dE());
      euf $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, git.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajh a(cka $$0) {
      return $$0.y() ? a : f;
   }
}
