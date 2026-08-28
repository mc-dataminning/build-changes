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

public class he implements ArgumentType<he.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xk.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xk.b("arguments.function.unknown", $$0));

   public static he a() {
      return new he();
   }

   public he.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final alp $$1 = alp.a($$0);
         return new he.a() {
            @Override
            public Collection<ik<ew>> a(CommandContext<ew> $$0) throws CommandSyntaxException {
               return he.b($$0, $$1);
            }

            @Override
            public Pair<alp, Either<ik<ew>, Collection<ik<ew>>>> b(CommandContext<ew> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(he.b($$0, $$1)));
            }

            @Override
            public Pair<alp, Collection<ik<ew>>> c(CommandContext<ew> $$0) throws CommandSyntaxException {
               return Pair.of($$1, he.b($$0, $$1));
            }
         };
      } else {
         final alp $$2 = alp.a($$0);
         return new he.a() {
            @Override
            public Collection<ik<ew>> a(CommandContext<ew> $$0) throws CommandSyntaxException {
               return Collections.singleton(he.a($$0, $$2));
            }

            @Override
            public Pair<alp, Either<ik<ew>, Collection<ik<ew>>>> b(CommandContext<ew> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(he.a($$0, $$2)));
            }

            @Override
            public Pair<alp, Collection<ik<ew>>> c(CommandContext<ew> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(he.a($$0, $$2)));
            }
         };
      }
   }

   static ik<ew> a(CommandContext<ew> $$0, alp $$1) throws CommandSyntaxException {
      return ((ew)$$0.getSource()).l().aE().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<ik<ew>> b(CommandContext<ew> $$0, alp $$1) throws CommandSyntaxException {
      Collection<ik<ew>> $$2 = ((ew)$$0.getSource()).l().aE().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<ik<ew>> a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return ((he.a)$$0.getArgument($$1, he.a.class)).a($$0);
   }

   public static Pair<alp, Either<ik<ew>, Collection<ik<ew>>>> b(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return ((he.a)$$0.getArgument($$1, he.a.class)).b($$0);
   }

   public static Pair<alp, Collection<ik<ew>>> c(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return ((he.a)$$0.getArgument($$1, he.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<ik<ew>> a(CommandContext<ew> var1) throws CommandSyntaxException;

      Pair<alp, Either<ik<ew>, Collection<ik<ew>>>> b(CommandContext<ew> var1) throws CommandSyntaxException;

      Pair<alp, Collection<ik<ew>>> c(CommandContext<ew> var1) throws CommandSyntaxException;
   }
}
