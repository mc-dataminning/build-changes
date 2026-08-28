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

public class gy implements ArgumentType<gy.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("arguments.function.unknown", $$0));

   public static gy a() {
      return new gy();
   }

   public gy.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final akk $$1 = akk.a($$0);
         return new gy.a() {
            @Override
            public Collection<ic<eq>> a(CommandContext<eq> $$0) throws CommandSyntaxException {
               return gy.b($$0, $$1);
            }

            @Override
            public Pair<akk, Either<ic<eq>, Collection<ic<eq>>>> b(CommandContext<eq> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(gy.b($$0, $$1)));
            }

            @Override
            public Pair<akk, Collection<ic<eq>>> c(CommandContext<eq> $$0) throws CommandSyntaxException {
               return Pair.of($$1, gy.b($$0, $$1));
            }
         };
      } else {
         final akk $$2 = akk.a($$0);
         return new gy.a() {
            @Override
            public Collection<ic<eq>> a(CommandContext<eq> $$0) throws CommandSyntaxException {
               return Collections.singleton(gy.a($$0, $$2));
            }

            @Override
            public Pair<akk, Either<ic<eq>, Collection<ic<eq>>>> b(CommandContext<eq> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(gy.a($$0, $$2)));
            }

            @Override
            public Pair<akk, Collection<ic<eq>>> c(CommandContext<eq> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(gy.a($$0, $$2)));
            }
         };
      }
   }

   static ic<eq> a(CommandContext<eq> $$0, akk $$1) throws CommandSyntaxException {
      return ((eq)$$0.getSource()).l().aF().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<ic<eq>> b(CommandContext<eq> $$0, akk $$1) throws CommandSyntaxException {
      Collection<ic<eq>> $$2 = ((eq)$$0.getSource()).l().aF().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<ic<eq>> a(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return ((gy.a)$$0.getArgument($$1, gy.a.class)).a($$0);
   }

   public static Pair<akk, Either<ic<eq>, Collection<ic<eq>>>> b(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return ((gy.a)$$0.getArgument($$1, gy.a.class)).b($$0);
   }

   public static Pair<akk, Collection<ic<eq>>> c(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return ((gy.a)$$0.getArgument($$1, gy.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<ic<eq>> a(CommandContext<eq> var1) throws CommandSyntaxException;

      Pair<akk, Either<ic<eq>, Collection<ic<eq>>>> b(CommandContext<eq> var1) throws CommandSyntaxException;

      Pair<akk, Collection<ic<eq>>> c(CommandContext<eq> var1) throws CommandSyntaxException;
   }
}
