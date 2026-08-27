import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class hu implements hl<StringArgumentType, hu.a> {
   public void a(hu.a $$0, uq $$1) {
      $$1.a((Enum<?>)$$0.b);
   }

   public hu.a a(uq $$0) {
      StringType $$1 = $$0.b(StringType.class);
      return new hu.a($$1);
   }

   public void a(hu.a $$0, JsonObject $$1) {
      $$1.addProperty("type", switch ($$0.b) {
         case SINGLE_WORD -> "word";
         case QUOTABLE_PHRASE -> "phrase";
         case GREEDY_PHRASE -> "greedy";
         default -> throw new IncompatibleClassChangeError();
      });
   }

   public hu.a a(StringArgumentType $$0) {
      return new hu.a($$0.getType());
   }

   public final class a implements hl.a<StringArgumentType> {
      final StringType b;

      public a(StringType $$1) {
         this.b = $$1;
      }

      public StringArgumentType a(dq $$0) {
         return switch (this.b) {
            case SINGLE_WORD -> StringArgumentType.word();
            case QUOTABLE_PHRASE -> StringArgumentType.string();
            case GREEDY_PHRASE -> StringArgumentType.greedyString();
            default -> throw new IncompatibleClassChangeError();
         };
      }

      @Override
      public hl<StringArgumentType, ?> a() {
         return hu.this;
      }
   }
}
