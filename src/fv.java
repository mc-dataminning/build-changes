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
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xi.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xi.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xi.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final alh<? extends kd<T>> e;
   private final js<T> f;

   public fv(es $$0, alh<? extends kd<T>> $$1) {
      this.e = $$1;
      this.f = $$0.d($$1);
   }

   public static <T> fv<T> a(es $$0, alh<? extends kd<T>> $$1) {
      return new fv<>($$0, $$1);
   }

   public static <T> jq.c<T> a(CommandContext<ew> $$0, String $$1, alh<kd<T>> $$2) throws CommandSyntaxException {
      jq.c<T> $$3 = (jq.c<T>)$$0.getArgument($$1, jq.c.class);
      alh<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static jq.c<bwd> a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lz.c);
   }

   public static jq.c<edx<?, ?>> b(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lz.aJ);
   }

   public static jq.c<elx> c(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lz.aS);
   }

   public static jq.c<bul<?>> d(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lz.z);
   }

   public static jq.c<bul<?>> e(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      jq.c<bul<?>> $$2 = a($$0, $$1, lz.z);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static jq.c<bth> f(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lz.W);
   }

   public static jq.c<dbs> g(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lz.aM);
   }

   public jq.c<T> a(StringReader $$0) throws CommandSyntaxException {
      ali $$1 = ali.a($$0);
      alh<T> $$2 = alh.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fb.a(this.f.c_().map(alh::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements is<fv<T>, fv.a<T>.a> {
      public void a(fv.a<T>.a $$0, wf $$1) {
         $$1.b($$0.b);
      }

      public fv.a<T>.a a(wf $$0) {
         return new fv.a.a($$0.r());
      }

      public void a(fv.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fv.a<T>.a a(fv<T> $$0) {
         return new fv.a.a($$0.e);
      }

      public final class a implements is.a<fv<T>> {
         final alh<? extends kd<T>> b;

         a(final alh<? extends kd<T>> $$1) {
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
