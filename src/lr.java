import com.google.gson.JsonObject;

public abstract class lr {
   protected static cly a(lu $$0) {
      return switch ($$0) {
         case a -> cly.a;
         case e, f -> cly.c;
         case c -> cly.b;
         default -> cly.d;
      };
   }

   protected abstract static class a implements ls {
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
