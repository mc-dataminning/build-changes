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

public class gjh implements en {
   private final gje a;
   private final fof b;
   private int d = -1;
   @Nullable
   private CompletableFuture<Suggestions> e;
   private final Set<String> f = new HashSet<>();

   public gjh(gje $$0, fof $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public Collection<String> q() {
      List<String> $$0 = Lists.newArrayList();

      for (gjp $$1 : this.a.m()) {
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
      return (Collection<String>)(this.b.w != null && this.b.w.d() == fdu.a.c ? Collections.singleton(((fdt)this.b.w).a().cH()) : Collections.emptyList());
   }

   @Override
   public Collection<String> r() {
      return this.a.z().f();
   }

   @Override
   public Stream<ale> s() {
      return this.b.ak().d().stream();
   }

   @Override
   public boolean c(int $$0) {
      goa $$1 = this.b.t;
      return $$1 != null ? $$1.s($$0) : $$0 == 0;
   }

   @Override
   public CompletableFuture<Suggestions> a(ald<? extends jr<?>> $$0, en.a $$1, SuggestionsBuilder $$2, CommandContext<?> $$3) {
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
      this.a.b(new aha($$1, $$0.getInput()));
      return this.e;
   }

   private static String a(double $$0) {
      return String.format(Locale.ROOT, "%.2f", $$0);
   }

   private static String a(int $$0) {
      return Integer.toString($$0);
   }

   @Override
   public Collection<en.b> A() {
      fdu $$0 = this.b.w;
      if ($$0 != null && $$0.d() == fdu.a.b) {
         iu $$1 = ((fds)$$0).b();
         return Collections.singleton(new en.b(a($$1.u()), a($$1.v()), a($$1.w())));
      } else {
         return en.super.A();
      }
   }

   @Override
   public Collection<en.b> B() {
      fdu $$0 = this.b.w;
      if ($$0 != null && $$0.d() == fdu.a.b) {
         fdw $$1 = $$0.g();
         return Collections.singleton(new en.b(a($$1.d), a($$1.e), a($$1.f)));
      } else {
         return en.super.B();
      }
   }

   @Override
   public Set<ald<dip>> t() {
      return this.a.u();
   }

   @Override
   public js u() {
      return this.a.v();
   }

   @Override
   public cub v() {
      return this.a.y();
   }

   public void a(int $$0, Suggestions $$1) {
      if ($$0 == this.d) {
         this.e.complete($$1);
         this.e = null;
         this.d = -1;
      }
   }

   public void a(acq.a $$0, List<String> $$1) {
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
