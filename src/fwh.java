import java.util.Objects;
import org.joml.Matrix4f;

public interface fwh {
   static fwh a(azq $$0) {
      return new fwg($$0);
   }

   static fwh a(cvi $$0) {
      Objects.requireNonNull($$0);

      return (fwh)(switch ($$0) {
         case cvh $$1 -> new fwf($$1.a());
         case fwe.a $$2 -> new fwe($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fnp var1);

   int b(fnp var1);

   default boolean a() {
      return false;
   }

   default void a(fnp $$0, int $$1, int $$2, Matrix4f $$3, glk.a $$4) {
   }

   default void a(fnp $$0, int $$1, int $$2, int $$3, int $$4, fnr $$5) {
   }
}
