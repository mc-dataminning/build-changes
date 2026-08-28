import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hgd implements hgf {
   private final hhe a;
   private final hgf b;
   private final hgf c;

   public hgd(hhe $$0, hgf $$1, hgf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hgi $$0, czn $$1, hgg $$2, czl $$3, @Nullable gkq $$4, @Nullable bxj $$5, int $$6) {
      (this.a.get($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hgt b, hgf.b c, hgf.b d) implements hgf.b {
      public static final MapCodec<hgd.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hgs.a.forGetter(hgd.a::b), hgh.a.fieldOf("on_true").forGetter(hgd.a::c), hgh.a.fieldOf("on_false").forGetter(hgd.a::d))
               .apply($$0, hgd.a::new)
      );

      @Override
      public MapCodec<hgd.a> a() {
         return a;
      }

      @Override
      public hgf a(hgf.a $$0) {
         return new hgd(this.a(this.b, $$0.d()), this.c.a($$0), this.d.a($$0));
      }

      private hhe a(hgt $$0, @Nullable azw $$1) {
         if ($$1 == null) {
            return $$0;
         } else {
            gkj<gkq, hhe> $$2 = new gkj<>($$2x -> a($$0, $$1, $$2x));
            return ($$2x, $$3, $$4, $$5, $$6) -> {
               hhe $$7 = (hhe)($$3 == null ? $$0 : $$2.a($$3));
               return $$7.get($$2x, $$3, $$4, $$5, $$6);
            };
         }
      }

      private static <T extends hgt> T a(T $$0, azw $$1, gkq $$2) {
         return (T)$$1.a($$0.a().codec(), $$0, $$2.F_()).result().orElse($$0);
      }

      @Override
      public void a(hmi.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
