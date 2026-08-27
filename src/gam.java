import javax.annotation.Nullable;

public class gam extends fzt<ccv, flq<ccv>> {
   private static final ahg a = new ahg("textures/" + ftw.i.b().a() + ".png");
   private static final ahg[] i = ftw.j.stream().map($$0 -> new ahg("textures/" + $$0.b().a() + ".png")).toArray(ahg[]::new);

   public gam(fyn.a $$0) {
      super($$0, new flq<>($$0.a(fmw.bh)), 0.0F);
      this.a(new gdb(this));
   }

   public elt a(ccv $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(ccv $$0, fwk $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         blz<?> $$3x = $$0.ai();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         elt $$6 = elt.c($$0.dm());
         return $$1.a(new elo($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public ahg a(ccv $$0) {
      return a($$0.gf());
   }

   public static ahg a(@Nullable clm $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(ccv $$0, eqb $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.A().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
