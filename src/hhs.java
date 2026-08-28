import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hhs implements hhx {
   private final gsj a;
   private final hle b;

   public hhs(gsj $$0, hle $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czb $$0, fjj $$1, gqa $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(alg b) implements hib.a {
      public static final MapCodec<hhs.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("texture").forGetter(hhs.a::b)).apply($$0, hhs.a::new));

      public a(cyb $$0) {
         this(gqv.b($$0));
      }

      @Override
      public MapCodec<hhs.a> a() {
         return a;
      }

      @Override
      public hib<?> a(giy $$0) {
         return new hhs(new gsj($$0), gqv.o.a(this.b));
      }
   }
}
