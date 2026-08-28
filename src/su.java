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

public class su {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final aro c;
   private final sx d;
   private final List<sp> e;
   private ImmutableList<sj> f;
   final List<sl> g = Lists.newArrayList();
   private final List<sp> h = Lists.newArrayList();
   private final su.b i;
   private boolean j = true;
   @Nullable
   private je<tk> k;
   private final su.c l;
   private final su.c m;
   final boolean n;

   protected su(su.b $$0, Collection<sj> $$1, aro $$2, sx $$3, su.c $$4, su.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(af.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new te()));
   }

   public List<sp> a() {
      return this.e;
   }

   public void b() {
      this.j = false;
      this.a(0);
   }

   public void c() {
      this.j = true;
      if (this.k != null) {
         this.d();
      }
   }

   public void a(sp $$0) {
      sp $$1 = $$0.D();
      $$0.C().forEach($$2 -> $$2.a($$0, $$1, this));
      this.e.add($$1);
      this.h.add($$1);
      if (this.j) {
         this.e();
      }
   }

   void a(final int $$0) {
      if ($$0 >= this.f.size()) {
         this.d();
         this.e();
      } else {
         final sj $$1 = (sj)this.f.get($$0);
         this.l.a(this.c);
         this.m.a(this.c);
         Collection<sp> $$2 = this.a($$1.b());
         b.info("Running test environment '{}' batch {} ({} tests)...", new Object[]{$$1.c().g(), $$1.a(), $$2.size()});
         if (this.k != $$1.c()) {
            this.d();
            this.k = $$1.c();
            this.k.a().a(this.c);
         }

         this.g.forEach($$1x -> $$1x.a($$1));
         final td $$3 = new td();
         $$2.forEach($$3::a);
         $$3.a(new ss() {
            private void a() {
               if ($$3.i()) {
                  su.this.g.forEach($$1xx -> $$1xx.b($$1));
                  LongSet $$0 = new LongArraySet(su.this.c.y());
                  $$0.forEach($$0xxx -> su.this.c.a(dhw.a($$0xxx), dhw.b($$0xxx), false));
                  su.this.a($$0 + 1);
               }
            }

            @Override
            public void a(sp $$0x) {
            }

            @Override
            public void a(sp $$0x, su $$1x) {
               this.a();
            }

            @Override
            public void b(sp $$0x, su $$1x) {
               if (su.this.n) {
                  su.this.d();
                  LongSet $$2 = new LongArraySet(su.this.c.y());
                  $$2.forEach($$0xxx -> su.this.c.a(dhw.a($$0xxx), dhw.b($$0xxx), false));
                  sx.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(sp $$0x, sp $$1x, su $$2) {
            }
         });
         $$2.forEach(this.d::a);
      }
   }

   void d() {
      if (this.k != null) {
         this.k.a().b(this.c);
         this.k = null;
      }
   }

   private void e() {
      if (!this.h.isEmpty()) {
         b.info("Starting re-run of tests: {}", this.h.stream().map($$0 -> $$0.b().toString()).collect(Collectors.joining(", ")));
         this.f = ImmutableList.copyOf(this.i.batch(this.h));
         this.h.clear();
         this.j = false;
         this.a(0);
      } else {
         this.f = ImmutableList.of();
         this.j = true;
      }
   }

   public void a(sl $$0) {
      this.g.add($$0);
   }

   private Collection<sp> a(Collection<sp> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<sp> b(sp $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(aro $$0) {
      agk.a($$0);
   }

   public static class a {
      private final aro a;
      private final sx b = sx.a;
      private su.b c = sk.a();
      private su.c d = su.c.a;
      private su.c e = su.c.b;
      private final Collection<sj> f;
      private boolean g = false;

      private a(Collection<sj> $$0, aro $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static su.a a(Collection<sj> $$0, aro $$1) {
         return new su.a($$0, $$1);
      }

      public static su.a b(Collection<sp> $$0, aro $$1) {
         return a(sk.a().batch($$0), $$1);
      }

      public su.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public su.a a(su.c $$0) {
         this.e = $$0;
         return this;
      }

      public su.a a(tg $$0) {
         this.d = $$0;
         return this;
      }

      public su.a a(su.b $$0) {
         this.c = $$0;
         return this;
      }

      public su a() {
         return new su(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<sj> batch(Collection<sp> var1);
   }

   public interface c {
      su.c a = $$0 -> Optional.of($$0.o().a(1));
      su.c b = $$0 -> Optional.empty();

      Optional<sp> spawnStructure(sp var1);

      default void a(aro $$0) {
      }
   }
}
