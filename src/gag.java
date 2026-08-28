import java.util.Objects;
import org.joml.Matrix4f;

public interface gag {
   static gag a(ayy $$0) {
      return new gaf($$0);
   }

   static gag a(cwx $$0) {
      Objects.requireNonNull($$0);

      return (gag)(switch ($$0) {
         case cww $$1 -> new gae($$1.a());
         case gad.a $$2 -> new gad($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(frm var1);

   int b(frm var1);

   default boolean a() {
      return false;
   }

   default void a(frm $$0, int $$1, int $$2, Matrix4f $$3, gps.a $$4) {
   }

   default void a(frm $$0, int $$1, int $$2, int $$3, int $$4, fro $$5) {
   }
}
