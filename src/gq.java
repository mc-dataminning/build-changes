import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class gq implements gh<StringArgumentType, gq.a> {
   public void a(gq.a $$0, sh $$1) {
      $$1.a((Enum<?>)$$0.b);
   }

   public gq.a a(sh $$0) {
      StringType $$1 = $$0.b(StringType.class);
      return new gq.a($$1);
   }

   public void a(gq.a $$0, JsonObject $$1) {
      $$1.addProperty("type", switch ($$0.b) {
         case SINGLE_WORD -> "word";
         case QUOTABLE_PHRASE -> "phrase";
         case GREEDY_PHRASE -> "greedy";
         default -> throw new IncompatibleClassChangeError();
      });
   }

   public gq.a a(StringArgumentType $$0) {
      return new gq.a($$0.getType());
   }

   public final class a implements gh.a<StringArgumentType> {
      final StringType b;

      public a(StringType $$1) {
         this.b = $$1;
      }

      public StringArgumentType a(dm $$0) {
         return switch (this.b) {
            case SINGLE_WORD -> StringArgumentType.word();
            case QUOTABLE_PHRASE -> StringArgumentType.string();
            case GREEDY_PHRASE -> StringArgumentType.greedyString();
            default -> throw new IncompatibleClassChangeError();
         };
      }

      @Override
      public gh<StringArgumentType, ?> a() {
         return gq.this;
      }
   }
}
