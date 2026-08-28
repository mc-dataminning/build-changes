import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class gr implements ArgumentType<EnumSet<jf.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("arguments.swizzle.invalid"));

   public static gr a() {
      return new gr();
   }

   public static EnumSet<jf.a> a(CommandContext<eq> $$0, String $$1) {
      return (EnumSet<jf.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<jf.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<jf.a> $$1 = EnumSet.noneOf(jf.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         jf.a $$6 = switch ($$2) {
            case 'x' -> jf.a.a;
            case 'y' -> jf.a.b;
            case 'z' -> jf.a.c;
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
