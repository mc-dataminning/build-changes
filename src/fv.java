import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class fv<T> implements ArgumentType<alg<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xh.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xh.b("commands.place.jigsaw.invalid", $$0));
   final alg<? extends kc<T>> e;

   public fv(alg<? extends kc<T>> $$0) {
      this.e = $$0;
   }

   public static <T> fv<T> a(alg<? extends kc<T>> $$0) {
      return new fv<>($$0);
   }

   private static <T> alg<T> a(CommandContext<ev> $$0, String $$1, alg<kc<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alg<?> $$4 = (alg<?>)$$0.getArgument($$1, alg.class);
      Optional<alg<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> kc<T> a(CommandContext<ev> $$0, alg<? extends kc<T>> $$1) {
      return ((ev)$$0.getSource()).l().bb().e($$1);
   }

   private static <T> jp.c<T> b(CommandContext<ev> $$0, String $$1, alg<kc<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alg<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).a($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static jp.c<edr<?, ?>> a(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ly.aJ, b);
   }

   public static jp.c<elr> b(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ly.aS, c);
   }

   public static jp.c<enb> c(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ly.aV, d);
   }

   public alg<T> a(StringReader $$0) throws CommandSyntaxException {
      alh $$1 = alh.a($$0);
      return alg.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fa $$2 ? $$2.a(this.e, fa.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ir<fv<T>, fv.a<T>.a> {
      public void a(fv.a<T>.a $$0, we $$1) {
         $$1.b($$0.b);
      }

      public fv.a<T>.a a(we $$0) {
         return new fv.a.a($$0.r());
      }

      public void a(fv.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fv.a<T>.a a(fv<T> $$0) {
         return new fv.a.a($$0.e);
      }

      public final class a implements ir.a<fv<T>> {
         final alg<? extends kc<T>> b;

         a(final alg<? extends kc<T>> $$1) {
            this.b = $$1;
         }

         public fv<T> a(er $$0) {
            return new fv<>(this.b);
         }

         @Override
         public ir<fv<T>, ?> a() {
            return a.this;
         }
      }
   }
}
