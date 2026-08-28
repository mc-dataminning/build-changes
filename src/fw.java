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

public class fw<T> implements ArgumentType<alo<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xk.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xk.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xk.b("commands.place.jigsaw.invalid", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xk.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xk.b("advancement.advancementNotFound", $$0));
   final alo<? extends kd<T>> g;

   public fw(alo<? extends kd<T>> $$0) {
      this.g = $$0;
   }

   public static <T> fw<T> a(alo<? extends kd<T>> $$0) {
      return new fw<>($$0);
   }

   private static <T> alo<T> a(CommandContext<ew> $$0, String $$1, alo<kd<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alo<?> $$4 = (alo<?>)$$0.getArgument($$1, alo.class);
      Optional<alo<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4.a()));
   }

   private static <T> kd<T> a(CommandContext<ew> $$0, alo<? extends kd<T>> $$1) {
      return ((ew)$$0.getSource()).l().ba().e($$1);
   }

   private static <T> jq.c<T> b(CommandContext<ew> $$0, String $$1, alo<kd<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alo<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).a($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static jq.c<egb<?, ?>> a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mb.aL, b);
   }

   public static jq.c<eod> b(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mb.aU, c);
   }

   public static jq.c<epn> c(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mb.aX, d);
   }

   public static dca<?> d(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      dcc $$2 = ((ew)$$0.getSource()).l().aI();
      alo<dbv<?>> $$3 = a($$0, $$1, mb.bk, e);
      return $$2.b($$3).orElseThrow(() -> e.create($$3.a()));
   }

   public static ah e(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      alo<ag> $$2 = a($$0, $$1, mb.bj, f);
      ah $$3 = ((ew)$$0.getSource()).l().aD().a($$2.a());
      if ($$3 == null) {
         throw f.create($$2.a());
      } else {
         return $$3;
      }
   }

   public alo<T> a(StringReader $$0) throws CommandSyntaxException {
      alp $$1 = alp.a($$0);
      return alo.a(this.g, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fb $$2 ? $$2.a(this.g, fb.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements is<fw<T>, fw.a<T>.a> {
      public void a(fw.a<T>.a $$0, wh $$1) {
         $$1.b($$0.b);
      }

      public fw.a<T>.a a(wh $$0) {
         return new fw.a.a($$0.r());
      }

      public void a(fw.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fw.a<T>.a a(fw<T> $$0) {
         return new fw.a.a($$0.g);
      }

      public final class a implements is.a<fw<T>> {
         final alo<? extends kd<T>> b;

         a(final alo<? extends kd<T>> $$1) {
            this.b = $$1;
         }

         public fw<T> a(es $$0) {
            return new fw<>(this.b);
         }

         @Override
         public is<fw<T>, ?> a() {
            return a.this;
         }
      }
   }
}
