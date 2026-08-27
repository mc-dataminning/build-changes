import javax.annotation.Nullable;

public class fvb extends fui<bzj, fgr<bzj>> {
   private static final aeu a = new aeu("textures/" + fon.i.b().a() + ".png");
   private static final aeu[] i = fon.j.stream().map($$0 -> new aeu("textures/" + $$0.b().a() + ".png")).toArray(aeu[]::new);

   public fvb(ftc.a $$0) {
      super($$0, new fgr<>($$0.a(fhw.be)), 0.0F);
      this.a(new fxn(this));
   }

   public ehi a(bzj $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(bzj $$0, frb $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         bip<?> $$3x = $$0.ag();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         ehi $$6 = ehi.c($$0.dk());
         return $$1.a(new ehd($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public aeu a(bzj $$0) {
      return a($$0.gb());
   }

   public static aeu a(@Nullable cho $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(bzj $$0, elk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.t().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
