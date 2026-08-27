import com.google.gson.JsonPrimitive;

public class la {
   public static final lb<la.a> a = new lb<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final lb<la.a> b = new lb<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final lb<aer> c = new lb<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final lb<Boolean> d = new lb<>("uvlock", JsonPrimitive::new);
   public static final lb<Integer> e = new lb<>("weight", JsonPrimitive::new);

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
