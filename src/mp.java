import com.google.gson.JsonPrimitive;

public class mp {
   public static final mq<mp.a> a = new mq<>("x", $$0 -> new JsonPrimitive($$0.e));
   public static final mq<mp.a> b = new mq<>("y", $$0 -> new JsonPrimitive($$0.e));
   public static final mq<ajh> c = new mq<>("model", $$0 -> new JsonPrimitive($$0.toString()));
   public static final mq<Boolean> d = new mq<>("uvlock", JsonPrimitive::new);
   public static final mq<Integer> e = new mq<>("weight", JsonPrimitive::new);

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
