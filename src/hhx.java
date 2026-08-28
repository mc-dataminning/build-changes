import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hhx<T> implements hhp {
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
   private final hke<T> b;
   private final hhu c;

   public hhx(hke<T> $$0, hhu $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(hhs $$0, czy $$1, hhq $$2, czw $$3, @Nullable gmb $$4, @Nullable bxu $$5, int $$6) {
      hhs.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hhs.a.b);
      }

      $$7.a(() -> a);
      $$7.a(this.b, this.b.b($$1));
      this.c.a($$7, $$3);
   }

   public static record a(ali b, hke.a c) implements hhp.b {
      public static final MapCodec<hhx.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ali.a.fieldOf("base").forGetter(hhx.a::b), hkf.a.fieldOf("model").forGetter(hhx.a::c)).apply($$0, hhx.a::new)
      );

      @Override
      public void a(hnr.a $$0) {
         $$0.markDependency(this.b);
      }

      @Override
      public hhp a(hhp.a $$0) {
         hke<?> $$1 = this.c.a($$0.b());
         if ($$1 == null) {
            return $$0.c();
         } else {
            hhu $$2 = this.b($$0);
            return new hhx<>($$1, $$2);
         }
      }

      private hhu b(hhp.a $$0) {
         hnj $$1 = $$0.a();
         hns $$2 = $$1.a(this.b);
         gtv $$3 = $$2.g();
         return hhu.a($$1, $$2, $$3);
      }

      @Override
      public MapCodec<hhx.a> a() {
         return a;
      }
   }
}
