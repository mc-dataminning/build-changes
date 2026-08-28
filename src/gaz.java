import java.util.Objects;
import org.joml.Matrix4f;

public interface gaz {
   static gaz a(ayy $$0) {
      return new gay($$0);
   }

   static gaz a(cxj $$0) {
      Objects.requireNonNull($$0);

      return (gaz)(switch ($$0) {
         case cxi $$1 -> new gax($$1.a());
         case gaw.a $$2 -> new gaw($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fsf var1);

   int b(fsf var1);

   default boolean a() {
      return false;
   }

   default void a(fsf $$0, int $$1, int $$2, Matrix4f $$3, gqm.a $$4) {
   }

   default void a(fsf $$0, int $$1, int $$2, int $$3, int $$4, fsh $$5) {
   }
}
