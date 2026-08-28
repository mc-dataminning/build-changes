import com.google.gson.JsonPrimitive;

public class oi {
   public static final oj<oi.a> a = new oj<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final oj<oi.a> b = new oj<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final oj<alp> c = new oj<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final oj<Boolean> d = new oj<>("uvlock", JsonPrimitive::new);
   public static final oj<Integer> e = new oj<>("weight", JsonPrimitive::new);

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
