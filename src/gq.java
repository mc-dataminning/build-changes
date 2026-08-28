import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class gq implements ArgumentType<EnumSet<je.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("arguments.swizzle.invalid"));

   public static gq a() {
      return new gq();
   }

   public static EnumSet<je.a> a(CommandContext<ep> $$0, String $$1) {
      return (EnumSet<je.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<je.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<je.a> $$1 = EnumSet.noneOf(je.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         je.a $$6 = switch ($$2) {
            case 'x' -> je.a.a;
            case 'y' -> je.a.b;
            case 'z' -> je.a.c;
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
