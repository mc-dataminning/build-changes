import com.google.gson.JsonPrimitive;

public class og {
   public static final oh<og.a> a = new oh<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final oh<og.a> b = new oh<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final oh<ali> c = new oh<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final oh<Boolean> d = new oh<>("uvlock", JsonPrimitive::new);
   public static final oh<Integer> e = new oh<>("weight", JsonPrimitive::new);

   public static enum a {
      a(0),
      b(90),
      c(180),
      d(270);

      final int e;

      private a(final int $$0) {
         this.e = $$0;
      }
   }
}
