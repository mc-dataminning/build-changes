import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hbg implements hbh {
   private final hbt a;
   private final hbh b;
   private final hbh c;

   public hbg(hbt $$0, hbh $$1, hbh $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hbk $$0, cwn $$1, hbi $$2, cwl $$3, @Nullable gfw $$4, @Nullable bvf $$5, int $$6) {
      (this.a.a($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hbt b, hbh.b c, hbh.b d) implements hbh.b {
      public static final MapCodec<hbg.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbs.a.forGetter(hbg.a::b), hbj.a.fieldOf("on_true").forGetter(hbg.a::c), hbj.a.fieldOf("on_false").forGetter(hbg.a::d))
               .apply($$0, hbg.a::new)
      );

      @Override
      public MapCodec<hbg.a> a() {
         return a;
      }

      @Override
      public hbh a(hbh.a $$0) {
         return new hbg(this.b, this.c.a($$0), this.d.a($$0));
      }

      @Override
      public void a(hhe.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
