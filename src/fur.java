import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fur extends fpt {
   private static final xd a = xd.c("editGamerule.title");
   private static final int b = 8;
   final fno c = new fno(this);
   private final Consumer<Optional<ddo>> d;
   private final Set<fur.f> s = Sets.newHashSet();
   private final ddo u;
   @Nullable
   private fur.g v;
   @Nullable
   private fka w;

   public fur(ddo $$0, Consumer<Optional<ddo>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aT_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new fur.g(this.u));
      fns $$0 = this.c.b(fns.e().a(8));
      this.w = $$0.a(fka.a(xc.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fka.a(xc.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fjy var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      if (this.v != null) {
         this.v.a(this.n, this.c);
      }
   }

   @Override
   public void d() {
      this.d.accept(Optional.empty());
   }

   private void m() {
      if (this.w != null) {
         this.w.j = this.s.isEmpty();
      }
   }

   void a(fur.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(fur.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends fur.d {
      private final fkh<Boolean> c;

      public a(final xd $$1, final List<ayo> $$2, final String $$3, final ddo.a $$4) {
         super($$2, $$1);
         this.c = fkh.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fur.f {
      final xd b;

      public b(final xd $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fur.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends flx> aK_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fnv> b() {
         return ImmutableList.of(new fnv() {
            @Override
            public fnv.a u() {
               return fnv.a.b;
            }

            @Override
            public void b(fnx $$0) {
               $$0.a(fnw.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends ddo.g<T>> {
      fur.f create(xd var1, List<ayo> var2, String var3, T var4);
   }

   public abstract class d extends fur.f {
      private final List<ayo> c;
      protected final List<fjy> a = Lists.newArrayList();

      public d(@Nullable final List<ayo> $$1, final xd $$2) {
         super($$1);
         this.c = fur.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends flx> aK_() {
         return this.a;
      }

      @Override
      public List<? extends fnv> b() {
         return this.a;
      }

      protected void a(fjn $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fur.this.m.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fur.this.m.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fur.this.m.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fur.d {
      private final fkj d;

      public e(final xd $$1, final List<ayo> $$2, final String $$3, final ddo.d $$4) {
         super($$2, $$1);
         this.d = new fkj(fur.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fur.this.b(this);
            } else {
               this.d.g(-65536);
               fur.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fkg.a<fur.f> {
      @Nullable
      final List<ayo> a;

      public f(@Nullable List<ayo> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fkg<fur.f> {
      private static final int m = 24;

      public g(final ddo $$1) {
         super(fib.Q(), fur.this.n, fur.this.c.d(), fur.this.c.c(), 24);
         final Map<ddo.b, Map<ddo.e<?>, fur.f>> $$2 = Maps.newHashMap();
         $$1.a(new ddo.c() {
            @Override
            public void b(ddo.e<ddo.a> $$0, ddo.f<ddo.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fur.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(ddo.e<ddo.d> $$0, ddo.f<ddo.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fur.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends ddo.g<T>> void a(ddo.e<T> $$0, fur.c<T> $$1x) {
               xd $$2 = xd.c($$0.b());
               xd $$3 = xd.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xd $$6 = xd.a("editGamerule.default", xd.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayo> $$10;
               String $$11;
               if (gxr.a($$7)) {
                  Builder<ayo> $$8 = ImmutableList.builder().add($$3.g());
                  xd $$9 = xd.c($$7);
                  fur.this.p.c($$9, 150).forEach($$8::add);
                  $$10 = $$8.add($$6.g()).build();
                  $$11 = $$9.getString() + "\n" + $$6.getString();
               } else {
                  $$10 = ImmutableList.of($$3.g(), $$6.g());
                  $$11 = $$6.getString();
               }

               $$2.computeIfAbsent($$0.c(), $$0x -> Maps.newHashMap()).put($$0, $$1.create($$2, $$10, $$11, $$4));
            }
         });
         $$2.entrySet()
            .stream()
            .sorted(Entry.comparingByKey())
            .forEach(
               $$0x -> {
                  this.b(fur.this.new b(xd.c(((ddo.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(ddo.e::a)))
                     .forEach($$0xx -> this.b((fur.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fjn $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fur.f $$4 = this.v();
         if ($$4 != null && $$4.a != null) {
            fur.this.b($$4.a);
         }
      }
   }
}
