import javax.annotation.Nullable;

public class fxj extends fwq<cbg, fiv<cbg>> {
   private static final agg a = new agg("textures/" + fqw.i.b().a() + ".png");
   private static final agg[] i = fqw.j.stream().map($$0 -> new agg("textures/" + $$0.b().a() + ".png")).toArray(agg[]::new);

   public fxj(fvk.a $$0) {
      super($$0, new fiv<>($$0.a(fka.be)), 0.0F);
      this.a(new fzv(this));
   }

   public eji a(cbg $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(cbg $$0, ftj $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         bkm<?> $$3x = $$0.ag();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         eji $$6 = eji.c($$0.dl());
         return $$1.a(new ejd($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public agg a(cbg $$0) {
      return a($$0.gf());
   }

   public static agg a(@Nullable cjp $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(cbg $$0, enk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.y().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
