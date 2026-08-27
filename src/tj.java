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

public class tj {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final aqt c;
   private final tm d;
   private final List<tg> e;
   private ImmutableList<ta> f;
   final List<tc> g = Lists.newArrayList();
   private final List<tg> h = Lists.newArrayList();
   private final tj.b i;
   private boolean j = true;
   @Nullable
   ta k;
   private final tj.c l;
   private final tj.c m;

   protected tj(tj.b $$0, Collection<ta> $$1, aqt $$2, tm $$3, tj.c $$4, tj.c $$5) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(Collectors.toList());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new ts()));
   }

   public List<tg> a() {
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

   public void a(tg $$0) {
      tg $$1 = $$0.B();
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
         this.k = (ta)this.f.get($$0);
         Collection<tg> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final tr $$3 = new tr();
         $$1.forEach($$3::a);
         $$3.a(new th() {
            private void a() {
               if ($$3.i()) {
                  tj.this.k.d().accept(tj.this.c);
                  tj.this.g.forEach($$0xxx -> $$0xxx.b(tj.this.k));
                  LongSet $$0 = new LongArraySet(tj.this.c.w());
                  $$0.forEach($$0xxx -> tj.this.c.a(dbh.a($$0xxx), dbh.b($$0xxx), false));
                  tj.this.a($$0 + 1);
               }
            }

            @Override
            public void a(tg $$0x) {
            }

            @Override
            public void a(tg $$0x, tj $$1) {
               this.a();
            }

            @Override
            public void b(tg $$0x, tj $$1) {
               this.a();
            }

            @Override
            public void a(tg $$0x, tg $$1, tj $$2) {
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

   public void a(tc $$0) {
      this.g.add($$0);
   }

   private Collection<tg> a(Collection<tg> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<tg> b(tg $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(aqt $$0) {
      agi.a($$0);
   }

   public static class a {
      private final aqt a;
      private final tm b = tm.a;
      private final tj.b c = tb.a();
      private final tj.c d = tj.c.a;
      private tj.c e = tj.c.b;
      private final Collection<ta> f;

      private a(Collection<ta> $$0, aqt $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static tj.a a(Collection<ta> $$0, aqt $$1) {
         return new tj.a($$0, $$1);
      }

      public static tj.a b(Collection<tg> $$0, aqt $$1) {
         return a(tb.a().batch($$0), $$1);
      }

      public tj.a a(tj.c $$0) {
         this.e = $$0;
         return this;
      }

      public tj a() {
         return new tj(this.c, this.f, this.a, this.b, this.d, this.e);
      }
   }

   public interface b {
      Collection<ta> batch(Collection<tg> var1);
   }

   public interface c {
      tj.c a = $$0 -> Optional.of($$0.n().a().a(1));
      tj.c b = $$0 -> Optional.empty();

      Optional<tg> spawnStructure(tg var1);
   }
}
