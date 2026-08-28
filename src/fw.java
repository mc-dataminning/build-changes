import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fw implements ArgumentType<alh> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xh.b("recipe.notFound", $$0));

   public static fw a() {
      return new fw();
   }

   public static ag a(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      alh $$2 = c($$0, $$1);
      ag $$3 = ((ev)$$0.getSource()).l().aD().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static dal<?> b(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      dan $$2 = ((ev)$$0.getSource()).l().aI();
      alh $$3 = c($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static alh c(CommandContext<ev> $$0, String $$1) {
      return (alh)$$0.getArgument($$1, alh.class);
   }

   public alh a(StringReader $$0) throws CommandSyntaxException {
      return alh.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
