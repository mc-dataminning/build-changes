import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.io.FilenameUtils;

public class gc<T> implements ArgumentType<Collection<js.c<T>>> {
   private static final Collection<String> b = List.of("minecraft:*", "*:asset", "*");
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wv.b("argument.resource_selector.not_found", $$0, $$1));
   final alc<? extends kf<T>> c;
   private final ju<T> d;

   gc(et $$0, alc<? extends kf<T>> $$1) {
      this.c = $$1;
      this.d = $$0.e($$1);
   }

   public Collection<js.c<T>> a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = a(b($$0));
      List<js.c<T>> $$2 = this.d.c().filter($$1x -> a($$1, $$1x.h().a())).toList();
      if ($$2.isEmpty()) {
         throw a.createWithContext($$0, $$1, this.c.a());
      } else {
         return $$2;
      }
   }

   public static <T> Collection<js.c<T>> a(StringReader $$0, ju<T> $$1) {
      String $$2 = a(b($$0));
      return $$1.c().filter($$1x -> a($$2, $$1x.h().a())).toList();
   }

   private static String b(StringReader $$0) {
      int $$1 = $$0.getCursor();

      while ($$0.canRead() && a($$0.peek())) {
         $$0.skip();
      }

      return $$0.getString().substring($$1, $$0.getCursor());
   }

   private static boolean a(char $$0) {
      return ald.a($$0) || $$0 == '*' || $$0 == '?';
   }

   private static String a(String $$0) {
      return !$$0.contains(":") ? "minecraft:" + $$0 : $$0;
   }

   private static boolean a(String $$0, ald $$1) {
      return FilenameUtils.wildcardMatch($$1.toString(), $$0);
   }

   public static <T> gc<T> a(et $$0, alc<? extends kf<T>> $$1) {
      return new gc<>($$0, $$1);
   }

   public static <T> Collection<js.c<T>> a(CommandContext<ex> $$0, String $$1, alc<? extends kf<T>> $$2) {
      return (Collection<js.c<T>>)$$0.getArgument($$1, Collection.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fc.b(this.d.c_().map(alc::a).map(ald::toString), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a<T> implements iu<gc<T>, gc.a<T>.a> {
      public void a(gc.a<T>.a $$0, vr $$1) {
         $$1.b($$0.b);
      }

      public gc.a<T>.a a(vr $$0) {
         return new gc.a.a($$0.r());
      }

      public void a(gc.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public gc.a<T>.a a(gc<T> $$0) {
         return new gc.a.a($$0.c);
      }

      public final class a implements iu.a<gc<T>> {
         final alc<? extends kf<T>> b;

         a(final alc<? extends kf<T>> $$1) {
            this.b = $$1;
         }

         public gc<T> a(et $$0) {
            return new gc<>($$0, this.b);
         }

         @Override
         public iu<gc<T>, ?> a() {
            return a.this;
         }
      }
   }
}
