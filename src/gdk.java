import com.google.common.collect.Lists;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class gdk implements fb {
   private final gdi a;
   private final fke b;
   private int c = -1;
   @Nullable
   private CompletableFuture<Suggestions> d;
   private final Set<String> e = new HashSet<>();

   public gdk(gdi $$0, fke $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public Collection<String> q() {
      List<String> $$0 = Lists.newArrayList();

      for (gds $$1 : this.a.m()) {
         $$0.add($$1.a().getName());
      }

      return $$0;
   }

   @Override
   public Collection<String> z() {
      if (this.e.isEmpty()) {
         return this.q();
      } else {
         Set<String> $$0 = new HashSet<>(this.q());
         $$0.addAll(this.e);
         return $$0;
      }
   }

   @Override
   public Collection<String> A() {
      return (Collection<String>)(this.b.w != null && this.b.w.d() == ezw.a.c ? Collections.singleton(((ezv)this.b.w).a().cH()) : Collections.emptyList());
   }

   @Override
   public Collection<String> r() {
      return this.a.z().f();
   }

   @Override
   public Stream<alj> s() {
      return this.b.ak().d().stream();
   }

   @Override
   public Stream<alj> t() {
      return this.a.j().g();
   }

   @Override
   public boolean c(int $$0) {
      gic $$1 = this.b.t;
      return $$1 != null ? $$1.s($$0) : $$0 == 0;
   }

   @Override
   public CompletableFuture<Suggestions> a(ali<? extends kd<?>> $$0, fb.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().a($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(() -> this.a($$3));
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      if (this.d != null) {
         this.d.cancel(false);
      }

      this.d = new CompletableFuture<>();
      int $$1 = ++this.c;
      this.a.b(new ahj($$1, $$0.getInput()));
      return this.d;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.2f", $$0);
   }

   private static String a(int $$0) {
      return Integer.toString($$0);
   }

   @Override
   public Collection<fb.b> B() {
      ezw $$0 = this.b.w;
      if ($$0 != null && $$0.d() == ezw.a.b) {
         jh $$1 = ((ezu)$$0).b();
         return Collections.singleton(new fb.b(a($$1.u()), a($$1.v()), a($$1.w())));
      } else {
         return fb.super.B();
      }
   }

   @Override
   public Collection<fb.b> C() {
      ezw $$0 = this.b.w;
      if ($$0 != null && $$0.d() == ezw.a.b) {
         ezy $$1 = $$0.g();
         return Collections.singleton(new fb.b(a($$1.d), a($$1.e), a($$1.f)));
      } else {
         return fb.super.C();
      }
   }

   @Override
   public Set<ali<dfm>> u() {
      return this.a.u();
   }

   @Override
   public ke v() {
      return this.a.v();
   }

   @Override
   public crq w() {
      return this.a.y();
   }

   public void a(int $$0, Suggestions $$1) {
      if ($$0 == this.c) {
         this.d.complete($$1);
         this.d = null;
         this.c = -1;
      }
   }

   public void a(ade.a $$0, List<String> $$1) {
      switch ($$0) {
         case a:
            this.e.addAll($$1);
            break;
         case b:
            $$1.forEach(this.e::remove);
            break;
         case c:
            this.e.clear();
            this.e.addAll($$1);
      }
   }
}
