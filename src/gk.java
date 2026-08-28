import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class gk implements ArgumentType<EnumSet<ja.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ww.c("arguments.swizzle.invalid"));

   public static gk a() {
      return new gk();
   }

   public static EnumSet<ja.a> a(CommandContext<ei> $$0, String $$1) {
      return (EnumSet<ja.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<ja.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<ja.a> $$1 = EnumSet.noneOf(ja.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         ja.a $$6 = switch ($$2) {
            case 'x' -> ja.a.a;
            case 'y' -> ja.a.b;
            case 'z' -> ja.a.c;
            default -> throw b.createWithContext($$0);
         };
         if ($$1.contains($$6)) {
            throw b.createWithContext($$0);
         }

         $$1.add($$6);
      }

      return $$1;
   }

   public Collection<String> getExamples() {
      return a;
   }
}
