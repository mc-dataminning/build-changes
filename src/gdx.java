import javax.annotation.Nullable;

public class gdx extends gde<cfm, foy<cfm>> {
   private static final ajc a = new ajc("textures/" + fxf.i.b().a() + ".png");
   private static final ajc[] i = fxf.j.stream().map($$0 -> new ajc("textures/" + $$0.b().a() + ".png")).toArray(ajc[]::new);

   public gdx(gby.a $$0) {
      super($$0, new foy<>($$0.a(fqe.bg)), 0.0F);
      this.a(new ggm(this));
   }

   public eov a(cfm $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1)).a((double)$$0.dY());
   }

   public boolean a(cfm $$0, fzu $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         bol<?> $$3x = $$0.ai();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         eov $$6 = eov.c($$0.dj());
         return $$1.a(new eoq($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public ajc a(cfm $$0) {
      return a($$0.gm());
   }

   public static ajc a(@Nullable cog $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(cfm $$0, etd $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4, $$5);
      $$1.a($$0.A().g().b(), 0.0F, 0.5F, 0.0F);
   }
}
