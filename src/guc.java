import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class guc extends gth<cmc, hac, gdr> {
   private static final aku a = gmq.i.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final aku[] b = gmq.j.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(aku[]::new);

   public guc(gsb.a $$0) {
      super($$0, new gdr($$0.a(gez.cE)), 0.0F);
   }

   public fay a(hac $$0) {
      return $$0.a;
   }

   public boolean a(cmc $$0, gpn $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         fay $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            buq<?> $$6 = $$0.aq();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            fay $$9 = fay.c($$0.dw());
            return $$1.a(new fat($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public aku b(hac $$0) {
      return a($$0.b);
   }

   public hac b() {
      return new hac();
   }

   public void a(cmc $$0, hac $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), fay.c);
      $$1.b = $$0.gp();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aZ;
      $$1.e = $$0.aX;
      $$1.f = $$0.t();
   }

   public static aku a(@Nullable cvk $$0) {
      return $$0 == null ? a : b[$$0.a()];
   }

   protected void a(hac $$0, ffs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
