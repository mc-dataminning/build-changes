import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class gi implements ArgumentType<EnumSet<iw.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("arguments.swizzle.invalid"));

   public static gi a() {
      return new gi();
   }

   public static EnumSet<iw.a> a(CommandContext<eh> $$0, String $$1) {
      return (EnumSet<iw.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<iw.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<iw.a> $$1 = EnumSet.noneOf(iw.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         iw.a $$6 = switch ($$2) {
            case 'x' -> iw.a.a;
            case 'y' -> iw.a.b;
            case 'z' -> iw.a.c;
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
