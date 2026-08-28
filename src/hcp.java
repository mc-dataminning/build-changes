import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hcp implements hck {
   private static final int a = 16;
   private final hds b;
   private final float c;
   private final float[] d;
   private final hck[] e;
   private final hck f;

   hcp(hds $$0, float $$1, float[] $$2, hck[] $$3, hck $$4) {
      this.b = $$0;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.c = $$1;
   }

   private static int a(float[] $$0, float $$1) {
      if ($$0.length < 16) {
         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            if ($$0[$$2] > $$1) {
               return $$2 - 1;
            }
         }

         return $$0.length - 1;
      } else {
         int $$3 = Arrays.binarySearch($$0, $$1);
         if ($$3 < 0) {
            int $$4 = ~$$3;
            return $$4 - 1;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public void a(hcn $$0, cxh $$1, hcl $$2, cxf $$3, @Nullable ggy $$4, @Nullable bvy $$5, int $$6) {
      float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
      hck $$8;
      if (Float.isNaN($$7)) {
         $$8 = this.f;
      } else {
         int $$9 = a(this.d, $$7);
         $$8 = $$9 == -1 ? this.f : this.e[$$9];
      }

      $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(float c, hck.b d) {
      public static final Codec<hcp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("threshold").forGetter(hcp.a::a), hcm.a.fieldOf("model").forGetter(hcp.a::b)).apply($$0, hcp.a::new)
      );
      public static final Comparator<hcp.a> b = Comparator.comparingDouble(hcp.a::a);

      public float a() {
         return (double)this.c;
      }

      public hck.b b() {
         return this.d;
      }
   }

   public static record b(hds b, float c, List<hcp.a> d, Optional<hck.b> e) implements hck.b {
      public static final MapCodec<hcp.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hdr.a.forGetter(hcp.b::b),
                  Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(hcp.b::c),
                  hcp.a.a.listOf().fieldOf("entries").forGetter(hcp.b::d),
                  hcm.a.optionalFieldOf("fallback").forGetter(hcp.b::e)
               )
               .apply($$0, hcp.b::new)
      );

      @Override
      public MapCodec<hcp.b> a() {
         return a;
      }

      @Override
      public hck a(hck.a $$0) {
         float[] $$1 = new float[this.d.size()];
         hck[] $$2 = new hck[this.d.size()];
         List<hcp.a> $$3 = new ArrayList<>(this.d);
         $$3.sort(hcp.a.b);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            hcp.a $$5 = $$3.get($$4);
            $$1[$$4] = $$5.c;
            $$2[$$4] = $$5.d.a($$0);
         }

         hck $$6 = this.e.<hck>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return new hcp(this.b, this.c, $$1, $$2, $$6);
      }

      @Override
      public void a(hij.a $$0) {
         this.e.ifPresent($$1 -> $$1.a($$0));
         this.d.forEach($$1 -> $$1.d.a($$0));
      }
   }
}
