import com.google.gson.JsonPrimitive;

public class mf {
   public static final mg<mf.a> a = new mg<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final mg<mf.a> b = new mg<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final mg<agm> c = new mg<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final mg<Boolean> d = new mg<>("uvlock", JsonPrimitive::new);
   public static final mg<Integer> e = new mg<>("weight", JsonPrimitive::new);

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
