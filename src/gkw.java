import javax.annotation.Nullable;

public class gkw extends gkc<cki, fvs<cki>> {
   private static final ale a = new ale("textures/" + gec.i.b().a() + ".png");
   private static final ale[] i = gec.j.stream().map($$0 -> new ale("textures/" + $$0.b().a() + ".png")).toArray(ale[]::new);

   public gkw(giw.a $$0) {
      super($$0, new fvs<>($$0.a(fwy.bk)), 0.0F);
      this.a(new gnl(this));
   }

   public evq a(cki $$0, float $$1) {
      return $$0.H($$1).orElse(super.a($$0, $$1)).a((double)$$0.ee());
   }

   public boolean a(cki $$0, ggr $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.H(0.0F).filter($$2x -> {
         bsz<?> $$3x = $$0.ak();
         float $$4x = $$3x.m() / 2.0F;
         float $$5 = $$3x.l() / 2.0F;
         evq $$6 = evq.c($$0.dp());
         return $$1.a(new evl($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public ale a(cki $$0) {
      return a($$0.gr());
   }

   public static ale a(@Nullable cth $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(cki $$0, ezx $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4, $$5);
      $$1.a($$0.y().g().b(), 0.0F, 0.5F, 0.0F);
   }
}
