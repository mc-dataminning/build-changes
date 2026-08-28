import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class gl implements ArgumentType<EnumSet<jb.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("arguments.swizzle.invalid"));

   public static gl a() {
      return new gl();
   }

   public static EnumSet<jb.a> a(CommandContext<ej> $$0, String $$1) {
      return (EnumSet<jb.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<jb.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<jb.a> $$1 = EnumSet.noneOf(jb.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         jb.a $$6 = switch ($$2) {
            case 'x' -> jb.a.a;
            case 'y' -> jb.a.b;
            case 'z' -> jb.a.c;
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
