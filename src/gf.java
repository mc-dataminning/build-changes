import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class gf implements ArgumentType<yb> {
   private static final Collection<String> b = List.of("{\"bold\": true}\n");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("argument.style.invalid", $$0));
   private final jq.a c;

   private gf(jq.a $$0) {
      this.c = $$0;
   }

   public static yb a(CommandContext<eu> $$0, String $$1) {
      return (yb)$$0.getArgument($$1, yb.class);
   }

   public static gf a(eq $$0) {
      return new gf($$0);
   }

   public yb a(StringReader $$0) throws CommandSyntaxException {
      try {
         return ey.a(this.c, $$0, yb.b.b);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
