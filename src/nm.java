import com.google.gson.JsonPrimitive;

public class nm {
   public static final nn<nm.a> a = new nn<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final nn<nm.a> b = new nn<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final nn<akf> c = new nn<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final nn<Boolean> d = new nn<>("uvlock", JsonPrimitive::new);
   public static final nn<Integer> e = new nn<>("weight", JsonPrimitive::new);

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
