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

public class fw<T> implements ArgumentType<alh<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xi.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xi.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xi.b("commands.place.jigsaw.invalid", $$0));
   final alh<? extends kd<T>> e;

   public fw(alh<? extends kd<T>> $$0) {
      this.e = $$0;
   }

   public static <T> fw<T> a(alh<? extends kd<T>> $$0) {
      return new fw<>($$0);
   }

   private static <T> alh<T> a(CommandContext<ew> $$0, String $$1, alh<kd<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alh<?> $$4 = (alh<?>)$$0.getArgument($$1, alh.class);
      Optional<alh<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> kd<T> a(CommandContext<ew> $$0, alh<? extends kd<T>> $$1) {
      return ((ew)$$0.getSource()).l().ba().e($$1);
   }

   private static <T> jq.c<T> b(CommandContext<ew> $$0, String $$1, alh<kd<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alh<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).a($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static jq.c<edx<?, ?>> a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lz.aJ, b);
   }

   public static jq.c<elx> b(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lz.aS, c);
   }

   public static jq.c<enh> c(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lz.aV, d);
   }

   public alh<T> a(StringReader $$0) throws CommandSyntaxException {
      ali $$1 = ali.a($$0);
      return alh.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fb $$2 ? $$2.a(this.e, fb.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements is<fw<T>, fw.a<T>.a> {
      public void a(fw.a<T>.a $$0, wf $$1) {
         $$1.b($$0.b);
      }

      public fw.a<T>.a a(wf $$0) {
         return new fw.a.a($$0.r());
      }

      public void a(fw.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fw.a<T>.a a(fw<T> $$0) {
         return new fw.a.a($$0.e);
      }

      public final class a implements is.a<fw<T>> {
         final alh<? extends kd<T>> b;

         a(final alh<? extends kd<T>> $$1) {
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
