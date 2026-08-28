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

public interface xc {
   Codec<xc> a = xc.a.e.dispatch("action", xc::a, $$0 -> $$0.h);

   xc.a a();

   public static enum a implements bai {
      a("show_text", true, xc.e.b),
      b("show_item", true, xc.d.b),
      c("show_entity", true, xc.c.b);

      public static final Codec<xc.a> d = bai.b(xc.a::values);
      public static final Codec<xc.a> e = d.validate(xc.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<? extends xc> h;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends xc> $$2) {
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

      private static DataResult<xc.a> a(xc.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static class b {
      public static final MapCodec<xc.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  mf.f.q().fieldOf("id").forGetter($$0x -> $$0x.b),
                  jy.f.fieldOf("uuid").forGetter($$0x -> $$0x.c),
                  wy.a.optionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, xc.b::new)
      );
      public final bwj<?> b;
      public final UUID c;
      public final Optional<ww> d;
      @Nullable
      private List<ww> e;

      public b(bwj<?> $$0, UUID $$1, @Nullable ww $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bwj<?> $$0, UUID $$1, Optional<ww> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public List<ww> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(ww.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(ww.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xc.b $$1 = (xc.b)$$0;
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

   public static record c(xc.b c) implements xc {
      public static final MapCodec<xc.c> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(xc.b.a.forGetter(xc.c::b)).apply($$0, xc.c::new));

      @Override
      public xc.a a() {
         return xc.a.c;
      }

      public xc.b b() {
         return this.c;
      }
   }

   public static record d(cys c) implements xc {
      public static final MapCodec<xc.d> b = cys.a.xmap(xc.d::new, xc.d::b);

      public d(cys c) {
         c = c.v();
         this.c = c;
      }

      @Override
      public xc.a a() {
         return xc.a.b;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof xc.d $$1 && cys.a(this.c, $$1.c)) {
            return true;
         }

         return false;
      }

      @Override
      public int hashCode() {
         return cys.b(this.c);
      }

      public cys b() {
         return this.c;
      }
   }

   public static record e(ww c) implements xc {
      public static final MapCodec<xc.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(wy.a.fieldOf("value").forGetter(xc.e::b)).apply($$0, xc.e::new));

      @Override
      public xc.a a() {
         return xc.a.a;
      }

      public ww b() {
         return this.c;
      }
   }
}
