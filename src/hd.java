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

public class hd implements ArgumentType<hd.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xh.b("arguments.function.unknown", $$0));

   public static hd a() {
      return new hd();
   }

   public hd.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final alh $$1 = alh.a($$0);
         return new hd.a() {
            @Override
            public Collection<ij<ev>> a(CommandContext<ev> $$0) throws CommandSyntaxException {
               return hd.b($$0, $$1);
            }

            @Override
            public Pair<alh, Either<ij<ev>, Collection<ij<ev>>>> b(CommandContext<ev> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(hd.b($$0, $$1)));
            }

            @Override
            public Pair<alh, Collection<ij<ev>>> c(CommandContext<ev> $$0) throws CommandSyntaxException {
               return Pair.of($$1, hd.b($$0, $$1));
            }
         };
      } else {
         final alh $$2 = alh.a($$0);
         return new hd.a() {
            @Override
            public Collection<ij<ev>> a(CommandContext<ev> $$0) throws CommandSyntaxException {
               return Collections.singleton(hd.a($$0, $$2));
            }

            @Override
            public Pair<alh, Either<ij<ev>, Collection<ij<ev>>>> b(CommandContext<ev> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(hd.a($$0, $$2)));
            }

            @Override
            public Pair<alh, Collection<ij<ev>>> c(CommandContext<ev> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(hd.a($$0, $$2)));
            }
         };
      }
   }

   static ij<ev> a(CommandContext<ev> $$0, alh $$1) throws CommandSyntaxException {
      return ((ev)$$0.getSource()).l().aE().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<ij<ev>> b(CommandContext<ev> $$0, alh $$1) throws CommandSyntaxException {
      Collection<ij<ev>> $$2 = ((ev)$$0.getSource()).l().aE().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<ij<ev>> a(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return ((hd.a)$$0.getArgument($$1, hd.a.class)).a($$0);
   }

   public static Pair<alh, Either<ij<ev>, Collection<ij<ev>>>> b(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return ((hd.a)$$0.getArgument($$1, hd.a.class)).b($$0);
   }

   public static Pair<alh, Collection<ij<ev>>> c(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return ((hd.a)$$0.getArgument($$1, hd.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<ij<ev>> a(CommandContext<ev> var1) throws CommandSyntaxException;

      Pair<alh, Either<ij<ev>, Collection<ij<ev>>>> b(CommandContext<ev> var1) throws CommandSyntaxException;

      Pair<alh, Collection<ij<ev>>> c(CommandContext<ev> var1) throws CommandSyntaxException;
   }
}
