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

public class sz {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final aqh c;
   private final tc d;
   private final List<sw> e;
   private ImmutableList<sq> f;
   final List<ss> g = Lists.newArrayList();
   private final List<sw> h = Lists.newArrayList();
   private final sz.b i;
   private boolean j = true;
   @Nullable
   sq k;
   private final sz.c l;
   private final sz.c m;

   protected sz(sz.b $$0, Collection<sq> $$1, aqh $$2, tc $$3, sz.c $$4, sz.c $$5) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(Collectors.toList());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new ti()));
   }

   public List<sw> a() {
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

   public void a(sw $$0) {
      sw $$1 = $$0.B();
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
         this.k = (sq)this.f.get($$0);
         Collection<sw> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final th $$3 = new th();
         $$1.forEach($$3::a);
         $$3.a(new sx() {
            private void a() {
               if ($$3.i()) {
                  sz.this.k.d().accept(sz.this.c);
                  sz.this.g.forEach($$0xxx -> $$0xxx.b(sz.this.k));
                  LongSet $$0 = new LongArraySet(sz.this.c.w());
                  $$0.forEach($$0xxx -> sz.this.c.a(czk.a($$0xxx), czk.b($$0xxx), false));
                  sz.this.a($$0 + 1);
               }
            }

            @Override
            public void a(sw $$0x) {
            }

            @Override
            public void a(sw $$0x, sz $$1) {
               this.a();
            }

            @Override
            public void b(sw $$0x, sz $$1) {
               this.a();
            }

            @Override
            public void a(sw $$0x, sw $$1, sz $$2) {
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

   public void a(ss $$0) {
      this.g.add($$0);
   }

   private Collection<sw> a(Collection<sw> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<sw> b(sw $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(aqh $$0) {
      afw.a($$0);
   }

   public static class a {
      private final aqh a;
      private final tc b = tc.a;
      private final sz.b c = sr.a();
      private final sz.c d = sz.c.a;
      private sz.c e = sz.c.b;
      private final Collection<sq> f;

      private a(Collection<sq> $$0, aqh $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static sz.a a(Collection<sq> $$0, aqh $$1) {
         return new sz.a($$0, $$1);
      }

      public static sz.a b(Collection<sw> $$0, aqh $$1) {
         return a(sr.a().batch($$0), $$1);
      }

      public sz.a a(sz.c $$0) {
         this.e = $$0;
         return this;
      }

      public sz a() {
         return new sz(this.c, this.f, this.a, this.b, this.d, this.e);
      }
   }

   public interface b {
      Collection<sq> batch(Collection<sw> var1);
   }

   public interface c {
      sz.c a = $$0 -> Optional.of($$0.n().a().a(1));
      sz.c b = $$0 -> Optional.empty();

      Optional<sw> spawnStructure(sw var1);
   }
}
