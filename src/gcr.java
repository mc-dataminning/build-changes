import java.util.Objects;
import org.joml.Matrix4f;

public interface gcr {
   static gcr a(azc $$0) {
      return new gcq($$0);
   }

   static gcr a(cxz $$0) {
      Objects.requireNonNull($$0);

      return (gcr)(switch ($$0) {
         case cxy $$1 -> new gcp($$1.a());
         case gco.a $$2 -> new gco($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(ftx var1);

   int b(ftx var1);

   default boolean a() {
      return false;
   }

   default void a(ftx $$0, int $$1, int $$2, Matrix4f $$3, gsc.a $$4) {
   }

   default void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, ftz $$5) {
   }
}
