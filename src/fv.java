import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fv implements ArgumentType<ale> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("recipe.notFound", $$0));

   public static fv a() {
      return new fv();
   }

   public static ag a(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      ale $$2 = c($$0, $$1);
      ag $$3 = ((eu)$$0.getSource()).l().aD().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static dam<?> b(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      dao $$2 = ((eu)$$0.getSource()).l().aI();
      ale $$3 = c($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static ale c(CommandContext<eu> $$0, String $$1) {
      return (ale)$$0.getArgument($$1, ale.class);
   }

   public ale a(StringReader $$0) throws CommandSyntaxException {
      return ale.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
