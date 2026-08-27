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

public class gb implements ArgumentType<gb.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wi.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wi.b("arguments.function.unknown", $$0));

   public static gb a() {
      return new gb();
   }

   public gb.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final ajv $$1 = ajv.a($$0);
         return new gb.a() {
            @Override
            public Collection<hh<dv>> a(CommandContext<dv> $$0) throws CommandSyntaxException {
               return gb.b($$0, $$1);
            }

            @Override
            public Pair<ajv, Either<hh<dv>, Collection<hh<dv>>>> b(CommandContext<dv> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(gb.b($$0, $$1)));
            }

            @Override
            public Pair<ajv, Collection<hh<dv>>> c(CommandContext<dv> $$0) throws CommandSyntaxException {
               return Pair.of($$1, gb.b($$0, $$1));
            }
         };
      } else {
         final ajv $$2 = ajv.a($$0);
         return new gb.a() {
            @Override
            public Collection<hh<dv>> a(CommandContext<dv> $$0) throws CommandSyntaxException {
               return Collections.singleton(gb.a($$0, $$2));
            }

            @Override
            public Pair<ajv, Either<hh<dv>, Collection<hh<dv>>>> b(CommandContext<dv> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(gb.a($$0, $$2)));
            }

            @Override
            public Pair<ajv, Collection<hh<dv>>> c(CommandContext<dv> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(gb.a($$0, $$2)));
            }
         };
      }
   }

   static hh<dv> a(CommandContext<dv> $$0, ajv $$1) throws CommandSyntaxException {
      return ((dv)$$0.getSource()).l().aF().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<hh<dv>> b(CommandContext<dv> $$0, ajv $$1) throws CommandSyntaxException {
      Collection<hh<dv>> $$2 = ((dv)$$0.getSource()).l().aF().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<hh<dv>> a(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return ((gb.a)$$0.getArgument($$1, gb.a.class)).a($$0);
   }

   public static Pair<ajv, Either<hh<dv>, Collection<hh<dv>>>> b(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return ((gb.a)$$0.getArgument($$1, gb.a.class)).b($$0);
   }

   public static Pair<ajv, Collection<hh<dv>>> c(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return ((gb.a)$$0.getArgument($$1, gb.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<hh<dv>> a(CommandContext<dv> var1) throws CommandSyntaxException;

      Pair<ajv, Either<hh<dv>, Collection<hh<dv>>>> b(CommandContext<dv> var1) throws CommandSyntaxException;

      Pair<ajv, Collection<hh<dv>>> c(CommandContext<dv> var1) throws CommandSyntaxException;
   }
}
