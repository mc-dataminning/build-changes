import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hfl implements hfn {
   private final hgl a;
   private final hfn b;
   private final hfn c;

   public hfl(hgl $$0, hfn $$1, hfn $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hfq $$0, czd $$1, hfo $$2, czb $$3, @Nullable gjz $$4, @Nullable bxe $$5, int $$6) {
      (this.a.get($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hga b, hfn.b c, hfn.b d) implements hfn.b {
      public static final MapCodec<hfl.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hfz.a.forGetter(hfl.a::b), hfp.a.fieldOf("on_true").forGetter(hfl.a::c), hfp.a.fieldOf("on_false").forGetter(hfl.a::d))
               .apply($$0, hfl.a::new)
      );

      @Override
      public MapCodec<hfl.a> a() {
         return a;
      }

      @Override
      public hfn a(hfn.a $$0) {
         return new hfl(this.a(this.b, $$0.d()), this.c.a($$0), this.d.a($$0));
      }

      private hgl a(hga $$0, @Nullable azw $$1) {
         if ($$1 == null) {
            return $$0;
         } else {
            gjs<gjz, hgl> $$2 = new gjs<>($$2x -> a($$0, $$1, $$2x));
            return ($$2x, $$3, $$4, $$5, $$6) -> {
               hgl $$7 = (hgl)($$3 == null ? $$0 : $$2.a($$3));
               return $$7.get($$2x, $$3, $$4, $$5, $$6);
            };
         }
      }

      private static <T extends hga> T a(T $$0, azw $$1, gjz $$2) {
         return (T)$$1.a($$0.a().codec(), $$0, $$2.F_()).result().orElse($$0);
      }

      @Override
      public void a(hlp.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
