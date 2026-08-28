import java.util.Objects;
import org.joml.Matrix4f;

public interface fwi {
   static fwi a(azq $$0) {
      return new fwh($$0);
   }

   static fwi a(cvj $$0) {
      Objects.requireNonNull($$0);

      return (fwi)(switch ($$0) {
         case cvi $$1 -> new fwg($$1.a());
         case fwf.a $$2 -> new fwf($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fnq var1);

   int b(fnq var1);

   default boolean a() {
      return false;
   }

   default void a(fnq $$0, int $$1, int $$2, Matrix4f $$3, gll.a $$4) {
   }

   default void a(fnq $$0, int $$1, int $$2, int $$3, int $$4, fns $$5) {
   }
}
