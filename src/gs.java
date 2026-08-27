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

public class gs {
   static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xe.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xe.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("arguments.item.component.malformed", $$0, $$1));
   static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xe.c("arguments.item.component.expected"));
   static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> xe.b("arguments.item.component.repeated", $$0));
   public static final char a = '[';
   public static final char b = ']';
   public static final char c = ',';
   public static final char d = '=';
   static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> j = SuggestionsBuilder::buildFuture;
   final jc.b<cuc> k;
   final DynamicOps<vh> l;

   public gs(jc.a $$0) {
      this.k = $$0.b(li.G);
      this.l = $$0.a(uy.a);
   }

   public gs.a a(StringReader $$0) throws CommandSyntaxException {
      final MutableObject<ja<cuc>> $$1 = new MutableObject();
      final ka.a $$2 = ka.a();
      this.a($$0, new gs.d() {
         @Override
         public void a(ja<cuc> $$0) {
            $$1.setValue($$0);
         }

         @Override
         public <T> void a(kd<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }
      });
      return new gs.a(Objects.requireNonNull((ja<cuc>)$$1.getValue(), "Parser gave no item"), $$2.a());
   }

   public void a(StringReader $$0, gs.d $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();

      try {
         new gs.b($$0, $$1).a();
      } catch (CommandSyntaxException var5) {
         $$0.setCursor($$2);
         throw var5;
      }
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      gs.c $$2 = new gs.c();
      gs.b $$3 = new gs.b($$1, $$2);

      try {
         $$3.a();
      } catch (CommandSyntaxException var6) {
      }

      return $$2.a($$0, $$1);
   }

   public static record a(ja<cuc> a, ka b) {
   }

   class b {
      private final StringReader b;
      private final gs.d c;

      b(StringReader $$0, gs.d $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public void a() throws CommandSyntaxException {
         this.c.a(this::d);
         this.b();
         this.c.a(this::a);
         if (this.b.canRead() && this.b.peek() == '[') {
            this.c.a(gs.j);
            this.c();
         }
      }

      private void b() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         akt $$1 = akt.a(this.b);
         this.c.a(gs.this.k.a(aks.a(li.G, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return gs.e.createWithContext(this.b, $$1);
         }));
      }

      private void c() throws CommandSyntaxException {
         this.b.expect('[');
         this.c.a(this::e);
         Set<kd<?>> $$0 = new ReferenceArraySet();

         while (this.b.canRead() && this.b.peek() != ']') {
            this.b.skipWhitespace();
            kd<?> $$1 = a(this.b);
            if (!$$0.add($$1)) {
               throw gs.i.create($$1);
            }

            this.c.a(this::c);
            this.b.skipWhitespace();
            this.b.expect('=');
            this.c.a(gs.j);
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
               throw gs.h.createWithContext(this.b);
            }
         }

         this.b.expect(']');
         this.c.a(gs.j);
      }

      public static kd<?> a(StringReader $$0) throws CommandSyntaxException {
         if (!$$0.canRead()) {
            throw gs.h.createWithContext($$0);
         } else {
            int $$1 = $$0.getCursor();
            akt $$2 = akt.a($$0);
            kd<?> $$3 = lh.as.a($$2);
            if ($$3 != null && !$$3.d()) {
               return $$3;
            } else {
               $$0.setCursor($$1);
               throw gs.f.createWithContext($$0, $$2);
            }
         }
      }

      private <T> void a(kd<T> $$0) throws CommandSyntaxException {
         int $$1 = this.b.getCursor();
         vh $$2 = new vi(this.b).d();
         DataResult<T> $$3 = $$0.c().parse(gs.this.l, $$2);
         this.c.a($$0, ad.a($$3, $$2x -> {
            this.b.setCursor($$1);
            return gs.g.createWithContext(this.b, $$0.toString(), $$2x);
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
         return em.a(gs.this.k.c().map(aks::a), $$0);
      }

      private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0) {
         String $$1 = $$0.getRemaining().toLowerCase(Locale.ROOT);
         em.a(lh.as.g(), $$1, $$0x -> ((aks)$$0x.getKey()).a(), $$1x -> {
            kd<?> $$2 = (kd<?>)$$1x.getValue();
            if ($$2.b() != null) {
               akt $$3 = ((aks)$$1x.getKey()).a();
               $$0.suggest($$3.toString() + "=");
            }
         });
         return $$0.buildFuture();
      }
   }

   static class c implements gs.d {
      private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> a = gs.j;

      @Override
      public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
         this.a = $$0;
      }

      public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, StringReader $$1) {
         return this.a.apply($$0.createOffset($$1.getCursor()));
      }
   }

   public interface d {
      default void a(ja<cuc> $$0) {
      }

      default <T> void a(kd<T> $$0, T $$1) {
      }

      default void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
      }
   }
}
