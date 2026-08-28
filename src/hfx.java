import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hfx implements hfz {
   private final hgy a;
   private final hfz b;
   private final hfz c;

   public hfx(hgy $$0, hfz $$1, hfz $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hgc $$0, czk $$1, hga $$2, czi $$3, @Nullable gkl $$4, @Nullable bxj $$5, int $$6) {
      (this.a.get($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hgn b, hfz.b c, hfz.b d) implements hfz.b {
      public static final MapCodec<hfx.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hgm.a.forGetter(hfx.a::b), hgb.a.fieldOf("on_true").forGetter(hfx.a::c), hgb.a.fieldOf("on_false").forGetter(hfx.a::d))
               .apply($$0, hfx.a::new)
      );

      @Override
      public MapCodec<hfx.a> a() {
         return a;
      }

      @Override
      public hfz a(hfz.a $$0) {
         return new hfx(this.a(this.b, $$0.d()), this.c.a($$0), this.d.a($$0));
      }

      private hgy a(hgn $$0, @Nullable azw $$1) {
         if ($$1 == null) {
            return $$0;
         } else {
            gke<gkl, hgy> $$2 = new gke<>($$2x -> a($$0, $$1, $$2x));
            return ($$2x, $$3, $$4, $$5, $$6) -> {
               hgy $$7 = (hgy)($$3 == null ? $$0 : $$2.a($$3));
               return $$7.get($$2x, $$3, $$4, $$5, $$6);
            };
         }
      }

      private static <T extends hgn> T a(T $$0, azw $$1, gkl $$2) {
         return (T)$$1.a($$0.a().codec(), $$0, $$2.F_()).result().orElse($$0);
      }

      @Override
      public void a(hmb.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
