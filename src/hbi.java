import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hbi implements hbk {
   private final hbw a;
   private final hbk b;
   private final hbk c;

   public hbi(hbw $$0, hbk $$1, hbk $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hbn $$0, cwo $$1, hbl $$2, cwm $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
      (this.a.a($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hbw b, hbk.b c, hbk.b d) implements hbk.b {
      public static final MapCodec<hbi.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbv.a.forGetter(hbi.a::b), hbm.a.fieldOf("on_true").forGetter(hbi.a::c), hbm.a.fieldOf("on_false").forGetter(hbi.a::d))
               .apply($$0, hbi.a::new)
      );

      @Override
      public MapCodec<hbi.a> a() {
         return a;
      }

      @Override
      public hbk a(hbk.a $$0) {
         return new hbi(this.b, this.c.a($$0), this.d.a($$0));
      }

      @Override
      public void a(hhj.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
