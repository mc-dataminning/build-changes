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

public class fw<T> implements ArgumentType<jr.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wp.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wp.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final aku<? extends ke<T>> e;
   private final jt<T> f;

   public fw(et $$0, aku<? extends ke<T>> $$1) {
      this.e = $$1;
      this.f = $$0.d($$1);
   }

   public static <T> fw<T> a(et $$0, aku<? extends ke<T>> $$1) {
      return new fw<>($$0, $$1);
   }

   public static <T> jr.c<T> a(CommandContext<ex> $$0, String $$1, aku<ke<T>> $$2) throws CommandSyntaxException {
      jr.c<T> $$3 = (jr.c<T>)$$0.getArgument($$1, jr.c.class);
      aku<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static jr.c<bwj> a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mc.c);
   }

   public static jr.c<efj<?, ?>> b(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mc.aL);
   }

   public static jr.c<enl> c(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mc.aU);
   }

   public static jr.c<bur<?>> d(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mc.z);
   }

   public static jr.c<bur<?>> e(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      jr.c<bur<?>> $$2 = a($$0, $$1, mc.z);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static jr.c<btn> f(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mc.W);
   }

   public static jr.c<dcy> g(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mc.aO);
   }

   public jr.c<T> a(StringReader $$0) throws CommandSyntaxException {
      akv $$1 = akv.a($$0);
      aku<T> $$2 = aku.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fc.a(this.f.c_().map(aku::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements it<fw<T>, fw.a<T>.a> {
      public void a(fw.a<T>.a $$0, vl $$1) {
         $$1.b($$0.b);
      }

      public fw.a<T>.a a(vl $$0) {
         return new fw.a.a($$0.r());
      }

      public void a(fw.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fw.a<T>.a a(fw<T> $$0) {
         return new fw.a.a($$0.e);
      }

      public final class a implements it.a<fw<T>> {
         final aku<? extends ke<T>> b;

         a(final aku<? extends ke<T>> $$1) {
            this.b = $$1;
         }

         public fw<T> a(et $$0) {
            return new fw<>($$0, this.b);
         }

         @Override
         public it<fw<T>, ?> a() {
            return a.this;
         }
      }
   }
}
