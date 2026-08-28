import java.util.Objects;
import org.joml.Matrix4f;

public interface fws {
   static fws a(ayk $$0) {
      return new fwr($$0);
   }

   static fws a(cuh $$0) {
      Objects.requireNonNull($$0);

      return (fws)(switch ($$0) {
         case cug $$1 -> new fwq($$1.a());
         case fwp.a $$2 -> new fwp($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fnz var1);

   int b(fnz var1);

   default boolean a() {
      return false;
   }

   default void a(fnz $$0, int $$1, int $$2, Matrix4f $$3, glv.a $$4) {
   }

   default void a(fnz $$0, int $$1, int $$2, int $$3, int $$4, fob $$5) {
   }
}
