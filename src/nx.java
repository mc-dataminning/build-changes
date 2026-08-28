import com.google.gson.JsonPrimitive;

public class nx {
   public static final ny<nx.a> a = new ny<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final ny<nx.a> b = new ny<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final ny<akq> c = new ny<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final ny<Boolean> d = new ny<>("uvlock", JsonPrimitive::new);
   public static final ny<Integer> e = new ny<>("weight", JsonPrimitive::new);

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
