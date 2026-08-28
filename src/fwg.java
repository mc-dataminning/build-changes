import java.util.Objects;
import org.joml.Matrix4f;

public interface fwg {
   static fwg a(azq $$0) {
      return new fwf($$0);
   }

   static fwg a(cvi $$0) {
      Objects.requireNonNull($$0);

      return (fwg)(switch ($$0) {
         case cvh $$1 -> new fwe($$1.a());
         case fwd.a $$2 -> new fwd($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fno var1);

   int b(fno var1);

   default boolean a() {
      return false;
   }

   default void a(fno $$0, int $$1, int $$2, Matrix4f $$3, glj.a $$4) {
   }

   default void a(fno $$0, int $$1, int $$2, int $$3, int $$4, fnq $$5) {
   }
}
