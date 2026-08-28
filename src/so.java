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

public class so {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final arc c;
   private final sr d;
   private final List<sl> e;
   private ImmutableList<sf> f;
   final List<sh> g = Lists.newArrayList();
   private final List<sl> h = Lists.newArrayList();
   private final so.b i;
   private boolean j = true;
   @Nullable
   sf k;
   private final so.c l;
   private final so.c m;
   final boolean n;

   protected so(so.b $$0, Collection<sf> $$1, arc $$2, sr $$3, so.c $$4, so.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(af.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new sx()));
   }

   public List<sl> a() {
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

   public void a(sl $$0) {
      sl $$1 = $$0.C();
      $$0.B().forEach($$2 -> $$2.a($$0, $$1, this));
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
         this.k = (sf)this.f.get($$0);
         this.l.a(this.c);
         this.m.a(this.c);
         Collection<sl> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final sw $$3 = new sw();
         $$1.forEach($$3::a);
         $$3.a(new sm() {
            private void a() {
               if ($$3.i()) {
                  so.this.k.d().accept(so.this.c);
                  so.this.g.forEach($$0xxx -> $$0xxx.b(so.this.k));
                  LongSet $$0 = new LongArraySet(so.this.c.y());
                  $$0.forEach($$0xxx -> so.this.c.a(dfo.a($$0xxx), dfo.b($$0xxx), false));
                  so.this.a($$0 + 1);
               }
            }

            @Override
            public void a(sl $$0x) {
            }

            @Override
            public void a(sl $$0x, so $$1) {
               this.a();
            }

            @Override
            public void b(sl $$0x, so $$1) {
               if (so.this.n) {
                  so.this.k.d().accept(so.this.c);
                  LongSet $$2 = new LongArraySet(so.this.c.y());
                  $$2.forEach($$0xxx -> so.this.c.a(dfo.a($$0xxx), dfo.b($$0xxx), false));
                  sr.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(sl $$0x, sl $$1, so $$2) {
            }
         });
         $$1.forEach(this.d::a);
      }
   }

   private void d() {
      if (!this.h.isEmpty()) {
         b.info("Starting re-run of tests: {}", this.h.stream().map($$0 -> $$0.v().c()).collect(Collectors.joining(", ")));
         this.f = ImmutableList.copyOf(this.i.batch(this.h));
         this.h.clear();
         this.j = false;
         this.a(0);
      } else {
         this.f = ImmutableList.of();
         this.j = true;
      }
   }

   public void a(sh $$0) {
      this.g.add($$0);
   }

   private Collection<sl> a(Collection<sl> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<sl> b(sl $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(arc $$0) {
      agc.a($$0);
   }

   public static class a {
      private final arc a;
      private final sr b = sr.a;
      private so.b c = sg.a();
      private so.c d = so.c.a;
      private so.c e = so.c.b;
      private final Collection<sf> f;
      private boolean g = false;

      private a(Collection<sf> $$0, arc $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static so.a a(Collection<sf> $$0, arc $$1) {
         return new so.a($$0, $$1);
      }

      public static so.a b(Collection<sl> $$0, arc $$1) {
         return a(sg.a().batch($$0), $$1);
      }

      public so.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public so.a a(so.c $$0) {
         this.e = $$0;
         return this;
      }

      public so.a a(ta $$0) {
         this.d = $$0;
         return this;
      }

      public so.a a(so.b $$0) {
         this.c = $$0;
         return this;
      }

      public so a() {
         return new so(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<sf> batch(Collection<sl> var1);
   }

   public interface c {
      so.c a = $$0 -> Optional.of($$0.o().a().a(1));
      so.c b = $$0 -> Optional.empty();

      Optional<sl> spawnStructure(sl var1);

      default void a(arc $$0) {
      }
   }
}
