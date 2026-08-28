import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class ge implements ArgumentType<xv> {
   private static final Collection<String> b = List.of("{\"bold\": true}\n");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("argument.style.invalid", $$0));
   private final jo.a c;

   private ge(jo.a $$0) {
      this.c = $$0;
   }

   public static xv a(CommandContext<et> $$0, String $$1) {
      return (xv)$$0.getArgument($$1, xv.class);
   }

   public static ge a(ep $$0) {
      return new ge($$0);
   }

   public xv a(StringReader $$0) throws CommandSyntaxException {
      try {
         return ex.a(this.c, $$0, xv.b.b);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
