import java.util.Objects;
import org.joml.Matrix4f;

public interface fzu {
   static fzu a(ayw $$0) {
      return new fzt($$0);
   }

   static fzu a(cwr $$0) {
      Objects.requireNonNull($$0);

      return (fzu)(switch ($$0) {
         case cwq $$1 -> new fzs($$1.a());
         case fzr.a $$2 -> new fzr($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fra var1);

   int b(fra var1);

   default boolean a() {
      return false;
   }

   default void a(fra $$0, int $$1, int $$2, Matrix4f $$3, gpd.a $$4) {
   }

   default void a(fra $$0, int $$1, int $$2, int $$3, int $$4, frc $$5) {
   }
}
