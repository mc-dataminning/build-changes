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

public class sl {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final aps c;
   private final so d;
   private final List<si> e;
   private ImmutableList<sc> f;
   final List<se> g = Lists.newArrayList();
   private final List<si> h = Lists.newArrayList();
   private final sl.b i;
   private boolean j = true;
   @Nullable
   sc k;
   private final sl.c l;
   private final sl.c m;

   protected sl(sl.b $$0, Collection<sc> $$1, aps $$2, so $$3, sl.c $$4, sl.c $$5) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(Collectors.toList());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new su()));
   }

   public List<si> a() {
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

   public void a(si $$0) {
      si $$1 = $$0.B();
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
         this.k = (sc)this.f.get($$0);
         Collection<si> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final st $$3 = new st();
         $$1.forEach($$3::a);
         $$3.a(new sj() {
            private void a() {
               if ($$3.i()) {
                  sl.this.k.d().accept(sl.this.c);
                  sl.this.g.forEach($$0xxx -> $$0xxx.b(sl.this.k));
                  LongSet $$0 = new LongArraySet(sl.this.c.w());
                  $$0.forEach($$0xxx -> sl.this.c.a(cye.a($$0xxx), cye.b($$0xxx), false));
                  sl.this.a($$0 + 1);
               }
            }

            @Override
            public void a(si $$0x) {
            }

            @Override
            public void a(si $$0x, sl $$1) {
               this.a();
            }

            @Override
            public void b(si $$0x, sl $$1) {
               this.a();
            }

            @Override
            public void a(si $$0x, si $$1, sl $$2) {
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

   public void a(se $$0) {
      this.g.add($$0);
   }

   private Collection<si> a(Collection<si> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<si> b(si $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(aps $$0) {
      afi.a($$0);
   }

   public static class a {
      private final aps a;
      private final so b = so.a;
      private final sl.b c = sd.a();
      private final sl.c d = sl.c.a;
      private sl.c e = sl.c.b;
      private final Collection<sc> f;

      private a(Collection<sc> $$0, aps $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static sl.a a(Collection<sc> $$0, aps $$1) {
         return new sl.a($$0, $$1);
      }

      public static sl.a b(Collection<si> $$0, aps $$1) {
         return a(sd.a().batch($$0), $$1);
      }

      public sl.a a(sl.c $$0) {
         this.e = $$0;
         return this;
      }

      public sl a() {
         return new sl(this.c, this.f, this.a, this.b, this.d, this.e);
      }
   }

   public interface b {
      Collection<sc> batch(Collection<si> var1);
   }

   public interface c {
      sl.c a = $$0 -> Optional.of($$0.n().a().a(1));
      sl.c b = $$0 -> Optional.empty();

      Optional<si> spawnStructure(si var1);
   }
}
