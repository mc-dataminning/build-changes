import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fy implements ArgumentType<aku> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");

   public static fy a() {
      return new fy();
   }

   public static aku a(CommandContext<ex> $$0, String $$1) {
      return (aku)$$0.getArgument($$1, aku.class);
   }

   public aku a(StringReader $$0) throws CommandSyntaxException {
      return aku.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
