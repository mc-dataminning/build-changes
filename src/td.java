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

public class td {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final arg c;
   private final tg d;
   private final List<ta> e;
   private ImmutableList<su> f;
   final List<sw> g = Lists.newArrayList();
   private final List<ta> h = Lists.newArrayList();
   private final td.b i;
   private boolean j = true;
   @Nullable
   su k;
   private final td.c l;
   private final td.c m;
   final boolean n;

   protected td(td.b $$0, Collection<su> $$1, arg $$2, tg $$3, td.c $$4, td.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ad.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new tm()));
   }

   public List<ta> a() {
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

   public void a(ta $$0) {
      ta $$1 = $$0.B();
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
         this.k = (su)this.f.get($$0);
         this.l.a(this.c);
         this.m.a(this.c);
         Collection<ta> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final tl $$3 = new tl();
         $$1.forEach($$3::a);
         $$3.a(new tb() {
            private void a() {
               if ($$3.i()) {
                  td.this.k.d().accept(td.this.c);
                  td.this.g.forEach($$0xxx -> $$0xxx.b(td.this.k));
                  LongSet $$0 = new LongArraySet(td.this.c.w());
                  $$0.forEach($$0xxx -> td.this.c.a(dcy.a($$0xxx), dcy.b($$0xxx), false));
                  td.this.a($$0 + 1);
               }
            }

            @Override
            public void a(ta $$0x) {
            }

            @Override
            public void a(ta $$0x, td $$1) {
               this.a();
            }

            @Override
            public void b(ta $$0x, td $$1) {
               if (td.this.n) {
                  td.this.k.d().accept(td.this.c);
                  LongSet $$2 = new LongArraySet(td.this.c.w());
                  $$2.forEach($$0xxx -> td.this.c.a(dcy.a($$0xxx), dcy.b($$0xxx), false));
                  tg.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(ta $$0x, ta $$1, td $$2) {
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

   public void a(sw $$0) {
      this.g.add($$0);
   }

   private Collection<ta> a(Collection<ta> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<ta> b(ta $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(arg $$0) {
      agn.a($$0);
   }

   public static class a {
      private final arg a;
      private final tg b = tg.a;
      private td.b c = sv.a();
      private td.c d = td.c.a;
      private td.c e = td.c.b;
      private final Collection<su> f;
      private boolean g = false;

      private a(Collection<su> $$0, arg $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static td.a a(Collection<su> $$0, arg $$1) {
         return new td.a($$0, $$1);
      }

      public static td.a b(Collection<ta> $$0, arg $$1) {
         return a(sv.a().batch($$0), $$1);
      }

      public td.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public td.a a(td.c $$0) {
         this.e = $$0;
         return this;
      }

      public td.a a(tp $$0) {
         this.d = $$0;
         return this;
      }

      public td.a a(td.b $$0) {
         this.c = $$0;
         return this;
      }

      public td a() {
         return new td(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<su> batch(Collection<ta> var1);
   }

   public interface c {
      td.c a = $$0 -> Optional.of($$0.n().a().a(1));
      td.c b = $$0 -> Optional.empty();

      Optional<ta> spawnStructure(ta var1);

      default void a(arg $$0) {
      }
   }
}
