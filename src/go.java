import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class go {
   static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wu.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wu.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("arguments.item.component.malformed", $$0, $$1));
   static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wu.c("arguments.item.component.expected"));
   static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> wu.b("arguments.item.component.repeated", $$0));
   public static final char a = '[';
   public static final char b = ']';
   public static final char c = ',';
   public static final char d = '=';
   static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> j = SuggestionsBuilder::buildFuture;
   final iy.b<csu> k;
   final DynamicOps<ux> l;

   public go(iy.a $$0) {
      this.k = $$0.b(le.G);
      this.l = $$0.a(uo.a);
   }

   public go.a a(StringReader $$0) throws CommandSyntaxException {
      final MutableObject<iw<csu>> $$1 = new MutableObject();
      final jw.a $$2 = jw.a();
      this.a($$0, new go.d() {
         @Override
         public void a(iw<csu> $$0) {
            $$1.setValue($$0);
         }

         @Override
         public <T> void a(jz<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }
      });
      return new go.a(Objects.requireNonNull((iw<csu>)$$1.getValue(), "Parser gave no item"), $$2.a());
   }

   public void a(StringReader $$0, go.d $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();

      try {
         new go.b($$0, $$1).a();
      } catch (CommandSyntaxException var5) {
         $$0.setCursor($$2);
         throw var5;
      }
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      go.c $$2 = new go.c();
      go.b $$3 = new go.b($$1, $$2);

      try {
         $$3.a();
      } catch (CommandSyntaxException var6) {
      }

      return $$2.a($$0, $$1);
   }

   public static record a(iw<csu> a, jw b) {
   }

   class b {
      private final StringReader b;
      private final go.d c;

      b(StringReader $$0, go.d $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public void a() throws CommandSyntaxException {
         this.c.a(this::d);
         this.b();
         this.c.a(this::a);
         if (this.b.canRead() && this.b.peek() == '[') {
            this.c.a(go.j);
            this.c();
         }
      }

      private void b() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         akh $$1 = akh.a(this.b);
         this.c.a(go.this.k.a(akg.a(le.G, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return go.e.createWithContext(this.b, $$1);
         }));
      }

      private void c() throws CommandSyntaxException {
         this.b.expect('[');
         this.c.a(this::e);
         Set<jz<?>> $$0 = new ReferenceArraySet();

         while (this.b.canRead() && this.b.peek() != ']') {
            this.b.skipWhitespace();
            jz<?> $$1 = a(this.b);
            if (!$$0.add($$1)) {
               throw go.i.create($$1);
            }

            this.c.a(this::c);
            this.b.skipWhitespace();
            this.b.expect('=');
            this.c.a(go.j);
            this.b.skipWhitespace();
            this.a($$1);
            this.b.skipWhitespace();
            this.c.a(this::b);
            if (!this.b.canRead() || this.b.peek() != ',') {
               break;
            }

            this.b.skip();
            this.b.skipWhitespace();
            this.c.a(this::e);
            if (!this.b.canRead()) {
               throw go.h.createWithContext(this.b);
            }
         }

         this.b.expect(']');
         this.c.a(go.j);
      }

      public static jz<?> a(StringReader $$0) throws CommandSyntaxException {
         if (!$$0.canRead()) {
            throw go.h.createWithContext($$0);
         } else {
            int $$1 = $$0.getCursor();
            akh $$2 = akh.a($$0);
            jz<?> $$3 = ld.as.a($$2);
            if ($$3 != null && !$$3.d()) {
               return $$3;
            } else {
               $$0.setCursor($$1);
               throw go.f.createWithContext($$0, $$2);
            }
         }
      }

      private <T> void a(jz<T> $$0) throws CommandSyntaxException {
         int $$1 = this.b.getCursor();
         ux $$2 = new uy(this.b).d();
         DataResult<T> $$3 = $$0.c().parse(go.this.l, $$2);
         this.c.a($$0, ac.a($$3, $$2x -> {
            this.b.setCursor($$1);
            return go.g.createWithContext(this.b, $$0.toString(), $$2x);
         }));
      }

      private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
         if ($$0.getRemaining().isEmpty()) {
            $$0.suggest(String.valueOf('['));
         }

         return $$0.buildFuture();
      }

      private CompletableFuture<Suggestions> b(SuggestionsBuilder $$0) {
         if ($$0.getRemaining().isEmpty()) {
            $$0.suggest(String.valueOf(','));
            $$0.suggest(String.valueOf(']'));
         }

         return $$0.buildFuture();
      }

      private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0) {
         if ($$0.getRemaining().isEmpty()) {
            $$0.suggest(String.valueOf('='));
         }

         return $$0.buildFuture();
      }

      private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0) {
         return ei.a(go.this.k.c().map(akg::a), $$0);
      }

      private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0) {
         String $$1 = $$0.getRemaining().toLowerCase(Locale.ROOT);
         ei.a(ld.as.g(), $$1, $$0x -> ((akg)$$0x.getKey()).a(), $$1x -> {
            jz<?> $$2 = (jz<?>)$$1x.getValue();
            if ($$2.b() != null) {
               akh $$3 = ((akg)$$1x.getKey()).a();
               $$0.suggest($$3.toString() + "=");
            }
         });
         return $$0.buildFuture();
      }
   }

   static class c implements go.d {
      private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> a = go.j;

      @Override
      public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
         this.a = $$0;
      }

      public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, StringReader $$1) {
         return this.a.apply($$0.createOffset($$1.getCursor()));
      }
   }

   public interface d {
      default void a(iw<csu> $$0) {
      }

      default <T> void a(jz<T> $$0, T $$1) {
      }

      default void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
      }
   }
}
