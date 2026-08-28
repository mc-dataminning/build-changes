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

public class ti {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final arn c;
   private final tl d;
   private final List<tf> e;
   private ImmutableList<sz> f;
   final List<tb> g = Lists.newArrayList();
   private final List<tf> h = Lists.newArrayList();
   private final ti.b i;
   private boolean j = true;
   @Nullable
   sz k;
   private final ti.c l;
   private final ti.c m;
   final boolean n;

   protected ti(ti.b $$0, Collection<sz> $$1, arn $$2, tl $$3, ti.c $$4, ti.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ae.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new tr()));
   }

   public List<tf> a() {
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

   public void a(tf $$0) {
      tf $$1 = $$0.B();
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
         this.k = (sz)this.f.get($$0);
         this.l.a(this.c);
         this.m.a(this.c);
         Collection<tf> $$1 = this.a(this.k.b());
         String $$2 = this.k.a();
         b.info("Running test batch '{}' ({} tests)...", $$2, $$1.size());
         this.k.c().accept(this.c);
         this.g.forEach($$0x -> $$0x.a(this.k));
         final tq $$3 = new tq();
         $$1.forEach($$3::a);
         $$3.a(new tg() {
            private void a() {
               if ($$3.i()) {
                  ti.this.k.d().accept(ti.this.c);
                  ti.this.g.forEach($$0xxx -> $$0xxx.b(ti.this.k));
                  LongSet $$0 = new LongArraySet(ti.this.c.w());
                  $$0.forEach($$0xxx -> ti.this.c.a(deh.a($$0xxx), deh.b($$0xxx), false));
                  ti.this.a($$0 + 1);
               }
            }

            @Override
            public void a(tf $$0x) {
            }

            @Override
            public void a(tf $$0x, ti $$1) {
               this.a();
            }

            @Override
            public void b(tf $$0x, ti $$1) {
               if (ti.this.n) {
                  ti.this.k.d().accept(ti.this.c);
                  LongSet $$2 = new LongArraySet(ti.this.c.w());
                  $$2.forEach($$0xxx -> ti.this.c.a(deh.a($$0xxx), deh.b($$0xxx), false));
                  tl.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(tf $$0x, tf $$1, ti $$2) {
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

   public void a(tb $$0) {
      this.g.add($$0);
   }

   private Collection<tf> a(Collection<tf> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<tf> b(tf $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(arn $$0) {
      ags.a($$0);
   }

   public static class a {
      private final arn a;
      private final tl b = tl.a;
      private ti.b c = ta.a();
      private ti.c d = ti.c.a;
      private ti.c e = ti.c.b;
      private final Collection<sz> f;
      private boolean g = false;

      private a(Collection<sz> $$0, arn $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static ti.a a(Collection<sz> $$0, arn $$1) {
         return new ti.a($$0, $$1);
      }

      public static ti.a b(Collection<tf> $$0, arn $$1) {
         return a(ta.a().batch($$0), $$1);
      }

      public ti.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public ti.a a(ti.c $$0) {
         this.e = $$0;
         return this;
      }

      public ti.a a(tu $$0) {
         this.d = $$0;
         return this;
      }

      public ti.a a(ti.b $$0) {
         this.c = $$0;
         return this;
      }

      public ti a() {
         return new ti(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<sz> batch(Collection<tf> var1);
   }

   public interface c {
      ti.c a = $$0 -> Optional.of($$0.n().a().a(1));
      ti.c b = $$0 -> Optional.empty();

      Optional<tf> spawnStructure(tf var1);

      default void a(arn $$0) {
      }
   }
}
