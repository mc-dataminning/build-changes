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

public class gl implements ArgumentType<gl.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("arguments.function.unknown", $$0));

   public static gl a() {
      return new gl();
   }

   public gl.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final akh $$1 = akh.a($$0);
         return new gl.a() {
            @Override
            public Collection<hp<ed>> a(CommandContext<ed> $$0) throws CommandSyntaxException {
               return gl.b($$0, $$1);
            }

            @Override
            public Pair<akh, Either<hp<ed>, Collection<hp<ed>>>> b(CommandContext<ed> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(gl.b($$0, $$1)));
            }

            @Override
            public Pair<akh, Collection<hp<ed>>> c(CommandContext<ed> $$0) throws CommandSyntaxException {
               return Pair.of($$1, gl.b($$0, $$1));
            }
         };
      } else {
         final akh $$2 = akh.a($$0);
         return new gl.a() {
            @Override
            public Collection<hp<ed>> a(CommandContext<ed> $$0) throws CommandSyntaxException {
               return Collections.singleton(gl.a($$0, $$2));
            }

            @Override
            public Pair<akh, Either<hp<ed>, Collection<hp<ed>>>> b(CommandContext<ed> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(gl.a($$0, $$2)));
            }

            @Override
            public Pair<akh, Collection<hp<ed>>> c(CommandContext<ed> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(gl.a($$0, $$2)));
            }
         };
      }
   }

   static hp<ed> a(CommandContext<ed> $$0, akh $$1) throws CommandSyntaxException {
      return ((ed)$$0.getSource()).l().aF().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<hp<ed>> b(CommandContext<ed> $$0, akh $$1) throws CommandSyntaxException {
      Collection<hp<ed>> $$2 = ((ed)$$0.getSource()).l().aF().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<hp<ed>> a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return ((gl.a)$$0.getArgument($$1, gl.a.class)).a($$0);
   }

   public static Pair<akh, Either<hp<ed>, Collection<hp<ed>>>> b(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return ((gl.a)$$0.getArgument($$1, gl.a.class)).b($$0);
   }

   public static Pair<akh, Collection<hp<ed>>> c(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return ((gl.a)$$0.getArgument($$1, gl.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<hp<ed>> a(CommandContext<ed> var1) throws CommandSyntaxException;

      Pair<akh, Either<hp<ed>, Collection<hp<ed>>>> b(CommandContext<ed> var1) throws CommandSyntaxException;

      Pair<akh, Collection<hp<ed>>> c(CommandContext<ed> var1) throws CommandSyntaxException;
   }
}
