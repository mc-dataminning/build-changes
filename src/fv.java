import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class fv implements ArgumentType<EnumSet<ij.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("arguments.swizzle.invalid"));

   public static fv a() {
      return new fv();
   }

   public static EnumSet<ij.a> a(CommandContext<dv> $$0, String $$1) {
      return (EnumSet<ij.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<ij.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<ij.a> $$1 = EnumSet.noneOf(ij.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         ij.a $$6 = switch ($$2) {
            case 'x' -> ij.a.a;
            case 'y' -> ij.a.b;
            case 'z' -> ij.a.c;
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
