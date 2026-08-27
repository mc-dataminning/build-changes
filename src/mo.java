import com.google.gson.JsonObject;

public abstract class mo {
   protected static cnu a(mr $$0) {
      return switch ($$0) {
         case a -> cnu.a;
         case e, f -> cnu.c;
         case c -> cnu.b;
         default -> cnu.d;
      };
   }

   protected abstract static class a implements mp {
      private final cnu a;

      protected a(cnu $$0) {
         this.a = $$0;
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.addProperty("category", this.a.c());
      }
   }
}
