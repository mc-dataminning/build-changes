import com.google.gson.JsonObject;

public abstract class lp {
   protected static cme a(ls $$0) {
      return switch ($$0) {
         case a -> cme.a;
         case e, f -> cme.c;
         case c -> cme.b;
         default -> cme.d;
      };
   }

   protected abstract static class a implements lq {
      private final cme a;

      protected a(cme $$0) {
         this.a = $$0;
      }

      @Override
      public void a(JsonObject $$0) {
         $$0.addProperty("category", this.a.c());
      }
   }
}
