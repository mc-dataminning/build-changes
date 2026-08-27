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

public class vw {
   public static final Codec<vw> a = Codec.either(vw.d.a.codec(), vw.d.b.codec())
      .xmap($$0 -> new vw((vw.d<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final vw.d<?> b;

   public <T> vw(vw.a<T> $$0, T $$1) {
      this(new vw.d<>($$0, $$1));
   }

   private vw(vw.d<?> $$0) {
      this.b = $$0;
   }

   public vw.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(vw.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((vw)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements axc {
      public static final vw.a<vq> a = new vw.a<>("show_text", true, vs.a, DataResult::success);
      public static final vw.a<vw.c> b = new vw.a<>("show_item", true, vw.c.b, vw.c::a);
      public static final vw.a<vw.b> c = new vw.a<>("show_entity", true, vw.b.a, vw.b::a);
      public static final Codec<vw.a<?>> d = axc.b(() -> new vw.a[]{a, b, c});
      public static final Codec<vw.a<?>> e = avp.a(d, vw.a::a);
      private final String f;
      private final boolean g;
      final Codec<vw.d<T>> h;
      final Codec<vw.d<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, Function<vq, DataResult<T>> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new vw.d<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = Codec.of(Encoder.error("Can't encode in legacy format"), vs.a.flatMap($$3).map($$0x -> new vw.d<>(this, (T)$$0x)));
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

      private static DataResult<vw.a<?>> a(@Nullable vw.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<vw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  jc.e.fieldOf("id").forGetter($$0x -> $$0x.c),
                  avp.a(vs.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, vw.b::new)
      );
      public final bnu<?> b;
      public final UUID c;
      public final Optional<vq> d;
      @Nullable
      private List<vq> e;

      public b(bnu<?> $$0, UUID $$1, @Nullable vq $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bnu<?> $$0, UUID $$1, Optional<vq> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<vw.b> a(vq $$0) {
         try {
            sw $$1 = tu.a($$0.getString());
            vq $$2 = vq.a.a($$1.l("name"));
            bnu<?> $$3 = kf.g.a(new aiy($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return DataResult.success(new vw.b($$3, $$4, $$2));
         } catch (Exception var5) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var5.getMessage());
         }
      }

      public List<vq> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(vq.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(vq.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vw.b $$1 = (vw.b)$$0;
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
      public static final Codec<vw.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.h.q().fieldOf("id").forGetter($$0x -> $$0x.c),
                  avp.a(Codec.INT, "count", Integer.valueOf(1)).forGetter($$0x -> $$0x.d),
                  avp.a(tu.i, "tag").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, vw.c::new)
      );
      public static final Codec<vw.c> b = Codec.either(kf.h.q(), a)
         .xmap($$0 -> (vw.c)$$0.map($$0x -> new vw.c($$0x, 1, Optional.empty()), $$0x -> $$0x), Either::right);
      private final cou c;
      private final int d;
      private final Optional<sw> e;
      @Nullable
      private coz f;

      c(cou $$0, int $$1, @Nullable sw $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      c(cou $$0, int $$1, Optional<sw> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public c(coz $$0) {
         this($$0.d(), $$0.M(), $$0.w() != null ? Optional.of($$0.w().h()) : Optional.empty());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vw.c $$1 = (vw.c)$$0;
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

      public coz a() {
         if (this.f == null) {
            this.f = new coz(this.c, this.d);
            this.e.ifPresent(this.f::c);
         }

         return this.f;
      }

      private static DataResult<vw.c> a(vq $$0) {
         try {
            sw $$1 = tu.a($$0.getString());
            return DataResult.success(new vw.c(coz.a($$1)));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse item tag: " + var2.getMessage());
         }
      }
   }

   static record d<T>(vw.a<T> c, T d) {
      public static final MapCodec<vw.d<?>> a = vw.a.e.dispatchMap("action", vw.d::a, $$0 -> $$0.h);
      public static final MapCodec<vw.d<?>> b = vw.a.e.dispatchMap("action", vw.d::a, $$0 -> $$0.i);

      public vw.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
