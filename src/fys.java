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

public class fys extends ftr {
   private static final xk a = xk.c("editGamerule.title");
   private static final int b = 8;
   final frn c = new frn(this);
   private final Consumer<Optional<dgv>> d;
   private final Set<fys.f> s = Sets.newHashSet();
   private final dgv u;
   @Nullable
   private fys.g v;
   @Nullable
   private fny w;

   public fys(dgv $$0, Consumer<Optional<dgv>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aT_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new fys.g(this.u));
      frr $$0 = this.c.b(frr.e().a(8));
      this.w = $$0.a(fny.a(xj.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fny.a(xj.e, $$0x -> this.aP_()).a());
      this.c.a($$1 -> {
         fnw var10000 = this.c($$1);
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

   void a(fys.f $$0) {
      this.s.add($$0);
      this.l();
   }

   void b(fys.f $$0) {
      this.s.remove($$0);
      this.l();
   }

   public class a extends fys.d {
      private final fof<Boolean> c;

      public a(final xk $$1, final List<azg> $$2, final String $$3, final dgv.a $$4) {
         super($$2, $$1);
         this.c = fof.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.k($$3 + $$4 - 45);
         this.c.l($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fys.f {
      final xk b;

      public b(final xk $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fys.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fpw> aI_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fru> b() {
         return ImmutableList.of(new fru() {
            @Override
            public fru.a u() {
               return fru.a.b;
            }

            @Override
            public void b(frw $$0) {
               $$0.a(frv.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dgv.g<T>> {
      fys.f create(xk var1, List<azg> var2, String var3, T var4);
   }

   public abstract class d extends fys.f {
      private final List<azg> c;
      protected final List<fnw> a = Lists.newArrayList();

      public d(@Nullable final List<azg> $$1, final xk $$2) {
         super($$1);
         this.c = fys.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fpw> aI_() {
         return this.a;
      }

      @Override
      public List<? extends fru> b() {
         return this.a;
      }

      protected void a(fnl $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.b(fys.this.m.h, this.c.get(0), $$2, $$1 + 5, -1);
         } else if (this.c.size() >= 2) {
            $$0.b(fys.this.m.h, this.c.get(0), $$2, $$1, -1);
            $$0.b(fys.this.m.h, this.c.get(1), $$2, $$1 + 10, -1);
         }
      }
   }

   public class e extends fys.d {
      private final foh d;

      public e(final xk $$1, final List<azg> $$2, final String $$3, final dgv.d $$4) {
         super($$2, $$1);
         this.d = new foh(fys.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fys.this.b(this);
            } else {
               this.d.g(-65536);
               fys.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.k($$3 + $$4 - 45);
         this.d.l($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends foe.a<fys.f> {
      @Nullable
      final List<azg> a;

      public f(@Nullable List<azg> $$0) {
         this.a = $$0;
      }
   }

   public class g extends foe<fys.f> {
      private static final int m = 24;

      public g(final dgv $$1) {
         super(flz.Q(), fys.this.n, fys.this.c.d(), fys.this.c.c(), 24);
         final Map<dgv.b, Map<dgv.e<?>, fys.f>> $$2 = Maps.newHashMap();
         $$1.a(new dgv.c() {
            @Override
            public void b(dgv.e<dgv.a> $$0, dgv.f<dgv.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fys.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dgv.e<dgv.d> $$0, dgv.f<dgv.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fys.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dgv.g<T>> void a(dgv.e<T> $$0, fys.c<T> $$1x) {
               xk $$2 = xk.c($$0.b());
               xk $$3 = xk.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xk $$6 = xk.a("editGamerule.default", xk.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<azg> $$10;
               String $$11;
               if (hcn.a($$7)) {
                  Builder<azg> $$8 = ImmutableList.builder().add($$3.g());
                  xk $$9 = xk.c($$7);
                  fys.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fys.this.new b(xk.c(((dgv.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dgv.e::a)))
                     .forEach($$0xx -> this.b((fys.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fnl $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fys.f $$4 = this.v();
         if ($$4 != null && $$4.a != null) {
            fys.this.b($$4.a);
         }
      }
   }
}
