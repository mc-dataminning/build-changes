import com.google.gson.JsonPrimitive;

public class mh {
   public static final mi<mh.a> a = new mi<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final mi<mh.a> b = new mi<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final mi<ahd> c = new mi<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final mi<Boolean> d = new mi<>("uvlock", JsonPrimitive::new);
   public static final mi<Integer> e = new mi<>("weight", JsonPrimitive::new);

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
