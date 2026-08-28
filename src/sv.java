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

public class sv {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final arq c;
   private final sy d;
   private final List<sq> e;
   private ImmutableList<sj> f;
   final List<sl> g = Lists.newArrayList();
   private final List<sq> h = Lists.newArrayList();
   private final sv.b i;
   private boolean j = true;
   @Nullable
   private jf<tl> k;
   private final sv.c l;
   private final sv.c m;
   final boolean n;

   protected sv(sv.b $$0, Collection<sj> $$1, arq $$2, sy $$3, sv.c $$4, sv.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ag.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new tf()));
   }

   public List<sq> a() {
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

   public void a(sq $$0) {
      sq $$1 = $$0.D();
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
         Collection<sq> $$2 = this.a($$1.b());
         b.info("Running test environment '{}' batch {} ({} tests)...", new Object[]{$$1.c().g(), $$1.a(), $$2.size()});
         if (this.k != $$1.c()) {
            this.d();
            this.k = $$1.c();
            this.k.a().a(this.c);
         }

         this.g.forEach($$1x -> $$1x.a($$1));
         final te $$3 = new te();
         $$2.forEach($$3::a);
         $$3.a(new st() {
            private void a() {
               if ($$3.i()) {
                  sv.this.g.forEach($$1xx -> $$1xx.b($$1));
                  LongSet $$0 = new LongArraySet(sv.this.c.y());
                  $$0.forEach($$0xxx -> sv.this.c.a(dio.a($$0xxx), dio.b($$0xxx), false));
                  sv.this.a($$0 + 1);
               }
            }

            @Override
            public void a(sq $$0x) {
            }

            @Override
            public void a(sq $$0x, sv $$1x) {
               this.a();
            }

            @Override
            public void b(sq $$0x, sv $$1x) {
               if (sv.this.n) {
                  sv.this.d();
                  LongSet $$2 = new LongArraySet(sv.this.c.y());
                  $$2.forEach($$0xxx -> sv.this.c.a(dio.a($$0xxx), dio.b($$0xxx), false));
                  sy.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(sq $$0x, sq $$1x, sv $$2) {
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

   private Collection<sq> a(Collection<sq> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<sq> b(sq $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(arq $$0) {
      agm.a($$0);
   }

   public static class a {
      private final arq a;
      private final sy b = sy.a;
      private sv.b c = sk.a();
      private sv.c d = sv.c.a;
      private sv.c e = sv.c.b;
      private final Collection<sj> f;
      private boolean g = false;

      private a(Collection<sj> $$0, arq $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static sv.a a(Collection<sj> $$0, arq $$1) {
         return new sv.a($$0, $$1);
      }

      public static sv.a b(Collection<sq> $$0, arq $$1) {
         return a(sk.a().batch($$0), $$1);
      }

      public sv.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public sv.a a(sv.c $$0) {
         this.e = $$0;
         return this;
      }

      public sv.a a(th $$0) {
         this.d = $$0;
         return this;
      }

      public sv.a a(sv.b $$0) {
         this.c = $$0;
         return this;
      }

      public sv a() {
         return new sv(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<sj> batch(Collection<sq> var1);
   }

   public interface c {
      sv.c a = $$0 -> Optional.of($$0.o().a(1));
      sv.c b = $$0 -> Optional.empty();

      Optional<sq> spawnStructure(sq var1);

      default void a(arq $$0) {
      }
   }
}
