import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class hc implements ArgumentType<hc.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("arguments.function.unknown", $$0));

   public static hc a() {
      return new hc();
   }

   public hc.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final ale $$1 = ale.a($$0);
         return new hc.a() {
            @Override
            public Collection<ii<eu>> a(CommandContext<eu> $$0) throws CommandSyntaxException {
               return hc.b($$0, $$1);
            }

            @Override
            public Pair<ale, Either<ii<eu>, Collection<ii<eu>>>> b(CommandContext<eu> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(hc.b($$0, $$1)));
            }

            @Override
            public Pair<ale, Collection<ii<eu>>> c(CommandContext<eu> $$0) throws CommandSyntaxException {
               return Pair.of($$1, hc.b($$0, $$1));
            }
         };
      } else {
         final ale $$2 = ale.a($$0);
         return new hc.a() {
            @Override
            public Collection<ii<eu>> a(CommandContext<eu> $$0) throws CommandSyntaxException {
               return Collections.singleton(hc.a($$0, $$2));
            }

            @Override
            public Pair<ale, Either<ii<eu>, Collection<ii<eu>>>> b(CommandContext<eu> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(hc.a($$0, $$2)));
            }

            @Override
            public Pair<ale, Collection<ii<eu>>> c(CommandContext<eu> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(hc.a($$0, $$2)));
            }
         };
      }
   }

   static ii<eu> a(CommandContext<eu> $$0, ale $$1) throws CommandSyntaxException {
      return ((eu)$$0.getSource()).l().aE().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<ii<eu>> b(CommandContext<eu> $$0, ale $$1) throws CommandSyntaxException {
      Collection<ii<eu>> $$2 = ((eu)$$0.getSource()).l().aE().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<ii<eu>> a(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return ((hc.a)$$0.getArgument($$1, hc.a.class)).a($$0);
   }

   public static Pair<ale, Either<ii<eu>, Collection<ii<eu>>>> b(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return ((hc.a)$$0.getArgument($$1, hc.a.class)).b($$0);
   }

   public static Pair<ale, Collection<ii<eu>>> c(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      return ((hc.a)$$0.getArgument($$1, hc.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<ii<eu>> a(CommandContext<eu> var1) throws CommandSyntaxException;

      Pair<ale, Either<ii<eu>, Collection<ii<eu>>>> b(CommandContext<eu> var1) throws CommandSyntaxException;

      Pair<ale, Collection<ii<eu>>> c(CommandContext<eu> var1) throws CommandSyntaxException;
   }
}
