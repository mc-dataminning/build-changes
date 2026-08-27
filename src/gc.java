import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class gc implements ArgumentType<EnumSet<ir.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("arguments.swizzle.invalid"));

   public static gc a() {
      return new gc();
   }

   public static EnumSet<ir.a> a(CommandContext<ec> $$0, String $$1) {
      return (EnumSet<ir.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<ir.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<ir.a> $$1 = EnumSet.noneOf(ir.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         ir.a $$6 = switch ($$2) {
            case 'x' -> ir.a.a;
            case 'y' -> ir.a.b;
            case 'z' -> ir.a.c;
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
