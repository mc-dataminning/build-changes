import com.google.gson.JsonPrimitive;

public class nn {
   public static final no<nn.a> a = new no<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final no<nn.a> b = new no<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final no<akh> c = new no<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final no<Boolean> d = new no<>("uvlock", JsonPrimitive::new);
   public static final no<Integer> e = new no<>("weight", JsonPrimitive::new);

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
