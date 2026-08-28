import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hdp implements hdk {
   private static final int a = 16;
   private final hes b;
   private final float c;
   private final float[] d;
   private final hdk[] e;
   private final hdk f;

   hdp(hes $$0, float $$1, float[] $$2, hdk[] $$3, hdk $$4) {
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
   public void a(hdn $$0, cxy $$1, hdl $$2, cxw $$3, @Nullable ghz $$4, @Nullable bwr $$5, int $$6) {
      float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
      hdk $$8;
      if (Float.isNaN($$7)) {
         $$8 = this.f;
      } else {
         int $$9 = a(this.d, $$7);
         $$8 = $$9 == -1 ? this.f : this.e[$$9];
      }

      $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(float c, hdk.b d) {
      public static final Codec<hdp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("threshold").forGetter(hdp.a::a), hdm.a.fieldOf("model").forGetter(hdp.a::b)).apply($$0, hdp.a::new)
      );
      public static final Comparator<hdp.a> b = Comparator.comparingDouble(hdp.a::a);

      public float a() {
         return (double)this.c;
      }

      public hdk.b b() {
         return this.d;
      }
   }

   public static record b(hes b, float c, List<hdp.a> d, Optional<hdk.b> e) implements hdk.b {
      public static final MapCodec<hdp.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  her.a.forGetter(hdp.b::b),
                  Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(hdp.b::c),
                  hdp.a.a.listOf().fieldOf("entries").forGetter(hdp.b::d),
                  hdm.a.optionalFieldOf("fallback").forGetter(hdp.b::e)
               )
               .apply($$0, hdp.b::new)
      );

      @Override
      public MapCodec<hdp.b> a() {
         return a;
      }

      @Override
      public hdk a(hdk.a $$0) {
         float[] $$1 = new float[this.d.size()];
         hdk[] $$2 = new hdk[this.d.size()];
         List<hdp.a> $$3 = new ArrayList<>(this.d);
         $$3.sort(hdp.a.b);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            hdp.a $$5 = $$3.get($$4);
            $$1[$$4] = $$5.c;
            $$2[$$4] = $$5.d.a($$0);
         }

         hdk $$6 = this.e.<hdk>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return new hdp(this.b, this.c, $$1, $$2, $$6);
      }

      @Override
      public void a(hjk.a $$0) {
         this.e.ifPresent($$1 -> $$1.a($$0));
         this.d.forEach($$1 -> $$1.d.a($$0));
      }
   }
}
