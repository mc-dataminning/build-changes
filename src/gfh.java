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

public class gfh implements fb {
   private final gfe a;
   private final flz b;
   private int c = -1;
   @Nullable
   private CompletableFuture<Suggestions> d;
   private final Set<String> e = new HashSet<>();

   public gfh(gfe $$0, flz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public Collection<String> q() {
      List<String> $$0 = Lists.newArrayList();

      for (gfp $$1 : this.a.m()) {
         $$0.add($$1.a().getName());
      }

      return $$0;
   }

   @Override
   public Collection<String> y() {
      if (this.e.isEmpty()) {
         return this.q();
      } else {
         Set<String> $$0 = new HashSet<>(this.q());
         $$0.addAll(this.e);
         return $$0;
      }
   }

   @Override
   public Collection<String> z() {
      return (Collection<String>)(this.b.w != null && this.b.w.d() == fbq.a.c ? Collections.singleton(((fbp)this.b.w).a().cH()) : Collections.emptyList());
   }

   @Override
   public Collection<String> r() {
      return this.a.z().f();
   }

   @Override
   public Stream<alz> s() {
      return this.b.ak().d().stream();
   }

   @Override
   public boolean c(int $$0) {
      gka $$1 = this.b.t;
      return $$1 != null ? $$1.s($$0) : $$0 == 0;
   }

   @Override
   public CompletableFuture<Suggestions> a(aly<? extends kd<?>> $$0, fb.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
      return this.u().a($$0).map($$2x -> {
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
      this.a.b(new ahz($$1, $$0.getInput()));
      return this.d;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.2f", $$0);
   }

   private static String a(int $$0) {
      return Integer.toString($$0);
   }

   @Override
   public Collection<fb.b> A() {
      fbq $$0 = this.b.w;
      if ($$0 != null && $$0.d() == fbq.a.b) {
         jh $$1 = ((fbo)$$0).b();
         return Collections.singleton(new fb.b(a($$1.u()), a($$1.v()), a($$1.w())));
      } else {
         return fb.super.A();
      }
   }

   @Override
   public Collection<fb.b> B() {
      fbq $$0 = this.b.w;
      if ($$0 != null && $$0.d() == fbq.a.b) {
         fbs $$1 = $$0.g();
         return Collections.singleton(new fb.b(a($$1.d), a($$1.e), a($$1.f)));
      } else {
         return fb.super.B();
      }
   }

   @Override
   public Set<aly<dha>> t() {
      return this.a.u();
   }

   @Override
   public ke u() {
      return this.a.v();
   }

   @Override
   public cso v() {
      return this.a.y();
   }

   public void a(int $$0, Suggestions $$1) {
      if ($$0 == this.c) {
         this.d.complete($$1);
         this.d = null;
         this.c = -1;
      }
   }

   public void a(adq.a $$0, List<String> $$1) {
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
