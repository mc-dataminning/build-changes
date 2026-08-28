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

public class te {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final arj c;
   private final th d;
   private final List<tb> e;
   private ImmutableList<sv> f;
   final List<sx> g = Lists.newArrayList();
   private final List<tb> h = Lists.newArrayList();
   private final te.b i;
   private boolean j = true;
   @Nullable
   sv k;
   private final te.c l;
   private final te.c m;
   final boolean n;

   protected te(te.b $$0, Collection<sv> $$1, arj $$2, th $$3, te.c $$4, te.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ad.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new tn()));
   }

   public List<tb> a() {
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

   public void a(tb $$0) {
      tb $$1 = $$0.B();
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
         this.k = (sv)this.f.get($$0);
         this.l.a(this.c);
         this.m.a(this.c);
         Collection<tb> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final tm $$3 = new tm();
         $$1.forEach($$3::a);
         $$3.a(new tc() {
            private void a() {
               if ($$3.i()) {
                  te.this.k.d().accept(te.this.c);
                  te.this.g.forEach($$0xxx -> $$0xxx.b(te.this.k));
                  LongSet $$0 = new LongArraySet(te.this.c.w());
                  $$0.forEach($$0xxx -> te.this.c.a(ddp.a($$0xxx), ddp.b($$0xxx), false));
                  te.this.a($$0 + 1);
               }
            }

            @Override
            public void a(tb $$0x) {
            }

            @Override
            public void a(tb $$0x, te $$1) {
               this.a();
            }

            @Override
            public void b(tb $$0x, te $$1) {
               if (te.this.n) {
                  te.this.k.d().accept(te.this.c);
                  LongSet $$2 = new LongArraySet(te.this.c.w());
                  $$2.forEach($$0xxx -> te.this.c.a(ddp.a($$0xxx), ddp.b($$0xxx), false));
                  th.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(tb $$0x, tb $$1, te $$2) {
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

   public void a(sx $$0) {
      this.g.add($$0);
   }

   private Collection<tb> a(Collection<tb> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<tb> b(tb $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(arj $$0) {
      ago.a($$0);
   }

   public static class a {
      private final arj a;
      private final th b = th.a;
      private te.b c = sw.a();
      private te.c d = te.c.a;
      private te.c e = te.c.b;
      private final Collection<sv> f;
      private boolean g = false;

      private a(Collection<sv> $$0, arj $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static te.a a(Collection<sv> $$0, arj $$1) {
         return new te.a($$0, $$1);
      }

      public static te.a b(Collection<tb> $$0, arj $$1) {
         return a(sw.a().batch($$0), $$1);
      }

      public te.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public te.a a(te.c $$0) {
         this.e = $$0;
         return this;
      }

      public te.a a(tq $$0) {
         this.d = $$0;
         return this;
      }

      public te.a a(te.b $$0) {
         this.c = $$0;
         return this;
      }

      public te a() {
         return new te(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<sv> batch(Collection<tb> var1);
   }

   public interface c {
      te.c a = $$0 -> Optional.of($$0.n().a().a(1));
      te.c b = $$0 -> Optional.empty();

      Optional<tb> spawnStructure(tb var1);

      default void a(arj $$0) {
      }
   }
}
