import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdo implements hdt {
   private final goi a;
   private final hha b;

   public hdo(goi $$0, hha $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cwo $$0, ffv $$1, glz $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(akv b) implements hdx.a {
      public static final MapCodec<hdo.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akv.a.fieldOf("texture").forGetter(hdo.a::b)).apply($$0, hdo.a::new));

      public a(cvn $$0) {
         this(gmu.b($$0));
      }

      @Override
      public MapCodec<hdo.a> a() {
         return a;
      }

      @Override
      public hdx<?> a(gfa $$0) {
         return new hdo(new goi($$0), gmu.a(this.b));
      }
   }
}
