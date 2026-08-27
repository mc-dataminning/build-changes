import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongArraySet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class rx {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final apa c;
   private final sa d;
   private final List<ru> e;
   private ImmutableList<ro> f;
   final List<rq> g = Lists.newArrayList();
   private final List<ru> h = Lists.newArrayList();
   private final rx.b i;
   private boolean j = true;
   @Nullable
   ro k;
   private final rx.c l;
   private final rx.c m;

   protected rx(rx.b $$0, Collection<ro> $$1, apa $$2, sa $$3, rx.c $$4, rx.c $$5) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(Collectors.toList());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new sg()));
   }

   public List<ru> a() {
      return this.e;
   }

   public void b() {
      this.j = false;
      this.a(0);
   }

   public void c() {
      this.j = true;
      if (this.k != null) {
         this.k.d().accept(this.c);
      }
   }

   public void a(ru $$0) {
      ru $$1 = $$0.B();
      $$0.A().forEach($$2 -> $$2.a($$0, $$1, this));
      this.e.add($$1);
      this.h.add($$1);
      if (this.j) {
         this.d();
      }
   }

   void a(final int $$0) {
      if ($$0 >= this.f.size()) {
         this.d();
      } else {
         this.k = (ro)this.f.get($$0);
         Collection<ru> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final sf $$3 = new sf();
         $$1.forEach($$3::a);
         $$3.a(new rv() {
            private void a() {
               if ($$3.i()) {
                  rx.this.k.d().accept(rx.this.c);
                  rx.this.g.forEach($$0xxx -> $$0xxx.b(rx.this.k));
                  LongSet $$0 = new LongArraySet(rx.this.c.w());
                  $$0.forEach($$0xxx -> rx.this.c.a(cvl.a($$0xxx), cvl.b($$0xxx), false));
                  rx.this.a($$0 + 1);
               }
            }

            @Override
            public void a(ru $$0x) {
            }

            @Override
            public void a(ru $$0x, rx $$1) {
               this.a();
            }

            @Override
            public void b(ru $$0x, rx $$1) {
               this.a();
            }

            @Override
            public void a(ru $$0x, ru $$1, rx $$2) {
            }
         });
         $$1.forEach(this.d::a);
      }
   }

   private void d() {
      if (!this.h.isEmpty()) {
         this.f = ImmutableList.copyOf(this.i.batch(this.h));
         this.h.clear();
         this.j = false;
         this.a(0);
      } else {
         this.f = ImmutableList.of();
         this.j = true;
      }
   }

   public void a(rq $$0) {
      this.g.add($$0);
   }

   private Collection<ru> a(Collection<ru> $$0) {
      return $$0.stream().map(this::b).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
   }

   private Optional<ru> b(ru $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(apa $$0) {
      aes.a($$0);
   }

   public static class a {
      private final apa a;
      private final sa b = sa.a;
      private final rx.b c = rp.a();
      private final rx.c d = rx.c.a;
      private rx.c e = rx.c.b;
      private final Collection<ro> f;

      private a(Collection<ro> $$0, apa $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static rx.a a(Collection<ro> $$0, apa $$1) {
         return new rx.a($$0, $$1);
      }

      public static rx.a b(Collection<ru> $$0, apa $$1) {
         return a(rp.a().batch($$0), $$1);
      }

      public rx.a a(rx.c $$0) {
         this.e = $$0;
         return this;
      }

      public rx a() {
         return new rx(this.c, this.f, this.a, this.b, this.d, this.e);
      }
   }

   public interface b {
      Collection<ro> batch(Collection<ru> var1);
   }

   public interface c {
      rx.c a = $$0 -> Optional.of($$0.n().a().a(1));
      rx.c b = $$0 -> Optional.empty();

      Optional<ru> spawnStructure(ru var1);
   }
}
