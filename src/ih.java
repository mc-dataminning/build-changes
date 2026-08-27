import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class ih implements hx<StringArgumentType, ih.a> {
   public void a(ih.a $$0, vu $$1) {
      $$1.a((Enum<?>)$$0.b);
   }

   public ih.a a(vu $$0) {
      StringType $$1 = $$0.b(StringType.class);
      return new ih.a($$1);
   }

   public void a(ih.a $$0, JsonObject $$1) {
      $$1.addProperty("type", switch ($$0.b) {
         case SINGLE_WORD -> "word";
         case QUOTABLE_PHRASE -> "phrase";
         case GREEDY_PHRASE -> "greedy";
         default -> throw new IncompatibleClassChangeError();
      });
   }

   public ih.a a(StringArgumentType $$0) {
      return new ih.a($$0.getType());
   }

   public final class a implements hx.a<StringArgumentType> {
      final StringType b;

      public a(StringType $$1) {
         this.b = $$1;
      }

      public StringArgumentType a(dz $$0) {
         return switch (this.b) {
            case SINGLE_WORD -> StringArgumentType.word();
            case QUOTABLE_PHRASE -> StringArgumentType.string();
            case GREEDY_PHRASE -> StringArgumentType.greedyString();
            default -> throw new IncompatibleClassChangeError();
         };
      }

      @Override
      public hx<StringArgumentType, ?> a() {
         return ih.this;
      }
   }
}
