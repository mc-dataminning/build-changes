import java.util.Objects;
import org.joml.Matrix4f;

public interface fxs {
   static fxs a(ayl $$0) {
      return new fxr($$0);
   }

   static fxs a(cvd $$0) {
      Objects.requireNonNull($$0);

      return (fxs)(switch ($$0) {
         case cvc $$1 -> new fxq($$1.a());
         case fxp.a $$2 -> new fxp($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fpa var1);

   int b(fpa var1);

   default boolean a() {
      return false;
   }

   default void a(fpa $$0, int $$1, int $$2, Matrix4f $$3, gmx.a $$4) {
   }

   default void a(fpa $$0, int $$1, int $$2, int $$3, int $$4, fpc $$5) {
   }
}
