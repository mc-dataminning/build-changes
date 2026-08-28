import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hgu implements hgz {
   private final grm a;
   private final hkg b;

   public hgu(grm $$0, hkg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cyq $$0, fiq $$1, gpd $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(ale b) implements hhd.a {
      public static final MapCodec<hgu.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("texture").forGetter(hgu.a::b)).apply($$0, hgu.a::new));

      public a(cxq $$0) {
         this(gpy.b($$0));
      }

      @Override
      public MapCodec<hgu.a> a() {
         return a;
      }

      @Override
      public hhd<?> a(gic $$0) {
         return new hgu(new grm($$0), gpy.o.a(this.b));
      }
   }
}
