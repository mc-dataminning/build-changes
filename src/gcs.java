import javax.annotation.Nullable;

public class gcs extends gbz<cet, fnu<cet>> {
   private static final aiy a = new aiy("textures/" + fwb.i.b().a() + ".png");
   private static final aiy[] i = fwb.j.stream().map($$0 -> new aiy("textures/" + $$0.b().a() + ".png")).toArray(aiy[]::new);

   public gcs(gat.a $$0) {
      super($$0, new fnu<>($$0.a(fpb.bg)), 0.0F);
      this.a(new gfh(this));
   }

   public ens a(cet $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1)).a((double)$$0.ea());
   }

   public boolean a(cet $$0, fyp $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         bnu<?> $$3x = $$0.ai();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         ens $$6 = ens.c($$0.dm());
         return $$1.a(new enn($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public aiy a(cet $$0) {
      return a($$0.gh());
   }

   public static aiy a(@Nullable cnn $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(cet $$0, esa $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4, $$5);
      $$1.a($$0.A().g().b(), 0.0F, 0.5F, 0.0F);
   }
}
