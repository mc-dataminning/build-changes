import com.google.gson.JsonPrimitive;

public class nq {
   public static final nr<nq.a> a = new nr<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final nr<nq.a> b = new nr<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final nr<akm> c = new nr<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final nr<Boolean> d = new nr<>("uvlock", JsonPrimitive::new);
   public static final nr<Integer> e = new nr<>("weight", JsonPrimitive::new);

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
