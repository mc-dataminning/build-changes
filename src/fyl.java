public class fyl extends fvj<cer> {
   private static final agg a = new agg("textures/entity/wither/wither_invulnerable.png");
   private static final agg f = new agg("textures/entity/wither/wither.png");
   private final fiy g;

   public fyl(fvk.a $$0) {
      super($$0);
      this.g = new fiy($$0.a(fka.bU));
   }

   public static fkh a() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      $$1.a("head", fkg.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fkd.a);
      return fkh.a($$0, 64, 64);
   }

   protected int a(cer $$0, ht $$1) {
      return 15;
   }

   public void a(cer $$0, float $$1, float $$2, enk $$3, fqh $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = ati.j($$2, $$0.N, $$0.dB());
      float $$7 = ati.i($$2, $$0.O, $$0.dD());
      eno $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, gay.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public agg a(cer $$0) {
      return $$0.w() ? a : f;
   }
}
