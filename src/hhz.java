import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hhz<T> implements hhr {
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
   private final hkg<T> b;
   private final hhw c;

   public hhz(hkg<T> $$0, hhw $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(hhu $$0, daa $$1, hhs $$2, czy $$3, @Nullable gmd $$4, @Nullable bxw $$5, int $$6) {
      hhu.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(hhu.a.b);
      }

      $$7.a(() -> a);
      $$7.a(this.b, this.b.b($$1));
      this.c.a($$7, $$3);
   }

   public static record a(alk b, hkg.a c) implements hhr.b {
      public static final MapCodec<hhz.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alk.a.fieldOf("base").forGetter(hhz.a::b), hkh.a.fieldOf("model").forGetter(hhz.a::c)).apply($$0, hhz.a::new)
      );

      @Override
      public void a(hnt.a $$0) {
         $$0.markDependency(this.b);
      }

      @Override
      public hhr a(hhr.a $$0) {
         hkg<?> $$1 = this.c.a($$0.b());
         if ($$1 == null) {
            return $$0.c();
         } else {
            hhw $$2 = this.b($$0);
            return new hhz<>($$1, $$2);
         }
      }

      private hhw b(hhr.a $$0) {
         hnl $$1 = $$0.a();
         hnu $$2 = $$1.a(this.b);
         gtx $$3 = $$2.g();
         return hhw.a($$1, $$2, $$3);
      }

      @Override
      public MapCodec<hhz.a> a() {
         return a;
      }
   }
}
