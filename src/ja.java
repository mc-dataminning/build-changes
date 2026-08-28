import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class ja implements ir<StringArgumentType, ja.a> {
   public void a(ja.a $$0, we $$1) {
      $$1.a((Enum<?>)$$0.b);
   }

   public ja.a a(we $$0) {
      StringType $$1 = $$0.b(StringType.class);
      return new ja.a($$1);
   }

   public void a(ja.a $$0, JsonObject $$1) {
      $$1.addProperty("type", switch ($$0.b) {
         case SINGLE_WORD -> "word";
         case QUOTABLE_PHRASE -> "phrase";
         case GREEDY_PHRASE -> "greedy";
         default -> throw new MatchException(null, null);
      });
   }

   public ja.a a(StringArgumentType $$0) {
      return new ja.a($$0.getType());
   }

   public final class a implements ir.a<StringArgumentType> {
      final StringType b;

      public a(final StringType $$1) {
         this.b = $$1;
      }

      public StringArgumentType a(er $$0) {
         return switch (this.b) {
            case SINGLE_WORD -> StringArgumentType.word();
            case QUOTABLE_PHRASE -> StringArgumentType.string();
            case GREEDY_PHRASE -> StringArgumentType.greedyString();
            default -> throw new MatchException(null, null);
         };
      }

      @Override
      public ir<StringArgumentType, ?> a() {
         return ja.this;
      }
   }
}
