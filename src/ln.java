import com.google.gson.JsonObject;

public abstract class ln {
   protected static cis a(lq $$0) {
      return switch ($$0) {
         case a -> cis.a;
         case e, f -> cis.c;
         case c -> cis.b;
         default -> cis.d;
      };
   }

   protected abstract static class a implements lo {
      private final cis a;

      protected a(cis $$0) {
         this.a = $$0;
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.addProperty("category", this.a.c());
      }
   }
}
