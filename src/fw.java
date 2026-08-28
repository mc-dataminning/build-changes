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

public class fw<T> implements ArgumentType<js.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wv.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wv.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wv.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final alc<? extends kf<T>> e;
   private final ju<T> f;

   public fw(et $$0, alc<? extends kf<T>> $$1) {
      this.e = $$1;
      this.f = $$0.e($$1);
   }

   public static <T> fw<T> a(et $$0, alc<? extends kf<T>> $$1) {
      return new fw<>($$0, $$1);
   }

   public static <T> js.c<T> a(CommandContext<ex> $$0, String $$1, alc<kf<T>> $$2) throws CommandSyntaxException {
      js.c<T> $$3 = (js.c<T>)$$0.getArgument($$1, js.c.class);
      alc<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static js.c<bxs> a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, me.c);
   }

   public static js.c<ehd<?, ?>> b(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, me.aP);
   }

   public static js.c<epg> c(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, me.aZ);
   }

   public static js.c<bwb<?>> d(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, me.z);
   }

   public static js.c<bwb<?>> e(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      js.c<bwb<?>> $$2 = a($$0, $$1, me.z);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static js.c<buu> f(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, me.W);
   }

   public static js.c<deh> g(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, me.aS);
   }

   public js.c<T> a(StringReader $$0) throws CommandSyntaxException {
      ald $$1 = ald.a($$0);
      alc<T> $$2 = alc.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fc.a(this.f.c_().map(alc::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements iu<fw<T>, fw.a<T>.a> {
      public void a(fw.a<T>.a $$0, vr $$1) {
         $$1.b($$0.b);
      }

      public fw.a<T>.a a(vr $$0) {
         return new fw.a.a($$0.r());
      }

      public void a(fw.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fw.a<T>.a a(fw<T> $$0) {
         return new fw.a.a($$0.e);
      }

      public final class a implements iu.a<fw<T>> {
         final alc<? extends kf<T>> b;

         a(final alc<? extends kf<T>> $$1) {
            this.b = $$1;
         }

         public fw<T> a(et $$0) {
            return new fw<>($$0, this.b);
         }

         @Override
         public iu<fw<T>, ?> a() {
            return a.this;
         }
      }
   }
}
