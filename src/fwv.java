import java.util.Objects;
import org.joml.Matrix4f;

public interface fwv {
   static fwv a(ayl $$0) {
      return new fwu($$0);
   }

   static fwv a(cuj $$0) {
      Objects.requireNonNull($$0);

      return (fwv)(switch ($$0) {
         case cui $$1 -> new fwt($$1.a());
         case fws.a $$2 -> new fws($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(foc var1);

   int b(foc var1);

   default boolean a() {
      return false;
   }

   default void a(foc $$0, int $$1, int $$2, Matrix4f $$3, gly.a $$4) {
   }

   default void a(foc $$0, int $$1, int $$2, int $$3, int $$4, foe $$5) {
   }
}
