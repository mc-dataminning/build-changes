import com.google.gson.JsonPrimitive;

public class mj {
   public static final mk<mj.a> a = new mk<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final mk<mj.a> b = new mk<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final mk<ahh> c = new mk<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final mk<Boolean> d = new mk<>("uvlock", JsonPrimitive::new);
   public static final mk<Integer> e = new mk<>("weight", JsonPrimitive::new);

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
