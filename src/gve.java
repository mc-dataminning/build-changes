import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gve extends guj<cmy, hbe, get> {
   private static final aku a = gns.i.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final aku[] b = gns.j.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(aku[]::new);

   public gve(gtd.a $$0) {
      super($$0, new get($$0.a(ggb.cG)), 0.0F);
   }

   public fbx a(hbe $$0) {
      return $$0.a;
   }

   public boolean a(cmy $$0, gqp $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         fbx $$5 = $$0.L(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            bvi<?> $$6 = $$0.aq();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            fbx $$9 = fbx.c($$0.du());
            return $$1.a(new fbs($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public aku b(hbe $$0) {
      return a($$0.b);
   }

   public hbe b() {
      return new hbe();
   }

   public void a(cmy $$0, hbe $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.L($$2), fbx.c);
      $$1.b = $$0.t();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.aX;
      $$1.e = $$0.aV;
      $$1.f = $$0.n();
   }

   public static aku a(@Nullable cwe $$0) {
      return $$0 == null ? a : b[$$0.a()];
   }

   protected void a(hbe $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
