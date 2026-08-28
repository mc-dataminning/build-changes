import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class gi implements ArgumentType<xm> {
   private static final Collection<String> b = List.of("{bold: true}", "{color: 'red'}", "{}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wp.b("argument.style.invalid", $$0));
   private final jt.a c;

   private gi(jt.a $$0) {
      this.c = $$0;
   }

   public static xm a(CommandContext<ex> $$0, String $$1) {
      return (xm)$$0.getArgument($$1, xm.class);
   }

   public static gi a(et $$0) {
      return new gi($$0);
   }

   public xm a(StringReader $$0) throws CommandSyntaxException {
      return fb.a(xm.b.b, this.c, a, $$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
