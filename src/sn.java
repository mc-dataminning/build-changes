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

public class sn {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final apu c;
   private final sq d;
   private final List<sk> e;
   private ImmutableList<se> f;
   final List<sg> g = Lists.newArrayList();
   private final List<sk> h = Lists.newArrayList();
   private final sn.b i;
   private boolean j = true;
   @Nullable
   se k;
   private final sn.c l;
   private final sn.c m;

   protected sn(sn.b $$0, Collection<se> $$1, apu $$2, sq $$3, sn.c $$4, sn.c $$5) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(Collectors.toList());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new sw()));
   }

   public List<sk> a() {
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

   public void a(sk $$0) {
      sk $$1 = $$0.B();
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
         this.k = (se)this.f.get($$0);
         Collection<sk> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final sv $$3 = new sv();
         $$1.forEach($$3::a);
         $$3.a(new sl() {
            private void a() {
               if ($$3.i()) {
                  sn.this.k.d().accept(sn.this.c);
                  sn.this.g.forEach($$0xxx -> $$0xxx.b(sn.this.k));
                  LongSet $$0 = new LongArraySet(sn.this.c.w());
                  $$0.forEach($$0xxx -> sn.this.c.a(cyn.a($$0xxx), cyn.b($$0xxx), false));
                  sn.this.a($$0 + 1);
               }
            }

            @Override
            public void a(sk $$0x) {
            }

            @Override
            public void a(sk $$0x, sn $$1) {
               this.a();
            }

            @Override
            public void b(sk $$0x, sn $$1) {
               this.a();
            }

            @Override
            public void a(sk $$0x, sk $$1, sn $$2) {
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

   public void a(sg $$0) {
      this.g.add($$0);
   }

   private Collection<sk> a(Collection<sk> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<sk> b(sk $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(apu $$0) {
      afk.a($$0);
   }

   public static class a {
      private final apu a;
      private final sq b = sq.a;
      private final sn.b c = sf.a();
      private final sn.c d = sn.c.a;
      private sn.c e = sn.c.b;
      private final Collection<se> f;

      private a(Collection<se> $$0, apu $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static sn.a a(Collection<se> $$0, apu $$1) {
         return new sn.a($$0, $$1);
      }

      public static sn.a b(Collection<sk> $$0, apu $$1) {
         return a(sf.a().batch($$0), $$1);
      }

      public sn.a a(sn.c $$0) {
         this.e = $$0;
         return this;
      }

      public sn a() {
         return new sn(this.c, this.f, this.a, this.b, this.d, this.e);
      }
   }

   public interface b {
      Collection<se> batch(Collection<sk> var1);
   }

   public interface c {
      sn.c a = $$0 -> Optional.of($$0.n().a().a(1));
      sn.c b = $$0 -> Optional.empty();

      Optional<sk> spawnStructure(sk var1);
   }
}
