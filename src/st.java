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

public class st {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final arn c;
   private final sw d;
   private final List<so> e;
   private ImmutableList<si> f;
   final List<sk> g = Lists.newArrayList();
   private final List<so> h = Lists.newArrayList();
   private final st.b i;
   private boolean j = true;
   @Nullable
   private js<tj> k;
   private final st.c l;
   private final st.c m;
   final boolean n;

   protected st(st.b $$0, Collection<si> $$1, arn $$2, sw $$3, st.c $$4, st.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(af.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new td()));
   }

   public List<so> a() {
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

   public void a(so $$0) {
      so $$1 = $$0.D();
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
         final si $$1 = (si)this.f.get($$0);
         this.l.a(this.c);
         this.m.a(this.c);
         Collection<so> $$2 = this.a($$1.b());
         b.info("Running test environment '{}' batch {} ({} tests)...", new Object[]{$$1.c().g(), $$1.a(), $$2.size()});
         if (this.k != $$1.c()) {
            this.d();
            this.k = $$1.c();
            this.k.a().a(this.c);
         }

         this.g.forEach($$1x -> $$1x.a($$1));
         final tc $$3 = new tc();
         $$2.forEach($$3::a);
         $$3.a(new sr() {
            private void a() {
               if ($$3.i()) {
                  st.this.g.forEach($$1xx -> $$1xx.b($$1));
                  LongSet $$0 = new LongArraySet(st.this.c.y());
                  $$0.forEach($$0xxx -> st.this.c.a(dgw.a($$0xxx), dgw.b($$0xxx), false));
                  st.this.a($$0 + 1);
               }
            }

            @Override
            public void a(so $$0x) {
            }

            @Override
            public void a(so $$0x, st $$1x) {
               this.a();
            }

            @Override
            public void b(so $$0x, st $$1x) {
               if (st.this.n) {
                  st.this.d();
                  LongSet $$2 = new LongArraySet(st.this.c.y());
                  $$2.forEach($$0xxx -> st.this.c.a(dgw.a($$0xxx), dgw.b($$0xxx), false));
                  sw.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(so $$0x, so $$1x, st $$2) {
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

   public void a(sk $$0) {
      this.g.add($$0);
   }

   private Collection<so> a(Collection<so> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<so> b(so $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(arn $$0) {
      agj.a($$0);
   }

   public static class a {
      private final arn a;
      private final sw b = sw.a;
      private st.b c = sj.a();
      private st.c d = st.c.a;
      private st.c e = st.c.b;
      private final Collection<si> f;
      private boolean g = false;

      private a(Collection<si> $$0, arn $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static st.a a(Collection<si> $$0, arn $$1) {
         return new st.a($$0, $$1);
      }

      public static st.a b(Collection<so> $$0, arn $$1) {
         return a(sj.a().batch($$0), $$1);
      }

      public st.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public st.a a(st.c $$0) {
         this.e = $$0;
         return this;
      }

      public st.a a(tf $$0) {
         this.d = $$0;
         return this;
      }

      public st.a a(st.b $$0) {
         this.c = $$0;
         return this;
      }

      public st a() {
         return new st(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<si> batch(Collection<so> var1);
   }

   public interface c {
      st.c a = $$0 -> Optional.of($$0.o().a(1));
      st.c b = $$0 -> Optional.empty();

      Optional<so> spawnStructure(so var1);

      default void a(arn $$0) {
      }
   }
}
