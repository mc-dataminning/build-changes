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

public class vb {
   public static final Codec<vb> a = Codec.either(vb.d.a.codec(), vb.d.b.codec())
      .xmap($$0 -> new vb((vb.d<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final vb.d<?> b;

   public <T> vb(vb.a<T> $$0, T $$1) {
      this(new vb.d<>($$0, $$1));
   }

   private vb(vb.d<?> $$0) {
      this.b = $$0;
   }

   public vb.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(vb.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((vb)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements auk {
      public static final vb.a<uv> a = new vb.a<>("show_text", true, ux.a, DataResult::success);
      public static final vb.a<vb.c> b = new vb.a<>("show_item", true, vb.c.b, vb.c::a);
      public static final vb.a<vb.b> c = new vb.a<>("show_entity", true, vb.b.a, vb.b::a);
      public static final Codec<vb.a<?>> d = auk.b(() -> new vb.a[]{a, b, c});
      public static final Codec<vb.a<?>> e = asy.a(d, vb.a::a);
      private final String f;
      private final boolean g;
      final Codec<vb.d<T>> h;
      final Codec<vb.d<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, Function<uv, DataResult<T>> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new vb.d<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = Codec.of(Encoder.error("Can't encode in legacy format"), ux.a.flatMap($$3).map($$0x -> new vb.d<>(this, (T)$$0x)));
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

      private static DataResult<vb.a<?>> a(@Nullable vb.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<vb.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kc.h.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  iz.d.fieldOf("id").forGetter($$0x -> $$0x.c),
                  asy.a(ux.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, vb.b::new)
      );
      public final bkz<?> b;
      public final UUID c;
      public final Optional<uv> d;
      @Nullable
      private List<uv> e;

      public b(bkz<?> $$0, UUID $$1, @Nullable uv $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bkz<?> $$0, UUID $$1, Optional<uv> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<vb.b> a(uv $$0) {
         try {
            sd $$1 = tb.a($$0.getString());
            uv $$2 = uv.a.a($$1.l("name"));
            bkz<?> $$3 = kc.h.a(new agm($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return DataResult.success(new vb.b($$3, $$4, $$2));
         } catch (Exception var5) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var5.getMessage());
         }
      }

      public List<uv> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(uv.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(uv.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vb.b $$1 = (vb.b)$$0;
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
      public static final Codec<vb.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kc.i.q().fieldOf("id").forGetter($$0x -> $$0x.c),
                  asy.a(Codec.INT, "count", Integer.valueOf(1)).forGetter($$0x -> $$0x.d),
                  asy.a(tb.i, "tag").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, vb.c::new)
      );
      public static final Codec<vb.c> b = Codec.either(kc.i.q(), a)
         .xmap($$0 -> (vb.c)$$0.map($$0x -> new vb.c($$0x, 1, Optional.empty()), $$0x -> $$0x), Either::right);
      private final clj c;
      private final int d;
      private final Optional<sd> e;
      @Nullable
      private clo f;

      c(clj $$0, int $$1, @Nullable sd $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      c(clj $$0, int $$1, Optional<sd> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public c(clo $$0) {
         this($$0.d(), $$0.L(), $$0.v() != null ? Optional.of($$0.v().h()) : Optional.empty());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vb.c $$1 = (vb.c)$$0;
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

      public clo a() {
         if (this.f == null) {
            this.f = new clo(this.c, this.d);
            this.e.ifPresent(this.f::c);
         }

         return this.f;
      }

      private static DataResult<vb.c> a(uv $$0) {
         try {
            sd $$1 = tb.a($$0.getString());
            return DataResult.success(new vb.c(clo.a($$1)));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse item tag: " + var2.getMessage());
         }
      }
   }

   static record d<T>(vb.a<T> c, T d) {
      public static final MapCodec<vb.d<?>> a = vb.a.e.dispatchMap("action", vb.d::a, $$0 -> $$0.h);
      public static final MapCodec<vb.d<?>> b = vb.a.e.dispatchMap("action", vb.d::a, $$0 -> $$0.i);

      public vb.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
