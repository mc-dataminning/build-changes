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

public class rz {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final apf c;
   private final sc d;
   private final List<rw> e;
   private ImmutableList<rq> f;
   final List<rs> g = Lists.newArrayList();
   private final List<rw> h = Lists.newArrayList();
   private final rz.b i;
   private boolean j = true;
   @Nullable
   rq k;
   private final rz.c l;
   private final rz.c m;

   protected rz(rz.b $$0, Collection<rq> $$1, apf $$2, sc $$3, rz.c $$4, rz.c $$5) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(Collectors.toList());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new si()));
   }

   public List<rw> a() {
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

   public void a(rw $$0) {
      rw $$1 = $$0.B();
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
         this.k = (rq)this.f.get($$0);
         Collection<rw> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final sh $$3 = new sh();
         $$1.forEach($$3::a);
         $$3.a(new rx() {
            private void a() {
               if ($$3.i()) {
                  rz.this.k.d().accept(rz.this.c);
                  rz.this.g.forEach($$0xxx -> $$0xxx.b(rz.this.k));
                  LongSet $$0 = new LongArraySet(rz.this.c.w());
                  $$0.forEach($$0xxx -> rz.this.c.a(cwg.a($$0xxx), cwg.b($$0xxx), false));
                  rz.this.a($$0 + 1);
               }
            }

            @Override
            public void a(rw $$0x) {
            }

            @Override
            public void a(rw $$0x, rz $$1) {
               this.a();
            }

            @Override
            public void b(rw $$0x, rz $$1) {
               this.a();
            }

            @Override
            public void a(rw $$0x, rw $$1, rz $$2) {
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

   public void a(rs $$0) {
      this.g.add($$0);
   }

   private Collection<rw> a(Collection<rw> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<rw> b(rw $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(apf $$0) {
      aew.a($$0);
   }

   public static class a {
      private final apf a;
      private final sc b = sc.a;
      private final rz.b c = rr.a();
      private final rz.c d = rz.c.a;
      private rz.c e = rz.c.b;
      private final Collection<rq> f;

      private a(Collection<rq> $$0, apf $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static rz.a a(Collection<rq> $$0, apf $$1) {
         return new rz.a($$0, $$1);
      }

      public static rz.a b(Collection<rw> $$0, apf $$1) {
         return a(rr.a().batch($$0), $$1);
      }

      public rz.a a(rz.c $$0) {
         this.e = $$0;
         return this;
      }

      public rz a() {
         return new rz(this.c, this.f, this.a, this.b, this.d, this.e);
      }
   }

   public interface b {
      Collection<rq> batch(Collection<rw> var1);
   }

   public interface c {
      rz.c a = $$0 -> Optional.of($$0.n().a().a(1));
      rz.c b = $$0 -> Optional.empty();

      Optional<rw> spawnStructure(rw var1);
   }
}
