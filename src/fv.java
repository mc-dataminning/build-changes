import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fv<T> implements ArgumentType<jq.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xk.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xk.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xk.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final alo<? extends kd<T>> e;
   private final js<T> f;

   public fv(es $$0, alo<? extends kd<T>> $$1) {
      this.e = $$1;
      this.f = $$0.d($$1);
   }

   public static <T> fv<T> a(es $$0, alo<? extends kd<T>> $$1) {
      return new fv<>($$0, $$1);
   }

   public static <T> jq.c<T> a(CommandContext<ew> $$0, String $$1, alo<kd<T>> $$2) throws CommandSyntaxException {
      jq.c<T> $$3 = (jq.c<T>)$$0.getArgument($$1, jq.c.class);
      alo<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static jq.c<bxa> a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mb.c);
   }

   public static jq.c<egb<?, ?>> b(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mb.aL);
   }

   public static jq.c<eod> c(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mb.aU);
   }

   public static jq.c<bvi<?>> d(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mb.z);
   }

   public static jq.c<bvi<?>> e(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      jq.c<bvi<?>> $$2 = a($$0, $$1, mb.z);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static jq.c<bue> f(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mb.W);
   }

   public static jq.c<ddq> g(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mb.aO);
   }

   public jq.c<T> a(StringReader $$0) throws CommandSyntaxException {
      alp $$1 = alp.a($$0);
      alo<T> $$2 = alo.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fb.a(this.f.c_().map(alo::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements is<fv<T>, fv.a<T>.a> {
      public void a(fv.a<T>.a $$0, wh $$1) {
         $$1.b($$0.b);
      }

      public fv.a<T>.a a(wh $$0) {
         return new fv.a.a($$0.r());
      }

      public void a(fv.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fv.a<T>.a a(fv<T> $$0) {
         return new fv.a.a($$0.e);
      }

      public final class a implements is.a<fv<T>> {
         final alo<? extends kd<T>> b;

         a(final alo<? extends kd<T>> $$1) {
            this.b = $$1;
         }

         public fv<T> a(es $$0) {
            return new fv<>($$0, this.b);
         }

         @Override
         public is<fv<T>, ?> a() {
            return a.this;
         }
      }
   }
}
