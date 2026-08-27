import com.google.gson.JsonPrimitive;

public class le {
   public static final lf<le.a> a = new lf<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final lf<le.a> b = new lf<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final lf<aex> c = new lf<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final lf<Boolean> d = new lf<>("uvlock", JsonPrimitive::new);
   public static final lf<Integer> e = new lf<>("weight", JsonPrimitive::new);

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
