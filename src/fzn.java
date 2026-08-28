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

public class fzn extends fum {
   private static final wp a = wp.c("editGamerule.title");
   private static final int b = 8;
   final fsi c = new fsi(this);
   private final Consumer<Optional<dgf>> d;
   private final Set<fzn.f> s = Sets.newHashSet();
   private final dgf u;
   @Nullable
   private fzn.g v;
   @Nullable
   private fou w;

   public fzn(dgf $$0, Consumer<Optional<dgf>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aR_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new fzn.g(this.u));
      fsm $$0 = this.c.b(fsm.e().a(8));
      this.w = $$0.a(fou.a(wo.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fou.a(wo.e, $$0x -> this.aO_()).a());
      this.c.a($$1 -> {
         fos var10000 = this.c($$1);
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

   void a(fzn.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(fzn.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends fzn.d {
      private final fpb<Boolean> c;

      public a(final wp $$1, final List<ayl> $$2, final String $$3, final dgf.a $$4) {
         super($$2, $$1);
         this.c = fpb.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.j($$3 + $$4 - 45);
         this.c.k($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fzn.f {
      final wp b;

      public b(final wp $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fzn.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fqr> aH_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fsp> b() {
         return ImmutableList.of(new fsp() {
            @Override
            public fsp.a w() {
               return fsp.a.b;
            }

            @Override
            public void b(fsr $$0) {
               $$0.a(fsq.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dgf.g<T>> {
      fzn.f create(wp var1, List<ayl> var2, String var3, T var4);
   }

   public abstract class d extends fzn.f {
      private final List<ayl> c;
      protected final List<fos> a = Lists.newArrayList();

      public d(@Nullable final List<ayl> $$1, final wp $$2) {
         super($$1);
         this.c = fzn.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fqr> aH_() {
         return this.a;
      }

      @Override
      public List<? extends fsp> b() {
         return this.a;
      }

      protected void a(fof $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.b(fzn.this.m.h, this.c.get(0), $$2, $$1 + 5, -1);
         } else if (this.c.size() >= 2) {
            $$0.b(fzn.this.m.h, this.c.get(0), $$2, $$1, -1);
            $$0.b(fzn.this.m.h, this.c.get(1), $$2, $$1 + 10, -1);
         }
      }
   }

   public class e extends fzn.d {
      private final fpd d;

      public e(final wp $$1, final List<ayl> $$2, final String $$3, final dgf.d $$4) {
         super($$2, $$1);
         this.d = new fpd(fzn.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               fzn.this.b(this);
            } else {
               this.d.m(-65536);
               fzn.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.j($$3 + $$4 - 45);
         this.d.k($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fpa.a<fzn.f> {
      @Nullable
      final List<ayl> a;

      public f(@Nullable List<ayl> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fpa<fzn.f> {
      private static final int m = 24;

      public g(final dgf $$1) {
         super(flk.Q(), fzn.this.n, fzn.this.c.d(), fzn.this.c.c(), 24);
         final Map<dgf.b, Map<dgf.e<?>, fzn.f>> $$2 = Maps.newHashMap();
         $$1.a(new dgf.c() {
            @Override
            public void b(dgf.e<dgf.a> $$0, dgf.f<dgf.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fzn.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dgf.e<dgf.d> $$0, dgf.f<dgf.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fzn.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dgf.g<T>> void a(dgf.e<T> $$0, fzn.c<T> $$1x) {
               wp $$2 = wp.c($$0.b());
               wp $$3 = wp.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               wp $$6 = wp.a("editGamerule.default", wp.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayl> $$10;
               String $$11;
               if (hgb.a($$7)) {
                  Builder<ayl> $$8 = ImmutableList.builder().add($$3.g());
                  wp $$9 = wp.c($$7);
                  fzn.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fzn.this.new b(wp.c(((dgf.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dgf.e::a)))
                     .forEach($$0xx -> this.b((fzn.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fof $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fzn.f $$4 = this.x();
         if ($$4 != null && $$4.a != null) {
            fzn.this.b($$4.a);
         }
      }
   }
}
