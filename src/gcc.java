import java.util.Objects;
import org.joml.Matrix4f;

public interface gcc {
   static gcc a(azk $$0) {
      return new gcb($$0);
   }

   static gcc a(cyj $$0) {
      Objects.requireNonNull($$0);

      return (gcc)(switch ($$0) {
         case cyi $$1 -> new gca($$1.a());
         case gbz.a $$2 -> new gbz($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fti var1);

   int b(fti var1);

   default boolean a() {
      return false;
   }

   default void a(fti $$0, int $$1, int $$2, Matrix4f $$3, grn.a $$4) {
   }

   default void a(fti $$0, int $$1, int $$2, int $$3, int $$4, ftk $$5) {
   }
}
