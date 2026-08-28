import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fx implements ArgumentType<alj> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xj.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xj.b("recipe.notFound", $$0));

   public static fx a() {
      return new fx();
   }

   public static ah a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      alj $$2 = c($$0, $$1);
      ah $$3 = ((ew)$$0.getSource()).l().aD().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static dbc<?> b(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      dbe $$2 = ((ew)$$0.getSource()).l().aI();
      alj $$3 = c($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static alj c(CommandContext<ew> $$0, String $$1) {
      return (alj)$$0.getArgument($$1, alj.class);
   }

   public alj a(StringReader $$0) throws CommandSyntaxException {
      return alj.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
