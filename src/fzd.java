public class fzd extends fwb<cfe> {
   private static final agm a = new agm("textures/entity/wither/wither_invulnerable.png");
   private static final agm f = new agm("textures/entity/wither/wither.png");
   private final fjq g;

   public fzd(fwc.a $$0) {
      super($$0);
      this.g = new fjq($$0.a(fks.bU));
   }

   public static fkz a() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      $$1.a("head", fky.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fkv.a);
      return fkz.a($$0, 64, 64);
   }

   protected int a(cfe $$0, hx $$1) {
      return 15;
   }

   public void a(cfe $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = atq.j($$2, $$0.N, $$0.dD());
      float $$7 = atq.i($$2, $$0.O, $$0.dF());
      eof $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gbq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agm a(cfe $$0) {
      return $$0.x() ? a : f;
   }
}
