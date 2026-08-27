import javax.annotation.Nullable;

public class fui extends ftp<bzf, fgd<bzf>> {
   private static final aep a = new aep("textures/" + fnu.i.b().a() + ".png");
   private static final aep[] i = fnu.j.stream().map($$0 -> new aep("textures/" + $$0.b().a() + ".png")).toArray(aep[]::new);

   public fui(fsj.a $$0) {
      super($$0, new fgd<>($$0.a(fhi.be)), 0.0F);
      this.a(new fwu(this));
   }

   public ehf a(bzf $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(bzf $$0, fqi $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         bik<?> $$3x = $$0.ag();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         ehf $$6 = ehf.c($$0.dk());
         return $$1.a(new eha($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public aep a(bzf $$0) {
      return a($$0.ga());
   }

   public static aep a(@Nullable chk $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(bzf $$0, elh $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.t().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
