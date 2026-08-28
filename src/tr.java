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

public class tr {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final arf c;
   private final tu d;
   private final List<to> e;
   private ImmutableList<ti> f;
   final List<tk> g = Lists.newArrayList();
   private final List<to> h = Lists.newArrayList();
   private final tr.b i;
   private boolean j = true;
   @Nullable
   ti k;
   private final tr.c l;
   private final tr.c m;

   protected tr(tr.b $$0, Collection<ti> $$1, arf $$2, tu $$3, tr.c $$4, tr.c $$5) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ac.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new ua()));
   }

   public List<to> a() {
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

   public void a(to $$0) {
      to $$1 = $$0.B();
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
         this.k = (ti)this.f.get($$0);
         Collection<to> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final tz $$3 = new tz();
         $$1.forEach($$3::a);
         $$3.a(new tp() {
            private void a() {
               if ($$3.i()) {
                  tr.this.k.d().accept(tr.this.c);
                  tr.this.g.forEach($$0xxx -> $$0xxx.b(tr.this.k));
                  LongSet $$0 = new LongArraySet(tr.this.c.w());
                  $$0.forEach($$0xxx -> tr.this.c.a(dbg.a($$0xxx), dbg.b($$0xxx), false));
                  tr.this.a($$0 + 1);
               }
            }

            @Override
            public void a(to $$0x) {
            }

            @Override
            public void a(to $$0x, tr $$1) {
               this.a();
            }

            @Override
            public void b(to $$0x, tr $$1) {
               this.a();
            }

            @Override
            public void a(to $$0x, to $$1, tr $$2) {
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

   public void a(tk $$0) {
      this.g.add($$0);
   }

   private Collection<to> a(Collection<to> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<to> b(to $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(arf $$0) {
      agt.a($$0);
   }

   public static class a {
      private final arf a;
      private final tu b = tu.a;
      private final tr.b c = tj.a();
      private final tr.c d = tr.c.a;
      private tr.c e = tr.c.b;
      private final Collection<ti> f;

      private a(Collection<ti> $$0, arf $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static tr.a a(Collection<ti> $$0, arf $$1) {
         return new tr.a($$0, $$1);
      }

      public static tr.a b(Collection<to> $$0, arf $$1) {
         return a(tj.a().batch($$0), $$1);
      }

      public tr.a a(tr.c $$0) {
         this.e = $$0;
         return this;
      }

      public tr a() {
         return new tr(this.c, this.f, this.a, this.b, this.d, this.e);
      }
   }

   public interface b {
      Collection<ti> batch(Collection<to> var1);
   }

   public interface c {
      tr.c a = $$0 -> Optional.of($$0.n().a().a(1));
      tr.c b = $$0 -> Optional.empty();

      Optional<to> spawnStructure(to var1);
   }
}
