import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class ii implements hy<StringArgumentType, ii.a> {
   public void a(ii.a $$0, vx $$1) {
      $$1.a((Enum<?>)$$0.b);
   }

   public ii.a a(vx $$0) {
      StringType $$1 = $$0.b(StringType.class);
      return new ii.a($$1);
   }

   public void a(ii.a $$0, JsonObject $$1) {
      $$1.addProperty("type", switch ($$0.b) {
         case SINGLE_WORD -> "word";
         case QUOTABLE_PHRASE -> "phrase";
         case GREEDY_PHRASE -> "greedy";
         default -> throw new MatchException(null, null);
      });
   }

   public ii.a a(StringArgumentType $$0) {
      return new ii.a($$0.getType());
   }

   public final class a implements hy.a<StringArgumentType> {
      final StringType b;

      public a(StringType $$1) {
         this.b = $$1;
      }

      public StringArgumentType a(ea $$0) {
         return switch (this.b) {
            case SINGLE_WORD -> StringArgumentType.word();
            case QUOTABLE_PHRASE -> StringArgumentType.string();
            case GREEDY_PHRASE -> StringArgumentType.greedyString();
            default -> throw new MatchException(null, null);
         };
      }

      @Override
      public hy<StringArgumentType, ?> a() {
         return ii.this;
      }
   }
}
