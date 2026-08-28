import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class gu implements ArgumentType<gs> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~-5 ~5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("argument.rotation.incomplete"));

   public static gu a() {
      return new gu();
   }

   public static gs a(CommandContext<eu> $$0, String $$1) {
      return (gs)$$0.getArgument($$1, gs.class);
   }

   public gs a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         gy $$2 = gy.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gy $$3 = gy.a($$0, false);
            return new gz($$3, $$2, new gy(true, 0.0));
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
