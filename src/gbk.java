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

public class gbk implements ey {
   private final gbi a;
   private final fil b;
   private int c = -1;
   @Nullable
   private CompletableFuture<Suggestions> d;
   private final Set<String> e = new HashSet<>();

   public gbk(gbi $$0, fil $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public Collection<String> q() {
      List<String> $$0 = Lists.newArrayList();

      for (gbs $$1 : this.a.m()) {
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
      return (Collection<String>)(this.b.w != null && this.b.w.d() == eyq.a.c ? Collections.singleton(((eyp)this.b.w).a().cE()) : Collections.emptyList());
   }

   @Override
   public Collection<String> r() {
      return this.a.z().f();
   }

   @Override
   public Stream<alc> s() {
      return this.b.ak().d().stream();
   }

   @Override
   public Stream<alc> t() {
      return this.a.j().g();
   }

   @Override
   public boolean c(int $$0) {
      ggc $$1 = this.b.t;
      return $$1 != null ? $$1.l($$0) : $$0 == 0;
   }

   @Override
   public CompletableFuture<Suggestions> a(alb<? extends ka<?>> $$0, ey.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.v().c($$0).map($$2x -> {
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
      this.a.b(new ahd($$1, $$0.getInput()));
      return this.d;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.2f", $$0);
   }

   private static String a(int $$0) {
      return Integer.toString($$0);
   }

   @Override
   public Collection<ey.b> B() {
      eyq $$0 = this.b.w;
      if ($$0 != null && $$0.d() == eyq.a.b) {
         je $$1 = ((eyo)$$0).b();
         return Collections.singleton(new ey.b(a($$1.u()), a($$1.v()), a($$1.w())));
      } else {
         return ey.super.B();
      }
   }

   @Override
   public Collection<ey.b> C() {
      eyq $$0 = this.b.w;
      if ($$0 != null && $$0.d() == eyq.a.b) {
         eys $$1 = $$0.g();
         return Collections.singleton(new ey.b(a($$1.d), a($$1.e), a($$1.f)));
      } else {
         return ey.super.C();
      }
   }

   @Override
   public Set<alb<deg>> u() {
      return this.a.u();
   }

   @Override
   public kb v() {
      return this.a.v();
   }

   @Override
   public cqn w() {
      return this.a.y();
   }

   public void a(int $$0, Suggestions $$1) {
      if ($$0 == this.c) {
         this.d.complete($$1);
         this.d = null;
         this.c = -1;
      }
   }

   public void a(acy.a $$0, List<String> $$1) {
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
