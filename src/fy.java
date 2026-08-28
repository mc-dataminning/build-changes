import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fy implements ArgumentType<ald> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");

   public static fy a() {
      return new fy();
   }

   public static ald a(CommandContext<ex> $$0, String $$1) {
      return (ald)$$0.getArgument($$1, ald.class);
   }

   public ald a(StringReader $$0) throws CommandSyntaxException {
      return ald.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
