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

public class tk {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final arx c;
   private final tn d;
   private final List<th> e;
   private ImmutableList<tb> f;
   final List<td> g = Lists.newArrayList();
   private final List<th> h = Lists.newArrayList();
   private final tk.b i;
   private boolean j = true;
   @Nullable
   tb k;
   private final tk.c l;
   private final tk.c m;
   final boolean n;

   protected tk(tk.b $$0, Collection<tb> $$1, arx $$2, tn $$3, tk.c $$4, tk.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ae.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new tt()));
   }

   public List<th> a() {
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

   public void a(th $$0) {
      th $$1 = $$0.C();
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
         this.k = (tb)this.f.get($$0);
         this.l.a(this.c);
         this.m.a(this.c);
         Collection<th> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final ts $$3 = new ts();
         $$1.forEach($$3::a);
         $$3.a(new ti() {
            private void a() {
               if ($$3.i()) {
                  tk.this.k.d().accept(tk.this.c);
                  tk.this.g.forEach($$0xxx -> $$0xxx.b(tk.this.k));
                  LongSet $$0 = new LongArraySet(tk.this.c.y());
                  $$0.forEach($$0xxx -> tk.this.c.a(dgf.a($$0xxx), dgf.b($$0xxx), false));
                  tk.this.a($$0 + 1);
               }
            }

            @Override
            public void a(th $$0x) {
            }

            @Override
            public void a(th $$0x, tk $$1) {
               this.a();
            }

            @Override
            public void b(th $$0x, tk $$1) {
               if (tk.this.n) {
                  tk.this.k.d().accept(tk.this.c);
                  LongSet $$2 = new LongArraySet(tk.this.c.y());
                  $$2.forEach($$0xxx -> tk.this.c.a(dgf.a($$0xxx), dgf.b($$0xxx), false));
                  tn.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(th $$0x, th $$1, tk $$2) {
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

   public void a(td $$0) {
      this.g.add($$0);
   }

   private Collection<th> a(Collection<th> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<th> b(th $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(arx $$0) {
      agy.a($$0);
   }

   public static class a {
      private final arx a;
      private final tn b = tn.a;
      private tk.b c = tc.a();
      private tk.c d = tk.c.a;
      private tk.c e = tk.c.b;
      private final Collection<tb> f;
      private boolean g = false;

      private a(Collection<tb> $$0, arx $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static tk.a a(Collection<tb> $$0, arx $$1) {
         return new tk.a($$0, $$1);
      }

      public static tk.a b(Collection<th> $$0, arx $$1) {
         return a(tc.a().batch($$0), $$1);
      }

      public tk.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public tk.a a(tk.c $$0) {
         this.e = $$0;
         return this;
      }

      public tk.a a(tw $$0) {
         this.d = $$0;
         return this;
      }

      public tk.a a(tk.b $$0) {
         this.c = $$0;
         return this;
      }

      public tk a() {
         return new tk(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<tb> batch(Collection<th> var1);
   }

   public interface c {
      tk.c a = $$0 -> Optional.of($$0.o().a().a(1));
      tk.c b = $$0 -> Optional.empty();

      Optional<th> spawnStructure(th var1);

      default void a(arx $$0) {
      }
   }
}
