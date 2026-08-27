import javax.annotation.Nullable;

public class fxw extends fxd<cbo, fji<cbo>> {
   private static final agi a = new agi("textures/" + frj.i.b().a() + ".png");
   private static final agi[] i = frj.j.stream().map($$0 -> new agi("textures/" + $$0.b().a() + ".png")).toArray(agi[]::new);

   public fxw(fvx.a $$0) {
      super($$0, new fji<>($$0.a(fkn.be)), 0.0F);
      this.a(new gai(this));
   }

   public eju a(cbo $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(cbo $$0, ftw $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         bku<?> $$3x = $$0.ai();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         eju $$6 = eju.c($$0.dn());
         return $$1.a(new ejp($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public agi a(cbo $$0) {
      return a($$0.gg());
   }

   public static agi a(@Nullable cjx $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(cbo $$0, enw $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.A().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
