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

public class tc {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final aqm c;
   private final tf d;
   private final List<sz> e;
   private ImmutableList<st> f;
   final List<sv> g = Lists.newArrayList();
   private final List<sz> h = Lists.newArrayList();
   private final tc.b i;
   private boolean j = true;
   @Nullable
   st k;
   private final tc.c l;
   private final tc.c m;

   protected tc(tc.b $$0, Collection<st> $$1, aqm $$2, tf $$3, tc.c $$4, tc.c $$5) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ac.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new tl()));
   }

   public List<sz> a() {
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

   public void a(sz $$0) {
      sz $$1 = $$0.B();
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
         this.k = (st)this.f.get($$0);
         Collection<sz> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final tk $$3 = new tk();
         $$1.forEach($$3::a);
         $$3.a(new ta() {
            private void a() {
               if ($$3.i()) {
                  tc.this.k.d().accept(tc.this.c);
                  tc.this.g.forEach($$0xxx -> $$0xxx.b(tc.this.k));
                  LongSet $$0 = new LongArraySet(tc.this.c.w());
                  $$0.forEach($$0xxx -> tc.this.c.a(dae.a($$0xxx), dae.b($$0xxx), false));
                  tc.this.a($$0 + 1);
               }
            }

            @Override
            public void a(sz $$0x) {
            }

            @Override
            public void a(sz $$0x, tc $$1) {
               this.a();
            }

            @Override
            public void b(sz $$0x, tc $$1) {
               this.a();
            }

            @Override
            public void a(sz $$0x, sz $$1, tc $$2) {
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

   public void a(sv $$0) {
      this.g.add($$0);
   }

   private Collection<sz> a(Collection<sz> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<sz> b(sz $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(aqm $$0) {
      aga.a($$0);
   }

   public static class a {
      private final aqm a;
      private final tf b = tf.a;
      private final tc.b c = su.a();
      private final tc.c d = tc.c.a;
      private tc.c e = tc.c.b;
      private final Collection<st> f;

      private a(Collection<st> $$0, aqm $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static tc.a a(Collection<st> $$0, aqm $$1) {
         return new tc.a($$0, $$1);
      }

      public static tc.a b(Collection<sz> $$0, aqm $$1) {
         return a(su.a().batch($$0), $$1);
      }

      public tc.a a(tc.c $$0) {
         this.e = $$0;
         return this;
      }

      public tc a() {
         return new tc(this.c, this.f, this.a, this.b, this.d, this.e);
      }
   }

   public interface b {
      Collection<st> batch(Collection<sz> var1);
   }

   public interface c {
      tc.c a = $$0 -> Optional.of($$0.n().a().a(1));
      tc.c b = $$0 -> Optional.empty();

      Optional<sz> spawnStructure(sz var1);
   }
}
