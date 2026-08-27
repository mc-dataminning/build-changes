public class fvy extends fsw<ccr> {
   private static final aer a = new aer("textures/entity/wither/wither_invulnerable.png");
   private static final aer f = new aer("textures/entity/wither/wither.png");
   private final fgp g;

   public fvy(fsx.a $$0) {
      super($$0);
      this.g = new fgp($$0.a(fhr.bU));
   }

   public static fhy a() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      $$1.a("head", fhx.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fhu.a);
      return fhy.a($$0, 64, 64);
   }

   protected int a(ccr $$0, gu $$1) {
      return 15;
   }

   public void a(ccr $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      float $$6 = arp.j($$2, $$0.N, $$0.dA());
      float $$7 = arp.i($$2, $$0.O, $$0.dC());
      elj $$8 = $$4.getBuffer(this.g.a(this.a($$0)));
      this.g.a(0.0F, $$6, $$7);
      this.g.a($$3, $$8, $$5, fyl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aer a(ccr $$0) {
      return $$0.p() ? a : f;
   }
}
