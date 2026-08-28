import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hhn<T> implements hhf {
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
   private final hju<T> b;
   private final hhk c;

   public hhn(hju<T> $$0, hhk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(hhi $$0, dak $$1, hhg $$2, dai $$3, @Nullable glo $$4, @Nullable byf $$5, int $$6) {
      hhi.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hhi.a.b);
      }

      $$7.a(() -> a);
      $$7.a(this.b, this.b.b($$1));
      this.c.a($$7, $$3);
   }

   public static record a(alr b, hju.a c) implements hhf.b {
      public static final MapCodec<hhn.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alr.a.fieldOf("base").forGetter(hhn.a::b), hjv.a.fieldOf("model").forGetter(hhn.a::c)).apply($$0, hhn.a::new)
      );

      @Override
      public void a(hnh.a $$0) {
         $$0.markDependency(this.b);
      }

      @Override
      public hhf a(hhf.a $$0) {
         hju<?> $$1 = this.c.a($$0.b());
         if ($$1 == null) {
            return $$0.c();
         } else {
            hhk $$2 = this.b($$0);
            return new hhn<>($$1, $$2);
         }
      }

      private hhk b(hhf.a $$0) {
         hmz $$1 = $$0.a();
         hni $$2 = $$1.a(this.b);
         gti $$3 = $$2.g();
         return hhk.a($$1, $$2, $$3);
      }

      @Override
      public MapCodec<hhn.a> a() {
         return a;
      }
   }
}
