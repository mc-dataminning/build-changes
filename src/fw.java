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

public class fw<T> implements ArgumentType<ali<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xj.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xj.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xj.b("commands.place.jigsaw.invalid", $$0));
   final ali<? extends kd<T>> e;

   public fw(ali<? extends kd<T>> $$0) {
      this.e = $$0;
   }

   public static <T> fw<T> a(ali<? extends kd<T>> $$0) {
      return new fw<>($$0);
   }

   private static <T> ali<T> a(CommandContext<ew> $$0, String $$1, ali<kd<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ali<?> $$4 = (ali<?>)$$0.getArgument($$1, ali.class);
      Optional<ali<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> kd<T> a(CommandContext<ew> $$0, ali<? extends kd<T>> $$1) {
      return ((ew)$$0.getSource()).l().ba().e($$1);
   }

   private static <T> jq.c<T> b(CommandContext<ew> $$0, String $$1, ali<kd<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ali<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).a($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static jq.c<eei<?, ?>> a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ma.aJ, b);
   }

   public static jq.c<emi> b(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ma.aS, c);
   }

   public static jq.c<ens> c(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ma.aV, d);
   }

   public ali<T> a(StringReader $$0) throws CommandSyntaxException {
      alj $$1 = alj.a($$0);
      return ali.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fb $$2 ? $$2.a(this.e, fb.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements is<fw<T>, fw.a<T>.a> {
      public void a(fw.a<T>.a $$0, wg $$1) {
         $$1.b($$0.b);
      }

      public fw.a<T>.a a(wg $$0) {
         return new fw.a.a($$0.r());
      }

      public void a(fw.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fw.a<T>.a a(fw<T> $$0) {
         return new fw.a.a($$0.e);
      }

      public final class a implements is.a<fw<T>> {
         final ali<? extends kd<T>> b;

         a(final ali<? extends kd<T>> $$1) {
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
