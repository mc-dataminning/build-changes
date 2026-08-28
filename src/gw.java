import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class gw implements ArgumentType<EnumSet<jl.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("arguments.swizzle.invalid"));

   public static gw a() {
      return new gw();
   }

   public static EnumSet<jl.a> a(CommandContext<ev> $$0, String $$1) {
      return (EnumSet<jl.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<jl.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<jl.a> $$1 = EnumSet.noneOf(jl.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         jl.a $$6 = switch ($$2) {
            case 'x' -> jl.a.a;
            case 'y' -> jl.a.b;
            case 'z' -> jl.a.c;
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
