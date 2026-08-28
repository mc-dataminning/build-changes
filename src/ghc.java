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

public class ghc implements fc {
   private final ggz a;
   private final fmg b;
   private int d = -1;
   @Nullable
   private CompletableFuture<Suggestions> e;
   private final Set<String> f = new HashSet<>();

   public ghc(ggz $$0, fmg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public Collection<String> q() {
      List<String> $$0 = Lists.newArrayList();

      for (ghk $$1 : this.a.m()) {
         $$0.add($$1.a().getName());
      }

      return $$0;
   }

   @Override
   public Collection<String> y() {
      if (this.f.isEmpty()) {
         return this.q();
      } else {
         Set<String> $$0 = new HashSet<>(this.q());
         $$0.addAll(this.f);
         return $$0;
      }
   }

   @Override
   public Collection<String> z() {
      return (Collection<String>)(this.b.w != null && this.b.w.d() == fbv.a.c ? Collections.singleton(((fbu)this.b.w).a().cG()) : Collections.emptyList());
   }

   @Override
   public Collection<String> r() {
      return this.a.z().f();
   }

   @Override
   public Stream<aku> s() {
      return this.b.ak().d().stream();
   }

   @Override
   public boolean c(int $$0) {
      glv $$1 = this.b.t;
      return $$1 != null ? $$1.s($$0) : $$0 == 0;
   }

   @Override
   public CompletableFuture<Suggestions> a(akt<? extends ke<?>> $$0, fc.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.u().a($$0).map($$2x -> {
         this.a($$2x, $$1, $$2);
         return $$2.buildFuture();
      }).orElseGet(() -> this.a($$3));
   }

   @Override
   public CompletableFuture<Suggestions> a(CommandContext<?> $$0) {
      if (this.e != null) {
         this.e.cancel(false);
      }

      this.e = new CompletableFuture<>();
      int $$1 = ++this.d;
      this.a.b(new ags($$1, $$0.getInput()));
      return this.e;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.2f", $$0);
   }

   private static String a(int $$0) {
      return Integer.toString($$0);
   }

   @Override
   public Collection<fc.b> A() {
      fbv $$0 = this.b.w;
      if ($$0 != null && $$0.d() == fbv.a.b) {
         ji $$1 = ((fbt)$$0).b();
         return Collections.singleton(new fc.b(a($$1.u()), a($$1.v()), a($$1.w())));
      } else {
         return fc.super.A();
      }
   }

   @Override
   public Collection<fc.b> B() {
      fbv $$0 = this.b.w;
      if ($$0 != null && $$0.d() == fbv.a.b) {
         fbx $$1 = $$0.g();
         return Collections.singleton(new fc.b(a($$1.d), a($$1.e), a($$1.f)));
      } else {
         return fc.super.B();
      }
   }

   @Override
   public Set<akt<dgz>> t() {
      return this.a.u();
   }

   @Override
   public kf u() {
      return this.a.v();
   }

   @Override
   public csn v() {
      return this.a.y();
   }

   public void a(int $$0, Suggestions $$1) {
      if ($$0 == this.d) {
         this.e.complete($$1);
         this.e = null;
         this.d = -1;
      }
   }

   public void a(acj.a $$0, List<String> $$1) {
      switch ($$0) {
         case a:
            this.f.addAll($$1);
            break;
         case b:
            $$1.forEach(this.f::remove);
            break;
         case c:
            this.f.clear();
            this.f.addAll($$1);
      }
   }
}
