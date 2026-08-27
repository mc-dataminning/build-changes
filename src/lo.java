import com.google.gson.JsonObject;

public abstract class lo {
   protected static clp a(lr $$0) {
      return switch ($$0) {
         case a -> clp.a;
         case e, f -> clp.c;
         case c -> clp.b;
         default -> clp.d;
      };
   }

   protected abstract static class a implements lp {
      private final clp a;

      protected a(clp $$0) {
         this.a = $$0;
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.addProperty("category", this.a.c());
      }
   }
}
