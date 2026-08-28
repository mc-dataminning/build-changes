import java.util.Objects;
import org.joml.Matrix4f;

public interface gan {
   static gan a(ayy $$0) {
      return new gam($$0);
   }

   static gan a(cxc $$0) {
      Objects.requireNonNull($$0);

      return (gan)(switch ($$0) {
         case cxb $$1 -> new gal($$1.a());
         case gak.a $$2 -> new gak($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(frt var1);

   int b(frt var1);

   default boolean a() {
      return false;
   }

   default void a(frt $$0, int $$1, int $$2, Matrix4f $$3, gqa.a $$4) {
   }

   default void a(frt $$0, int $$1, int $$2, int $$3, int $$4, frv $$5) {
   }
}
