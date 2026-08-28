import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class ga implements ArgumentType<yi> {
   private static final Collection<String> b = List.of("{\"bold\": true}\n");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xl.b("argument.style.invalid", $$0));
   private final jk.a c;

   private ga(jk.a $$0) {
      this.c = $$0;
   }

   public static yi a(CommandContext<ep> $$0, String $$1) {
      return (yi)$$0.getArgument($$1, yi.class);
   }

   public static ga a(el $$0) {
      return new ga($$0);
   }

   public yi a(StringReader $$0) throws CommandSyntaxException {
      try {
         return et.a(this.c, $$0, yi.b.b);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
