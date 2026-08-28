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

public class tv {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final ash c;
   private final ty d;
   private final List<ts> e;
   private ImmutableList<tm> f;
   final List<to> g = Lists.newArrayList();
   private final List<ts> h = Lists.newArrayList();
   private final tv.b i;
   private boolean j = true;
   @Nullable
   tm k;
   private final tv.c l;
   private final tv.c m;
   final boolean n;

   protected tv(tv.b $$0, Collection<tm> $$1, ash $$2, ty $$3, tv.c $$4, tv.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ae.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new ue()));
   }

   public List<ts> a() {
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

   public void a(ts $$0) {
      ts $$1 = $$0.C();
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
         this.k = (tm)this.f.get($$0);
         this.l.a(this.c);
         this.m.a(this.c);
         Collection<ts> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final ud $$3 = new ud();
         $$1.forEach($$3::a);
         $$3.a(new tt() {
            private void a() {
               if ($$3.i()) {
                  tv.this.k.d().accept(tv.this.c);
                  tv.this.g.forEach($$0xxx -> $$0xxx.b(tv.this.k));
                  LongSet $$0 = new LongArraySet(tv.this.c.x());
                  $$0.forEach($$0xxx -> tv.this.c.a(dgn.a($$0xxx), dgn.b($$0xxx), false));
                  tv.this.a($$0 + 1);
               }
            }

            @Override
            public void a(ts $$0x) {
            }

            @Override
            public void a(ts $$0x, tv $$1) {
               this.a();
            }

            @Override
            public void b(ts $$0x, tv $$1) {
               if (tv.this.n) {
                  tv.this.k.d().accept(tv.this.c);
                  LongSet $$2 = new LongArraySet(tv.this.c.x());
                  $$2.forEach($$0xxx -> tv.this.c.a(dgn.a($$0xxx), dgn.b($$0xxx), false));
                  ty.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(ts $$0x, ts $$1, tv $$2) {
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

   public void a(to $$0) {
      this.g.add($$0);
   }

   private Collection<ts> a(Collection<ts> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<ts> b(ts $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(ash $$0) {
      ahj.a($$0);
   }

   public static class a {
      private final ash a;
      private final ty b = ty.a;
      private tv.b c = tn.a();
      private tv.c d = tv.c.a;
      private tv.c e = tv.c.b;
      private final Collection<tm> f;
      private boolean g = false;

      private a(Collection<tm> $$0, ash $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static tv.a a(Collection<tm> $$0, ash $$1) {
         return new tv.a($$0, $$1);
      }

      public static tv.a b(Collection<ts> $$0, ash $$1) {
         return a(tn.a().batch($$0), $$1);
      }

      public tv.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public tv.a a(tv.c $$0) {
         this.e = $$0;
         return this;
      }

      public tv.a a(uh $$0) {
         this.d = $$0;
         return this;
      }

      public tv.a a(tv.b $$0) {
         this.c = $$0;
         return this;
      }

      public tv a() {
         return new tv(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<tm> batch(Collection<ts> var1);
   }

   public interface c {
      tv.c a = $$0 -> Optional.of($$0.o().a().a(1));
      tv.c b = $$0 -> Optional.empty();

      Optional<ts> spawnStructure(ts var1);

      default void a(ash $$0) {
      }
   }
}
