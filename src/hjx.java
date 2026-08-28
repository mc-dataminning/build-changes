import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hjx implements hkc {
   private final gum a;
   private final hnj b;

   public hjx(gum $$0, hnj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czy $$0, flq $$1, gsc $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(alk b) implements hkg.a {
      public static final MapCodec<hjx.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alk.a.fieldOf("texture").forGetter(hjx.a::b)).apply($$0, hjx.a::new));

      public a(cyy $$0) {
         this(gsw.b($$0));
      }

      @Override
      public MapCodec<hjx.a> a() {
         return a;
      }

      @Override
      public hkg<?> a(glc $$0) {
         return new hjx(new gum($$0), gsw.o.a(this.b));
      }
   }
}
