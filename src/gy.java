import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class gy implements ArgumentType<EnumSet<jn.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.c("arguments.swizzle.invalid"));

   public static gy a() {
      return new gy();
   }

   public static EnumSet<jn.a> a(CommandContext<ex> $$0, String $$1) {
      return (EnumSet<jn.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<jn.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<jn.a> $$1 = EnumSet.noneOf(jn.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         jn.a $$6 = switch ($$2) {
            case 'x' -> jn.a.a;
            case 'y' -> jn.a.b;
            case 'z' -> jn.a.c;
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
