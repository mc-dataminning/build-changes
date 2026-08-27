import com.google.gson.JsonPrimitive;

public class lb {
   public static final lc<lb.a> a = new lc<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final lc<lb.a> b = new lc<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final lc<aep> c = new lc<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final lc<Boolean> d = new lc<>("uvlock", JsonPrimitive::new);
   public static final lc<Integer> e = new lc<>("weight", JsonPrimitive::new);

   public static enum a {
      a(0),
      b(90),
      c(180),
      d(270);

      final int e;

      private a(int $$0) {
         this.e = $$0;
      }
   }
}
