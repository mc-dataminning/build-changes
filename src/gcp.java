import java.util.Objects;
import org.joml.Matrix4f;

public interface gcp {
   static gcp a(aza $$0) {
      return new gco($$0);
   }

   static gcp a(cxx $$0) {
      Objects.requireNonNull($$0);

      return (gcp)(switch ($$0) {
         case cxw $$1 -> new gcn($$1.a());
         case gcm.a $$2 -> new gcm($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(ftv var1);

   int b(ftv var1);

   default boolean a() {
      return false;
   }

   default void a(ftv $$0, int $$1, int $$2, Matrix4f $$3, gsa.a $$4) {
   }

   default void a(ftv $$0, int $$1, int $$2, int $$3, int $$4, ftx $$5) {
   }
}
