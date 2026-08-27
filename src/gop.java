import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import org.joml.Quaternionf;

public enum gop implements gow {
   a(0, 0),
   b(0, 90),
   c(0, 180),
   d(0, 270),
   e(90, 0),
   f(90, 90),
   g(90, 180),
   h(90, 270),
   i(180, 0),
   j(180, 90),
   k(180, 180),
   l(180, 270),
   m(270, 0),
   n(270, 90),
   o(270, 180),
   p(270, 270);

   private static final int q = 360;
   private static final Map<Integer, gop> r = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.u, $$0 -> (gop)$$0));
   private final j s;
   private final h t;
   private final int u;

   private static int b(int $$0, int $$1) {
      return $$0 * 360 + $$1;
   }

   private gop(int $$0, int $$1) {
      this.u = b($$0, $$1);
      Quaternionf $$2 = new Quaternionf().rotateYXZ((float)(-$$1) * (float) (Math.PI / 180.0), (float)(-$$0) * (float) (Math.PI / 180.0), 0.0F);
      h $$3 = h.a;

      for (int $$4 = 0; $$4 < $$1; $$4 += 90) {
         $$3 = $$3.a(h.u);
      }

      for (int $$5 = 0; $$5 < $$0; $$5 += 90) {
         $$3 = $$3.a(h.s);
      }

      this.s = new j(null, $$2, null, null);
      this.t = $$3;
   }

   @Override
   public j b() {
      return this.s;
   }

   public static gop a(int $$0, int $$1) {
      return r.get(b(axw.b($$0, 360), axw.b($$1, 360)));
   }

   public h a() {
      return this.t;
   }
}
