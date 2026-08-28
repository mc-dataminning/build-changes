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

public class ta {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final aqu c;
   private final td d;
   private final List<sx> e;
   private ImmutableList<sr> f;
   final List<st> g = Lists.newArrayList();
   private final List<sx> h = Lists.newArrayList();
   private final ta.b i;
   private boolean j = true;
   @Nullable
   sr k;
   private final ta.c l;
   private final ta.c m;
   final boolean n;

   protected ta(ta.b $$0, Collection<sr> $$1, aqu $$2, td $$3, ta.c $$4, ta.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ad.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new tj()));
   }

   public List<sx> a() {
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

   public void a(sx $$0) {
      sx $$1 = $$0.B();
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
         this.k = (sr)this.f.get($$0);
         this.l.a(this.c);
         this.m.a(this.c);
         Collection<sx> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final ti $$3 = new ti();
         $$1.forEach($$3::a);
         $$3.a(new sy() {
            private void a() {
               if ($$3.i()) {
                  ta.this.k.d().accept(ta.this.c);
                  ta.this.g.forEach($$0xxx -> $$0xxx.b(ta.this.k));
                  LongSet $$0 = new LongArraySet(ta.this.c.w());
                  $$0.forEach($$0xxx -> ta.this.c.a(dcd.a($$0xxx), dcd.b($$0xxx), false));
                  ta.this.a($$0 + 1);
               }
            }

            @Override
            public void a(sx $$0x) {
            }

            @Override
            public void a(sx $$0x, ta $$1) {
               this.a();
            }

            @Override
            public void b(sx $$0x, ta $$1) {
               if (ta.this.n) {
                  ta.this.k.d().accept(ta.this.c);
                  LongSet $$2 = new LongArraySet(ta.this.c.w());
                  $$2.forEach($$0xxx -> ta.this.c.a(dcd.a($$0xxx), dcd.b($$0xxx), false));
                  td.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(sx $$0x, sx $$1, ta $$2) {
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

   public void a(st $$0) {
      this.g.add($$0);
   }

   private Collection<sx> a(Collection<sx> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<sx> b(sx $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(aqu $$0) {
      agf.a($$0);
   }

   public static class a {
      private final aqu a;
      private final td b = td.a;
      private ta.b c = ss.a();
      private ta.c d = ta.c.a;
      private ta.c e = ta.c.b;
      private final Collection<sr> f;
      private boolean g = false;

      private a(Collection<sr> $$0, aqu $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static ta.a a(Collection<sr> $$0, aqu $$1) {
         return new ta.a($$0, $$1);
      }

      public static ta.a b(Collection<sx> $$0, aqu $$1) {
         return a(ss.a().batch($$0), $$1);
      }

      public ta.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public ta.a a(ta.c $$0) {
         this.e = $$0;
         return this;
      }

      public ta.a a(tm $$0) {
         this.d = $$0;
         return this;
      }

      public ta.a a(ta.b $$0) {
         this.c = $$0;
         return this;
      }

      public ta a() {
         return new ta(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<sr> batch(Collection<sx> var1);
   }

   public interface c {
      ta.c a = $$0 -> Optional.of($$0.n().a().a(1));
      ta.c b = $$0 -> Optional.empty();

      Optional<sx> spawnStructure(sx var1);

      default void a(aqu $$0) {
      }
   }
}
