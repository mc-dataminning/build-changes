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

public class hi {
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wo.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType g = new DynamicCommandExceptionType($$0 -> wo.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType h = new Dynamic2CommandExceptionType(($$0, $$1) -> wo.b("arguments.item.component.malformed", $$0, $$1));
   static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wo.c("arguments.item.component.expected"));
   static final DynamicCommandExceptionType j = new DynamicCommandExceptionType($$0 -> wo.b("arguments.item.component.repeated", $$0));
   private static final DynamicCommandExceptionType k = new DynamicCommandExceptionType($$0 -> wo.b("arguments.item.malformed", $$0));
   public static final char a = '[';
   public static final char b = ']';
   public static final char c = ',';
   public static final char d = '=';
   public static final char e = '!';
   static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> l = SuggestionsBuilder::buildFuture;
   final jt.b<cwl> m;
   final DynamicOps<un> n;

   public hi(jt.a $$0) {
      this.m = $$0.d(mc.K);
      this.n = $$0.a(ue.a);
   }

   public hi.a a(StringReader $$0) throws CommandSyntaxException {
      final MutableObject<jr<cwl>> $$1 = new MutableObject();
      final ks.a $$2 = ks.a();
      this.a($$0, new hi.d() {
         @Override
         public void a(jr<cwl> $$0) {
            $$1.setValue($$0);
         }

         @Override
         public <T> void a(ku<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }

         @Override
         public <T> void a(ku<T> $$0) {
            $$2.a($$0);
         }
      });
      jr<cwl> $$3 = Objects.requireNonNull((jr<cwl>)$$1.getValue(), "Parser gave no item");
      ks $$4 = $$2.a();
      a($$0, $$3, $$4);
      return new hi.a($$3, $$4);
   }

   private static void a(StringReader $$0, jr<cwl> $$1, ks $$2) throws CommandSyntaxException {
      kr $$3 = kw.a($$1.a().g(), $$2);
      DataResult<baf> $$4 = cwp.a($$3);
      $$4.getOrThrow($$1x -> k.createWithContext($$0, $$1x));
   }

   public void a(StringReader $$0, hi.d $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();

      try {
         new hi.b($$0, $$1).a();
      } catch (CommandSyntaxException var5) {
         $$0.setCursor($$2);
         throw var5;
      }
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      hi.c $$2 = new hi.c();
      hi.b $$3 = new hi.b($$1, $$2);

      try {
         $$3.a();
      } catch (CommandSyntaxException var6) {
      }

      return $$2.a($$0, $$1);
   }

   public static record a(jr<cwl> a, ks b) {
   }

   class b {
      private final StringReader b;
      private final hi.d c;

      b(final StringReader $$0, final hi.d $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public void a() throws CommandSyntaxException {
         this.c.a(this::d);
         this.b();
         this.c.a(this::a);
         if (this.b.canRead() && this.b.peek() == '[') {
            this.c.a(hi.l);
            this.c();
         }
      }

      private void b() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         aku $$1 = aku.a(this.b);
         this.c.a(hi.this.m.a(akt.a(mc.K, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return hi.f.createWithContext(this.b, $$1);
         }));
      }

      private void c() throws CommandSyntaxException {
         this.b.expect('[');
         this.c.a(this::e);
         Set<ku<?>> $$0 = new ReferenceArraySet();

         while (this.b.canRead() && this.b.peek() != ']') {
            this.b.skipWhitespace();
            if (this.b.canRead() && this.b.peek() == '!') {
               this.b.skip();
               this.c.a(this::f);
               ku<?> $$1 = a(this.b);
               if (!$$0.add($$1)) {
                  throw hi.j.create($$1);
               }

               this.c.a($$1);
               this.c.a(hi.l);
               this.b.skipWhitespace();
            } else {
               ku<?> $$2 = a(this.b);
               if (!$$0.add($$2)) {
                  throw hi.j.create($$2);
               }

               this.c.a(this::c);
               this.b.skipWhitespace();
               this.b.expect('=');
               this.c.a(hi.l);
               this.b.skipWhitespace();
               this.a($$2);
               this.b.skipWhitespace();
            }

            this.c.a(this::b);
            if (!this.b.canRead() || this.b.peek() != ',') {
               break;
            }

            this.b.skip();
            this.b.skipWhitespace();
            this.c.a(this::e);
            if (!this.b.canRead()) {
               throw hi.i.createWithContext(this.b);
            }
         }

         this.b.expect(']');
         this.c.a(hi.l);
      }

      public static ku<?> a(StringReader $$0) throws CommandSyntaxException {
         if (!$$0.canRead()) {
            throw hi.i.createWithContext($$0);
         } else {
            int $$1 = $$0.getCursor();
            aku $$2 = aku.a($$0);
            ku<?> $$3 = mb.ao.a($$2);
            if ($$3 != null && !$$3.d()) {
               return $$3;
            } else {
               $$0.setCursor($$1);
               throw hi.g.createWithContext($$0, $$2);
            }
         }
      }

      private <T> void a(ku<T> $$0) throws CommandSyntaxException {
         int $$1 = this.b.getCursor();
         un $$2 = new uo(this.b).d();
         DataResult<T> $$3 = $$0.c().parse(hi.this.n, $$2);
         this.c.a($$0, (T)$$3.getOrThrow($$2x -> {
            this.b.setCursor($$1);
            return hi.h.createWithContext(this.b, $$0.toString(), $$2x);
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
         return fc.a(hi.this.m.c_().map(akt::a), $$0);
      }

      private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0) {
         $$0.suggest(String.valueOf('!'));
         return this.a($$0, String.valueOf('='));
      }

      private CompletableFuture<Suggestions> f(SuggestionsBuilder $$0) {
         return this.a($$0, "");
      }

      private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, String $$1) {
         String $$2 = $$0.getRemaining().toLowerCase(Locale.ROOT);
         fc.a(mb.ao.k(), $$2, $$0x -> ((akt)$$0x.getKey()).a(), $$2x -> {
            ku<?> $$3 = (ku<?>)$$2x.getValue();
            if ($$3.b() != null) {
               aku $$4 = ((akt)$$2x.getKey()).a();
               $$0.suggest($$4 + $$1);
            }
         });
         return $$0.buildFuture();
      }
   }

   static class c implements hi.d {
      private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> a = hi.l;

      @Override
      public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
         this.a = $$0;
      }

      public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, StringReader $$1) {
         return this.a.apply($$0.createOffset($$1.getCursor()));
      }
   }

   public interface d {
      default void a(jr<cwl> $$0) {
      }

      default <T> void a(ku<T> $$0, T $$1) {
      }

      default <T> void a(ku<T> $$0) {
      }

      default void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
      }
   }
}
