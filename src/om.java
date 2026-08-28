import com.google.gson.JsonPrimitive;

public class om {
   public static final on<om.a> a = new on<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final on<om.a> b = new on<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final on<alz> c = new on<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final on<Boolean> d = new on<>("uvlock", JsonPrimitive::new);
   public static final on<Integer> e = new on<>("weight", JsonPrimitive::new);

   public static enum a {
      a(0),
      b(90),
      c(180),
      d(270);

      final int e;

      private a(final int $$0) {
         this.e = $$0;
      }
   }
}
