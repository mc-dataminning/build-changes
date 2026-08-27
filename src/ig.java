import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class ig implements hw<StringArgumentType, ig.a> {
   public void a(ig.a $$0, vs $$1) {
      $$1.a((Enum<?>)$$0.b);
   }

   public ig.a a(vs $$0) {
      StringType $$1 = $$0.b(StringType.class);
      return new ig.a($$1);
   }

   public void a(ig.a $$0, JsonObject $$1) {
      $$1.addProperty("type", switch ($$0.b) {
         case SINGLE_WORD -> "word";
         case QUOTABLE_PHRASE -> "phrase";
         case GREEDY_PHRASE -> "greedy";
         default -> throw new IncompatibleClassChangeError();
      });
   }

   public ig.a a(StringArgumentType $$0) {
      return new ig.a($$0.getType());
   }

   public final class a implements hw.a<StringArgumentType> {
      final StringType b;

      public a(StringType $$1) {
         this.b = $$1;
      }

      public StringArgumentType a(dy $$0) {
         return switch (this.b) {
            case SINGLE_WORD -> StringArgumentType.word();
            case QUOTABLE_PHRASE -> StringArgumentType.string();
            case GREEDY_PHRASE -> StringArgumentType.greedyString();
            default -> throw new IncompatibleClassChangeError();
         };
      }

      @Override
      public hw<StringArgumentType, ?> a() {
         return ig.this;
      }
   }
}
