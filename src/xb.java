import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface xb {
   Codec<xb> a = xb.a.e.dispatch("action", xb::a, $$0 -> $$0.h);

   xb.a a();

   public static enum a implements bag {
      a("show_text", true, xb.e.b),
      b("show_item", true, xb.d.b),
      c("show_entity", true, xb.c.b);

      public static final Codec<xb.a> d = bag.b(xb.a::values);
      public static final Codec<xb.a> e = d.validate(xb.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<? extends xb> h;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends xb> $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
      }

      public boolean a() {
         return this.g;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Override
      public String toString() {
         return "<action " + this.f + ">";
      }

      private static DataResult<xb.a> a(xb.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static class b {
      public static final MapCodec<xb.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  md.f.q().fieldOf("id").forGetter($$0x -> $$0x.b),
                  km.f.fieldOf("uuid").forGetter($$0x -> $$0x.c),
                  wx.a.optionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xb.b::new)
      );
      public final bwb<?> b;
      public final UUID c;
      public final Optional<wv> d;
      @Nullable
      private List<wv> e;

      public b(bwb<?> $$0, UUID $$1, @Nullable wv $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bwb<?> $$0, UUID $$1, Optional<wv> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public List<wv> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(wv.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(wv.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xb.b $$1 = (xb.b)$$0;
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

   public static record c(xb.b c) implements xb {
      public static final MapCodec<xb.c> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(xb.b.a.forGetter(xb.c::b)).apply($$0, xb.c::new));

      @Override
      public xb.a a() {
         return xb.a.c;
      }

      public xb.b b() {
         return this.c;
      }
   }

   public static record d(cxy c) implements xb {
      public static final MapCodec<xb.d> b = cxy.a.xmap(xb.d::new, xb.d::b);

      public d(cxy c) {
         c = c.v();
         this.c = c;
      }

      @Override
      public xb.a a() {
         return xb.a.b;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof xb.d $$1 && cxy.a(this.c, $$1.c)) {
            return true;
         }

         return false;
      }

      @Override
      public int hashCode() {
         return cxy.b(this.c);
      }

      public cxy b() {
         return this.c;
      }
   }

   public static record e(wv c) implements xb {
      public static final MapCodec<xb.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(wx.a.fieldOf("value").forGetter(xb.e::b)).apply($$0, xb.e::new));

      @Override
      public xb.a a() {
         return xb.a.a;
      }

      public wv b() {
         return this.c;
      }
   }
}
