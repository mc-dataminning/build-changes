import com.google.gson.JsonObject;

public abstract class lr {
   protected static cma a(lu $$0) {
      return switch ($$0) {
         case a -> cma.a;
         case e, f -> cma.c;
         case c -> cma.b;
         default -> cma.d;
      };
   }

   protected abstract static class a implements ls {
      private final cma a;

      protected a(cma $$0) {
         this.a = $$0;
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.addProperty("category", this.a.c());
      }
   }
}
