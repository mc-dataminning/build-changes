import com.google.gson.JsonPrimitive;

public class ns {
   public static final nt<ns.a> a = new nt<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final nt<ns.a> b = new nt<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final nt<akt> c = new nt<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final nt<Boolean> d = new nt<>("uvlock", JsonPrimitive::new);
   public static final nt<Integer> e = new nt<>("weight", JsonPrimitive::new);

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
