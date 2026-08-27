import com.google.gson.JsonPrimitive;

public class lc {
   public static final ld<lc.a> a = new ld<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final ld<lc.a> b = new ld<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final ld<aeu> c = new ld<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final ld<Boolean> d = new ld<>("uvlock", JsonPrimitive::new);
   public static final ld<Integer> e = new ld<>("weight", JsonPrimitive::new);

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
