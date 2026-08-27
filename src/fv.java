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

public class fv implements ArgumentType<fv.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ti.a("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ti.a("arguments.function.unknown", $$0));

   public static fv a() {
      return new fv();
   }

   public fv.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final aeu $$1 = aeu.a($$0);
         return new fv.a() {
            @Override
            public Collection<dp> a(CommandContext<dt> $$0) throws CommandSyntaxException {
               return fv.b($$0, $$1);
            }

            @Override
            public Pair<aeu, Either<dp, Collection<dp>>> b(CommandContext<dt> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(fv.b($$0, $$1)));
            }
         };
      } else {
         final aeu $$2 = aeu.a($$0);
         return new fv.a() {
            @Override
            public Collection<dp> a(CommandContext<dt> $$0) throws CommandSyntaxException {
               return Collections.singleton(fv.a($$0, $$2));
            }

            @Override
            public Pair<aeu, Either<dp, Collection<dp>>> b(CommandContext<dt> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(fv.a($$0, $$2)));
            }
         };
      }
   }

   static dp a(CommandContext<dt> $$0, aeu $$1) throws CommandSyntaxException {
      return ((dt)$$0.getSource()).l().aA().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<dp> b(CommandContext<dt> $$0, aeu $$1) throws CommandSyntaxException {
      Collection<dp> $$2 = ((dt)$$0.getSource()).l().aA().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<dp> a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return ((fv.a)$$0.getArgument($$1, fv.a.class)).a($$0);
   }

   public static Pair<aeu, Either<dp, Collection<dp>>> b(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return ((fv.a)$$0.getArgument($$1, fv.a.class)).b($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<dp> a(CommandContext<dt> var1) throws CommandSyntaxException;

      Pair<aeu, Either<dp, Collection<dp>>> b(CommandContext<dt> var1) throws CommandSyntaxException;
   }
}
