import javax.annotation.Nullable;

public class gaz extends gag<cdc, fmc<cdc>> {
   private static final ahh a = new ahh("textures/" + fui.i.b().a() + ".png");
   private static final ahh[] i = fui.j.stream().map($$0 -> new ahh("textures/" + $$0.b().a() + ".png")).toArray(ahh[]::new);

   public gaz(fza.a $$0) {
      super($$0, new fmc<>($$0.a(fni.bg)), 0.0F);
      this.a(new gdo(this));
   }

   public emc a(cdc $$0, float $$1) {
      return $$0.E($$1).orElse(super.a($$0, $$1)).a((double)$$0.dZ());
   }

   public boolean a(cdc $$0, fww $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.E(0.0F).filter($$2x -> {
         bmc<?> $$3x = $$0.ai();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         emc $$6 = emc.c($$0.dl());
         return $$1.a(new elx($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public ahh a(cdc $$0) {
      return a($$0.gg());
   }

   public static ahh a(@Nullable clv $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(cdc $$0, eqk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.A().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
