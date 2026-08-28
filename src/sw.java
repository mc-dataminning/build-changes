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
   final asb c;
   private final sz d;
   private final List<sr> e;
   private ImmutableList<sk> f;
   final List<sm> g = Lists.newArrayList();
   private final List<sr> h = Lists.newArrayList();
   private final sw.b i;
   private boolean j = true;
   @Nullable
   private jg<tm> k;
   private final sw.c l;
   private final sw.c m;
   final boolean n;

   protected sw(sw.b $$0, Collection<sk> $$1, asb $$2, sz $$3, sw.c $$4, sw.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ag.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new tg()));
   }

   public List<sr> a() {
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

   public void a(sr $$0) {
      sr $$1 = $$0.D();
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
         final sk $$1 = (sk)this.f.get($$0);
         this.l.a(this.c);
         this.m.a(this.c);
         Collection<sr> $$2 = this.a($$1.b());
         b.info("Running test environment '{}' batch {} ({} tests)...", new Object[]{$$1.c().g(), $$1.a(), $$2.size()});
         if (this.k != $$1.c()) {
            this.d();
            this.k = $$1.c();
            this.k.a().a(this.c);
         }

         this.g.forEach($$1x -> $$1x.a($$1));
         final tf $$3 = new tf();
         $$2.forEach($$3::a);
         $$3.a(new su() {
            private void a() {
               if ($$3.i()) {
                  sw.this.g.forEach($$1xx -> $$1xx.b($$1));
                  LongSet $$0 = new LongArraySet(sw.this.c.y());
                  $$0.forEach($$0xxx -> sw.this.c.a(djo.a($$0xxx), djo.b($$0xxx), false));
                  sw.this.a($$0 + 1);
               }
            }

            @Override
            public void a(sr $$0x) {
            }

            @Override
            public void a(sr $$0x, sw $$1x) {
               this.a();
            }

            @Override
            public void b(sr $$0x, sw $$1x) {
               if (sw.this.n) {
                  sw.this.d();
                  LongSet $$2 = new LongArraySet(sw.this.c.y());
                  $$2.forEach($$0xxx -> sw.this.c.a(djo.a($$0xxx), djo.b($$0xxx), false));
                  sz.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(sr $$0x, sr $$1x, sw $$2) {
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

   public void a(sm $$0) {
      this.g.add($$0);
   }

   private Collection<sr> a(Collection<sr> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<sr> b(sr $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(asb $$0) {
      agx.a($$0);
   }

   public static class a {
      private final asb a;
      private final sz b = sz.a;
      private sw.b c = sl.a();
      private sw.c d = sw.c.a;
      private sw.c e = sw.c.b;
      private final Collection<sk> f;
      private boolean g = false;

      private a(Collection<sk> $$0, asb $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static sw.a a(Collection<sk> $$0, asb $$1) {
         return new sw.a($$0, $$1);
      }

      public static sw.a b(Collection<sr> $$0, asb $$1) {
         return a(sl.a().batch($$0), $$1);
      }

      public sw.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public sw.a a(sw.c $$0) {
         this.e = $$0;
         return this;
      }

      public sw.a a(ti $$0) {
         this.d = $$0;
         return this;
      }

      public sw.a a(sw.b $$0) {
         this.c = $$0;
         return this;
      }

      public sw a() {
         return new sw(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<sk> batch(Collection<sr> var1);
   }

   public interface c {
      sw.c a = $$0 -> Optional.of($$0.o().a(1));
      sw.c b = $$0 -> Optional.empty();

      Optional<sr> spawnStructure(sr var1);

      default void a(asb $$0) {
      }
   }
}
