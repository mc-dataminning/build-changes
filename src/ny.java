import com.google.gson.JsonPrimitive;

public class ny {
   public static final nz<ny.a> a = new nz<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final nz<ny.a> b = new nz<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final nz<akr> c = new nz<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final nz<Boolean> d = new nz<>("uvlock", JsonPrimitive::new);
   public static final nz<Integer> e = new nz<>("weight", JsonPrimitive::new);

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
