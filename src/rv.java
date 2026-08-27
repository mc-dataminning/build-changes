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

public class rv {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final aow c;
   private final ry d;
   private final List<rs> e;
   private ImmutableList<rm> f;
   final List<ro> g = Lists.newArrayList();
   private final List<rs> h = Lists.newArrayList();
   private final rv.b i;
   private boolean j = true;
   @Nullable
   rm k;
   private final rv.c l;
   private final rv.c m;

   protected rv(rv.b $$0, Collection<rm> $$1, aow $$2, ry $$3, rv.c $$4, rv.c $$5) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(Collectors.toList());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new se()));
   }

   public List<rs> a() {
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

   public void a(rs $$0) {
      rs $$1 = $$0.B();
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
         this.k = (rm)this.f.get($$0);
         Collection<rs> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final sd $$3 = new sd();
         $$1.forEach($$3::a);
         $$3.a(new rt() {
            private void a() {
               if ($$3.i()) {
                  rv.this.k.d().accept(rv.this.c);
                  rv.this.g.forEach($$0xxx -> $$0xxx.b(rv.this.k));
                  LongSet $$0 = new LongArraySet(rv.this.c.w());
                  $$0.forEach($$0xxx -> rv.this.c.a(cuy.a($$0xxx), cuy.b($$0xxx), false));
                  rv.this.a($$0 + 1);
               }
            }

            @Override
            public void a(rs $$0x) {
            }

            @Override
            public void a(rs $$0x, rv $$1) {
               this.a();
            }

            @Override
            public void b(rs $$0x, rv $$1) {
               this.a();
            }

            @Override
            public void a(rs $$0x, rs $$1, rv $$2) {
            }
         });
         $$1.forEach(this.d::a);
      }
   }

   private void d() {
      if (!this.h.isEmpty()) {
         this.f = ImmutableList.copyOf(this.i.batch(this.h));
         this.h.clear();
         this.j = false;
         this.a(0);
      } else {
         this.f = ImmutableList.of();
         this.j = true;
      }
   }

   public void a(ro $$0) {
      this.g.add($$0);
   }

   private Collection<rs> a(Collection<rs> $$0) {
      return $$0.stream().map(this::b).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
   }

   private Optional<rs> b(rs $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(aow $$0) {
      aep.a($$0);
   }

   public static class a {
      private final aow a;
      private final ry b = ry.a;
      private final rv.b c = rn.a();
      private final rv.c d = rv.c.a;
      private rv.c e = rv.c.b;
      private final Collection<rm> f;

      private a(Collection<rm> $$0, aow $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static rv.a a(Collection<rm> $$0, aow $$1) {
         return new rv.a($$0, $$1);
      }

      public static rv.a b(Collection<rs> $$0, aow $$1) {
         return a(rn.a().batch($$0), $$1);
      }

      public rv.a a(rv.c $$0) {
         this.e = $$0;
         return this;
      }

      public rv a() {
         return new rv(this.c, this.f, this.a, this.b, this.d, this.e);
      }
   }

   public interface b {
      Collection<rm> batch(Collection<rs> var1);
   }

   public interface c {
      rv.c a = $$0 -> Optional.of($$0.n().a().a(1));
      rv.c b = $$0 -> Optional.empty();

      Optional<rs> spawnStructure(rs var1);
   }
}
