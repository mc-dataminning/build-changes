import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import javax.annotation.Nullable;

public class vm {
   public static final Codec<vm> a = Codec.either(vm.d.a.codec(), vm.d.b.codec())
      .xmap($$0 -> new vm((vm.d<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final vm.d<?> b;

   public <T> vm(vm.a<T> $$0, T $$1) {
      this(new vm.d<>($$0, $$1));
   }

   private vm(vm.d<?> $$0) {
      this.b = $$0;
   }

   public vm.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(vm.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((vm)$$0).b.equals(this.b) : false;
      }
   }

   @Override
   public String toString() {
      return this.b.toString();
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static class a<T> implements avl {
      public static final vm.a<vg> a = new vm.a<>("show_text", true, vi.a, DataResult::success);
      public static final vm.a<vm.c> b = new vm.a<>("show_item", true, vm.c.b, vm.c::a);
      public static final vm.a<vm.b> c = new vm.a<>("show_entity", true, vm.b.a, vm.b::a);
      public static final Codec<vm.a<?>> d = avl.b(() -> new vm.a[]{a, b, c});
      public static final Codec<vm.a<?>> e = atx.a(d, vm.a::a);
      private final String f;
      private final boolean g;
      final Codec<vm.d<T>> h;
      final Codec<vm.d<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, Function<vg, DataResult<T>> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new vm.d<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = Codec.of(Encoder.error("Can't encode in legacy format"), vi.a.flatMap($$3).map($$0x -> new vm.d<>(this, (T)$$0x)));
      }

      public boolean a() {
         return this.g;
      }

      @Override
      public String c() {
         return this.f;
      }

      T a(Object $$0) {
         return (T)$$0;
      }

      @Override
      public String toString() {
         return "<action " + this.f + ">";
      }

      private static DataResult<vm.a<?>> a(@Nullable vm.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<vm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kd.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  ja.e.fieldOf("id").forGetter($$0x -> $$0x.c),
                  atx.a(vi.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, vm.b::new)
      );
      public final bmc<?> b;
      public final UUID c;
      public final Optional<vg> d;
      @Nullable
      private List<vg> e;

      public b(bmc<?> $$0, UUID $$1, @Nullable vg $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bmc<?> $$0, UUID $$1, Optional<vg> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<vm.b> a(vg $$0) {
         try {
            so $$1 = tm.a($$0.getString());
            vg $$2 = vg.a.a($$1.l("name"));
            bmc<?> $$3 = kd.g.a(new ahh($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return DataResult.success(new vm.b($$3, $$4, $$2));
         } catch (Exception var5) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var5.getMessage());
         }
      }

      public List<vg> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(vg.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(vg.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vm.b $$1 = (vm.b)$$0;
            return this.b.equals($$1.b) && this.c.equals($$1.c) && this.d.equals($$1.d);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.b.hashCode();
         $$0 = 31 * $$0 + this.c.hashCode();
         return 31 * $$0 + this.d.hashCode();
      }
   }

   public static class c {
      public static final Codec<vm.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kd.h.q().fieldOf("id").forGetter($$0x -> $$0x.c),
                  atx.a(Codec.INT, "count", Integer.valueOf(1)).forGetter($$0x -> $$0x.d),
                  atx.a(tm.i, "tag").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, vm.c::new)
      );
      public static final Codec<vm.c> b = Codec.either(kd.h.q(), a)
         .xmap($$0 -> (vm.c)$$0.map($$0x -> new vm.c($$0x, 1, Optional.empty()), $$0x -> $$0x), Either::right);
      private final cnb c;
      private final int d;
      private final Optional<so> e;
      @Nullable
      private cng f;

      c(cnb $$0, int $$1, @Nullable so $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      c(cnb $$0, int $$1, Optional<so> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public c(cng $$0) {
         this($$0.d(), $$0.L(), $$0.v() != null ? Optional.of($$0.v().h()) : Optional.empty());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vm.c $$1 = (vm.c)$$0;
            return this.d == $$1.d && this.c.equals($$1.c) && this.e.equals($$1.e);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.c.hashCode();
         $$0 = 31 * $$0 + this.d;
         return 31 * $$0 + this.e.hashCode();
      }

      public cng a() {
         if (this.f == null) {
            this.f = new cng(this.c, this.d);
            this.e.ifPresent(this.f::c);
         }

         return this.f;
      }

      private static DataResult<vm.c> a(vg $$0) {
         try {
            so $$1 = tm.a($$0.getString());
            return DataResult.success(new vm.c(cng.a($$1)));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse item tag: " + var2.getMessage());
         }
      }
   }

   static record d<T>(vm.a<T> c, T d) {
      public static final MapCodec<vm.d<?>> a = vm.a.e.dispatchMap("action", vm.d::a, $$0 -> $$0.h);
      public static final MapCodec<vm.d<?>> b = vm.a.e.dispatchMap("action", vm.d::a, $$0 -> $$0.i);

      public vm.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
