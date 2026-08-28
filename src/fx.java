import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fx implements ArgumentType<alz> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");

   public static fx a() {
      return new fx();
   }

   public static alz a(CommandContext<ew> $$0, String $$1) {
      return (alz)$$0.getArgument($$1, alz.class);
   }

   public alz a(StringReader $$0) throws CommandSyntaxException {
      return alz.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
