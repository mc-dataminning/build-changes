import com.google.gson.JsonPrimitive;

public class mn {
   public static final mo<mn.a> a = new mo<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final mo<mn.a> b = new mo<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final mo<ajc> c = new mo<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final mo<Boolean> d = new mo<>("uvlock", JsonPrimitive::new);
   public static final mo<Integer> e = new mo<>("weight", JsonPrimitive::new);

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
