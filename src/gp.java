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

public class gp {
   static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wx.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wx.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("arguments.item.component.malformed", $$0, $$1));
   static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wx.c("arguments.item.component.expected"));
   static final DynamicCommandExceptionType i = new DynamicCommandExceptionType($$0 -> wx.b("arguments.item.component.repeated", $$0));
   public static final char a = '[';
   public static final char b = ']';
   public static final char c = ',';
   public static final char d = '=';
   static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> j = SuggestionsBuilder::buildFuture;
   final iz.b<ctl> k;
   final DynamicOps<va> l;

   public gp(iz.a $$0) {
      this.k = $$0.b(lf.G);
      this.l = $$0.a(ur.a);
   }

   public gp.a a(StringReader $$0) throws CommandSyntaxException {
      final MutableObject<ix<ctl>> $$1 = new MutableObject();
      final jx.a $$2 = jx.a();
      this.a($$0, new gp.d() {
         @Override
         public void a(ix<ctl> $$0) {
            $$1.setValue($$0);
         }

         @Override
         public <T> void a(ka<T> $$0, T $$1x) {
            $$2.a($$0, $$1);
         }
      });
      return new gp.a(Objects.requireNonNull((ix<ctl>)$$1.getValue(), "Parser gave no item"), $$2.a());
   }

   public void a(StringReader $$0, gp.d $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();

      try {
         new gp.b($$0, $$1).a();
      } catch (CommandSyntaxException var5) {
         $$0.setCursor($$2);
         throw var5;
      }
   }

   public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      StringReader $$1 = new StringReader($$0.getInput());
      $$1.setCursor($$0.getStart());
      gp.c $$2 = new gp.c();
      gp.b $$3 = new gp.b($$1, $$2);

      try {
         $$3.a();
      } catch (CommandSyntaxException var6) {
      }

      return $$2.a($$0, $$1);
   }

   public static record a(ix<ctl> a, jx b) {
   }

   class b {
      private final StringReader b;
      private final gp.d c;

      b(StringReader $$0, gp.d $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public void a() throws CommandSyntaxException {
         this.c.a(this::d);
         this.b();
         this.c.a(this::a);
         if (this.b.canRead() && this.b.peek() == '[') {
            this.c.a(gp.j);
            this.c();
         }
      }

      private void b() throws CommandSyntaxException {
         int $$0 = this.b.getCursor();
         akn $$1 = akn.a(this.b);
         this.c.a(gp.this.k.a(akm.a(lf.G, $$1)).orElseThrow(() -> {
            this.b.setCursor($$0);
            return gp.e.createWithContext(this.b, $$1);
         }));
      }

      private void c() throws CommandSyntaxException {
         this.b.expect('[');
         this.c.a(this::e);
         Set<ka<?>> $$0 = new ReferenceArraySet();

         while (this.b.canRead() && this.b.peek() != ']') {
            this.b.skipWhitespace();
            ka<?> $$1 = a(this.b);
            if (!$$0.add($$1)) {
               throw gp.i.create($$1);
            }

            this.c.a(this::c);
            this.b.skipWhitespace();
            this.b.expect('=');
            this.c.a(gp.j);
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
               throw gp.h.createWithContext(this.b);
            }
         }

         this.b.expect(']');
         this.c.a(gp.j);
      }

      public static ka<?> a(StringReader $$0) throws CommandSyntaxException {
         if (!$$0.canRead()) {
            throw gp.h.createWithContext($$0);
         } else {
            int $$1 = $$0.getCursor();
            akn $$2 = akn.a($$0);
            ka<?> $$3 = le.as.a($$2);
            if ($$3 != null && !$$3.d()) {
               return $$3;
            } else {
               $$0.setCursor($$1);
               throw gp.f.createWithContext($$0, $$2);
            }
         }
      }

      private <T> void a(ka<T> $$0) throws CommandSyntaxException {
         int $$1 = this.b.getCursor();
         va $$2 = new vb(this.b).d();
         DataResult<T> $$3 = $$0.c().parse(gp.this.l, $$2);
         this.c.a($$0, (T)$$3.getOrThrow($$2x -> {
            this.b.setCursor($$1);
            return gp.g.createWithContext(this.b, $$0.toString(), $$2x);
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
         return ej.a(gp.this.k.c().map(akm::a), $$0);
      }

      private CompletableFuture<Suggestions> e(SuggestionsBuilder $$0) {
         String $$1 = $$0.getRemaining().toLowerCase(Locale.ROOT);
         ej.a(le.as.g(), $$1, $$0x -> ((akm)$$0x.getKey()).a(), $$1x -> {
            ka<?> $$2 = (ka<?>)$$1x.getValue();
            if ($$2.b() != null) {
               akn $$3 = ((akm)$$1x.getKey()).a();
               $$0.suggest($$3.toString() + "=");
            }
         });
         return $$0.buildFuture();
      }
   }

   static class c implements gp.d {
      private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> a = gp.j;

      @Override
      public void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
         this.a = $$0;
      }

      public CompletableFuture<Suggestions> a(SuggestionsBuilder $$0, StringReader $$1) {
         return this.a.apply($$0.createOffset($$1.getCursor()));
      }
   }

   public interface d {
      default void a(ix<ctl> $$0) {
      }

      default <T> void a(ka<T> $$0, T $$1) {
      }

      default void a(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> $$0) {
      }
   }
}
