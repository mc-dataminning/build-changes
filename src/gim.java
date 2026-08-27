import javax.annotation.Nullable;

public class gim extends ght<chx, ftk<chx>> {
   private static final akf a = new akf("textures/" + gbt.i.b().a() + ".png");
   private static final akf[] i = gbt.j.stream().map($$0 -> new akf("textures/" + $$0.b().a() + ".png")).toArray(akf[]::new);

   public gim(ggn.a $$0) {
      super($$0, new ftk<>($$0.a(fuq.bk)), 0.0F);
      this.a(new glb(this));
   }

   public etf a(chx $$0, float $$1) {
      return $$0.H($$1).orElse(super.a($$0, $$1)).a((double)$$0.ec());
   }

   public boolean a(chx $$0, gei $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.H(0.0F).filter($$2x -> {
         bqr<?> $$3x = $$0.ai();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         etf $$6 = etf.c($$0.dn());
         return $$1.a(new eta($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public akf a(chx $$0) {
      return a($$0.gq());
   }

   public static akf a(@Nullable cqw $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(chx $$0, exn $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4, $$5);
      $$1.a($$0.y().g().b(), 0.0F, 0.5F, 0.0F);
   }
}
