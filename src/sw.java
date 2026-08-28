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

public class sw {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final aqk c;
   private final sz d;
   private final List<st> e;
   private ImmutableList<sn> f;
   final List<sp> g = Lists.newArrayList();
   private final List<st> h = Lists.newArrayList();
   private final sw.b i;
   private boolean j = true;
   @Nullable
   sn k;
   private final sw.c l;
   private final sw.c m;

   protected sw(sw.b $$0, Collection<sn> $$1, aqk $$2, sz $$3, sw.c $$4, sw.c $$5) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ac.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new tf()));
   }

   public List<st> a() {
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

   public void a(st $$0) {
      st $$1 = $$0.B();
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
         this.k = (sn)this.f.get($$0);
         Collection<st> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final te $$3 = new te();
         $$1.forEach($$3::a);
         $$3.a(new su() {
            private void a() {
               if ($$3.i()) {
                  sw.this.k.d().accept(sw.this.c);
                  sw.this.g.forEach($$0xxx -> $$0xxx.b(sw.this.k));
                  LongSet $$0 = new LongArraySet(sw.this.c.w());
                  $$0.forEach($$0xxx -> sw.this.c.a(dbk.a($$0xxx), dbk.b($$0xxx), false));
                  sw.this.a($$0 + 1);
               }
            }

            @Override
            public void a(st $$0x) {
            }

            @Override
            public void a(st $$0x, sw $$1) {
               this.a();
            }

            @Override
            public void b(st $$0x, sw $$1) {
               this.a();
            }

            @Override
            public void a(st $$0x, st $$1, sw $$2) {
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

   public void a(sp $$0) {
      this.g.add($$0);
   }

   private Collection<st> a(Collection<st> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<st> b(st $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(aqk $$0) {
      afy.a($$0);
   }

   public static class a {
      private final aqk a;
      private final sz b = sz.a;
      private final sw.b c = so.a();
      private final sw.c d = sw.c.a;
      private sw.c e = sw.c.b;
      private final Collection<sn> f;

      private a(Collection<sn> $$0, aqk $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static sw.a a(Collection<sn> $$0, aqk $$1) {
         return new sw.a($$0, $$1);
      }

      public static sw.a b(Collection<st> $$0, aqk $$1) {
         return a(so.a().batch($$0), $$1);
      }

      public sw.a a(sw.c $$0) {
         this.e = $$0;
         return this;
      }

      public sw a() {
         return new sw(this.c, this.f, this.a, this.b, this.d, this.e);
      }
   }

   public interface b {
      Collection<sn> batch(Collection<st> var1);
   }

   public interface c {
      sw.c a = $$0 -> Optional.of($$0.n().a().a(1));
      sw.c b = $$0 -> Optional.empty();

      Optional<st> spawnStructure(st var1);
   }
}
