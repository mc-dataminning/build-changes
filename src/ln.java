import com.google.gson.JsonObject;

public abstract class ln {
   protected static clq a(lq $$0) {
      return switch ($$0) {
         case a -> clq.a;
         case e, f -> clq.c;
         case c -> clq.b;
         default -> clq.d;
      };
   }

   protected abstract static class a implements lo {
      private final clq a;

      protected a(clq $$0) {
         this.a = $$0;
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.addProperty("category", this.a.c());
      }
   }
}
