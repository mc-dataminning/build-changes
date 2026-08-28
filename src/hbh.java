import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hbh implements hbi {
   private final hbu a;
   private final hbi b;
   private final hbi c;

   public hbh(hbu $$0, hbi $$1, hbi $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hbl $$0, cwp $$1, hbj $$2, cwn $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
      (this.a.a($$1, $$4, $$5, $$6) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hbu b, hbi.b c, hbi.b d) implements hbi.b {
      public static final MapCodec<hbh.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbt.a.forGetter(hbh.a::b), hbk.a.fieldOf("on_true").forGetter(hbh.a::c), hbk.a.fieldOf("on_false").forGetter(hbh.a::d))
               .apply($$0, hbh.a::new)
      );

      @Override
      public MapCodec<hbh.a> a() {
         return a;
      }

      @Override
      public hbi a(hbi.a $$0) {
         return new hbh(this.b, this.c.a($$0), this.d.a($$0));
      }

      @Override
      public void a(hhd.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
