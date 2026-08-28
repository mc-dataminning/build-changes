import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hhp implements hhr {
   private final hiq a;
   private final hhr b;
   private final hhr c;

   public hhp(hiq $$0, hhr $$1, hhr $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hhu $$0, daa $$1, hhs $$2, czy $$3, @Nullable gmd $$4, @Nullable bxw $$5, int $$6) {
      (this.a.get($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hif b, hhr.b c, hhr.b d) implements hhr.b {
      public static final MapCodec<hhp.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hie.a.forGetter(hhp.a::b), hht.a.fieldOf("on_true").forGetter(hhp.a::c), hht.a.fieldOf("on_false").forGetter(hhp.a::d))
               .apply($$0, hhp.a::new)
      );

      @Override
      public MapCodec<hhp.a> a() {
         return a;
      }

      @Override
      public hhr a(hhr.a $$0) {
         return new hhp(this.a(this.b, $$0.d()), this.c.a($$0), this.d.a($$0));
      }

      private hiq a(hif $$0, @Nullable baa $$1) {
         if ($$1 == null) {
            return $$0;
         } else {
            glw<gmd, hiq> $$2 = new glw<>($$2x -> a($$0, $$1, $$2x));
            return ($$2x, $$3, $$4, $$5, $$6) -> {
               hiq $$7 = (hiq)($$3 == null ? $$0 : $$2.a($$3));
               return $$7.get($$2x, $$3, $$4, $$5, $$6);
            };
         }
      }

      private static <T extends hif> T a(T $$0, baa $$1, gmd $$2) {
         return (T)$$1.a($$0.a().codec(), $$0, $$2.J_()).result().orElse($$0);
      }

      @Override
      public void a(hnt.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
