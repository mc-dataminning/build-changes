import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gmh extends gln<ckj, fxb<ckj>> {
   private static final akr a = gfm.i.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final akr[] i = gfm.j.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(akr[]::new);

   public gmh(gkh.a $$0) {
      super($$0, new fxb<>($$0.a(fyh.bl)), 0.0F);
      this.a(new gow(this));
   }

   public exa a(ckj $$0, float $$1) {
      return $$0.I($$1).orElse(super.a($$0, $$1)).a((double)$$0.ec());
   }

   public boolean a(ckj $$0, gic $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.I(0.0F).filter($$2x -> {
         bsx<?> $$3x = $$0.am();
         float $$4x = $$3x.m() / 2.0F;
         float $$5 = $$3x.l() / 2.0F;
         exa $$6 = exa.c($$0.dp());
         return $$1.a(new ewv($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public akr a(ckj $$0) {
      return a($$0.gm());
   }

   public static akr a(@Nullable cti $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(ckj $$0, fbg $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4, $$5);
      $$1.a($$0.x().g().b(), 0.0F, 0.5F, 0.0F);
   }
}
