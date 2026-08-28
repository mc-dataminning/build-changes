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

public class hf implements ArgumentType<hf.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wp.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wp.b("arguments.function.unknown", $$0));

   public static hf a() {
      return new hf();
   }

   public hf.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final aku $$1 = aku.a($$0);
         return new hf.a() {
            @Override
            public Collection<il<ex>> a(CommandContext<ex> $$0) throws CommandSyntaxException {
               return hf.b($$0, $$1);
            }

            @Override
            public Pair<aku, Either<il<ex>, Collection<il<ex>>>> b(CommandContext<ex> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(hf.b($$0, $$1)));
            }

            @Override
            public Pair<aku, Collection<il<ex>>> c(CommandContext<ex> $$0) throws CommandSyntaxException {
               return Pair.of($$1, hf.b($$0, $$1));
            }
         };
      } else {
         final aku $$2 = aku.a($$0);
         return new hf.a() {
            @Override
            public Collection<il<ex>> a(CommandContext<ex> $$0) throws CommandSyntaxException {
               return Collections.singleton(hf.a($$0, $$2));
            }

            @Override
            public Pair<aku, Either<il<ex>, Collection<il<ex>>>> b(CommandContext<ex> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(hf.a($$0, $$2)));
            }

            @Override
            public Pair<aku, Collection<il<ex>>> c(CommandContext<ex> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(hf.a($$0, $$2)));
            }
         };
      }
   }

   static il<ex> a(CommandContext<ex> $$0, aku $$1) throws CommandSyntaxException {
      return ((ex)$$0.getSource()).l().aE().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<il<ex>> b(CommandContext<ex> $$0, aku $$1) throws CommandSyntaxException {
      Collection<il<ex>> $$2 = ((ex)$$0.getSource()).l().aE().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<il<ex>> a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return ((hf.a)$$0.getArgument($$1, hf.a.class)).a($$0);
   }

   public static Pair<aku, Either<il<ex>, Collection<il<ex>>>> b(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return ((hf.a)$$0.getArgument($$1, hf.a.class)).b($$0);
   }

   public static Pair<aku, Collection<il<ex>>> c(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return ((hf.a)$$0.getArgument($$1, hf.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<il<ex>> a(CommandContext<ex> var1) throws CommandSyntaxException;

      Pair<aku, Either<il<ex>, Collection<il<ex>>>> b(CommandContext<ex> var1) throws CommandSyntaxException;

      Pair<aku, Collection<il<ex>>> c(CommandContext<ex> var1) throws CommandSyntaxException;
   }
}
