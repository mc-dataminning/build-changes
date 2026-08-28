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

public class fyz extends fty {
   private static final xv a = xv.c("editGamerule.title");
   private static final int b = 8;
   final fru c = new fru(this);
   private final Consumer<Optional<dhe>> d;
   private final Set<fyz.f> s = Sets.newHashSet();
   private final dhe u;
   @Nullable
   private fyz.g v;
   @Nullable
   private fof w;

   public fyz(dhe $$0, Consumer<Optional<dhe>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aT_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new fyz.g(this.u));
      fry $$0 = this.c.b(fry.e().a(8));
      this.w = $$0.a(fof.a(xu.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fof.a(xu.e, $$0x -> this.aP_()).a());
      this.c.a($$1 -> {
         fod var10000 = this.c($$1);
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
   public void aP_() {
      this.d.accept(Optional.empty());
   }

   private void l() {
      if (this.w != null) {
         this.w.j = this.s.isEmpty();
      }
   }

   void a(fyz.f $$0) {
      this.s.add($$0);
      this.l();
   }

   void b(fyz.f $$0) {
      this.s.remove($$0);
      this.l();
   }

   public class a extends fyz.d {
      private final fom<Boolean> c;

      public a(final xv $$1, final List<azq> $$2, final String $$3, final dhe.a $$4) {
         super($$2, $$1);
         this.c = fom.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.k($$3 + $$4 - 45);
         this.c.l($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fyz.f {
      final xv b;

      public b(final xv $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fyz.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fqd> aI_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fsb> b() {
         return ImmutableList.of(new fsb() {
            @Override
            public fsb.a u() {
               return fsb.a.b;
            }

            @Override
            public void b(fsd $$0) {
               $$0.a(fsc.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dhe.g<T>> {
      fyz.f create(xv var1, List<azq> var2, String var3, T var4);
   }

   public abstract class d extends fyz.f {
      private final List<azq> c;
      protected final List<fod> a = Lists.newArrayList();

      public d(@Nullable final List<azq> $$1, final xv $$2) {
         super($$1);
         this.c = fyz.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fqd> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fsb> b() {
         return this.a;
      }

      protected void a(fns $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fyz.this.m.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fyz.this.m.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fyz.this.m.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fyz.d {
      private final foo d;

      public e(final xv $$1, final List<azq> $$2, final String $$3, final dhe.d $$4) {
         super($$2, $$1);
         this.d = new foo(fyz.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fyz.this.b(this);
            } else {
               this.d.g(-65536);
               fyz.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.k($$3 + $$4 - 45);
         this.d.l($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fol.a<fyz.f> {
      @Nullable
      final List<azq> a;

      public f(@Nullable List<azq> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fol<fyz.f> {
      private static final int m = 24;

      public g(final dhe $$1) {
         super(fmg.Q(), fyz.this.n, fyz.this.c.d(), fyz.this.c.c(), 24);
         final Map<dhe.b, Map<dhe.e<?>, fyz.f>> $$2 = Maps.newHashMap();
         $$1.a(new dhe.c() {
            @Override
            public void b(dhe.e<dhe.a> $$0, dhe.f<dhe.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fyz.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dhe.e<dhe.d> $$0, dhe.f<dhe.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fyz.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dhe.g<T>> void a(dhe.e<T> $$0, fyz.c<T> $$1x) {
               xv $$2 = xv.c($$0.b());
               xv $$3 = xv.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xv $$6 = xv.a("editGamerule.default", xv.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<azq> $$10;
               String $$11;
               if (hcs.a($$7)) {
                  Builder<azq> $$8 = ImmutableList.builder().add($$3.g());
                  xv $$9 = xv.c($$7);
                  fyz.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fyz.this.new b(xv.c(((dhe.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dhe.e::a)))
                     .forEach($$0xx -> this.b((fyz.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fns $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fyz.f $$4 = this.v();
         if ($$4 != null && $$4.a != null) {
            fyz.this.b($$4.a);
         }
      }
   }
}
