import com.google.gson.JsonObject;

public abstract class mm {
   protected static cnc a(mp $$0) {
      return switch ($$0) {
         case a -> cnc.a;
         case e, f -> cnc.c;
         case c -> cnc.b;
         default -> cnc.d;
      };
   }

   protected abstract static class a implements mn {
      private final cnc a;

      protected a(cnc $$0) {
         this.a = $$0;
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.addProperty("category", this.a.c());
      }
   }
}
