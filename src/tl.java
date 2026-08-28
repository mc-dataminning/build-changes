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

public class tl {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final arq c;
   private final to d;
   private final List<ti> e;
   private ImmutableList<tc> f;
   final List<te> g = Lists.newArrayList();
   private final List<ti> h = Lists.newArrayList();
   private final tl.b i;
   private boolean j = true;
   @Nullable
   tc k;
   private final tl.c l;
   private final tl.c m;
   final boolean n;

   protected tl(tl.b $$0, Collection<tc> $$1, arq $$2, to $$3, tl.c $$4, tl.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ae.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new tu()));
   }

   public List<ti> a() {
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

   public void a(ti $$0) {
      ti $$1 = $$0.C();
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
         this.k = (tc)this.f.get($$0);
         this.l.a(this.c);
         this.m.a(this.c);
         Collection<ti> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final tt $$3 = new tt();
         $$1.forEach($$3::a);
         $$3.a(new tj() {
            private void a() {
               if ($$3.i()) {
                  tl.this.k.d().accept(tl.this.c);
                  tl.this.g.forEach($$0xxx -> $$0xxx.b(tl.this.k));
                  LongSet $$0 = new LongArraySet(tl.this.c.w());
                  $$0.forEach($$0xxx -> tl.this.c.a(del.a($$0xxx), del.b($$0xxx), false));
                  tl.this.a($$0 + 1);
               }
            }

            @Override
            public void a(ti $$0x) {
            }

            @Override
            public void a(ti $$0x, tl $$1) {
               this.a();
            }

            @Override
            public void b(ti $$0x, tl $$1) {
               if (tl.this.n) {
                  tl.this.k.d().accept(tl.this.c);
                  LongSet $$2 = new LongArraySet(tl.this.c.w());
                  $$2.forEach($$0xxx -> tl.this.c.a(del.a($$0xxx), del.b($$0xxx), false));
                  to.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(ti $$0x, ti $$1, tl $$2) {
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

   public void a(te $$0) {
      this.g.add($$0);
   }

   private Collection<ti> a(Collection<ti> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<ti> b(ti $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(arq $$0) {
      agv.a($$0);
   }

   public static class a {
      private final arq a;
      private final to b = to.a;
      private tl.b c = td.a();
      private tl.c d = tl.c.a;
      private tl.c e = tl.c.b;
      private final Collection<tc> f;
      private boolean g = false;

      private a(Collection<tc> $$0, arq $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static tl.a a(Collection<tc> $$0, arq $$1) {
         return new tl.a($$0, $$1);
      }

      public static tl.a b(Collection<ti> $$0, arq $$1) {
         return a(td.a().batch($$0), $$1);
      }

      public tl.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public tl.a a(tl.c $$0) {
         this.e = $$0;
         return this;
      }

      public tl.a a(tx $$0) {
         this.d = $$0;
         return this;
      }

      public tl.a a(tl.b $$0) {
         this.c = $$0;
         return this;
      }

      public tl a() {
         return new tl(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<tc> batch(Collection<ti> var1);
   }

   public interface c {
      tl.c a = $$0 -> Optional.of($$0.o().a().a(1));
      tl.c b = $$0 -> Optional.empty();

      Optional<ti> spawnStructure(ti var1);

      default void a(arq $$0) {
      }
   }
}
