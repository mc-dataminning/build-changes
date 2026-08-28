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

public class hg implements ArgumentType<hg.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wv.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wv.b("arguments.function.unknown", $$0));

   public static hg a() {
      return new hg();
   }

   public hg.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final ald $$1 = ald.a($$0);
         return new hg.a() {
            @Override
            public Collection<im<ex>> a(CommandContext<ex> $$0) throws CommandSyntaxException {
               return hg.b($$0, $$1);
            }

            @Override
            public Pair<ald, Either<im<ex>, Collection<im<ex>>>> b(CommandContext<ex> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(hg.b($$0, $$1)));
            }

            @Override
            public Pair<ald, Collection<im<ex>>> c(CommandContext<ex> $$0) throws CommandSyntaxException {
               return Pair.of($$1, hg.b($$0, $$1));
            }
         };
      } else {
         final ald $$2 = ald.a($$0);
         return new hg.a() {
            @Override
            public Collection<im<ex>> a(CommandContext<ex> $$0) throws CommandSyntaxException {
               return Collections.singleton(hg.a($$0, $$2));
            }

            @Override
            public Pair<ald, Either<im<ex>, Collection<im<ex>>>> b(CommandContext<ex> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(hg.a($$0, $$2)));
            }

            @Override
            public Pair<ald, Collection<im<ex>>> c(CommandContext<ex> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(hg.a($$0, $$2)));
            }
         };
      }
   }

   static im<ex> a(CommandContext<ex> $$0, ald $$1) throws CommandSyntaxException {
      return ((ex)$$0.getSource()).l().aE().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<im<ex>> b(CommandContext<ex> $$0, ald $$1) throws CommandSyntaxException {
      Collection<im<ex>> $$2 = ((ex)$$0.getSource()).l().aE().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<im<ex>> a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return ((hg.a)$$0.getArgument($$1, hg.a.class)).a($$0);
   }

   public static Pair<ald, Either<im<ex>, Collection<im<ex>>>> b(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return ((hg.a)$$0.getArgument($$1, hg.a.class)).b($$0);
   }

   public static Pair<ald, Collection<im<ex>>> c(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return ((hg.a)$$0.getArgument($$1, hg.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<im<ex>> a(CommandContext<ex> var1) throws CommandSyntaxException;

      Pair<ald, Either<im<ex>, Collection<im<ex>>>> b(CommandContext<ex> var1) throws CommandSyntaxException;

      Pair<ald, Collection<im<ex>>> c(CommandContext<ex> var1) throws CommandSyntaxException;
   }
}
