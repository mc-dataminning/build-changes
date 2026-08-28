import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gtq extends gsv<cnc, gzo, gde> {
   private static final alz a = gmf.i.b().a((UnaryOperator<String>)($$0 -> "textures/" + $$0 + ".png"));
   private static final alz[] b = gmf.j.stream().map($$0 -> $$0.b().a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).toArray(alz[]::new);

   public gtq(grp.a $$0) {
      super($$0, new gde($$0.a(gem.cB)), 0.0F);
   }

   public fbx a(gzo $$0) {
      return $$0.a;
   }

   public boolean a(cnc $$0, gpb $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         fbx $$5 = $$0.K(0.0F);
         if ($$5 == null) {
            return false;
         } else {
            bvq<?> $$6 = $$0.aq();
            float $$7 = $$6.m() / 2.0F;
            float $$8 = $$6.l() / 2.0F;
            fbx $$9 = fbx.c($$0.dw());
            return $$1.a(new fbs($$5.d, $$5.e + (double)$$7, $$5.f, $$9.d, $$9.e + (double)$$7, $$9.f).c((double)$$8, (double)$$7, (double)$$8));
         }
      }
   }

   public alz b(gzo $$0) {
      return a($$0.b);
   }

   public gzo b() {
      return new gzo();
   }

   public void a(cnc $$0, gzo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = Objects.requireNonNullElse($$0.K($$2), fbx.c);
      $$1.b = $$0.go();
      $$1.c = $$0.J($$2);
      $$1.d = $$0.aZ;
      $$1.e = $$0.aX;
      $$1.f = $$0.t();
   }

   public static alz a(@Nullable cwl $$0) {
      return $$0 == null ? a : b[$$0.a()];
   }

   protected void a(gzo $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2 + 180.0F, $$3);
      $$1.a($$0.f.g().b(), 0.0F, 0.5F, 0.0F);
   }
}
