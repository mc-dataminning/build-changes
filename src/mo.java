import com.google.gson.JsonObject;

public abstract class mo {
   protected static coc a(mr $$0) {
      return switch ($$0) {
         case a -> coc.a;
         case e, f -> coc.c;
         case c -> coc.b;
         default -> coc.d;
      };
   }

   protected abstract static class a implements mp {
      private final coc a;

      protected a(coc $$0) {
         this.a = $$0;
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.addProperty("category", this.a.c());
      }
   }
}
