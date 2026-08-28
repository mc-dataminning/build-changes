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

public class hb implements ArgumentType<hb.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("arguments.function.unknown", $$0));

   public static hb a() {
      return new hb();
   }

   public hb.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final akq $$1 = akq.a($$0);
         return new hb.a() {
            @Override
            public Collection<ig<et>> a(CommandContext<et> $$0) throws CommandSyntaxException {
               return hb.b($$0, $$1);
            }

            @Override
            public Pair<akq, Either<ig<et>, Collection<ig<et>>>> b(CommandContext<et> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(hb.b($$0, $$1)));
            }

            @Override
            public Pair<akq, Collection<ig<et>>> c(CommandContext<et> $$0) throws CommandSyntaxException {
               return Pair.of($$1, hb.b($$0, $$1));
            }
         };
      } else {
         final akq $$2 = akq.a($$0);
         return new hb.a() {
            @Override
            public Collection<ig<et>> a(CommandContext<et> $$0) throws CommandSyntaxException {
               return Collections.singleton(hb.a($$0, $$2));
            }

            @Override
            public Pair<akq, Either<ig<et>, Collection<ig<et>>>> b(CommandContext<et> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(hb.a($$0, $$2)));
            }

            @Override
            public Pair<akq, Collection<ig<et>>> c(CommandContext<et> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(hb.a($$0, $$2)));
            }
         };
      }
   }

   static ig<et> a(CommandContext<et> $$0, akq $$1) throws CommandSyntaxException {
      return ((et)$$0.getSource()).l().aF().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<ig<et>> b(CommandContext<et> $$0, akq $$1) throws CommandSyntaxException {
      Collection<ig<et>> $$2 = ((et)$$0.getSource()).l().aF().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<ig<et>> a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return ((hb.a)$$0.getArgument($$1, hb.a.class)).a($$0);
   }

   public static Pair<akq, Either<ig<et>, Collection<ig<et>>>> b(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return ((hb.a)$$0.getArgument($$1, hb.a.class)).b($$0);
   }

   public static Pair<akq, Collection<ig<et>>> c(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return ((hb.a)$$0.getArgument($$1, hb.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<ig<et>> a(CommandContext<et> var1) throws CommandSyntaxException;

      Pair<akq, Either<ig<et>, Collection<ig<et>>>> b(CommandContext<et> var1) throws CommandSyntaxException;

      Pair<akq, Collection<ig<et>>> c(CommandContext<et> var1) throws CommandSyntaxException;
   }
}
