import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hhn implements hhp {
   private final hio a;
   private final hhp b;
   private final hhp c;

   public hhn(hio $$0, hhp $$1, hhp $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hhs $$0, czy $$1, hhq $$2, czw $$3, @Nullable gmb $$4, @Nullable bxu $$5, int $$6) {
      (this.a.get($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hid b, hhp.b c, hhp.b d) implements hhp.b {
      public static final MapCodec<hhn.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hic.a.forGetter(hhn.a::b), hhr.a.fieldOf("on_true").forGetter(hhn.a::c), hhr.a.fieldOf("on_false").forGetter(hhn.a::d))
               .apply($$0, hhn.a::new)
      );

      @Override
      public MapCodec<hhn.a> a() {
         return a;
      }

      @Override
      public hhp a(hhp.a $$0) {
         return new hhn(this.a(this.b, $$0.d()), this.c.a($$0), this.d.a($$0));
      }

      private hio a(hid $$0, @Nullable azy $$1) {
         if ($$1 == null) {
            return $$0;
         } else {
            glu<gmb, hio> $$2 = new glu<>($$2x -> a($$0, $$1, $$2x));
            return ($$2x, $$3, $$4, $$5, $$6) -> {
               hio $$7 = (hio)($$3 == null ? $$0 : $$2.a($$3));
               return $$7.get($$2x, $$3, $$4, $$5, $$6);
            };
         }
      }

      private static <T extends hid> T a(T $$0, azy $$1, gmb $$2) {
         return (T)$$1.a($$0.a().codec(), $$0, $$2.J_()).result().orElse($$0);
      }

      @Override
      public void a(hnr.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
