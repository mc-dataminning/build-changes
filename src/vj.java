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

public class vj {
   public static final Codec<vj> a = Codec.either(vj.d.a.codec(), vj.d.b.codec())
      .xmap($$0 -> new vj((vj.d<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final vj.d<?> b;

   public <T> vj(vj.a<T> $$0, T $$1) {
      this(new vj.d<>($$0, $$1));
   }

   private vj(vj.d<?> $$0) {
      this.b = $$0;
   }

   public vj.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(vj.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((vj)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements ave {
      public static final vj.a<vd> a = new vj.a<>("show_text", true, vf.a, DataResult::success);
      public static final vj.a<vj.c> b = new vj.a<>("show_item", true, vj.c.b, vj.c::a);
      public static final vj.a<vj.b> c = new vj.a<>("show_entity", true, vj.b.a, vj.b::a);
      public static final Codec<vj.a<?>> d = ave.b(() -> new vj.a[]{a, b, c});
      public static final Codec<vj.a<?>> e = atq.a(d, vj.a::a);
      private final String f;
      private final boolean g;
      final Codec<vj.d<T>> h;
      final Codec<vj.d<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, Function<vd, DataResult<T>> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new vj.d<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = Codec.of(Encoder.error("Can't encode in legacy format"), vf.a.flatMap($$3).map($$0x -> new vj.d<>(this, (T)$$0x)));
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

      private static DataResult<vj.a<?>> a(@Nullable vj.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<vj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kd.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  ja.e.fieldOf("id").forGetter($$0x -> $$0x.c),
                  atq.a(vf.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, vj.b::new)
      );
      public final blt<?> b;
      public final UUID c;
      public final Optional<vd> d;
      @Nullable
      private List<vd> e;

      public b(blt<?> $$0, UUID $$1, @Nullable vd $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(blt<?> $$0, UUID $$1, Optional<vd> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<vj.b> a(vd $$0) {
         try {
            sl $$1 = tj.a($$0.getString());
            vd $$2 = vd.a.a($$1.l("name"));
            blt<?> $$3 = kd.g.a(new ahd($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return DataResult.success(new vj.b($$3, $$4, $$2));
         } catch (Exception var5) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var5.getMessage());
         }
      }

      public List<vd> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(vd.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(vd.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vj.b $$1 = (vj.b)$$0;
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
      public static final Codec<vj.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kd.h.q().fieldOf("id").forGetter($$0x -> $$0x.c),
                  atq.a(Codec.INT, "count", Integer.valueOf(1)).forGetter($$0x -> $$0x.d),
                  atq.a(tj.i, "tag").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, vj.c::new)
      );
      public static final Codec<vj.c> b = Codec.either(kd.h.q(), a)
         .xmap($$0 -> (vj.c)$$0.map($$0x -> new vj.c($$0x, 1, Optional.empty()), $$0x -> $$0x), Either::right);
      private final cmm c;
      private final int d;
      private final Optional<sl> e;
      @Nullable
      private cmr f;

      c(cmm $$0, int $$1, @Nullable sl $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      c(cmm $$0, int $$1, Optional<sl> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public c(cmr $$0) {
         this($$0.d(), $$0.L(), $$0.v() != null ? Optional.of($$0.v().h()) : Optional.empty());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vj.c $$1 = (vj.c)$$0;
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

      public cmr a() {
         if (this.f == null) {
            this.f = new cmr(this.c, this.d);
            this.e.ifPresent(this.f::c);
         }

         return this.f;
      }

      private static DataResult<vj.c> a(vd $$0) {
         try {
            sl $$1 = tj.a($$0.getString());
            return DataResult.success(new vj.c(cmr.a($$1)));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse item tag: " + var2.getMessage());
         }
      }
   }

   static record d<T>(vj.a<T> c, T d) {
      public static final MapCodec<vj.d<?>> a = vj.a.e.dispatchMap("action", vj.d::a, $$0 -> $$0.h);
      public static final MapCodec<vj.d<?>> b = vj.a.e.dispatchMap("action", vj.d::a, $$0 -> $$0.i);

      public vj.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
