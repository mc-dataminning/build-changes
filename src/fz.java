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

public class fz implements ArgumentType<fz.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vq.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vq.b("arguments.function.unknown", $$0));

   public static fz a() {
      return new fz();
   }

   public fz.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final aiy $$1 = aiy.a($$0);
         return new fz.a() {
            @Override
            public Collection<hd<du>> a(CommandContext<du> $$0) throws CommandSyntaxException {
               return fz.b($$0, $$1);
            }

            @Override
            public Pair<aiy, Either<hd<du>, Collection<hd<du>>>> b(CommandContext<du> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(fz.b($$0, $$1)));
            }

            @Override
            public Pair<aiy, Collection<hd<du>>> c(CommandContext<du> $$0) throws CommandSyntaxException {
               return Pair.of($$1, fz.b($$0, $$1));
            }
         };
      } else {
         final aiy $$2 = aiy.a($$0);
         return new fz.a() {
            @Override
            public Collection<hd<du>> a(CommandContext<du> $$0) throws CommandSyntaxException {
               return Collections.singleton(fz.a($$0, $$2));
            }

            @Override
            public Pair<aiy, Either<hd<du>, Collection<hd<du>>>> b(CommandContext<du> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(fz.a($$0, $$2)));
            }

            @Override
            public Pair<aiy, Collection<hd<du>>> c(CommandContext<du> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(fz.a($$0, $$2)));
            }
         };
      }
   }

   static hd<du> a(CommandContext<du> $$0, aiy $$1) throws CommandSyntaxException {
      return ((du)$$0.getSource()).l().aE().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<hd<du>> b(CommandContext<du> $$0, aiy $$1) throws CommandSyntaxException {
      Collection<hd<du>> $$2 = ((du)$$0.getSource()).l().aE().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<hd<du>> a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return ((fz.a)$$0.getArgument($$1, fz.a.class)).a($$0);
   }

   public static Pair<aiy, Either<hd<du>, Collection<hd<du>>>> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return ((fz.a)$$0.getArgument($$1, fz.a.class)).b($$0);
   }

   public static Pair<aiy, Collection<hd<du>>> c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return ((fz.a)$$0.getArgument($$1, fz.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<hd<du>> a(CommandContext<du> var1) throws CommandSyntaxException;

      Pair<aiy, Either<hd<du>, Collection<hd<du>>>> b(CommandContext<du> var1) throws CommandSyntaxException;

      Pair<aiy, Collection<hd<du>>> c(CommandContext<du> var1) throws CommandSyntaxException;
   }
}
