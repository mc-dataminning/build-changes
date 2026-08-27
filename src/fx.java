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

public class fx implements ArgumentType<fx.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vd.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vd.b("arguments.function.unknown", $$0));

   public static fx a() {
      return new fx();
   }

   public fx.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final ahd $$1 = ahd.a($$0);
         return new fx.a() {
            @Override
            public Collection<hb<ds>> a(CommandContext<ds> $$0) throws CommandSyntaxException {
               return fx.b($$0, $$1);
            }

            @Override
            public Pair<ahd, Either<hb<ds>, Collection<hb<ds>>>> b(CommandContext<ds> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(fx.b($$0, $$1)));
            }
         };
      } else {
         final ahd $$2 = ahd.a($$0);
         return new fx.a() {
            @Override
            public Collection<hb<ds>> a(CommandContext<ds> $$0) throws CommandSyntaxException {
               return Collections.singleton(fx.a($$0, $$2));
            }

            @Override
            public Pair<ahd, Either<hb<ds>, Collection<hb<ds>>>> b(CommandContext<ds> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(fx.a($$0, $$2)));
            }
         };
      }
   }

   static hb<ds> a(CommandContext<ds> $$0, ahd $$1) throws CommandSyntaxException {
      return ((ds)$$0.getSource()).l().aC().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<hb<ds>> b(CommandContext<ds> $$0, ahd $$1) throws CommandSyntaxException {
      Collection<hb<ds>> $$2 = ((ds)$$0.getSource()).l().aC().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<hb<ds>> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return ((fx.a)$$0.getArgument($$1, fx.a.class)).a($$0);
   }

   public static Pair<ahd, Either<hb<ds>, Collection<hb<ds>>>> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return ((fx.a)$$0.getArgument($$1, fx.a.class)).b($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<hb<ds>> a(CommandContext<ds> var1) throws CommandSyntaxException;

      Pair<ahd, Either<hb<ds>, Collection<hb<ds>>>> b(CommandContext<ds> var1) throws CommandSyntaxException;
   }
}
