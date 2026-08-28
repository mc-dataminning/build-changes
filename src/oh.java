import com.google.gson.JsonPrimitive;

public class oh {
   public static final oi<oh.a> a = new oi<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final oi<oh.a> b = new oi<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final oi<alj> c = new oi<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final oi<Boolean> d = new oi<>("uvlock", JsonPrimitive::new);
   public static final oi<Integer> e = new oi<>("weight", JsonPrimitive::new);

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
