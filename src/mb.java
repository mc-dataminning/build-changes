import com.google.gson.JsonPrimitive;

public class mb {
   public static final mc<mb.a> a = new mc<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final mc<mb.a> b = new mc<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final mc<agi> c = new mc<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final mc<Boolean> d = new mc<>("uvlock", JsonPrimitive::new);
   public static final mc<Integer> e = new mc<>("weight", JsonPrimitive::new);

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
