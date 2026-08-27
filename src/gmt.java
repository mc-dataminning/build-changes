import javax.annotation.Nullable;

public class gmt extends glz<cjk, fxl<cjk>> {
   private static final akt a = new akt("textures/" + gfv.i.b().a() + ".png");
   private static final akt[] b = gfv.j.stream().map($$0 -> new akt("textures/" + $$0.b().a() + ".png")).toArray(akt[]::new);

   public gmt(gkq.a $$0) {
      super($$0, new fxl<>($$0.a(fyr.bo)), 0.0F);
      this.a(new gpl(this));
   }

   public ewu a(cjk $$0, float $$1) {
      return $$0.H($$1).orElse(super.a($$0, $$1)).a((double)$$0.em());
   }

   public boolean a(cjk $$0, gik $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.H(0.0F).filter($$2x -> {
         bsb<?> $$3x = $$0.ak();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         ewu $$6 = ewu.c($$0.du());
         return $$1.a(new ewp($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public akt a(cjk $$0) {
      return a($$0.gz());
   }

   public static akt a(@Nullable csy $$0) {
      return $$0 == null ? a : b[$$0.a()];
   }

   protected void a(cjk $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4, $$5);
      $$1.a($$0.x().g().b(), 0.0F, 0.5F, 0.0F);
   }
}
