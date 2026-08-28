public class gqm extends gni<cpc, gvy> {
   private static final alc a = alc.b("textures/entity/wither/wither_invulnerable.png");
   private static final alc b = alc.b("textures/entity/wither/wither.png");
   private final fzg h;

   public gqm(gnj.a $$0) {
      super($$0);
      this.h = new fzg($$0.a(gak.df));
   }

   public static gar a() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      $$1.a("head", gaq.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gan.a);
      return gar.a($$0, 64, 64);
   }

   protected int a(cpc $$0, je $$1) {
      return 15;
   }

   public void a(gvy $$0, fde $$1, ghg $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fdi $$4 = $$2.getBuffer(this.h.a(this.a($$0)));
      this.h.a(0.0F, $$0.c, $$0.b);
      this.h.a($$1, $$4, $$3, gws.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public alc a(gvy $$0) {
      return $$0.a ? a : b;
   }

   public gvy c() {
      return new gvy();
   }

   public void a(cpc $$0, gvy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.w();
      $$1.c = $$0.k($$2);
      $$1.b = $$0.j($$2);
   }
}
