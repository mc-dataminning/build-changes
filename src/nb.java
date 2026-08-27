import com.google.gson.JsonPrimitive;

public class nb {
   public static final nc<nb.a> a = new nc<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final nc<nb.a> b = new nc<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final nc<ajt> c = new nc<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final nc<Boolean> d = new nc<>("uvlock", JsonPrimitive::new);
   public static final nc<Integer> e = new nc<>("weight", JsonPrimitive::new);

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
