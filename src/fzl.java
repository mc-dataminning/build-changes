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

public class fzl extends fuk {
   private static final wo a = wo.c("editGamerule.title");
   private static final int b = 8;
   final fsg c = new fsg(this);
   private final Consumer<Optional<dge>> d;
   private final Set<fzl.f> s = Sets.newHashSet();
   private final dge u;
   @Nullable
   private fzl.g v;
   @Nullable
   private fos w;

   public fzl(dge $$0, Consumer<Optional<dge>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aR_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new fzl.g(this.u));
      fsk $$0 = this.c.b(fsk.e().a(8));
      this.w = $$0.a(fos.a(wn.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fos.a(wn.e, $$0x -> this.aO_()).a());
      this.c.a($$1 -> {
         fop var10000 = this.c($$1);
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
   public void aO_() {
      this.d.accept(Optional.empty());
   }

   private void m() {
      if (this.w != null) {
         this.w.j = this.s.isEmpty();
      }
   }

   void a(fzl.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(fzl.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends fzl.d {
      private final foz<Boolean> c;

      public a(final wo $$1, final List<ayl> $$2, final String $$3, final dge.a $$4) {
         super($$2, $$1);
         this.c = foz.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.j($$3 + $$4 - 45);
         this.c.k($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fzl.f {
      final wo b;

      public b(final wo $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fzl.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fqp> aH_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fsn> b() {
         return ImmutableList.of(new fsn() {
            @Override
            public fsn.a w() {
               return fsn.a.b;
            }

            @Override
            public void b(fsp $$0) {
               $$0.a(fso.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dge.g<T>> {
      fzl.f create(wo var1, List<ayl> var2, String var3, T var4);
   }

   public abstract class d extends fzl.f {
      private final List<ayl> c;
      protected final List<fop> a = Lists.newArrayList();

      public d(@Nullable final List<ayl> $$1, final wo $$2) {
         super($$1);
         this.c = fzl.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fqp> aH_() {
         return this.a;
      }

      @Override
      public List<? extends fsn> b() {
         return this.a;
      }

      protected void a(fod $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.b(fzl.this.m.h, this.c.get(0), $$2, $$1 + 5, -1);
         } else if (this.c.size() >= 2) {
            $$0.b(fzl.this.m.h, this.c.get(0), $$2, $$1, -1);
            $$0.b(fzl.this.m.h, this.c.get(1), $$2, $$1 + 10, -1);
         }
      }
   }

   public class e extends fzl.d {
      private final fpb d;

      public e(final wo $$1, final List<ayl> $$2, final String $$3, final dge.d $$4) {
         super($$2, $$1);
         this.d = new fpb(fzl.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               fzl.this.b(this);
            } else {
               this.d.m(-65536);
               fzl.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.j($$3 + $$4 - 45);
         this.d.k($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends foy.a<fzl.f> {
      @Nullable
      final List<ayl> a;

      public f(@Nullable List<ayl> $$0) {
         this.a = $$0;
      }
   }

   public class g extends foy<fzl.f> {
      private static final int m = 24;

      public g(final dge $$1) {
         super(flj.Q(), fzl.this.n, fzl.this.c.d(), fzl.this.c.c(), 24);
         final Map<dge.b, Map<dge.e<?>, fzl.f>> $$2 = Maps.newHashMap();
         $$1.a(new dge.c() {
            @Override
            public void b(dge.e<dge.a> $$0, dge.f<dge.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fzl.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dge.e<dge.d> $$0, dge.f<dge.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fzl.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dge.g<T>> void a(dge.e<T> $$0, fzl.c<T> $$1x) {
               wo $$2 = wo.c($$0.b());
               wo $$3 = wo.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               wo $$6 = wo.a("editGamerule.default", wo.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayl> $$10;
               String $$11;
               if (hfq.a($$7)) {
                  Builder<ayl> $$8 = ImmutableList.builder().add($$3.g());
                  wo $$9 = wo.c($$7);
                  fzl.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fzl.this.new b(wo.c(((dge.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dge.e::a)))
                     .forEach($$0xx -> this.b((fzl.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fod $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fzl.f $$4 = this.x();
         if ($$4 != null && $$4.a != null) {
            fzl.this.b($$4.a);
         }
      }
   }
}
