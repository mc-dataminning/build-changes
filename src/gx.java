import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class gx implements ArgumentType<EnumSet<jm.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xj.c("arguments.swizzle.invalid"));

   public static gx a() {
      return new gx();
   }

   public static EnumSet<jm.a> a(CommandContext<ew> $$0, String $$1) {
      return (EnumSet<jm.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<jm.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<jm.a> $$1 = EnumSet.noneOf(jm.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         jm.a $$6 = switch ($$2) {
            case 'x' -> jm.a.a;
            case 'y' -> jm.a.b;
            case 'z' -> jm.a.c;
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
