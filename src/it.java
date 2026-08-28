import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class it implements ik<StringArgumentType, it.a> {
   public void a(it.a $$0, wm $$1) {
      $$1.a((Enum<?>)$$0.b);
   }

   public it.a a(wm $$0) {
      StringType $$1 = $$0.b(StringType.class);
      return new it.a($$1);
   }

   public void a(it.a $$0, JsonObject $$1) {
      $$1.addProperty("type", switch ($$0.b) {
         case SINGLE_WORD -> "word";
         case QUOTABLE_PHRASE -> "phrase";
         case GREEDY_PHRASE -> "greedy";
         default -> throw new MatchException(null, null);
      });
   }

   public it.a a(StringArgumentType $$0) {
      return new it.a($$0.getType());
   }

   public final class a implements ik.a<StringArgumentType> {
      final StringType b;

      public a(final StringType $$1) {
         this.b = $$1;
      }

      public StringArgumentType a(el $$0) {
         return switch (this.b) {
            case SINGLE_WORD -> StringArgumentType.word();
            case QUOTABLE_PHRASE -> StringArgumentType.string();
            case GREEDY_PHRASE -> StringArgumentType.greedyString();
            default -> throw new MatchException(null, null);
         };
      }

      @Override
      public ik<StringArgumentType, ?> a() {
         return it.this;
      }
   }
}
