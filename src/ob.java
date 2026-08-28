import com.google.gson.JsonPrimitive;

public class ob {
   public static final oc<ob.a> a = new oc<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final oc<ob.a> b = new oc<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final oc<ale> c = new oc<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final oc<Boolean> d = new oc<>("uvlock", JsonPrimitive::new);
   public static final oc<Integer> e = new oc<>("weight", JsonPrimitive::new);

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
