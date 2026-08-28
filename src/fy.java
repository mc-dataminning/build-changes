import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fy implements ArgumentType<akv> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");

   public static fy a() {
      return new fy();
   }

   public static akv a(CommandContext<ex> $$0, String $$1) {
      return (akv)$$0.getArgument($$1, akv.class);
   }

   public akv a(StringReader $$0) throws CommandSyntaxException {
      return akv.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
