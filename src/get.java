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

public class get extends fzq {
   private static final xg a = xg.c("editGamerule.title");
   private static final int b = 8;
   final fxm c = new fxm(this);
   private final Consumer<Optional<dkf>> d;
   private final Set<get.f> s = Sets.newHashSet();
   private final dkf u;
   @Nullable
   private get.g v;
   @Nullable
   private fty w;

   public get(dkf $$0, Consumer<Optional<dkf>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aT_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new get.g(this.u));
      fxq $$0 = this.c.b(fxq.e().a(8));
      this.w = $$0.a(fty.a(xf.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fty.a(xf.e, $$0x -> this.aQ_()).a());
      this.c.a($$1 -> {
         ftw var10000 = this.c($$1);
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
   public void aQ_() {
      this.d.accept(Optional.empty());
   }

   private void m() {
      if (this.w != null) {
         this.w.j = this.s.isEmpty();
      }
   }

   void a(get.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(get.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends get.d {
      private final fuf<Boolean> c;

      public a(final xg $$1, final List<azk> $$2, final String $$3, final dkf.a $$4) {
         super($$2, $$1);
         this.c = fuf.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.j($$3 + $$4 - 45);
         this.c.k($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends get.f {
      final xg b;

      public b(final xg $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(get.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fvv> aJ_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fxt> b() {
         return ImmutableList.of(new fxt() {
            @Override
            public fxt.a w() {
               return fxt.a.b;
            }

            @Override
            public void b(fxv $$0) {
               $$0.a(fxu.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dkf.g<T>> {
      get.f create(xg var1, List<azk> var2, String var3, T var4);
   }

   public abstract class d extends get.f {
      private final List<azk> c;
      protected final List<ftw> a = Lists.newArrayList();

      public d(@Nullable final List<azk> $$1, final xg $$2) {
         super($$1);
         this.c = get.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fvv> aJ_() {
         return this.a;
      }

      @Override
      public List<? extends fxt> b() {
         return this.a;
      }

      protected void a(ftk $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.b(get.this.m.h, this.c.get(0), $$2, $$1 + 5, -1);
         } else if (this.c.size() >= 2) {
            $$0.b(get.this.m.h, this.c.get(0), $$2, $$1, -1);
            $$0.b(get.this.m.h, this.c.get(1), $$2, $$1 + 10, -1);
         }
      }
   }

   public class e extends get.d {
      private final fuh d;

      public e(final xg $$1, final List<azk> $$2, final String $$3, final dkf.d $$4) {
         super($$2, $$1);
         this.d = new fuh(get.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               get.this.b(this);
            } else {
               this.d.m(-65536);
               get.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.j($$3 + $$4 - 45);
         this.d.k($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fue.a<get.f> {
      @Nullable
      final List<azk> a;

      public f(@Nullable List<azk> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fue<get.f> {
      private static final int m = 24;

      public g(final dkf $$1) {
         super(fqq.Q(), get.this.n, get.this.c.d(), get.this.c.c(), 24);
         final Map<dkf.b, Map<dkf.e<?>, get.f>> $$2 = Maps.newHashMap();
         $$1.a(new dkf.c() {
            @Override
            public void b(dkf.e<dkf.a> $$0, dkf.f<dkf.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> get.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dkf.e<dkf.d> $$0, dkf.f<dkf.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> get.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dkf.g<T>> void a(dkf.e<T> $$0, get.c<T> $$1x) {
               xg $$2 = xg.c($$0.b());
               xg $$3 = xg.b($$0.a()).a(o.o);
               T $$4 = $$1.b($$0);
               String $$5 = $$4.b();
               xg $$6 = xg.a("editGamerule.default", xg.b($$5)).a(o.h);
               String $$7 = $$0.b() + ".description";
               List<azk> $$10;
               String $$11;
               if (hly.a($$7)) {
                  Builder<azk> $$8 = ImmutableList.builder().add($$3.g());
                  xg $$9 = xg.c($$7);
                  get.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(get.this.new b(xg.c(((dkf.b)$$0x.getKey()).a()).a(o.r, o.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dkf.e::a)))
                     .forEach($$0xx -> this.b((get.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(ftk $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         get.f $$4 = this.x();
         if ($$4 != null && $$4.a != null) {
            get.this.b($$4.a);
         }
      }
   }
}
