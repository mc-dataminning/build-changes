import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class gu implements ArgumentType<EnumSet<ji.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("arguments.swizzle.invalid"));

   public static gu a() {
      return new gu();
   }

   public static EnumSet<ji.a> a(CommandContext<et> $$0, String $$1) {
      return (EnumSet<ji.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<ji.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<ji.a> $$1 = EnumSet.noneOf(ji.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         ji.a $$6 = switch ($$2) {
            case 'x' -> ji.a.a;
            case 'y' -> ji.a.b;
            case 'z' -> ji.a.c;
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
