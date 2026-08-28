import java.util.Objects;
import org.joml.Matrix4f;

public interface fyr {
   static fyr a(ayw $$0) {
      return new fyq($$0);
   }

   static fyr a(cvu $$0) {
      Objects.requireNonNull($$0);

      return (fyr)(switch ($$0) {
         case cvt $$1 -> new fyp($$1.a());
         case fyo.a $$2 -> new fyo($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fpx var1);

   int b(fpx var1);

   default boolean a() {
      return false;
   }

   default void a(fpx $$0, int $$1, int $$2, Matrix4f $$3, gny.a $$4) {
   }

   default void a(fpx $$0, int $$1, int $$2, int $$3, int $$4, fpz $$5) {
   }
}
