import com.google.gson.JsonPrimitive;

public class oc {
   public static final od<oc.a> a = new od<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final od<oc.a> b = new od<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final od<ale> c = new od<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final od<Boolean> d = new od<>("uvlock", JsonPrimitive::new);
   public static final od<Integer> e = new od<>("weight", JsonPrimitive::new);

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
