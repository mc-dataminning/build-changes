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

public class fvf extends fqh {
   private static final xe a = xe.c("editGamerule.title");
   private static final int b = 8;
   final foc c = new foc(this);
   private final Consumer<Optional<def>> d;
   private final Set<fvf.f> s = Sets.newHashSet();
   private final def u;
   @Nullable
   private fvf.g v;
   @Nullable
   private fko w;

   public fvf(def $$0, Consumer<Optional<def>> $$1) {
      super(a);
      this.u = $$0;
      this.d = $$1;
   }

   @Override
   protected void aS_() {
      this.c.a(a, this.p);
      this.v = this.c.c(new fvf.g(this.u));
      fog $$0 = this.c.b(fog.e().a(8));
      this.w = $$0.a(fko.a(xd.d, $$0x -> this.d.accept(Optional.of(this.u))).a());
      $$0.a(fko.a(xd.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fkm var10000 = this.c($$1);
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

   void a(fvf.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(fvf.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends fvf.d {
      private final fkv<Boolean> c;

      public a(final xe $$1, final List<ayr> $$2, final String $$3, final def.a $$4) {
         super($$2, $$1);
         this.c = fkv.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fvf.f {
      final xe b;

      public b(final xe $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fvf.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fml> aJ_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends foj> b() {
         return ImmutableList.of(new foj() {
            @Override
            public foj.a u() {
               return foj.a.b;
            }

            @Override
            public void b(fol $$0) {
               $$0.a(fok.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends def.g<T>> {
      fvf.f create(xe var1, List<ayr> var2, String var3, T var4);
   }

   public abstract class d extends fvf.f {
      private final List<ayr> c;
      protected final List<fkm> a = Lists.newArrayList();

      public d(@Nullable final List<ayr> $$1, final xe $$2) {
         super($$1);
         this.c = fvf.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fml> aJ_() {
         return this.a;
      }

      @Override
      public List<? extends foj> b() {
         return this.a;
      }

      protected void a(fkb $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fvf.this.m.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fvf.this.m.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fvf.this.m.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fvf.d {
      private final fkx d;

      public e(final xe $$1, final List<ayr> $$2, final String $$3, final def.d $$4) {
         super($$2, $$1);
         this.d = new fkx(fvf.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fvf.this.b(this);
            } else {
               this.d.g(-65536);
               fvf.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fku.a<fvf.f> {
      @Nullable
      final List<ayr> a;

      public f(@Nullable List<ayr> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fku<fvf.f> {
      private static final int m = 24;

      public g(final def $$1) {
         super(fip.Q(), fvf.this.n, fvf.this.c.d(), fvf.this.c.c(), 24);
         final Map<def.b, Map<def.e<?>, fvf.f>> $$2 = Maps.newHashMap();
         $$1.a(new def.c() {
            @Override
            public void b(def.e<def.a> $$0, def.f<def.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fvf.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(def.e<def.d> $$0, def.f<def.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fvf.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends def.g<T>> void a(def.e<T> $$0, fvf.c<T> $$1x) {
               xe $$2 = xe.c($$0.b());
               xe $$3 = xe.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xe $$6 = xe.a("editGamerule.default", xe.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayr> $$10;
               String $$11;
               if (gyn.a($$7)) {
                  Builder<ayr> $$8 = ImmutableList.builder().add($$3.g());
                  xe $$9 = xe.c($$7);
                  fvf.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fvf.this.new b(xe.c(((def.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(def.e::a)))
                     .forEach($$0xx -> this.b((fvf.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fkb $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fvf.f $$4 = this.v();
         if ($$4 != null && $$4.a != null) {
            fvf.this.b($$4.a);
         }
      }
   }
}
