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

public class vh {
   public static final Codec<vh> a = Codec.either(vh.d.a.codec(), vh.d.b.codec())
      .xmap($$0 -> new vh((vh.d<?>)$$0.map($$0x -> $$0x, $$0x -> $$0x)), $$0 -> Either.left($$0.b));
   private final vh.d<?> b;

   public <T> vh(vh.a<T> $$0, T $$1) {
      this(new vh.d<>($$0, $$1));
   }

   private vh(vh.d<?> $$0) {
      this.b = $$0;
   }

   public vh.a<?> a() {
      return this.b.c;
   }

   @Nullable
   public <T> T a(vh.a<T> $$0) {
      return this.b.c == $$0 ? $$0.a(this.b.d) : null;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? ((vh)$$0).b.equals(this.b) : false;
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

   public static class a<T> implements aut {
      public static final vh.a<vb> a = new vh.a<>("show_text", true, vd.a, DataResult::success);
      public static final vh.a<vh.c> b = new vh.a<>("show_item", true, vh.c.b, vh.c::a);
      public static final vh.a<vh.b> c = new vh.a<>("show_entity", true, vh.b.a, vh.b::a);
      public static final Codec<vh.a<?>> d = aut.b(() -> new vh.a[]{a, b, c});
      public static final Codec<vh.a<?>> e = atg.a(d, vh.a::a);
      private final String f;
      private final boolean g;
      final Codec<vh.d<T>> h;
      final Codec<vh.d<T>> i;

      public a(String $$0, boolean $$1, Codec<T> $$2, Function<vb, DataResult<T>> $$3) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2.xmap($$0x -> new vh.d<>(this, (T)$$0x), $$0x -> $$0x.d).fieldOf("contents").codec();
         this.i = Codec.of(Encoder.error("Can't encode in legacy format"), vd.a.flatMap($$3).map($$0x -> new vh.d<>(this, (T)$$0x)));
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

      private static DataResult<vh.a<?>> a(@Nullable vh.a<?> $$0) {
         if ($$0 == null) {
            return DataResult.error(() -> "Unknown action");
         } else {
            return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
         }
      }
   }

   public static class b {
      public static final Codec<vh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kb.g.q().fieldOf("type").forGetter($$0x -> $$0x.b),
                  iy.e.fieldOf("id").forGetter($$0x -> $$0x.c),
                  atg.a(vd.a, "name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, vh.b::new)
      );
      public final blj<?> b;
      public final UUID c;
      public final Optional<vb> d;
      @Nullable
      private List<vb> e;

      public b(blj<?> $$0, UUID $$1, @Nullable vb $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(blj<?> $$0, UUID $$1, Optional<vb> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public static DataResult<vh.b> a(vb $$0) {
         try {
            sj $$1 = th.a($$0.getString());
            vb $$2 = vb.a.a($$1.l("name"));
            blj<?> $$3 = kb.g.a(new agt($$1.l("type")));
            UUID $$4 = UUID.fromString($$1.l("id"));
            return DataResult.success(new vh.b($$3, $$4, $$2));
         } catch (Exception var5) {
            return DataResult.error(() -> "Failed to parse tooltip: " + var5.getMessage());
         }
      }

      public List<vb> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(vb.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(vb.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vh.b $$1 = (vh.b)$$0;
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
      public static final Codec<vh.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kb.h.q().fieldOf("id").forGetter($$0x -> $$0x.c),
                  atg.a(Codec.INT, "count", Integer.valueOf(1)).forGetter($$0x -> $$0x.d),
                  atg.a(th.i, "tag").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, vh.c::new)
      );
      public static final Codec<vh.c> b = Codec.either(kb.h.q(), a)
         .xmap($$0 -> (vh.c)$$0.map($$0x -> new vh.c($$0x, 1, Optional.empty()), $$0x -> $$0x), Either::right);
      private final cmc c;
      private final int d;
      private final Optional<sj> e;
      @Nullable
      private cmh f;

      c(cmc $$0, int $$1, @Nullable sj $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      c(cmc $$0, int $$1, Optional<sj> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public c(cmh $$0) {
         this($$0.d(), $$0.L(), $$0.v() != null ? Optional.of($$0.v().h()) : Optional.empty());
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            vh.c $$1 = (vh.c)$$0;
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

      public cmh a() {
         if (this.f == null) {
            this.f = new cmh(this.c, this.d);
            this.e.ifPresent(this.f::c);
         }

         return this.f;
      }

      private static DataResult<vh.c> a(vb $$0) {
         try {
            sj $$1 = th.a($$0.getString());
            return DataResult.success(new vh.c(cmh.a($$1)));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse item tag: " + var2.getMessage());
         }
      }
   }

   static record d<T>(vh.a<T> c, T d) {
      public static final MapCodec<vh.d<?>> a = vh.a.e.dispatchMap("action", vh.d::a, $$0 -> $$0.h);
      public static final MapCodec<vh.d<?>> b = vh.a.e.dispatchMap("action", vh.d::a, $$0 -> $$0.i);

      public vh.a<T> a() {
         return this.c;
      }

      public T b() {
         return this.d;
      }
   }
}
