import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gpj extends gop<clg, gvf, fzd> {
   private static final alc a = gib.i.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final alc[] b = gib.j.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(alc[]::new);

   public gpj(gnj.a $$0) {
      super($$0, new fzd($$0.a(gak.ci)), 0.0F);
   }

   public eys a(gvf $$0) {
      return $$0.a;
   }

   public boolean a(clg $$0, gkx $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         eys $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            btv<?> $$6 = $$0.ao();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            eys $$9 = eys.c($$0.ds());
            return $$1.a(new eyn($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public alc b(gvf $$0) {
      return a($$0.b);
   }

   public gvf c() {
      return new gvf();
   }

   public void a(clg $$0, gvf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), eys.c);
      $$1.b = $$0.gq();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aV;
      $$1.e = $$0.aT;
      $$1.f = $$0.y();
   }

   public static alc a(@Nullable cuj $$0) {
      return $$0 == null ? a : b[$$0.a()];
   }

   protected void a(gvf $$0, fde $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
