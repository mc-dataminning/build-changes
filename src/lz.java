import com.google.gson.JsonPrimitive;

public class lz {
   public static final ma<lz.a> a = new ma<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final ma<lz.a> b = new ma<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final ma<afw> c = new ma<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final ma<Boolean> d = new ma<>("uvlock", JsonPrimitive::new);
   public static final ma<Integer> e = new ma<>("weight", JsonPrimitive::new);

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
