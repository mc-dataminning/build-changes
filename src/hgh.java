import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hgh<T> implements hfz {
   private static final Vector3f[] a = new Vector3f[]{
      new Vector3f(0.0F, 0.0F, 0.0F),
      new Vector3f(0.0F, 0.0F, 1.0F),
      new Vector3f(0.0F, 1.0F, 1.0F),
      new Vector3f(0.0F, 1.0F, 0.0F),
      new Vector3f(1.0F, 1.0F, 0.0F),
      new Vector3f(1.0F, 1.0F, 1.0F),
      new Vector3f(1.0F, 0.0F, 1.0F),
      new Vector3f(1.0F, 0.0F, 0.0F)
   };
   private final hio<T> b;
   private final hge c;

   public hgh(hio<T> $$0, hge $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(hgc $$0, czk $$1, hga $$2, czi $$3, @Nullable gkl $$4, @Nullable bxj $$5, int $$6) {
      hgc.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hgc.a.b);
      }

      $$7.a(() -> a);
      $$7.a(this.b, this.b.b($$1));
      this.c.a($$7, $$3);
   }

   public static record a(alg b, hio.a c) implements hfz.b {
      public static final MapCodec<hgh.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.fieldOf("base").forGetter(hgh.a::b), hip.a.fieldOf("model").forGetter(hgh.a::c)).apply($$0, hgh.a::new)
      );

      @Override
      public void a(hmb.a $$0) {
         $$0.markDependency(this.b);
      }

      @Override
      public hfz a(hfz.a $$0) {
         hio<?> $$1 = this.c.a($$0.b());
         if ($$1 == null) {
            return $$0.c();
         } else {
            hge $$2 = this.b($$0);
            return new hgh<>($$1, $$2);
         }
      }

      private hge b(hfz.a $$0) {
         hls $$1 = $$0.a();
         hmc $$2 = $$1.a(this.b);
         gsg $$3 = $$2.g();
         return hge.a($$1, $$2, $$3);
      }

      @Override
      public MapCodec<hgh.a> a() {
         return a;
      }
   }
}
