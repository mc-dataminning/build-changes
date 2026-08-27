import com.google.gson.JsonObject;

public abstract class ms {
   protected static coh a(mv $$0) {
      return switch ($$0) {
         case a -> coh.a;
         case e, f -> coh.c;
         case c -> coh.b;
         default -> coh.d;
      };
   }

   protected abstract static class a implements mt {
      private final coh a;

      protected a(coh $$0) {
         this.a = $$0;
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.addProperty("category", this.a.c());
      }
   }
}
