import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class gf implements ArgumentType<EnumSet<it.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("arguments.swizzle.invalid"));

   public static gf a() {
      return new gf();
   }

   public static EnumSet<it.a> a(CommandContext<ee> $$0, String $$1) {
      return (EnumSet<it.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<it.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<it.a> $$1 = EnumSet.noneOf(it.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         it.a $$6 = switch ($$2) {
            case 'x' -> it.a.a;
            case 'y' -> it.a.b;
            case 'z' -> it.a.c;
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
