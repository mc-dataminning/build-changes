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

public class gp implements ArgumentType<gp.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("arguments.function.unknown", $$0));

   public static gp a() {
      return new gp();
   }

   public gp.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final akt $$1 = akt.a($$0);
         return new gp.a() {
            @Override
            public Collection<ht<eh>> a(CommandContext<eh> $$0) throws CommandSyntaxException {
               return gp.b($$0, $$1);
            }

            @Override
            public Pair<akt, Either<ht<eh>, Collection<ht<eh>>>> b(CommandContext<eh> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(gp.b($$0, $$1)));
            }

            @Override
            public Pair<akt, Collection<ht<eh>>> c(CommandContext<eh> $$0) throws CommandSyntaxException {
               return Pair.of($$1, gp.b($$0, $$1));
            }
         };
      } else {
         final akt $$2 = akt.a($$0);
         return new gp.a() {
            @Override
            public Collection<ht<eh>> a(CommandContext<eh> $$0) throws CommandSyntaxException {
               return Collections.singleton(gp.a($$0, $$2));
            }

            @Override
            public Pair<akt, Either<ht<eh>, Collection<ht<eh>>>> b(CommandContext<eh> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(gp.a($$0, $$2)));
            }

            @Override
            public Pair<akt, Collection<ht<eh>>> c(CommandContext<eh> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(gp.a($$0, $$2)));
            }
         };
      }
   }

   static ht<eh> a(CommandContext<eh> $$0, akt $$1) throws CommandSyntaxException {
      return ((eh)$$0.getSource()).l().aF().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<ht<eh>> b(CommandContext<eh> $$0, akt $$1) throws CommandSyntaxException {
      Collection<ht<eh>> $$2 = ((eh)$$0.getSource()).l().aF().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<ht<eh>> a(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return ((gp.a)$$0.getArgument($$1, gp.a.class)).a($$0);
   }

   public static Pair<akt, Either<ht<eh>, Collection<ht<eh>>>> b(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return ((gp.a)$$0.getArgument($$1, gp.a.class)).b($$0);
   }

   public static Pair<akt, Collection<ht<eh>>> c(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return ((gp.a)$$0.getArgument($$1, gp.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<ht<eh>> a(CommandContext<eh> var1) throws CommandSyntaxException;

      Pair<akt, Either<ht<eh>, Collection<ht<eh>>>> b(CommandContext<eh> var1) throws CommandSyntaxException;

      Pair<akt, Collection<ht<eh>>> c(CommandContext<eh> var1) throws CommandSyntaxException;
   }
}
