import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hfd implements hff {
   private final hgd a;
   private final hff b;
   private final hff c;

   public hfd(hgd $$0, hff $$1, hff $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hfi $$0, cyy $$1, hfg $$2, cyw $$3, @Nullable gjr $$4, @Nullable bxc $$5, int $$6) {
      (this.a.get($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hfs b, hff.b c, hff.b d) implements hff.b {
      public static final MapCodec<hfd.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hfr.a.forGetter(hfd.a::b), hfh.a.fieldOf("on_true").forGetter(hfd.a::c), hfh.a.fieldOf("on_false").forGetter(hfd.a::d))
               .apply($$0, hfd.a::new)
      );

      @Override
      public MapCodec<hfd.a> a() {
         return a;
      }

      @Override
      public hff a(hff.a $$0) {
         return new hfd(this.a(this.b, $$0.d()), this.c.a($$0), this.d.a($$0));
      }

      private hgd a(hfs $$0, @Nullable azw $$1) {
         if ($$1 == null) {
            return $$0;
         } else {
            gjk<gjr, hgd> $$2 = new gjk<>($$2x -> a($$0, $$1, $$2x));
            return ($$2x, $$3, $$4, $$5, $$6) -> {
               hgd $$7 = (hgd)($$3 == null ? $$0 : $$2.a($$3));
               return $$7.get($$2x, $$3, $$4, $$5, $$6);
            };
         }
      }

      private static <T extends hfs> T a(T $$0, azw $$1, gjr $$2) {
         return (T)$$1.a($$0.a().codec(), $$0, $$2.F_()).result().orElse($$0);
      }

      @Override
      public void a(hlh.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
