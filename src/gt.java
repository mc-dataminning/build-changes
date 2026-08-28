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

public class gt implements ArgumentType<gt.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xg.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xg.b("arguments.function.unknown", $$0));

   public static gt a() {
      return new gt();
   }

   public gt.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final alr $$1 = alr.a($$0);
         return new gt.a() {
            @Override
            public Collection<hy<ek>> a(CommandContext<ek> $$0) throws CommandSyntaxException {
               return gt.b($$0, $$1);
            }

            @Override
            public Pair<alr, Either<hy<ek>, Collection<hy<ek>>>> b(CommandContext<ek> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(gt.b($$0, $$1)));
            }

            @Override
            public Pair<alr, Collection<hy<ek>>> c(CommandContext<ek> $$0) throws CommandSyntaxException {
               return Pair.of($$1, gt.b($$0, $$1));
            }
         };
      } else {
         final alr $$2 = alr.a($$0);
         return new gt.a() {
            @Override
            public Collection<hy<ek>> a(CommandContext<ek> $$0) throws CommandSyntaxException {
               return Collections.singleton(gt.a($$0, $$2));
            }

            @Override
            public Pair<alr, Either<hy<ek>, Collection<hy<ek>>>> b(CommandContext<ek> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(gt.a($$0, $$2)));
            }

            @Override
            public Pair<alr, Collection<hy<ek>>> c(CommandContext<ek> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(gt.a($$0, $$2)));
            }
         };
      }
   }

   static hy<ek> a(CommandContext<ek> $$0, alr $$1) throws CommandSyntaxException {
      return ((ek)$$0.getSource()).l().aE().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<hy<ek>> b(CommandContext<ek> $$0, alr $$1) throws CommandSyntaxException {
      Collection<hy<ek>> $$2 = ((ek)$$0.getSource()).l().aE().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<hy<ek>> a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return ((gt.a)$$0.getArgument($$1, gt.a.class)).a($$0);
   }

   public static Pair<alr, Either<hy<ek>, Collection<hy<ek>>>> b(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return ((gt.a)$$0.getArgument($$1, gt.a.class)).b($$0);
   }

   public static Pair<alr, Collection<hy<ek>>> c(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return ((gt.a)$$0.getArgument($$1, gt.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<hy<ek>> a(CommandContext<ek> var1) throws CommandSyntaxException;

      Pair<alr, Either<hy<ek>, Collection<hy<ek>>>> b(CommandContext<ek> var1) throws CommandSyntaxException;

      Pair<alr, Collection<hy<ek>>> c(CommandContext<ek> var1) throws CommandSyntaxException;
   }
}
