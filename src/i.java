import java.util.Arrays;
import org.joml.Matrix3f;

public enum i {
   a(0, 1, 2),
   b(1, 0, 2),
   c(0, 2, 1),
   d(1, 2, 0),
   e(2, 0, 1),
   f(2, 1, 0);

   private final int[] g;
   private final Matrix3f h;
   private static final int i = 3;
   private static final i[][] j = ae.a(new i[values().length][values().length], $$0 -> {
      for (i $$1 : values()) {
         for (i $$2 : values()) {
            int[] $$3 = new int[3];

            for (int $$4 = 0; $$4 < 3; $$4++) {
               $$3[$$4] = $$1.g[$$2.g[$$4]];
            }

            i $$5 = Arrays.stream(values()).filter($$1x -> Arrays.equals($$1x.g, $$3)).findFirst().get();
            $$0[$$1.ordinal()][$$2.ordinal()] = $$5;
         }
      }
   });

   private i(final int $$0, final int $$1, final int $$2) {
      this.g = new int[]{$$0, $$1, $$2};
      this.h = new Matrix3f();
      this.h.set(this.a(0), 0, 1.0F);
      this.h.set(this.a(1), 1, 1.0F);
      this.h.set(this.a(2), 2, 1.0F);
   }

   public i a(i $$0) {
      return j[this.ordinal()][$$0.ordinal()];
   }

   public int a(int $$0) {
      return this.g[$$0];
   }

   public Matrix3f a() {
      return this.h;
   }
}
