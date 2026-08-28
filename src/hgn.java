import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hgn<T> implements hgf {
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
   private final hiu<T> b;
   private final hgk c;

   public hgn(hiu<T> $$0, hgk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(hgi $$0, czn $$1, hgg $$2, czl $$3, @Nullable gkq $$4, @Nullable bxj $$5, int $$6) {
      hgi.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hgi.a.b);
      }

      $$7.a(() -> a);
      $$7.a(this.b, this.b.b($$1));
      this.c.a($$7, $$3);
   }

   public static record a(alg b, hiu.a c) implements hgf.b {
      public static final MapCodec<hgn.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.fieldOf("base").forGetter(hgn.a::b), hiv.a.fieldOf("model").forGetter(hgn.a::c)).apply($$0, hgn.a::new)
      );

      @Override
      public void a(hmi.a $$0) {
         $$0.markDependency(this.b);
      }

      @Override
      public hgf a(hgf.a $$0) {
         hiu<?> $$1 = this.c.a($$0.b());
         if ($$1 == null) {
            return $$0.c();
         } else {
            hgk $$2 = this.b($$0);
            return new hgn<>($$1, $$2);
         }
      }

      private hgk b(hgf.a $$0) {
         hlz $$1 = $$0.a();
         hmj $$2 = $$1.a(this.b);
         gsl $$3 = $$2.g();
         return hgk.a($$1, $$2, $$3);
      }

      @Override
      public MapCodec<hgn.a> a() {
         return a;
      }
   }
}
