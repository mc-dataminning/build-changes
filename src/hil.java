import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hil implements hiq {
   private final gta a;
   private final hlx b;

   public hil(gta $$0, hlx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czl $$0, fkd $$1, gqr $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(alg b) implements hiu.a {
      public static final MapCodec<hil.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("texture").forGetter(hil.a::b)).apply($$0, hil.a::new));

      public a(cyl $$0) {
         this(grl.b($$0));
      }

      @Override
      public MapCodec<hil.a> a() {
         return a;
      }

      @Override
      public hiu<?> a(gjp $$0) {
         return new hil(new gta($$0), grl.o.a(this.b));
      }
   }
}
