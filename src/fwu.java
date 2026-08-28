import java.util.Objects;
import org.joml.Matrix4f;

public interface fwu {
   static fwu a(ayl $$0) {
      return new fwt($$0);
   }

   static fwu a(cuj $$0) {
      Objects.requireNonNull($$0);

      return (fwu)(switch ($$0) {
         case cui $$1 -> new fws($$1.a());
         case fwr.a $$2 -> new fwr($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fob var1);

   int b(fob var1);

   default boolean a() {
      return false;
   }

   default void a(fob $$0, int $$1, int $$2, Matrix4f $$3, glx.a $$4) {
   }

   default void a(fob $$0, int $$1, int $$2, int $$3, int $$4, fod $$5) {
   }
}
