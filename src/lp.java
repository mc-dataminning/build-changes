import com.google.gson.JsonObject;

public abstract class lp {
   protected static cly a(ls $$0) {
      return switch ($$0) {
         case a -> cly.a;
         case e, f -> cly.c;
         case c -> cly.b;
         default -> cly.d;
      };
   }

   protected abstract static class a implements lq {
      private final cly a;

      protected a(cly $$0) {
         this.a = $$0;
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.addProperty("category", this.a.c());
      }
   }
}
