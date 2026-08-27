import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class gp implements gg<StringArgumentType, gp.a> {
   public void a(gp.a $$0, si $$1) {
      $$1.a((Enum<?>)$$0.b);
   }

   public gp.a a(si $$0) {
      StringType $$1 = $$0.b(StringType.class);
      return new gp.a($$1);
   }

   public void a(gp.a $$0, JsonObject $$1) {
      $$1.addProperty("type", switch ($$0.b) {
         case SINGLE_WORD -> "word";
         case QUOTABLE_PHRASE -> "phrase";
         case GREEDY_PHRASE -> "greedy";
         default -> throw new IncompatibleClassChangeError();
      });
   }

   public gp.a a(StringArgumentType $$0) {
      return new gp.a($$0.getType());
   }

   public final class a implements gg.a<StringArgumentType> {
      final StringType b;

      public a(StringType $$1) {
         this.b = $$1;
      }

      public StringArgumentType a(dl $$0) {
         return switch (this.b) {
            case SINGLE_WORD -> StringArgumentType.word();
            case QUOTABLE_PHRASE -> StringArgumentType.string();
            case GREEDY_PHRASE -> StringArgumentType.greedyString();
            default -> throw new IncompatibleClassChangeError();
         };
      }

      @Override
      public gg<StringArgumentType, ?> a() {
         return gp.this;
      }
   }
}
