import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hif implements hik {
   private final gsv a;
   private final hlq b;

   public hif(gsv $$0, hlq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czi $$0, fjy $$1, gqm $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(alg b) implements hio.a {
      public static final MapCodec<hif.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("texture").forGetter(hif.a::b)).apply($$0, hif.a::new));

      public a(cyi $$0) {
         this(grg.b($$0));
      }

      @Override
      public MapCodec<hif.a> a() {
         return a;
      }

      @Override
      public hio<?> a(gjk $$0) {
         return new hif(new gsv($$0), grg.o.a(this.b));
      }
   }
}
