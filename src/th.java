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

public class th {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final arm c;
   private final tk d;
   private final List<te> e;
   private ImmutableList<sy> f;
   final List<ta> g = Lists.newArrayList();
   private final List<te> h = Lists.newArrayList();
   private final th.b i;
   private boolean j = true;
   @Nullable
   sy k;
   private final th.c l;
   private final th.c m;
   final boolean n;

   protected th(th.b $$0, Collection<sy> $$1, arm $$2, tk $$3, th.c $$4, th.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ad.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new tq()));
   }

   public List<te> a() {
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

   public void a(te $$0) {
      te $$1 = $$0.B();
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
         this.k = (sy)this.f.get($$0);
         this.l.a(this.c);
         this.m.a(this.c);
         Collection<te> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final tp $$3 = new tp();
         $$1.forEach($$3::a);
         $$3.a(new tf() {
            private void a() {
               if ($$3.i()) {
                  th.this.k.d().accept(th.this.c);
                  th.this.g.forEach($$0xxx -> $$0xxx.b(th.this.k));
                  LongSet $$0 = new LongArraySet(th.this.c.w());
                  $$0.forEach($$0xxx -> th.this.c.a(deb.a($$0xxx), deb.b($$0xxx), false));
                  th.this.a($$0 + 1);
               }
            }

            @Override
            public void a(te $$0x) {
            }

            @Override
            public void a(te $$0x, th $$1) {
               this.a();
            }

            @Override
            public void b(te $$0x, th $$1) {
               if (th.this.n) {
                  th.this.k.d().accept(th.this.c);
                  LongSet $$2 = new LongArraySet(th.this.c.w());
                  $$2.forEach($$0xxx -> th.this.c.a(deb.a($$0xxx), deb.b($$0xxx), false));
                  tk.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(te $$0x, te $$1, th $$2) {
            }
         });
         $$1.forEach(this.d::a);
      }
   }

   private void d() {
      if (!this.h.isEmpty()) {
         b.info("Starting re-run of tests: {}", this.h.stream().map($$0 -> $$0.u().c()).collect(Collectors.joining(", ")));
         this.f = ImmutableList.copyOf(this.i.batch(this.h));
         this.h.clear();
         this.j = false;
         this.a(0);
      } else {
         this.f = ImmutableList.of();
         this.j = true;
      }
   }

   public void a(ta $$0) {
      this.g.add($$0);
   }

   private Collection<te> a(Collection<te> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<te> b(te $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(arm $$0) {
      agr.a($$0);
   }

   public static class a {
      private final arm a;
      private final tk b = tk.a;
      private th.b c = sz.a();
      private th.c d = th.c.a;
      private th.c e = th.c.b;
      private final Collection<sy> f;
      private boolean g = false;

      private a(Collection<sy> $$0, arm $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static th.a a(Collection<sy> $$0, arm $$1) {
         return new th.a($$0, $$1);
      }

      public static th.a b(Collection<te> $$0, arm $$1) {
         return a(sz.a().batch($$0), $$1);
      }

      public th.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public th.a a(th.c $$0) {
         this.e = $$0;
         return this;
      }

      public th.a a(tt $$0) {
         this.d = $$0;
         return this;
      }

      public th.a a(th.b $$0) {
         this.c = $$0;
         return this;
      }

      public th a() {
         return new th(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<sy> batch(Collection<te> var1);
   }

   public interface c {
      th.c a = $$0 -> Optional.of($$0.n().a().a(1));
      th.c b = $$0 -> Optional.empty();

      Optional<te> spawnStructure(te var1);

      default void a(arm $$0) {
      }
   }
}
