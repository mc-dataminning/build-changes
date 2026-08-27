import com.google.gson.JsonObject;

public abstract class lp {
   protected static clt a(ls $$0) {
      return switch ($$0) {
         case a -> clt.a;
         case e, f -> clt.c;
         case c -> clt.b;
         default -> clt.d;
      };
   }

   protected abstract static class a implements lq {
      private final clt a;

      protected a(clt $$0) {
         this.a = $$0;
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.addProperty("category", this.a.c());
      }
   }
}
