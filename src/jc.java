import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class jc implements it<StringArgumentType, jc.a> {
   public void a(jc.a $$0, vl $$1) {
      $$1.a((Enum<?>)$$0.b);
   }

   public jc.a a(vl $$0) {
      StringType $$1 = $$0.b(StringType.class);
      return new jc.a($$1);
   }

   public void a(jc.a $$0, JsonObject $$1) {
      $$1.addProperty("type", switch ($$0.b) {
         case SINGLE_WORD -> "word";
         case QUOTABLE_PHRASE -> "phrase";
         case GREEDY_PHRASE -> "greedy";
         default -> throw new MatchException(null, null);
      });
   }

   public jc.a a(StringArgumentType $$0) {
      return new jc.a($$0.getType());
   }

   public final class a implements it.a<StringArgumentType> {
      final StringType b;

      public a(final StringType $$1) {
         this.b = $$1;
      }

      public StringArgumentType a(et $$0) {
         return switch (this.b) {
            case SINGLE_WORD -> StringArgumentType.word();
            case QUOTABLE_PHRASE -> StringArgumentType.string();
            case GREEDY_PHRASE -> StringArgumentType.greedyString();
            default -> throw new MatchException(null, null);
         };
      }

      @Override
      public it<StringArgumentType, ?> a() {
         return jc.this;
      }
   }
}
