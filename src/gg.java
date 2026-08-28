import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class gg implements ArgumentType<ye> {
   private static final Collection<String> b = List.of("{\"bold\": true}\n");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xh.b("argument.style.invalid", $$0));
   private final jr.a c;

   private gg(jr.a $$0) {
      this.c = $$0;
   }

   public static ye a(CommandContext<ev> $$0, String $$1) {
      return (ye)$$0.getArgument($$1, ye.class);
   }

   public static gg a(er $$0) {
      return new gg($$0);
   }

   public ye a(StringReader $$0) throws CommandSyntaxException {
      try {
         return ez.a(this.c, $$0, ye.b.b);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
