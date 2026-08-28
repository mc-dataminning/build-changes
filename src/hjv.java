import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hjv implements hka {
   private final guk a;
   private final hnh b;

   public hjv(guk $$0, hnh $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(czw $$0, flo $$1, gsa $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(ali b) implements hke.a {
      public static final MapCodec<hjv.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ali.a.fieldOf("texture").forGetter(hjv.a::b)).apply($$0, hjv.a::new));

      public a(cyw $$0) {
         this(gsu.b($$0));
      }

      @Override
      public MapCodec<hjv.a> a() {
         return a;
      }

      @Override
      public hke<?> a(gla $$0) {
         return new hjv(new guk($$0), gsu.o.a(this.b));
      }
   }
}
