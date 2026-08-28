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

public class tq {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final arb c;
   private final tt d;
   private final List<tn> e;
   private ImmutableList<th> f;
   final List<tj> g = Lists.newArrayList();
   private final List<tn> h = Lists.newArrayList();
   private final tq.b i;
   private boolean j = true;
   @Nullable
   th k;
   private final tq.c l;
   private final tq.c m;

   protected tq(tq.b $$0, Collection<th> $$1, arb $$2, tt $$3, tq.c $$4, tq.c $$5) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ac.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new tz()));
   }

   public List<tn> a() {
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

   public void a(tn $$0) {
      tn $$1 = $$0.B();
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
         this.k = (th)this.f.get($$0);
         Collection<tn> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final ty $$3 = new ty();
         $$1.forEach($$3::a);
         $$3.a(new to() {
            private void a() {
               if ($$3.i()) {
                  tq.this.k.d().accept(tq.this.c);
                  tq.this.g.forEach($$0xxx -> $$0xxx.b(tq.this.k));
                  LongSet $$0 = new LongArraySet(tq.this.c.w());
                  $$0.forEach($$0xxx -> tq.this.c.a(dba.a($$0xxx), dba.b($$0xxx), false));
                  tq.this.a($$0 + 1);
               }
            }

            @Override
            public void a(tn $$0x) {
            }

            @Override
            public void a(tn $$0x, tq $$1) {
               this.a();
            }

            @Override
            public void b(tn $$0x, tq $$1) {
               this.a();
            }

            @Override
            public void a(tn $$0x, tn $$1, tq $$2) {
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

   public void a(tj $$0) {
      this.g.add($$0);
   }

   private Collection<tn> a(Collection<tn> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<tn> b(tn $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(arb $$0) {
      agp.a($$0);
   }

   public static class a {
      private final arb a;
      private final tt b = tt.a;
      private final tq.b c = ti.a();
      private final tq.c d = tq.c.a;
      private tq.c e = tq.c.b;
      private final Collection<th> f;

      private a(Collection<th> $$0, arb $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static tq.a a(Collection<th> $$0, arb $$1) {
         return new tq.a($$0, $$1);
      }

      public static tq.a b(Collection<tn> $$0, arb $$1) {
         return a(ti.a().batch($$0), $$1);
      }

      public tq.a a(tq.c $$0) {
         this.e = $$0;
         return this;
      }

      public tq a() {
         return new tq(this.c, this.f, this.a, this.b, this.d, this.e);
      }
   }

   public interface b {
      Collection<th> batch(Collection<tn> var1);
   }

   public interface c {
      tq.c a = $$0 -> Optional.of($$0.n().a().a(1));
      tq.c b = $$0 -> Optional.empty();

      Optional<tn> spawnStructure(tn var1);
   }
}
