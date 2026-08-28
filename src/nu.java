import com.google.gson.JsonPrimitive;

public class nu {
   public static final nv<nu.a> a = new nv<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final nv<nu.a> b = new nv<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final nv<akk> c = new nv<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final nv<Boolean> d = new nv<>("uvlock", JsonPrimitive::new);
   public static final nv<Integer> e = new nv<>("weight", JsonPrimitive::new);

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
