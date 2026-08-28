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

public class fx<T> implements ArgumentType<akt<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wo.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wo.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wo.b("commands.place.jigsaw.invalid", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wo.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wo.b("advancement.advancementNotFound", $$0));
   final akt<? extends ke<T>> g;

   public fx(akt<? extends ke<T>> $$0) {
      this.g = $$0;
   }

   public static <T> fx<T> a(akt<? extends ke<T>> $$0) {
      return new fx<>($$0);
   }

   private static <T> akt<T> a(CommandContext<ex> $$0, String $$1, akt<ke<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      akt<?> $$4 = (akt<?>)$$0.getArgument($$1, akt.class);
      Optional<akt<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4.a()));
   }

   private static <T> ke<T> a(CommandContext<ex> $$0, akt<? extends ke<T>> $$1) {
      return ((ex)$$0.getSource()).l().ba().e($$1);
   }

   private static <T> jr.c<T> b(CommandContext<ex> $$0, String $$1, akt<ke<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      akt<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).a($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static jr.c<efk<?, ?>> a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mc.aL, b);
   }

   public static jr.c<enm> b(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mc.aU, c);
   }

   public static jr.c<eow> c(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mc.aX, d);
   }

   public static dbj<?> d(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      dbl $$2 = ((ex)$$0.getSource()).l().aI();
      akt<dbe<?>> $$3 = a($$0, $$1, mc.bk, e);
      return $$2.b($$3).orElseThrow(() -> e.create($$3.a()));
   }

   public static ai e(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      akt<ah> $$2 = a($$0, $$1, mc.bj, f);
      ai $$3 = ((ex)$$0.getSource()).l().aD().a($$2.a());
      if ($$3 == null) {
         throw f.create($$2.a());
      } else {
         return $$3;
      }
   }

   public akt<T> a(StringReader $$0) throws CommandSyntaxException {
      aku $$1 = aku.a($$0);
      return akt.a(this.g, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fc $$2 ? $$2.a(this.g, fc.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements it<fx<T>, fx.a<T>.a> {
      public void a(fx.a<T>.a $$0, vl $$1) {
         $$1.b($$0.b);
      }

      public fx.a<T>.a a(vl $$0) {
         return new fx.a.a($$0.r());
      }

      public void a(fx.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fx.a<T>.a a(fx<T> $$0) {
         return new fx.a.a($$0.g);
      }

      public final class a implements it.a<fx<T>> {
         final akt<? extends ke<T>> b;

         a(final akt<? extends ke<T>> $$1) {
            this.b = $$1;
         }

         public fx<T> a(et $$0) {
            return new fx<>(this.b);
         }

         @Override
         public it<fx<T>, ?> a() {
            return a.this;
         }
      }
   }
}
