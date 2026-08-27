import javax.annotation.Nullable;

public class fwc extends fvj<car, fhq<car>> {
   private static final afw a = new afw("textures/" + fpp.i.b().a() + ".png");
   private static final afw[] i = fpp.j.stream().map($$0 -> new afw("textures/" + $$0.b().a() + ".png")).toArray(afw[]::new);

   public fwc(fud.a $$0) {
      super($$0, new fhq<>($$0.a(fiv.be)), 0.0F);
      this.a(new fyo(this));
   }

   public eif a(car $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(car $$0, fsc $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         bjx<?> $$3x = $$0.ag();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         eif $$6 = eif.c($$0.dl());
         return $$1.a(new eia($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public afw a(car $$0) {
      return a($$0.gf());
   }

   public static afw a(@Nullable cix $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(car $$0, emh $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.y().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
