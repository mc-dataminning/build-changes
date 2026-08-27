import javax.annotation.Nullable;

public class gcz extends gcg<cex, fob<cex>> {
   private static final aiy a = new aiy("textures/" + fwi.i.b().a() + ".png");
   private static final aiy[] i = fwi.j.stream().map($$0 -> new aiy("textures/" + $$0.b().a() + ".png")).toArray(aiy[]::new);

   public gcz(gba.a $$0) {
      super($$0, new fob<>($$0.a(fpi.bg)), 0.0F);
      this.a(new gfo(this));
   }

   public enz a(cex $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1)).a((double)$$0.ea());
   }

   public boolean a(cex $$0, fyw $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         bnw<?> $$3x = $$0.ai();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         enz $$6 = enz.c($$0.dm());
         return $$1.a(new enu($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public aiy a(cex $$0) {
      return a($$0.gh());
   }

   public static aiy a(@Nullable cnr $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(cex $$0, esh $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4, $$5);
      $$1.a($$0.A().g().b(), 0.0F, 0.5F, 0.0F);
   }
}
