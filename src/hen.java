import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hen implements hep {
   private final hfn a;
   private final hep b;
   private final hep c;

   public hen(hfn $$0, hep $$1, hep $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hes $$0, cys $$1, heq $$2, cyq $$3, @Nullable gjd $$4, @Nullable bwz $$5, int $$6) {
      (this.a.get($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hfc b, hep.b c, hep.b d) implements hep.b {
      public static final MapCodec<hen.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hfb.a.forGetter(hen.a::b), her.a.fieldOf("on_true").forGetter(hen.a::c), her.a.fieldOf("on_false").forGetter(hen.a::d))
               .apply($$0, hen.a::new)
      );

      @Override
      public MapCodec<hen.a> a() {
         return a;
      }

      @Override
      public hep a(hep.a $$0) {
         return new hen(this.a(this.b, $$0.d()), this.c.a($$0), this.d.a($$0));
      }

      private hfn a(hfc $$0, @Nullable azu $$1) {
         if ($$1 == null) {
            return $$0;
         } else {
            giw<gjd, hfn> $$2 = new giw<>($$2x -> a($$0, $$1, $$2x));
            return ($$2x, $$3, $$4, $$5, $$6) -> {
               hfn $$7 = (hfn)($$3 == null ? $$0 : $$2.a($$3));
               return $$7.get($$2x, $$3, $$4, $$5, $$6);
            };
         }
      }

      private static <T extends hfc> T a(T $$0, azu $$1, gjd $$2) {
         return (T)$$1.a($$0.a().codec(), $$0, $$2.F_()).result().orElse($$0);
      }

      @Override
      public void a(hkr.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
