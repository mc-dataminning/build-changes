import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class gk implements ArgumentType<gi> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~-5 ~5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xa.c("argument.rotation.incomplete"));

   public static gk a() {
      return new gk();
   }

   public static gi a(CommandContext<ej> $$0, String $$1) {
      return (gi)$$0.getArgument($$1, gi.class);
   }

   public gi a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         go $$2 = go.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            go $$3 = go.a($$0, false);
            return new gp($$3, $$2, new go(true, 0.0));
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
