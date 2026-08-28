import java.util.Objects;
import org.joml.Matrix4f;

public interface fww {
   static fww a(ayl $$0) {
      return new fwv($$0);
   }

   static fww a(cuk $$0) {
      Objects.requireNonNull($$0);

      return (fww)(switch ($$0) {
         case cuj $$1 -> new fwu($$1.a());
         case fwt.a $$2 -> new fwt($$2);
         default -> throw new IllegalArgumentException("Unknown TooltipComponent");
      });
   }

   int a(fod var1);

   int b(fod var1);

   default boolean a() {
      return false;
   }

   default void a(fod $$0, int $$1, int $$2, Matrix4f $$3, glz.a $$4) {
   }

   default void a(fod $$0, int $$1, int $$2, int $$3, int $$4, fof $$5) {
   }
}
