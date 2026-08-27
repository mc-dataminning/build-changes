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

public class vl {
   public static final Codec<vl> a = Codec.either(vl.d.a.codec(), vl.d.b.codec())
      .xmap($$0 -> new vl((vl.d<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final vl.d<?> b;

   public <T> vl(vl.a<T> $$0, T $$1) {
      this(new vl.d<>($$0, $$1));
   }

   private vl(vl.d<?> $$0) {
      this.b = $$0;
   }

   public vl.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(vl.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((vl)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements avk {
      public static final vl.a<vf> a = new vl.a<>("show_text", true, vh.a, DataResult::success);
      public static final vl.a<vl.c> b = new vl.a<>("show_item", true, vl.c.b, vl.c::a);
      public static final vl.a<vl.b> c = new vl.a<>("show_entity", true, vl.b.a, vl.b::a);
      public static final Codec<vl.a<?>> d = avk.b(() -> new vl.a[]{a, b, c});
      public static final Codec<vl.a<?>> e = atw.a(d, vl.a::a);
      private final String f;
      private final boolean g;
      final Codec<vl.d<T>> h;
      final Codec<vl.d<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, Function<vf, DataResult<T>> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new vl.d<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = Codec.of(Encoder.error("Can't encode in legacy format"), vh.a.flatMap($$3).map($$0x -> new vl.d<>(this, (T)$$0x)));
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

      private static DataResult<vl.a<?>> a(@Nullable vl.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<vl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kd.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  ja.e.fieldOf("id").forGetter($$0x -> $$0x.c),
                  atw.a(vh.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, vl.b::new)
      );
      public final blz<?> b;
      public final UUID c;
      public final Optional<vf> d;
      @Nullable
      private List<vf> e;

      public b(blz<?> $$0, UUID $$1, @Nullable vf $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(blz<?> $$0, UUID $$1, Optional<vf> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<vl.b> a(vf $$0) {
         try {
            sn $$1 = tl.a($$0.getString());
            vf $$2 = vf.a.a($$1.l("name"));
            blz<?> $$3 = kd.g.a(new ahg($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return DataResult.success(new vl.b($$3, $$4, $$2));
         } catch (Exception var5) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var5.getMessage());
         }
      }

      public List<vf> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(vf.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(vf.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vl.b $$1 = (vl.b)$$0;
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
      public static final Codec<vl.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kd.h.q().fieldOf("id").forGetter($$0x -> $$0x.c),
                  atw.a(Codec.INT, "count", Integer.valueOf(1)).forGetter($$0x -> $$0x.d),
                  atw.a(tl.i, "tag").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, vl.c::new)
      );
      public static final Codec<vl.c> b = Codec.either(kd.h.q(), a)
         .xmap($$0 -> (vl.c)$$0.map($$0x -> new vl.c($$0x, 1, Optional.empty()), $$0x -> $$0x), Either::right);
      private final cmt c;
      private final int d;
      private final Optional<sn> e;
      @Nullable
      private cmy f;

      c(cmt $$0, int $$1, @Nullable sn $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      c(cmt $$0, int $$1, Optional<sn> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public c(cmy $$0) {
         this($$0.d(), $$0.L(), $$0.v() != null ? Optional.of($$0.v().h()) : Optional.empty());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vl.c $$1 = (vl.c)$$0;
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

      public cmy a() {
         if (this.f == null) {
            this.f = new cmy(this.c, this.d);
            this.e.ifPresent(this.f::c);
         }

         return this.f;
      }

      private static DataResult<vl.c> a(vf $$0) {
         try {
            sn $$1 = tl.a($$0.getString());
            return DataResult.success(new vl.c(cmy.a($$1)));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse item tag: " + var2.getMessage());
         }
      }
   }

   static record d<T>(vl.a<T> c, T d) {
      public static final MapCodec<vl.d<?>> a = vl.a.e.dispatchMap("action", vl.d::a, $$0 -> $$0.h);
      public static final MapCodec<vl.d<?>> b = vl.a.e.dispatchMap("action", vl.d::a, $$0 -> $$0.i);

      public vl.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
