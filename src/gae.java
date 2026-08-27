import javax.annotation.Nullable;

public class gae extends fzl<ccp, fli<ccp>> {
   private static final ahd a = new ahd("textures/" + fto.i.b().a() + ".png");
   private static final ahd[] i = fto.j.stream().map($$0 -> new ahd("textures/" + $$0.b().a() + ".png")).toArray(ahd[]::new);

   public gae(fyf.a $$0) {
      super($$0, new fli<>($$0.a(fmo.bh)), 0.0F);
      this.a(new gct(this));
   }

   public elm a(ccp $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(ccp $$0, fwc $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         blt<?> $$3x = $$0.ai();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         elm $$6 = elm.c($$0.dm());
         return $$1.a(new elh($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public ahd a(ccp $$0) {
      return a($$0.gf());
   }

   public static ahd a(@Nullable clf $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(ccp $$0, ept $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.A().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
