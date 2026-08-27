import javax.annotation.Nullable;

public class fzn extends fyu<ccf, fkr<ccf>> {
   private static final agt a = new agt("textures/" + fsx.i.b().a() + ".png");
   private static final agt[] i = fsx.j.stream().map($$0 -> new agt("textures/" + $$0.b().a() + ".png")).toArray(agt[]::new);

   public fzn(fxo.a $$0) {
      super($$0, new fkr<>($$0.a(flx.bh)), 0.0F);
      this.a(new gcc(this));
   }

   public elb a(ccf $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(ccf $$0, fvl $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         blj<?> $$3x = $$0.ai();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         elb $$6 = elb.c($$0.dm());
         return $$1.a(new ekw($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public agt a(ccf $$0) {
      return a($$0.gf());
   }

   public static agt a(@Nullable ckv $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(ccf $$0, epd $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.A().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
