import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class fv implements ArgumentType<xv> {
   private static final Collection<String> b = List.of("{bold: true}", "{color: 'red'}", "{}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("argument.style.invalid", $$0));
   private final jh.a c;

   private fv(jh.a $$0) {
      this.c = $$0;
   }

   public static xv a(CommandContext<ej> $$0, String $$1) {
      return (xv)$$0.getArgument($$1, xv.class);
   }

   public static fv a(ef $$0) {
      return new fv($$0);
   }

   public xv a(StringReader $$0) throws CommandSyntaxException {
      return en.a(xv.b.b, this.c, a, $$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
