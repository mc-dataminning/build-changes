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

public class gi implements ArgumentType<gi.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ws.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ws.b("arguments.function.unknown", $$0));

   public static gi a() {
      return new gi();
   }

   public gi.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final akf $$1 = akf.a($$0);
         return new gi.a() {
            @Override
            public Collection<ho<ec>> a(CommandContext<ec> $$0) throws CommandSyntaxException {
               return gi.b($$0, $$1);
            }

            @Override
            public Pair<akf, Either<ho<ec>, Collection<ho<ec>>>> b(CommandContext<ec> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(gi.b($$0, $$1)));
            }

            @Override
            public Pair<akf, Collection<ho<ec>>> c(CommandContext<ec> $$0) throws CommandSyntaxException {
               return Pair.of($$1, gi.b($$0, $$1));
            }
         };
      } else {
         final akf $$2 = akf.a($$0);
         return new gi.a() {
            @Override
            public Collection<ho<ec>> a(CommandContext<ec> $$0) throws CommandSyntaxException {
               return Collections.singleton(gi.a($$0, $$2));
            }

            @Override
            public Pair<akf, Either<ho<ec>, Collection<ho<ec>>>> b(CommandContext<ec> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(gi.a($$0, $$2)));
            }

            @Override
            public Pair<akf, Collection<ho<ec>>> c(CommandContext<ec> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(gi.a($$0, $$2)));
            }
         };
      }
   }

   static ho<ec> a(CommandContext<ec> $$0, akf $$1) throws CommandSyntaxException {
      return ((ec)$$0.getSource()).l().aF().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<ho<ec>> b(CommandContext<ec> $$0, akf $$1) throws CommandSyntaxException {
      Collection<ho<ec>> $$2 = ((ec)$$0.getSource()).l().aF().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<ho<ec>> a(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return ((gi.a)$$0.getArgument($$1, gi.a.class)).a($$0);
   }

   public static Pair<akf, Either<ho<ec>, Collection<ho<ec>>>> b(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return ((gi.a)$$0.getArgument($$1, gi.a.class)).b($$0);
   }

   public static Pair<akf, Collection<ho<ec>>> c(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return ((gi.a)$$0.getArgument($$1, gi.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<ho<ec>> a(CommandContext<ec> var1) throws CommandSyntaxException;

      Pair<akf, Either<ho<ec>, Collection<ho<ec>>>> b(CommandContext<ec> var1) throws CommandSyntaxException;

      Pair<akf, Collection<ho<ec>>> c(CommandContext<ec> var1) throws CommandSyntaxException;
   }
}
