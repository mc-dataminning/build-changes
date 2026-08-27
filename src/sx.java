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

public class sx {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final aqe c;
   private final ta d;
   private final List<su> e;
   private ImmutableList<so> f;
   final List<sq> g = Lists.newArrayList();
   private final List<su> h = Lists.newArrayList();
   private final sx.b i;
   private boolean j = true;
   @Nullable
   so k;
   private final sx.c l;
   private final sx.c m;

   protected sx(sx.b $$0, Collection<so> $$1, aqe $$2, ta $$3, sx.c $$4, sx.c $$5) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(Collectors.toList());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new tg()));
   }

   public List<su> a() {
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

   public void a(su $$0) {
      su $$1 = $$0.B();
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
         this.k = (so)this.f.get($$0);
         Collection<su> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final tf $$3 = new tf();
         $$1.forEach($$3::a);
         $$3.a(new sv() {
            private void a() {
               if ($$3.i()) {
                  sx.this.k.d().accept(sx.this.c);
                  sx.this.g.forEach($$0xxx -> $$0xxx.b(sx.this.k));
                  LongSet $$0 = new LongArraySet(sx.this.c.w());
                  $$0.forEach($$0xxx -> sx.this.c.a(czb.a($$0xxx), czb.b($$0xxx), false));
                  sx.this.a($$0 + 1);
               }
            }

            @Override
            public void a(su $$0x) {
            }

            @Override
            public void a(su $$0x, sx $$1) {
               this.a();
            }

            @Override
            public void b(su $$0x, sx $$1) {
               this.a();
            }

            @Override
            public void a(su $$0x, su $$1, sx $$2) {
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

   public void a(sq $$0) {
      this.g.add($$0);
   }

   private Collection<su> a(Collection<su> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<su> b(su $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(aqe $$0) {
      afu.a($$0);
   }

   public static class a {
      private final aqe a;
      private final ta b = ta.a;
      private final sx.b c = sp.a();
      private final sx.c d = sx.c.a;
      private sx.c e = sx.c.b;
      private final Collection<so> f;

      private a(Collection<so> $$0, aqe $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static sx.a a(Collection<so> $$0, aqe $$1) {
         return new sx.a($$0, $$1);
      }

      public static sx.a b(Collection<su> $$0, aqe $$1) {
         return a(sp.a().batch($$0), $$1);
      }

      public sx.a a(sx.c $$0) {
         this.e = $$0;
         return this;
      }

      public sx a() {
         return new sx(this.c, this.f, this.a, this.b, this.d, this.e);
      }
   }

   public interface b {
      Collection<so> batch(Collection<su> var1);
   }

   public interface c {
      sx.c a = $$0 -> Optional.of($$0.n().a().a(1));
      sx.c b = $$0 -> Optional.empty();

      Optional<su> spawnStructure(su var1);
   }
}
