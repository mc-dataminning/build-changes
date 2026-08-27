public class gcc extends fyz<cgw> {
   private static final ahh a = new ahh("textures/entity/wither/wither_invulnerable.png");
   private static final ahh f = new ahh("textures/entity/wither/wither.png");
   private final fmf g;

   public gcc(fza.a $$0) {
      super($$0);
      this.g = new fmf($$0.a(fni.bX));
   }

   public static fnp a() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("head", fno.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fnl.a);
      return fnp.a($$0, 64, 64);
   }

   protected int a(cgw $$0, hx $$1) {
      return 15;
   }

   public void a(cgw $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = aup.j($$2, $$0.N, $$0.dB());
      float $$7 = aup.i($$2, $$0.O, $$0.dD());
      eqo $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, ges.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahh a(cgw $$0) {
      return $$0.z() ? a : f;
   }
}
