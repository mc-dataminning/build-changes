import javax.annotation.Nullable;

public class fyb extends fxi<cbt, fjn<cbt>> {
   private static final agm a = new agm("textures/" + fro.i.b().a() + ".png");
   private static final agm[] i = fro.j.stream().map($$0 -> new agm("textures/" + $$0.b().a() + ".png")).toArray(agm[]::new);

   public fyb(fwc.a $$0) {
      super($$0, new fjn<>($$0.a(fks.be)), 0.0F);
      this.a(new gan(this));
   }

   public ejz a(cbt $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(cbt $$0, fub $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         bkz<?> $$3x = $$0.ai();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         ejz $$6 = ejz.c($$0.dn());
         return $$1.a(new eju($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public agm a(cbt $$0) {
      return a($$0.gg());
   }

   public static agm a(@Nullable ckc $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(cbt $$0, eob $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.A().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
