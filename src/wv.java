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

public interface wv {
   Codec<wv> a = wv.a.e.dispatch("action", wv::a, $$0 -> $$0.h);

   wv.a a();

   public static enum a implements azv {
      a("show_text", true, wv.e.b),
      b("show_item", true, wv.d.b),
      c("show_entity", true, wv.c.b);

      public static final Codec<wv.a> d = azv.b(wv.a::values);
      public static final Codec<wv.a> e = d.validate(wv.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<? extends wv> h;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends wv> $$2) {
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

      private static DataResult<wv.a> a(wv.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static class b {
      public static final MapCodec<wv.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  mb.f.q().fieldOf("id").forGetter($$0x -> $$0x.b),
                  kl.f.fieldOf("uuid").forGetter($$0x -> $$0x.c),
                  wr.a.optionalFieldOf("name").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, wv.b::new)
      );
      public final bvi<?> b;
      public final UUID c;
      public final Optional<wp> d;
      @Nullable
      private List<wp> e;

      public b(bvi<?> $$0, UUID $$1, @Nullable wp $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bvi<?> $$0, UUID $$1, Optional<wp> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public List<wp> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(wp.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(wp.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            wv.b $$1 = (wv.b)$$0;
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

   public static record c(wv.b c) implements wv {
      public static final MapCodec<wv.c> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(wv.b.a.forGetter(wv.c::b)).apply($$0, wv.c::new));

      @Override
      public wv.a a() {
         return wv.a.c;
      }

      public wv.b b() {
         return this.c;
      }
   }

   public static record d(cxh c) implements wv {
      public static final MapCodec<wv.d> b = cxh.a.xmap(wv.d::new, wv.d::b);

      public d(cxh c) {
         c = c.v();
         this.c = c;
      }

      @Override
      public wv.a a() {
         return wv.a.b;
      }

      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof wv.d $$1 && cxh.a(this.c, $$1.c)) {
            return true;
         }

         return false;
      }

      @Override
      public int hashCode() {
         return cxh.b(this.c);
      }

      public cxh b() {
         return this.c;
      }
   }

   public static record e(wp c) implements wv {
      public static final MapCodec<wv.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(wr.a.fieldOf("text").forGetter(wv.e::b)).apply($$0, wv.e::new));

      @Override
      public wv.a a() {
         return wv.a.a;
      }

      public wp b() {
         return this.c;
      }
   }
}
