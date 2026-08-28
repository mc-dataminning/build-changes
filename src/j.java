import java.util.Arrays;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;

public enum j {
   a(0, 1, 2),
   b(1, 0, 2),
   c(0, 2, 1),
   d(1, 2, 0),
   e(2, 0, 1),
   f(2, 1, 0);

   private final int[] g;
   private final Matrix3fc h;
   private static final int i = 3;
   private static final j[][] j = ag.a(new j[values().length][values().length], $$0 -> {
      for (j $$1 : values()) {
         for (j $$2 : values()) {
            int[] $$3 = new int[3];

            for (int $$4 = 0; $$4 < 3; $$4++) {
               $$3[$$4] = $$1.g[$$2.g[$$4]];
            }

            j $$5 = Arrays.stream(values()).filter($$1x -> Arrays.equals($$1x.g, $$3)).findFirst().get();
            $$0[$$1.ordinal()][$$2.ordinal()] = $$5;
         }
      }
   });

   private j(final int $$0, final int $$1, final int $$2) {
      this.g = new int[]{$$0, $$1, $$2};
      Matrix3f $$3 = new Matrix3f().zero();
      $$3.set(this.a(0), 0, 1.0F);
      $$3.set(this.a(1), 1, 1.0F);
      $$3.set(this.a(2), 2, 1.0F);
      this.h = $$3;
   }

   public j a(j $$0) {
      return j[this.ordinal()][$$0.ordinal()];
   }

   public int a(int $$0) {
      return this.g[$$0];
   }

   public Matrix3fc a() {
      return this.h;
   }
}
