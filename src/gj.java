import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class gj implements ArgumentType<xs> {
   private static final Collection<String> b = List.of("{bold: true}", "{color: 'red'}", "{}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wv.b("argument.style.invalid", $$0));
   private final ju.a c;

   private gj(ju.a $$0) {
      this.c = $$0;
   }

   public static xs a(CommandContext<ex> $$0, String $$1) {
      return (xs)$$0.getArgument($$1, xs.class);
   }

   public static gj a(et $$0) {
      return new gj($$0);
   }

   public xs a(StringReader $$0) throws CommandSyntaxException {
      return fb.a(xs.b.b, this.c, a, $$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
