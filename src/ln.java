import com.google.gson.JsonObject;

public abstract class ln {
   protected static clr a(lq $$0) {
      return switch ($$0) {
         case a -> clr.a;
         case e, f -> clr.c;
         case c -> clr.b;
         default -> clr.d;
      };
   }

   protected abstract static class a implements lo {
      private final clr a;

      protected a(clr $$0) {
         this.a = $$0;
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.addProperty("category", this.a.c());
      }
   }
}
