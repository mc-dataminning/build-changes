import java.util.Objects;
import org.joml.Matrix4f;

public interface gbe {
   static gbe a(ayy $$0) {
      return new gbd($$0);
   }

   static gbe a(cxm $$0) {
      Objects.requireNonNull($$0);

      return (gbe)(switch ($$0) {
         case cxl $$1 -> new gbc($$1.a());
         case gbb.a $$2 -> new gbb($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fsk var1);

   int b(fsk var1);

   default boolean a() {
      return false;
   }

   default void a(fsk $$0, int $$1, int $$2, Matrix4f $$3, gqr.a $$4) {
   }

   default void a(fsk $$0, int $$1, int $$2, int $$3, int $$4, fsm $$5) {
   }
}
