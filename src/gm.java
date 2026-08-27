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

public class gm implements ArgumentType<gm.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wx.b("arguments.function.unknown", $$0));

   public static gm a() {
      return new gm();
   }

   public gm.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final akm $$1 = akm.a($$0);
         return new gm.a() {
            @Override
            public Collection<hq<ee>> a(CommandContext<ee> $$0) throws CommandSyntaxException {
               return gm.b($$0, $$1);
            }

            @Override
            public Pair<akm, Either<hq<ee>, Collection<hq<ee>>>> b(CommandContext<ee> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(gm.b($$0, $$1)));
            }

            @Override
            public Pair<akm, Collection<hq<ee>>> c(CommandContext<ee> $$0) throws CommandSyntaxException {
               return Pair.of($$1, gm.b($$0, $$1));
            }
         };
      } else {
         final akm $$2 = akm.a($$0);
         return new gm.a() {
            @Override
            public Collection<hq<ee>> a(CommandContext<ee> $$0) throws CommandSyntaxException {
               return Collections.singleton(gm.a($$0, $$2));
            }

            @Override
            public Pair<akm, Either<hq<ee>, Collection<hq<ee>>>> b(CommandContext<ee> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(gm.a($$0, $$2)));
            }

            @Override
            public Pair<akm, Collection<hq<ee>>> c(CommandContext<ee> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(gm.a($$0, $$2)));
            }
         };
      }
   }

   static hq<ee> a(CommandContext<ee> $$0, akm $$1) throws CommandSyntaxException {
      return ((ee)$$0.getSource()).l().aF().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<hq<ee>> b(CommandContext<ee> $$0, akm $$1) throws CommandSyntaxException {
      Collection<hq<ee>> $$2 = ((ee)$$0.getSource()).l().aF().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<hq<ee>> a(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return ((gm.a)$$0.getArgument($$1, gm.a.class)).a($$0);
   }

   public static Pair<akm, Either<hq<ee>, Collection<hq<ee>>>> b(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return ((gm.a)$$0.getArgument($$1, gm.a.class)).b($$0);
   }

   public static Pair<akm, Collection<hq<ee>>> c(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return ((gm.a)$$0.getArgument($$1, gm.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<hq<ee>> a(CommandContext<ee> var1) throws CommandSyntaxException;

      Pair<akm, Either<hq<ee>, Collection<hq<ee>>>> b(CommandContext<ee> var1) throws CommandSyntaxException;

      Pair<akm, Collection<hq<ee>>> c(CommandContext<ee> var1) throws CommandSyntaxException;
   }
}
