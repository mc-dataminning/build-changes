import javax.annotation.Nullable;

public class gex extends gee<cge, fpw<cge>> {
   private static final ajh a = new ajh("textures/" + fyf.i.b().a() + ".png");
   private static final ajh[] i = fyf.j.stream().map($$0 -> new ajh("textures/" + $$0.b().a() + ".png")).toArray(ajh[]::new);

   public gex(gcy.a $$0) {
      super($$0, new fpw<>($$0.a(frc.bg)), 0.0F);
      this.a(new ghm(this));
   }

   public epr a(cge $$0, float $$1) {
      return $$0.H($$1).orElse(super.a($$0, $$1)).a((double)$$0.eb());
   }

   public boolean a(cge $$0, gau $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.H(0.0F).filter($$2x -> {
         bpc<?> $$3x = $$0.ai();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         epr $$6 = epr.c($$0.dm());
         return $$1.a(new epm($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public ajh a(cge $$0) {
      return a($$0.go());
   }

   public static ajh a(@Nullable cpb $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(cge $$0, etz $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4, $$5);
      $$1.a($$0.y().g().b(), 0.0F, 0.5F, 0.0F);
   }
}
