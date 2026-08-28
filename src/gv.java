import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class gv implements ArgumentType<EnumSet<jk.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("arguments.swizzle.invalid"));

   public static gv a() {
      return new gv();
   }

   public static EnumSet<jk.a> a(CommandContext<eu> $$0, String $$1) {
      return (EnumSet<jk.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<jk.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<jk.a> $$1 = EnumSet.noneOf(jk.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         jk.a $$6 = switch ($$2) {
            case 'x' -> jk.a.a;
            case 'y' -> jk.a.b;
            case 'z' -> jk.a.c;
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
