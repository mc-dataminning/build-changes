import java.util.Objects;
import org.joml.Matrix4f;

public interface fwb {
   static fwb a(azg $$0) {
      return new fwa($$0);
   }

   static fwb a(cva $$0) {
      Objects.requireNonNull($$0);

      return (fwb)(switch ($$0) {
         case cuz $$1 -> new fvz($$1.a());
         case fvy.a $$2 -> new fvy($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fnj var1);

   int b(fnj var1);

   default boolean a() {
      return false;
   }

   default void a(fnj $$0, int $$1, int $$2, Matrix4f $$3, glg.a $$4) {
   }

   default void a(fnj $$0, int $$1, int $$2, int $$3, int $$4, fnl $$5) {
   }
}
